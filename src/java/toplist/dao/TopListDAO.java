/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toplist.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import toplist.model.TopList;
import utils.DBConnection;

/**
 *
 * @author Vladimir Tomic
 */
public class TopListDAO {

    private static String genericQuery;
    private static PreparedStatement ps;

    public TopListDAO() {

    }

    private static void prepare(String query) throws SQLException {
        ps = DBConnection.getInstance().getConn().prepareStatement(query);
    }

    private static void setPsInsertFields(long id, TopList tl) throws SQLException {
        ps.setLong(1, id);
        ps.setString(2, tl.getName());
        ps.setLong(3, tl.getTypeId());
    }

    private static void setPsUpdateFields(TopList tl) throws SQLException {
        ps.setString(1, tl.getName());
        ps.setLong(2, tl.getTypeId());
        ps.setLong(3, tl.getId());
    }

    public static LinkedList<TopList> getAll() {
        return getAllWhere("1=1");
    }

    public static LinkedList<TopList> getAllWhere(String where) {
        LinkedList<TopList> topLists = new LinkedList<>();
        try {
            genericQuery = "SELECT * FROM toplist WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                topLists.add(new TopList(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getLong("type_id")));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(TopListDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return topLists;
    }

    public static TopList getById(long id) {
        return getWhere("id=" + id);
    }

    public static TopList getWhere(String where) {
        TopList topList = new TopList();
        try {
            genericQuery = "SELECT * FROM toplist WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                topList = new TopList(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getLong("type_id"));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(TopListDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return topList;
    }

    public static long add(TopList tl) {
        long last = -1L;
        try {
            genericQuery = "SELECT MAX(id) AS last FROM toplist";
            prepare(genericQuery);
            ResultSet rs1 = ps.executeQuery();
            if (rs1.next()) {
                last = rs1.getLong("last");
            } else {
                last = 0;
            }
            genericQuery = "INSERT INTO toplist VALUES(?,?,?)";
            prepare(genericQuery);
            setPsInsertFields(++last, tl);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TopListDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(TopList tl) {
        try {
            genericQuery = "update toplist set"
                    + " name=?,"
                    + " type_id=?"
                    + " where id=?";
            prepare(genericQuery);
            setPsUpdateFields(tl);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TopListDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static long countAll() {
        return countWhere("1=1");
    }

    public static long countWhere(String where) {
        try {
            genericQuery = "SELECT COUNT(*) AS rowcount FROM toplist WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(TopListDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static void delete(TopList tl) {
        delete(tl.getId());
    }

    public static void delete(long id) {
        try {
            genericQuery = "delete from toplist where id=?";
            prepare(genericQuery);
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TopListDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
