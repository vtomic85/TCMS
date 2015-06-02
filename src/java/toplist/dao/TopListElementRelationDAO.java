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
import toplist.model.TopListElementRelation;
import utils.DBConnection;

/**
 *
 * @author Vladimir Tomic
 */
public class TopListElementRelationDAO {

    private static String genericQuery;
    private static PreparedStatement ps;

    public TopListElementRelationDAO() {

    }

    private static void prepare(String query) throws SQLException {
        ps = DBConnection.getInstance().getConn().prepareStatement(query);
    }

    private static void setPsInsertFields(long id, TopListElementRelation tler) throws SQLException {
        ps.setLong(1, id);
        ps.setLong(2, tler.getTopListId());
        ps.setLong(3, tler.getCmsElementId());
    }

    private static void setPsUpdateFields(TopListElementRelation tler) throws SQLException {
        ps.setLong(1, tler.getTopListId());
        ps.setLong(2, tler.getCmsElementId());
        ps.setLong(3, tler.getId());
    }

    public static LinkedList<TopListElementRelation> getAll() {
        return getAllWhere("1=1");
    }

    public static LinkedList<TopListElementRelation> getAllWhere(String where) {
        LinkedList<TopListElementRelation> topListElementRelations = new LinkedList<>();
        try {
            genericQuery = "SELECT * FROM toplist_element_relation WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
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
        return getWhere("id=" + id);
    }

    public static TopListElementRelation getWhere(String where) {
        TopListElementRelation topListElementRelation = new TopListElementRelation();
        try {
            genericQuery = "SELECT * FROM toplist_element_relation WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
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

    public static long add(TopListElementRelation tler) {
        long last = -1L;
        try {
            genericQuery = "SELECT MAX(id) AS last FROM toplist_element_relation";
            prepare(genericQuery);
            ResultSet rs1 = ps.executeQuery();
            if (rs1.next()) {
                last = rs1.getLong("last");
            } else {
                last = 0;
            }
            genericQuery = "INSERT INTO toplist_element_relation VALUES(?,?,?)";
            prepare(genericQuery);
            setPsInsertFields(++last, tler);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TopListElementRelation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(TopListElementRelation tler) {
        try {
            genericQuery = "update toplist_element_relation set"
                    + " toplist_id=?,"
                    + " cms_element_id=?"
                    + " where id=?";
            prepare(genericQuery);
            setPsUpdateFields(tler);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TopListElementRelationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void delete(long id) {
        try {
            genericQuery = "delete from toplist_element_relation where id=?";
            prepare(genericQuery);
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TopListElementRelationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void deleteWhere(String where) {
        try {
            genericQuery = "delete from toplist_element_relation where " + where;
            prepare(genericQuery);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TopListElementRelationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void delete(TopListElementRelation tler) {
        delete(tler.getId());
    }

    public static long countAll() {
        return countWhere("1=1");
    }

    public static long countWhere(String where) {
        try {
            genericQuery = "SELECT COUNT(*) AS rowcount FROM toplist_element_relation WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(TopListElementRelationDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}
