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
import userPart.model.UserPartConfig;
import utils.DBConnection;

/**
 *
 * @author Vladimir Tomic
 */
public class UserPartConfigDAO {

    public static LinkedList<UserPartConfig> getAll() {
        LinkedList<UserPartConfig> userPartConfigs = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM user_part_config");
        try {
            while (rs.next()) {
                userPartConfigs.add(new UserPartConfig(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getBoolean("title"),
                        rs.getBoolean("subtitle"),
                        rs.getBoolean("lead"),
                        rs.getBoolean("body"),
                        rs.getBoolean("date_created"),
                        rs.getBoolean("date_modified"),
                        rs.getBoolean("author"),
                        rs.getBoolean("image"),
                        rs.getBoolean("gallery")));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserPartConfig.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userPartConfigs;
    }

    public static LinkedList<UserPartConfig> getAllWhere(String where) {
        LinkedList<UserPartConfig> userPartConfigs = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM user_part_config WHERE " + where);
        try {
            while (rs.next()) {
                userPartConfigs.add(new UserPartConfig(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getBoolean("title"),
                        rs.getBoolean("subtitle"),
                        rs.getBoolean("lead"),
                        rs.getBoolean("body"),
                        rs.getBoolean("date_created"),
                        rs.getBoolean("date_modified"),
                        rs.getBoolean("author"),
                        rs.getBoolean("image"),
                        rs.getBoolean("gallery")));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserPartConfig.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userPartConfigs;
    }

    public static UserPartConfig getById(long id) {
        UserPartConfig userPartConfig = new UserPartConfig();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM user_part_config WHERE id=" + id);
        try {
            if (rs.next()) {
                userPartConfig = new UserPartConfig(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getBoolean("title"),
                        rs.getBoolean("subtitle"),
                        rs.getBoolean("lead"),
                        rs.getBoolean("body"),
                        rs.getBoolean("date_created"),
                        rs.getBoolean("date_modified"),
                        rs.getBoolean("author"),
                        rs.getBoolean("image"),
                        rs.getBoolean("gallery"));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserPartConfig.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userPartConfig;
    }

    public static UserPartConfig getWhere(String where) {
        System.out.println("DEBUG ::: UserPartConfigDAO:getWhere:" + where);
        UserPartConfig userPartConfig = new UserPartConfig();
        String query = "SELECT * FROM user_part_config WHERE " + where;
        ResultSet rs = DBConnection.getInstance().executeQuery(query);
        try {
            if (rs.next()) {
                userPartConfig = new UserPartConfig(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getBoolean("title"),
                        rs.getBoolean("subtitle"),
                        rs.getBoolean("lead"),
                        rs.getBoolean("body"),
                        rs.getBoolean("date_created"),
                        rs.getBoolean("date_modified"),
                        rs.getBoolean("author"),
                        rs.getBoolean("image"),
                        rs.getBoolean("gallery"));
            } else {
                userPartConfig = null;
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserPartConfig.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userPartConfig;
    }

    public static long add(UserPartConfig userPartConfig) {
        long last = 0;
        try {
            String query1 = "SELECT MAX(id) AS last FROM user_part_config";
            ResultSet rs1 = DBConnection.getInstance().executeQuery(query1);

            try {
                if (rs1.next()) {
                    last = rs1.getLong("last");
                } else {
                    last = 0;
                }
                String query2 = "INSERT INTO user_part_config VALUES(" + ++last + ",'"
                        + userPartConfig.getName() + "',"
                        + userPartConfig.isHasTitle() + ","
                        + userPartConfig.isHasSubtitle() + ","
                        + userPartConfig.isHasLead() + ","
                        + userPartConfig.isHasBody() + ","
                        + userPartConfig.isHasDateCreated() + ","
                        + userPartConfig.isHasDateModified() + ","
                        + userPartConfig.isHasAuthor() + ","
                        + userPartConfig.isHasImage() + ","
                        + userPartConfig.isHasGallery() + ")";
                System.out.println("DEBUG ::: UserPartConfigDAO:add:query=" + query2);
                DBConnection.getInstance().executeUpdate(query2);
                userPartConfig.setId(last);
                rs1.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserPartConfig.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(UserPartConfig.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(UserPartConfig userPartConfig) {
        String query = "update user_part_config set"
                + " name='" + userPartConfig.getName() + "',"
                + " title=" + userPartConfig.isHasTitle() + ","
                + " subtitle=" + userPartConfig.isHasSubtitle() + ","
                + " lead=" + userPartConfig.isHasLead() + ","
                + " body=" + userPartConfig.isHasBody() + ","
                + " date_created=" + userPartConfig.isHasDateCreated() + ","
                + " date_modified=" + userPartConfig.isHasDateModified() + ","
                + " author=" + userPartConfig.isHasAuthor() + ","
                + " image=" + userPartConfig.isHasImage() + ","
                + " gallery=" + userPartConfig.isHasGallery()
                + " where id=" + userPartConfig.getId();
        System.out.println("DEBUG ::: UserPartConfigDAO:update:query=" + query);
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(long id) {
        String query = "delete from user_part_config where id=" + id;
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(UserPartConfig userPartConfig) {
        String query = "delete from user_part_config where id=" + userPartConfig.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

    public static long countAll() {
        try {
            String query = "SELECT COUNT(*) AS rowcount FROM user_part_config";
            ResultSet rs = DBConnection.getInstance().executeQuery(query);
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(UserPartConfigDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static long countWhere(String where) {
        try {
            String query = "SELECT COUNT(*) AS rowcount FROM user_part_config WHERE " + where;
            ResultSet rs = DBConnection.getInstance().executeQuery(query);
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(UserPartConfigDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}
