/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userPart.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import userPart.model.UserPart;
import utils.DBConnection;

/**
 *
 * @author Vladimir Tomic
 */
public class UserPartDAO {

    public static LinkedList<UserPart> getAll() {
        LinkedList<UserPart> userParts = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM user_part");
        try {
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

    public static LinkedList<UserPart> getAllOrderBy(String order) {
        LinkedList<UserPart> userParts = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM user_part ORDER BY " + order);
        try {
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
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM user_part WHERE " + where);
        try {
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
        UserPart userPart = new UserPart();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM user_part WHERE id=" + id);
        try {
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
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserPart.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userPart;
    }

    public static UserPart getWhere(String where) {
        System.out.println("DEBUG ::: UserPartDAO:getWhere:" + where);
        UserPart userPart = new UserPart();
        String query = "SELECT * FROM user_part WHERE " + where;
        ResultSet rs = DBConnection.getInstance().executeQuery(query);
        try {
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
        long last = 0;
        try {
            String query1 = "SELECT MAX(id) AS last FROM user_part";
            ResultSet rs1 = DBConnection.getInstance().executeQuery(query1);

            try {
                if (rs1.next()) {
                    last = rs1.getLong("last");
                } else {
                    last = 0;
                }
                String query2 = "INSERT INTO user_part VALUES(" + ++last + ","
                        + userPart.getConfigId() + ","
                        + userPart.getItemId() + ",'"
                        + userPart.getName() + "','"
                        + userPart.getTitle() + "','"
                        + userPart.getSubtitle() + "','"
                        + userPart.getLead() + "','"
                        + userPart.getBody() + "','"
                        + userPart.getSqlDateCreated() + "','"
                        + userPart.getSqlDateModified() + "','"
                        + userPart.getAuthor() + "','"
                        + userPart.getImgPath() + "',"
                        + userPart.getGalleryId() + ","
                        + userPart.getComments() + ","
                        + userPart.getViews() + ","
                        + userPart.isPublished() + ")";
                DBConnection.getInstance().executeUpdate(query2);
                userPart.setId(last);
                rs1.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserPart.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(UserPart.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(UserPart userPart) {
        String query = "update user_part set"
                + " config_id=" + userPart.getConfigId() + ","
                + " item_id=" + userPart.getItemId() + ","
                + " name='" + userPart.getName() + "',"
                + " title='" + userPart.getTitle() + "',"
                + " subtitle='" + userPart.getSubtitle() + "',"
                + " lead='" + userPart.getLead() + "',"
                + " body='" + userPart.getBody() + "',"
                + " date_created='" + userPart.getSqlDateCreated() + "',"
                + " date_modified='" + userPart.getSqlDateModified() + "',"
                + " author='" + userPart.getAuthor() + "',"
                + " img_path='" + userPart.getImgPath() + "',"
                + " gallery_id=" + userPart.getGalleryId() + ","
                + " comments=" + userPart.getComments() + ","
                + " views=" + userPart.getViews() + ","
                + " published=" + userPart.isPublished()
                + " where id=" + userPart.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(long id) {
        String query = "delete from user_part where id=" + id;
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(UserPart userPart) {
        String query = "delete from user_part where id=" + userPart.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

    public static long countAll() {
        try {
            String query = "SELECT COUNT(*) AS rowcount FROM user_part";
            ResultSet rs = DBConnection.getInstance().executeQuery(query);
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(UserPartDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static long countWhere(String where) {
        try {
            String query = "SELECT COUNT(*) AS rowcount FROM user_part WHERE " + where;
            ResultSet rs = DBConnection.getInstance().executeQuery(query);
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(UserPartDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}
