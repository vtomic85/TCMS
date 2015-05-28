/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toplist.dao;

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

    public static LinkedList<TopList> getAll() {
        LinkedList<TopList> topLists = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM toplist");
        try {
            while (rs.next()) {
                topLists.add(new TopList(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getLong("type_id")));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(TopList.class.getName()).log(Level.SEVERE, null, ex);
        }
        return topLists;
    }

    public static LinkedList<TopList> getAllWhere(String where) {
        LinkedList<TopList> topLists = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM toplist WHERE " + where);
        try {
            while (rs.next()) {
                topLists.add(new TopList(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getLong("type_id")));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(TopList.class.getName()).log(Level.SEVERE, null, ex);
        }
        return topLists;
    }

    public static TopList getById(long id) {
        TopList topList = new TopList();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM toplist WHERE id=" + id);
        try {
            if (rs.next()) {
                topList = new TopList(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getLong("type_id"));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(TopList.class.getName()).log(Level.SEVERE, null, ex);
        }
        return topList;
    }

    public static TopList getWhere(String where) {
        TopList topList = new TopList();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM toplist WHERE " + where);
        try {
            if (rs.next()) {
                topList = new TopList(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getLong("type_id"));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(TopList.class.getName()).log(Level.SEVERE, null, ex);
        }
        return topList;
    }

    public static long insert(TopList topList) {
        long last = 0L;
        try {
            String query1 = "SELECT MAX(id) AS last FROM toplist";
            ResultSet rs1 = DBConnection.getInstance().executeQuery(query1);

            try {
                if (rs1.next()) {
                    last = rs1.getLong("last");
                } else {
                    last = 0;
                }
                String query2 = "INSERT INTO toplist VALUES(" + ++last + ", '"
                        + topList.getName() + "', "
                        + topList.getTypeId() + ")";
                DBConnection.getInstance().executeUpdate(query2);
                topList.setId(last);
                rs1.close();
            } catch (SQLException ex) {
                Logger.getLogger(TopList.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(TopList.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(TopList topList) {
        String query = "update toplist set"
                + " name='" + topList.getName() + "',"
                + " type_id=" + topList.getTypeId()
                + " where id=" + topList.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(long id) {
        String query = "delete from toplist where id=" + id;
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(TopList topList) {
        String query = "delete from toplist where id=" + topList.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

}
