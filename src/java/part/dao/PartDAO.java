/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part.dao;

import java.sql.PreparedStatement;
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

    private static String genericQuery;
    private static PreparedStatement ps;

    public PartDAO() {

    }

    private static void prepare(String query) throws SQLException {
        ps = DBConnection.getInstance().getConn().prepareStatement(query);
    }

    private static void setPsInsertFields(long id, Part part) throws SQLException {
        ps.setLong(1, id);
        ps.setString(2, part.getFolder());
        ps.setString(3, part.getName());
        ps.setLong(4, part.getItemType());
        ps.setBoolean(5, part.isTopListNeeded());
        ps.setInt(6, part.getWidth());
        ps.setLong(7, part.getTopListId());
    }

    private static void setPsUpdateFields(Part part) throws SQLException {
        ps.setString(1, part.getFolder());
        ps.setString(2, part.getName());
        ps.setLong(3, part.getItemType());
        ps.setBoolean(4, part.isTopListNeeded());
        ps.setInt(5, part.getWidth());
        ps.setLong(6, part.getTopListId());
        ps.setLong(7, part.getId());
    }

    public static LinkedList<Part> getAll() {
        return getAllWhere("1=1");
    }

    public static LinkedList<Part> getAllWhere(String where) {
        LinkedList<Part> parts = new LinkedList<>();
        try {
            genericQuery = "SELECT * FROM part WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
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
            Logger.getLogger(PartDAO.class.getName()).log(Level.SEVERE, null, ex);
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
        return getWhere("id=" + id);
    }

    public static Part getWhere(String where) {
        Part part = new Part();
        try {
            genericQuery = "SELECT * FROM part WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
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
            Logger.getLogger(PartDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return part;
    }

    public static long add(Part part) {
        long last = -1L;
        try {
            genericQuery = "SELECT MAX(id) AS last FROM part";
            prepare(genericQuery);
            ResultSet rs1 = ps.executeQuery();
            if (rs1.next()) {
                last = rs1.getLong("last");
            } else {
                last = 0;
            }
            genericQuery = "INSERT INTO part VALUES(?,?,?,?,?,?,?)";
            prepare(genericQuery);
            setPsInsertFields(++last, part);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PartDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(Part part) {
        try {
            genericQuery = "update part set "
                    + " folder=?,"
                    + " name=?,"
                    + " item_type=?,"
                    + " toplist_needed=?,"
                    + " width=?,"
                    + " toplist_id=?"
                    + " where id=?";
            prepare(genericQuery);
            setPsUpdateFields(part);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PartDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static long countAll() {
        return countWhere("1=1");
    }

    public static long countWhere(String where) {
        try {
            genericQuery = "SELECT COUNT(*) AS rowcount FROM part WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(PartDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static void delete(Part part) {
        delete(part.getId());
    }

    public static void delete(long id) {
        try {
            genericQuery = "delete from part where id=?";
            prepare(genericQuery);
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PartDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
