/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gallery.dao;

import gallery.model.Gallery;
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
public class GalleryDAO {

    private static String genericQuery;
    private static PreparedStatement ps;

    public GalleryDAO() {

    }

    private static void prepare(String query) throws SQLException {
        ps = DBConnection.getInstance().getConn().prepareStatement(query);
    }

    private static void setPsInsertFields(long id, Gallery gallery) throws SQLException {
        ps.setLong(1, id);
        ps.setString(2, gallery.getTitle());
    }

    private static void setPsUpdateFields(Gallery gallery) throws SQLException {
        ps.setString(1, gallery.getTitle());
        ps.setLong(2, gallery.getId());
    }

    public static LinkedList<Gallery> getAll() {
        return getAllWhere("1=1");
    }

    public static LinkedList<Gallery> getAllWhere(String where) {
        LinkedList<Gallery> galleries = new LinkedList<>();
        try {
            genericQuery = "SELECT * FROM gallery WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                galleries.add(new Gallery(
                        rs.getLong("id"),
                        rs.getString("title")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(GalleryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return galleries;
    }

    public static Gallery getById(long id) {
        return getWhere("id=" + id);
    }

    public static Gallery getWhere(String where) {
        Gallery gallery = new Gallery();
        try {
            genericQuery = "SELECT * FROM gallery WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                gallery = new Gallery(
                        rs.getLong("id"),
                        rs.getString("title"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(GalleryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return gallery;
    }

    public static long add(Gallery gallery) {
        long last = -1L;
        try {
            genericQuery = "SELECT MAX(id) AS last FROM gallery";
            prepare(genericQuery);
            ResultSet rs1 = ps.executeQuery();
            if (rs1.next()) {
                last = rs1.getLong("last");
            } else {
                last = 0;
            }
            genericQuery = "INSERT INTO gallery VALUES(?,?)";
            prepare(genericQuery);
            setPsInsertFields(++last, gallery);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Gallery.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(Gallery gallery) {
        try {
            genericQuery = "update gallery set"
                    + " title=?"
                    + " where id=?";
            prepare(genericQuery);
            setPsUpdateFields(gallery);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(GalleryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void updateGalleryIdForObject(String objectTable, long objectId, long galleryId) {
        try {
            genericQuery = "update " + objectTable + " set " + " gallery_id=? where id=?";
            prepare(genericQuery);
            ps.setLong(1, galleryId);
            ps.setLong(2, objectId);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(GalleryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static long countAll() {
        return countWhere("1=1");
    }

    public static long countWhere(String where) {
        try {
            genericQuery = "SELECT COUNT(*) AS rowcount FROM gallery WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(GalleryDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static void delete(Gallery gallery) {
        delete(gallery.getId());
    }

    public static void delete(long id) {
        try {
            genericQuery = "delete from gallery where id=?";
            prepare(genericQuery);
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(GalleryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
