/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import part.model.Part;
import platform.model.Commons;
import utils.DBConnection;

/**
 *
 * @author Vladimir Tomic
 */
public class PartDAO {

    public static LinkedList<Part> getAll() {
        LinkedList<Part> parts = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM part");
        try {
            while (rs.next()) {
                parts.add(new Part(
                        rs.getLong("id"),
                        rs.getString("folder"),
                        rs.getString("name"),
                        rs.getInt("item_type"),
                        rs.getBoolean("toplist_needed"),
                        rs.getInt("width"),
                        rs.getLong("toplist_id")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Part.class.getName()).log(Level.SEVERE, null, ex);
        }
        return parts;
    }

    public static LinkedList<Part> getAllWhere(String where) {
        LinkedList<Part> parts = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM part WHERE " + where);
        try {
            while (rs.next()) {
                parts.add(new Part(
                        rs.getLong("id"),
                        rs.getString("folder"),
                        rs.getString("name"),
                        rs.getInt("item_type"),
                        rs.getBoolean("toplist_needed"),
                        rs.getInt("width"),
                        rs.getLong("toplist_id")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Part.class.getName()).log(Level.SEVERE, null, ex);
        }
        return parts;
    }

    public static LinkedList<Part> getAllOneThirds() {
        return getAllWhere("width=" + Commons.REGION_WIDTH_ONE_THIRD);
    }

    public static LinkedList<Part> getAllOneHalves() {
        return getAllWhere("width=" + Commons.REGION_WIDTH_ONE_HALF);
    }

    public static LinkedList<Part> getAllTwoThirds() {
        return getAllWhere("width=" + Commons.REGION_WIDTH_TWO_THIRDS);
    }

    public static LinkedList<Part> getAllFulls() {
        return getAllWhere("width=" + Commons.REGION_WIDTH_FULL);
    }

    public static LinkedList<Part> getAllForWidth(int width) {
        return getAllWhere("width=" + width);
    }

    public static Part getById(long id) {
        Part part = new Part();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM part WHERE id=" + id);
        try {
            if (rs.next()) {
                part = new Part(
                        rs.getLong("id"),
                        rs.getString("folder"),
                        rs.getString("name"),
                        rs.getInt("item_type"),
                        rs.getBoolean("toplist_needed"),
                        rs.getInt("width"),
                        rs.getLong("toplist_id"));
                System.out.println("DEBUG ::: PartDAO:getById:part " + part.getId() + " " + part.getName() + " " + part.getTopListId());
            }
        } catch (SQLException ex) {
            Logger.getLogger(Part.class.getName()).log(Level.SEVERE, null, ex);
        }
        return part;
    }

    public static Part getWhere(String where) {
        Part part = new Part();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM part WHERE " + where);
        try {
            if (rs.next()) {
                part = new Part(
                        rs.getLong("id"),
                        rs.getString("folder"),
                        rs.getString("name"),
                        rs.getInt("item_type"),
                        rs.getBoolean("toplist_needed"),
                        rs.getInt("width"),
                        rs.getLong("toplist_id"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Part.class.getName()).log(Level.SEVERE, null, ex);
        }
        return part;
    }

    public static long add(Part part) {
        long last = -1L;
        try {
            String query1 = "SELECT MAX(id) AS last FROM part";
            ResultSet rs1 = DBConnection.getInstance().executeQuery(query1);

            try {
                if (rs1.next()) {
                    last = rs1.getLong("last");
                } else {
                    last = 0;
                }
                String query2 = "INSERT INTO part VALUES("
                        + ++last + ", '"
                        + part.getFolder() + "', '"
                        + part.getName() + "', "
                        + part.getItemType() + ","
                        + part.isTopListNeeded() + ","
                        + part.getWidth() + ","
                        + part.getTopListId() + ")";
                DBConnection.getInstance().executeUpdate(query2);

            } catch (SQLException ex) {
                Logger.getLogger(Part.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(Part.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(Part part) {
        String query = "update part set "
                + " folder='" + part.getFolder() + "',"
                + " name='" + part.getName() + "',"
                + " item_type=" + part.getItemType() + ","
                + " toplist_needed=" + part.isTopListNeeded() + ","
                + " width=" + part.getWidth() + ","
                + " toplist_id=" + part.getTopListId()
                + " where id=" + part.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

    public static long countAll() {
        try {
            String query = "SELECT COUNT(*) AS rowcount FROM part";
            ResultSet rs = DBConnection.getInstance().executeQuery(query);
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(PartDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static long countWhere(String where) {
        try {
            String query = "SELECT COUNT(*) AS rowcount FROM part WHERE " + where;
            ResultSet rs = DBConnection.getInstance().executeQuery(query);
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(PartDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static void delete(long id) {
        String query = "delete from part where id=" + id;
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(Part part) {
        String query = "delete from part where id=" + part.getId();
        DBConnection.getInstance().executeUpdate(query);
    }
}
