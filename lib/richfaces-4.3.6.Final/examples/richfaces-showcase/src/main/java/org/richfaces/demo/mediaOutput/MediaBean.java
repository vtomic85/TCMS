package org.richfaces.demo.mediaOutput;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.charset.Charset;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean(name = "mediaBean")
@RequestScoped
public class MediaBean {
    private static final String RICHFACES_MEDIA_OUTPUT_IMAGE_SOURCE = "/richfaces/mediaOutput/image/source.png";
    private static final int BUFFER_SIZE = 8192;
    private Color[] colors;
    private boolean isIndexed = false;
    private Charset asciiCharset = Charset.forName("US-ASCII");
    private int sectionLength;
    private int imageWidth;
    private byte[] lengthBytes = new byte[4];
    private byte[] chunkTypeBytes = new byte[4];

    private class Section {
        protected void writeHeaderSectionData(OutputStream outChannel) throws IOException {
            outChannel.write(lengthBytes);
            outChannel.write(chunkTypeBytes);
        }

        protected void writeInt(OutputStream outChannel, int value) throws IOException {
            byte[] bs = new byte[4];
            ByteBuffer.wrap(bs).order(ByteOrder.BIG_ENDIAN).asIntBuffer().put(value);
            outChannel.write(bs);
        }

        protected void writeSectionData(InputStream inChannel, OutputStream outChannel) throws IOException {
            byte[] bs = new byte[BUFFER_SIZE];
            int read = 0;
            int remaining = sectionLength;

            while ((read = inChannel.read(bs, 0, Math.min(remaining, bs.length))) > 0) {
                outChannel.write(bs, 0, read);
                remaining -= read;
            }

            if (remaining > 0) {
                throw new IllegalArgumentException();
            }

            byte[] crc = new byte[4];
            if (inChannel.read(crc) < crc.length) {
                throw new IllegalArgumentException();
            }

            outChannel.write(crc);
        }

        public void write(InputStream inChannel, OutputStream outChannel) throws IOException {
            writeHeaderSectionData(outChannel);
            writeSectionData(inChannel, outChannel);
        }
    }

    ;

    private class HeaderSection extends Section {
        @Override
        protected void writeSectionData(InputStream inChannel, OutputStream outChannel) throws IOException {
            // // Width 4 bytes
            // // Height 4 bytes
            // // Bit depth 1 byte
            // // Colour type 1 byte
            // // Compression method 1 byte
            // // Filter method 1 byte
            // // Interlace method 1 byte

            byte[] headerBytes = new byte[sectionLength];

            if (inChannel.read(headerBytes) < headerBytes.length) {
                throw new IllegalArgumentException();
            }

            if (headerBytes[8] != 8) {
                throw new IllegalStateException("Color depth is not 8");
            }

            if (headerBytes[9] != 2 && headerBytes[9] != 3) {
                throw new IllegalStateException("Unsupported color type");
            }

            imageWidth = ByteBuffer.wrap(headerBytes, 0, 4).order(ByteOrder.BIG_ENDIAN).asIntBuffer().get();

            isIndexed = (headerBytes[9] == 3);

            outChannel.write(headerBytes);

            byte[] crc = new byte[4];
            if (inChannel.read(crc) < crc.length) {
                throw new IllegalArgumentException();
            }

            outChannel.write(crc);
        }
    }

    ;

    private void transformColors(byte[] data, int offset, int length) {
        float[] intensities = new float[3];

        for (int i = offset; i < length + offset; i += 3) {
            float weight = 0;
            for (int j = 0; j < intensities.length; j++) {
                intensities[j] = ((float) (data[i + j] & 0xFF)) / 255;
                weight += intensities[j];
            }

            float r = 0;
            float g = 0;
            float b = 0;

            for (int j = 0; j < intensities.length; j++) {
                r += intensities[j] * colors[j].getRed();
                g += intensities[j] * colors[j].getGreen();
                b += intensities[j] * colors[j].getBlue();
            }

            data[i] = (byte) (r);
            data[i + 1] = (byte) (g);
            data[i + 2] = (byte) (b);
        }
    }

    private class PaletteSection extends Section {
        @Override
        protected void writeSectionData(InputStream inChannel, OutputStream outChannel) throws IOException {
            if (!isIndexed) {
                super.writeSectionData(inChannel, outChannel);
            } else {
                byte[] data = new byte[2000 * 3];
                int read;
                int remaining = sectionLength;

                assert (data.length < BUFFER_SIZE);

                CRC32 crc32 = new CRC32();
                crc32.update(chunkTypeBytes);

                while ((read = (inChannel.read(data, 0, Math.min(remaining, data.length)))) > 0) {
                    remaining -= read;

                    transformColors(data, 0, read);

                    outChannel.write(data, 0, read);
                    crc32.update(data, 0, read);
                }

                if (remaining > 0) {
                    throw new IllegalArgumentException();
                }

                inChannel.skip(4);

                writeInt(outChannel, (int) crc32.getValue());
            }
        }
    }

    ;

    private class LimitedInputStream extends FilterInputStream {
        private int remaining;

        protected LimitedInputStream(InputStream inChannel) {
            super(inChannel);
            this.remaining = sectionLength;
        }

        @Override
        public int available() throws IOException {
            return Math.min(super.available(), this.remaining);
        }

        @Override
        public int read() throws IOException {
            if (this.remaining > 0) {
                int read = super.read();
                if (read != -1) {
                    this.remaining--;
                }

                return read;
            } else {
                return -1;
            }
        }

        @Override
        public int read(byte[] b) throws IOException {
            return read(b, 0, b.length);
        }

        @Override
        public int read(byte[] b, int off, int len) throws IOException {
            int read = super.read(b, 0, Math.min(len, this.remaining));
            if (read > 0) {
                this.remaining -= read;
            }

            return read;
        }

        @Override
        public synchronized void mark(int readlimit) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean markSupported() {
            return false;
        }

        @Override
        public synchronized void reset() throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override
        public long skip(long n) throws IOException {
            long toSkip = Math.min(this.remaining, n);
            long skipped = super.skip(toSkip);

            if (skipped > 0) {
                this.remaining -= skipped;
            }

            return skipped;
        }
    }

    ;

    private class DataSection extends Section {
        private byte paeth(byte a, byte b, byte c) {
            int p = (a & 0xFF) + (b & 0xFF) - (c & 0xFF);
            int pa = Math.abs(p - a);
            int pb = Math.abs(p - b);
            int pc = Math.abs(p - c);

            int pr;

            if (pa <= pb && pa <= pc) {
                pr = a;
            } else if (pb <= pc) {
                pr = b;
            } else {
                pr = c;
            }

            return (byte) pr;
        }

        ;

        private class Filter {
            protected int idx;
            byte a = 0;
            byte b = 0;
            byte c = 0;
            byte oa = 0;
            byte ob = 0;
            byte oc = 0;
            int step = 3;
            byte[] bs;
            byte[] ps;

            public void setIdx(int idx) {
                this.idx = idx;

                oa = a;
                ob = b;
                oc = c;

                b = ps[idx];
                if (idx > step) {
                    a = bs[idx - step];
                    c = ps[idx - step];
                }
            }

            public void next() {
                idx = idx + step;
                setIdx(idx);
            }
        }

        ;

        private class SubFilter extends Filter {
            @Override
            public void next() {
                bs[idx] = (byte) ((bs[idx] & 0xFF) + (a & 0xFF) - (oa & 0xFF));
                setIdx(idx + step);
            }
        }

        ;

        private class UpFilter extends Filter {
            @Override
            public void next() {
                bs[idx] = (byte) ((bs[idx] & 0xFF) + (b & 0xFF) - (ob & 0xFF));
                setIdx(idx + step);
            }
        }

        ;

        private class PaethFilter extends Filter {
            @Override
            public void next() {
                bs[idx] = (byte) (paeth(a, b, c) - paeth(oa, ob, oc) + (bs[idx] & 0xFF));
                setIdx(idx + step);
            }
        }

        private void reconstruct(byte[] bs, byte[] ps) {
            Filter[] filters = new Filter[3];

            for (int i = 0; i < filters.length; i++) {
                switch (bs[0]) {
                    case 0:
                        filters[i] = new Filter();
                        break;
                    case 1:
                        filters[i] = new SubFilter();
                        break;
                    case 2:
                        filters[i] = new UpFilter();
                        break;
                    case 4:
                        filters[i] = new PaethFilter();
                        break;

                    default:
                        throw new IllegalArgumentException(Integer.toHexString(bs[0]));
                }

                filters[i].bs = bs;
                filters[i].ps = ps;
                filters[i].step = 3;

                filters[i].setIdx(1 + i);
            }

            for (int i = 1; i < (bs.length - 1) / 3; i++) {
                for (Filter filter : filters) {
                    filter.next();
                }
            }

            bs[0] = 0;
        }

        @Override
        public void write(InputStream inChannel, OutputStream outChannel) throws IOException {
            if (isIndexed) {
                super.write(inChannel, outChannel);
            } else {
                byte[] ps = new byte[imageWidth * 3 + 1];
                byte[] bs = new byte[imageWidth * 3 + 1];

                assert (bs.length < BUFFER_SIZE);

                int read = 0;

                InputStream inflaterInputStream = new BufferedInputStream(new InflaterInputStream(new LimitedInputStream(
                        inChannel), new Inflater(), 2048), BUFFER_SIZE);
                ByteArrayOutputStream baos = new ByteArrayOutputStream(sectionLength);
                DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(baos, new Deflater(), 2048);

                while ((read = (inflaterInputStream.read(bs))) > 0) {
                    reconstruct(bs, ps);
                    transformColors(bs, 1, read - 1);

                    deflaterOutputStream.write(bs, 0, read);

                    byte[] swapVar = bs;
                    bs = ps;
                    ps = swapVar;
                }

                deflaterOutputStream.finish();

                byte[] compressedSectionBytes = baos.toByteArray();
                writeInt(outChannel, compressedSectionBytes.length);

                CRC32 crc32 = new CRC32();
                outChannel.write(chunkTypeBytes);
                crc32.update(chunkTypeBytes);

                if (inChannel.skip(4) < 4) {
                    throw new IllegalArgumentException();
                }

                outChannel.write(compressedSectionBytes);

                writeInt(outChannel, (int) crc32.getValue());
            }
        }
    }

    ;

    private Section readNextSection(InputStream inChannel) throws IOException {
        int read = inChannel.read(lengthBytes);
        if (read != -1) {
            if (read < lengthBytes.length) {
                throw new IllegalArgumentException();
            }

            if (inChannel.read(chunkTypeBytes) < chunkTypeBytes.length) {
                throw new IllegalArgumentException();
            }

            IntBuffer lengthBuffer = ByteBuffer.wrap(lengthBytes).order(ByteOrder.BIG_ENDIAN).asIntBuffer();
            sectionLength = lengthBuffer.get(0);
            String chunkTypeString = new String(chunkTypeBytes, asciiCharset);

            if ("IHDR".equals(chunkTypeString)) {
                return new HeaderSection();
            } else if ("PLTE".equals(chunkTypeString)) {
                return new PaletteSection();
            } else if ("IDAT".equals(chunkTypeString)) {
                return new DataSection();
            } else {
                return new Section();
            }
        } else {
            return null;
        }
    }

    public void process(OutputStream outStream, Object data) throws Exception {
        colors = ((MediaData) data).getNewColors();

        ExternalContext extContext = FacesContext.getCurrentInstance().getExternalContext();
        BufferedInputStream inStream = new BufferedInputStream(
                extContext.getResourceAsStream(RICHFACES_MEDIA_OUTPUT_IMAGE_SOURCE), BUFFER_SIZE);
        try {
            // skip 8-bytes of header
            byte[] bs = new byte[8];
            if (inStream.read(bs) < bs.length) {
                throw new IllegalArgumentException();
            }
            outStream.write(bs);

            Section section = null;
            while ((section = readNextSection(inStream)) != null) {
                section.write(inStream, outStream);
            }
        } finally {
            inStream.close();
            outStream.close();
        }
    }
}
