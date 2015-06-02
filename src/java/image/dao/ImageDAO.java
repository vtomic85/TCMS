/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package image.dao;

import image.model.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.DBConnection;

/**
 *
 * @author Vladimir Tomic
 */
public class ImageDAO {

    private static String genericQuery;
    private static PreparedStatement ps;

    public ImageDAO() {

    }

    private static void prepare(String query) throws SQLException {
        ps = DBConnection.getInstance().getConn().prepareStatement(query);
    }

    private static void setPsInsertFields(long id, Image image) throws SQLException {
        ps.setLong(1, id);
        ps.setString(2, image.getTitle());
        ps.setString(3, image.getImgPath());
        ps.setLong(4, image.getGalleryId());
    }

    private static void setPsUpdateFields(Image image) throws SQLException {
        ps.setString(1, image.getTitle());
        ps.setString(2, image.getImgPath());
        ps.setLong(3, image.getGalleryId());
        ps.setLong(10, image.getId());
    }

    public static LinkedList<Image> getAll() {
        return getAllWhere("1=1");
    }

    public static LinkedList<Image> getAllWhere(String where) {
        LinkedList<Image> images = new LinkedList<>();
        try {
            genericQuery = "SELECT * FROM image WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                images.add(new Image(
                        rs.getLong("id"),
                        rs.getString("title"),
                        rs.getString("img_path"),
                        rs.getLong("gallery_id")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Image.class.getName()).log(Level.SEVERE, null, ex);
        }
        return images;
    }

    public static Image getById(long id) {
        return getWhere("id=" + id);
    }

    public static Image getWhere(String where) {
        Image image = new Image();
        try {
            genericQuery = "SELECT * FROM image WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                image = new Image(
                        rs.getLong("id"),
                        rs.getString("title"),
                        rs.getString("img_path"),
                        rs.getLong("gallery_id"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ImageDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return image;
    }

    public static long add(Image image) {
        long last = -1L;
        try {
            genericQuery = "SELECT MAX(id) AS last FROM image";
            prepare(genericQuery);
            ResultSet rs1 = ps.executeQuery();
            if (rs1.next()) {
                last = rs1.getLong("last");
            } else {
                last = 0;
            }
            genericQuery = "INSERT INTO image VALUES(?,?,?,?)";
            prepare(genericQuery);
            setPsInsertFields(++last, image);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Image.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(Image image) {
        try {
            genericQuery = "update image set "
                    + " title=?,"
                    + " img_path=?,"
                    + " gallery_id=?"
                    + " where id=?";
            prepare(genericQuery);
            setPsUpdateFields(image);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ImageDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void updateImageIdForObject(String objectTable, long objectId, long imageId) {
        try {
            genericQuery = "update " + objectTable + " set image_id=? where id=?";
            prepare(genericQuery);
            ps.setLong(1, imageId);
            ps.setLong(2, objectId);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ImageDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void delete(Image image) {
        delete(image.getId());
    }

    public static void delete(long id) {
        try {
            genericQuery = "delete from image where id=?";
            prepare(genericQuery);
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ImageDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static long countAll() {
        return countWhere("1=1");
    }

    public static long countWhere(String where) {
        try {
            genericQuery = "SELECT COUNT(*) AS rowcount FROM image WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(ImageDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}
