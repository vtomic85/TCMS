/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package image.dao;

import image.model.Image;
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

    public static LinkedList<Image> getAll() {
        LinkedList<Image> images = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM image");
        try {
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

    public static LinkedList<Image> getAllWhere(String where) {
        LinkedList<Image> images = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM image WHERE " + where);
        try {
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
        Image image = new Image();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM image WHERE id=" + id);
        try {
            if (rs.next()) {
                image = new Image(
                        rs.getLong("id"),
                        rs.getString("title"),
                        rs.getString("img_path"),
                        rs.getLong("gallery_id"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Image.class.getName()).log(Level.SEVERE, null, ex);
        }
        return image;
    }

    public static long add(Image image) {
        long last = -1;
        try {
            String query1 = "SELECT MAX(id) AS last FROM image";
            ResultSet rs1 = DBConnection.getInstance().executeQuery(query1);

            try {
                if (rs1.next()) {
                    last = rs1.getLong("last");
                } else {
                    last = 0;
                }
                String query2 = "INSERT INTO image VALUES("
                        + ++last + ", '"
                        + image.getTitle() + "','"
                        + image.getImgPath() + "',"
                        + image.getGalleryId() + ")";
                DBConnection.getInstance().executeUpdate(query2);

            } catch (SQLException ex) {
                Logger.getLogger(Image.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(Image.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void delete(Image image) {
        String query = "delete from image where id=" + image.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

//    public static long update(Image image) {
//        try {
//            final String dbDriver = "com.mysql.jdbc.Driver";
//            final String dbName = "jdbc:mysql://localhost:3306/tcms?useUnicode=true&characterEncoding=UTF-8&characterSetResults=UTF-8";
//            final String dbUsername = "root";
//            final String dbPassword = "";
//            Class.forName(dbDriver);
//            Connection conn = DriverManager.getConnection(dbName, dbUsername, dbPassword);
//            PreparedStatement prepStat = conn.prepareStatement("update image set"
//                    + "img_blob=? "
//                    + "where id=?");
//            prepStat.setBytes(1, image.getImgBlob());
//            prepStat.setLong(2, image.getId());
//            int ok = prepStat.executeUpdate();
//            if (ok > 0) {
//                ResultSet rs = prepStat.getGeneratedKeys();
//                rs.next();
//                return rs.getLong(1);
//            }
//            prepStat.close();
//        } catch (SQLException | ClassNotFoundException ex) {
//            Logger.getLogger(ImageDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return 0;
//    }
    public static void update(Image image) {
        String query = "update image set "
                + " title='" + image.getTitle() + "', "
                + " img_path='" + image.getImgPath() + "', "
                + " gallery_id=" + image.getGalleryId()
                + " where id=" + image.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void updateImageIdForObject(String objectTable, long objectId, long imageId) {
        String query = "update " + objectTable + " set " + " image_id=" + imageId + " where id=" + objectId;
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(long id) {
        String query = "delete from image where id=" + id;
        DBConnection.getInstance().executeUpdate(query);
    }

    public static int countWhere(String where) {
        try {
            String query = "SELECT COUNT(*) AS rowcount FROM image WHERE " + where;
            ResultSet rs = DBConnection.getInstance().executeQuery(query);
            rs.next();
            int count = rs.getInt("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(ImageDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}
