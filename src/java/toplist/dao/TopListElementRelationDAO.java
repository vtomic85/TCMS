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
import toplist.model.TopListElementRelation;
import utils.DBConnection;

/**
 *
 * @author Vladimir Tomic
 */
public class TopListElementRelationDAO {

    public static LinkedList<TopListElementRelation> getAll() {
        LinkedList<TopListElementRelation> topListElementRelations = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM toplist_element_relation");
        try {
            while (rs.next()) {
                topListElementRelations.add(new TopListElementRelation(
                        rs.getLong("id"),
                        rs.getLong("toplist_id"),
                        rs.getLong("cms_element_id")));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(TopListElementRelation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return topListElementRelations;
    }

    public static LinkedList<TopListElementRelation> getAllWhere(String where) {
        LinkedList<TopListElementRelation> topListElementRelations = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM toplist_element_relation WHERE " + where);
        try {
            while (rs.next()) {
                topListElementRelations.add(new TopListElementRelation(
                        rs.getLong("id"),
                        rs.getLong("toplist_id"),
                        rs.getLong("cms_element_id")));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(TopListElementRelation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return topListElementRelations;
    }

    public static TopListElementRelation getById(long id) {
        TopListElementRelation topListElementRelation = new TopListElementRelation();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM toplist_element_relation WHERE id=" + id);
        try {
            if (rs.next()) {
                topListElementRelation = new TopListElementRelation(
                        rs.getLong("id"),
                        rs.getLong("toplist_id"),
                        rs.getLong("cms_element_id"));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(TopListElementRelation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return topListElementRelation;
    }

    public static TopListElementRelation getWhere(String where) {
        TopListElementRelation topListElementRelation = new TopListElementRelation();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM toplist_element_relation WHERE " + where);
        try {
            if (rs.next()) {
                topListElementRelation = new TopListElementRelation(
                        rs.getLong("id"),
                        rs.getLong("toplist_id"),
                        rs.getLong("cms_element_id"));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(TopListElementRelation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return topListElementRelation;
    }

    public static long insert(TopListElementRelation topListElementRelation) {
        long last = 0L;
        try {
            String query1 = "SELECT MAX(id) AS last FROM toplist_element_relation";
            ResultSet rs1 = DBConnection.getInstance().executeQuery(query1);

            try {
                if (rs1.next()) {
                    last = rs1.getLong("last");
                } else {
                    last = 0;
                }
                String query2 = "INSERT INTO toplist_element_relation VALUES(" + ++last + ", "
                        + topListElementRelation.getTopListId() + ", "
                        + topListElementRelation.getCmsElementId() + ")";
                DBConnection.getInstance().executeUpdate(query2);
                topListElementRelation.setId(last);
                rs1.close();
            } catch (SQLException ex) {
                Logger.getLogger(TopListElementRelation.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(TopListElementRelation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(TopListElementRelation topListElementRelation) {
        String query = "update toplist_element_relation set"
                + " toplist_id=" + topListElementRelation.getTopListId() + ","
                + " cms_element_id=" + topListElementRelation.getCmsElementId()
                + " where id=" + topListElementRelation.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(long id) {
        String query = "delete from toplist_element_relation where id=" + id;
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void deleteWhere(String where) {
        String query = "delete from toplist_element_relation where " + where;
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(TopListElementRelation topListElementRelation) {
        deleteWhere("id=" + topListElementRelation.getId());
    }

    public static long countWhere(String where) {
        try {
            String query = "SELECT COUNT(*) AS rowcount FROM toplist_element_relation WHERE " + where;
            ResultSet rs = DBConnection.getInstance().executeQuery(query);
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(TopListElementRelationDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}
