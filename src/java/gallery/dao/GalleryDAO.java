/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gallery.dao;

import gallery.model.Gallery;
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

    public static LinkedList<Gallery> getAll() {
        LinkedList<Gallery> galleries = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM gallery");
        try {
            while (rs.next()) {
                galleries.add(new Gallery(
                        rs.getLong("id"),
                        rs.getString("title")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Gallery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return galleries;
    }

    public static Gallery getById(long id) {
        Gallery gallery = new Gallery();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM gallery WHERE id=" + id);
        try {
            if (rs.next()) {
                gallery = new Gallery(
                        rs.getLong("id"),
                        rs.getString("title"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Gallery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return gallery;
    }

    public static long add(Gallery gallery) {
        long last = -1;
        try {
            String query1 = "SELECT MAX(id) AS last FROM gallery";
            ResultSet rs1 = DBConnection.getInstance().executeQuery(query1);

            try {
                if (rs1.next()) {
                    last = rs1.getLong("last");
                } else {
                    last = 0;
                }
                String query2 = "INSERT INTO gallery VALUES("
                        + ++last + ", '"
                        + gallery.getTitle() + "')";
                DBConnection.getInstance().executeUpdate(query2);

            } catch (SQLException ex) {
                Logger.getLogger(Gallery.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(Gallery.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void delete(Gallery gallery) {
        String query = "delete from gallery where id=" + gallery.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void update(Gallery gallery) {
        String query = "update gallery set "
                + " title='" + gallery.getTitle() + "'"
                + " where id=" + gallery.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void updateGalleryIdForObject(String objectTable, long objectId, long galleryId) {
        String query = "update " + objectTable + " set " + " gallery_id=" + galleryId + " where id=" + objectId;
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(long id) {
        String query = "delete from gallery where id=" + id;
        DBConnection.getInstance().executeUpdate(query);
    }
}
