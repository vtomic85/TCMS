package image.model;

/**
 *
 * @author Vladimir Tomic
 */
public class Image {

    private long id;
    private String title;
    private String imgPath;
    private long galleryId;

    public Image(long id, String title, String imgPath,long galleryId) {
        this.id = id;
        this.title = title;
        this.imgPath = imgPath;
        this.galleryId=galleryId;
    }

    public Image() {
        this(0, null, null,0);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public long getGalleryId() {
        return galleryId;
    }

    public void setGalleryId(long galleryId) {
        this.galleryId = galleryId;
    }
}
