/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userpart.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import userpart.model.UserPart;
import utils.DBConnection;

/**
 *
 * @author Vladimir Tomic
 */
public class UserPartDAO {

    private static String genericQuery;
    private static PreparedStatement ps;

    public UserPartDAO() {

    }

    private static void prepare(String query) throws SQLException {
        ps = DBConnection.getInstance().getConn().prepareStatement(query);
    }

    private static void setPsInsertFields(long id, UserPart up) throws SQLException {
        ps.setLong(1, id);
        ps.setLong(2, up.getConfigId());
        ps.setLong(3, up.getItemId());
        ps.setString(4, up.getName());
        ps.setString(5, up.getTitle());
        ps.setString(6, up.getSubtitle());
        ps.setString(7, up.getLead());
        ps.setString(8, up.getBody());
        ps.setDate(9, up.getSqlDateCreated());
        ps.setDate(10, up.getSqlDateModified());
        ps.setString(11, up.getAuthor());
        ps.setString(12, up.getImgPath());
        ps.setLong(13, up.getGalleryId());
        ps.setInt(14, up.getComments());
        ps.setInt(15, up.getViews());
        ps.setBoolean(16, up.isPublished());
    }

    private static void setPsUpdateFields(UserPart up) throws SQLException {
        ps.setLong(1, up.getConfigId());
        ps.setLong(2, up.getItemId());
        ps.setString(3, up.getName());
        ps.setString(4, up.getTitle());
        ps.setString(5, up.getSubtitle());
        ps.setString(6, up.getLead());
        ps.setString(7, up.getBody());
        ps.setDate(8, up.getSqlDateCreated());
        ps.setDate(9, up.getSqlDateModified());
        ps.setString(10, up.getAuthor());
        ps.setString(11, up.getImgPath());
        ps.setLong(12, up.getGalleryId());
        ps.setInt(13, up.getComments());
        ps.setInt(14, up.getViews());
        ps.setBoolean(15, up.isPublished());
        ps.setLong(16, up.getId());
    }

    public static LinkedList<UserPart> getAll() {
        return getAllWhere("1=1");
    }

    public static LinkedList<UserPart> getAllOrderBy(String order) {
        LinkedList<UserPart> userParts = new LinkedList<>();
        try {
            genericQuery = "SELECT * FROM user_part ORDER BY " + order;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                userParts.add(new UserPart(
                        rs.getLong("id"),
                        rs.getLong("config_id"),
                        rs.getLong("item_id"),
                        rs.getString("name"),
                        rs.getString("title"),
                        rs.getString("subtitle"),
                        rs.getString("lead"),
                        rs.getString("body"),
                        rs.getDate("date_created"),
                        rs.getDate("date_modified"),
                        rs.getString("author"),
                        rs.getString("img_path"),
                        rs.getLong("gallery_id"),
                        rs.getInt("comments"),
                        rs.getInt("views"),
                        rs.getBoolean("published")));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserPart.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userParts;
    }

    public static LinkedList<UserPart> getAllWhere(String where) {
        LinkedList<UserPart> userParts = new LinkedList<>();
        try {
            genericQuery = "SELECT * FROM user_part WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                userParts.add(new UserPart(
                        rs.getLong("id"),
                        rs.getLong("config_id"),
                        rs.getLong("item_id"),
                        rs.getString("name"),
                        rs.getString("title"),
                        rs.getString("subtitle"),
                        rs.getString("lead"),
                        rs.getString("body"),
                        rs.getDate("date_created"),
                        rs.getDate("date_modified"),
                        rs.getString("author"),
                        rs.getString("img_path"),
                        rs.getLong("gallery_id"),
                        rs.getInt("comments"),
                        rs.getInt("views"),
                        rs.getBoolean("published")));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserPart.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userParts;
    }

    public static UserPart getById(long id) {
        return getWhere("id=" + id);
    }

    public static UserPart getWhere(String where) {
        UserPart userPart = new UserPart();
        try {
            genericQuery = "SELECT * FROM user_part WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                userPart = new UserPart(
                        rs.getLong("id"),
                        rs.getLong("config_id"),
                        rs.getLong("item_id"),
                        rs.getString("name"),
                        rs.getString("title"),
                        rs.getString("subtitle"),
                        rs.getString("lead"),
                        rs.getString("body"),
                        rs.getDate("date_created"),
                        rs.getDate("date_modified"),
                        rs.getString("author"),
                        rs.getString("img_path"),
                        rs.getLong("gallery_id"),
                        rs.getInt("comments"),
                        rs.getInt("views"),
                        rs.getBoolean("published"));
            } else {
                userPart = null;
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserPart.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userPart;
    }

    public static long add(UserPart userPart) {
        long last = -1L;
        try {
            genericQuery = "SELECT MAX(id) AS last FROM user_part";
            prepare(genericQuery);
            ResultSet rs1 = ps.executeQuery();
            if (rs1.next()) {
                last = rs1.getLong("last");
            } else {
                last = 0;
            }
            genericQuery = "INSERT INTO user_part VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            prepare(genericQuery);
            setPsInsertFields(++last, userPart);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserPart.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(UserPart userPart) {
        try {
            genericQuery = "update user_part set"
                    + " config_id=?,"
                    + " item_id=?,"
                    + " name=?,"
                    + " title=?,"
                    + " subtitle=?,"
                    + " lead=?,"
                    + " body=?,"
                    + " date_created=?,"
                    + " date_modified=?,"
                    + " author=?,"
                    + " img_path=?,"
                    + " gallery_id=?,"
                    + " comments=?,"
                    + " views=?,"
                    + " published=?"
                    + " where id=?";
            prepare(genericQuery);
            setPsUpdateFields(userPart);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserPartDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static long countAll() {
        return countWhere("1=1");
    }

    public static long countWhere(String where) {
        try {
            genericQuery = "SELECT COUNT(*) AS rowcount FROM user_part WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(UserPartDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static void delete(UserPart up) {
        delete(up.getId());
    }

    public static void delete(long id) {
        try {
            genericQuery = "delete from user_part where id=?";
            prepare(genericQuery);
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserPartDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
