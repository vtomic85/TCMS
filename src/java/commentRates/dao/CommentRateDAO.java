/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commentRates.dao;

import commentRates.model.CommentRate;
import java.sql.PreparedStatement;
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
public class CommentRateDAO {

    private static String genericQuery;
    private static PreparedStatement ps;

    public CommentRateDAO() {

    }

    private static void prepare(String query) throws SQLException {
        ps = DBConnection.getInstance().getConn().prepareStatement(query);
    }

    private static void setPsInsertFields(long id, CommentRate cr) throws SQLException {
        ps.setLong(1, id);
        ps.setLong(2, cr.getUserId());
        ps.setLong(3, cr.getCommentId());
        ps.setBoolean(4, cr.isPositive());
    }

    private static void setPsUpdateFields(CommentRate cr) throws SQLException {
        ps.setLong(1, cr.getUserId());
        ps.setLong(2, cr.getCommentId());
        ps.setBoolean(3, cr.isPositive());
        ps.setLong(4, cr.getId());

    }

    public static LinkedList<CommentRate> getAll() {
        return getAllWhere("1=1");
    }

    public static LinkedList<CommentRate> getAllWhere(String where) {
        LinkedList<CommentRate> crs = new LinkedList<>();
        try {
            genericQuery = "SELECT * FROM comment_rate WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                crs.add(new CommentRate(
                        rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getLong("comment_id"),
                        rs.getBoolean("positive")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CommentRateDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return crs;
    }

    public static LinkedList<CommentRate> getAllForComment(long commentId) {
        return getAllWhere("comment_id=" + commentId);
    }

    public static LinkedList<CommentRate> getAllForUser(long userId) {
        return getAllWhere("user_id=" + userId);
    }

    public static CommentRate getById(long id) {
        return getWhere("id=" + id);
    }

    public static CommentRate getWhere(String where) {
        CommentRate cr = new CommentRate();
        try {
            genericQuery = "SELECT * FROM comment_rate WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cr = new CommentRate(
                        rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getLong("comment_id"),
                        rs.getBoolean("positive"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CommentRateDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cr;
    }

    public static long add(CommentRate cr) {
        long last = -1L;
        try {
            genericQuery = "SELECT MAX(id) AS last FROM comment_rate";
            prepare(genericQuery);
            ResultSet rs1 = ps.executeQuery();
            if (rs1.next()) {
                last = rs1.getLong("last");
            } else {
                last = 0;
            }
            genericQuery = "INSERT INTO comment_rate VALUES(?,?,?,?)";
            prepare(genericQuery);
            setPsInsertFields(++last, cr);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CommentRate.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(CommentRate cr) {
        try {
            genericQuery = "update comment set"
                    + " user_id=?,"
                    + " comment_id=?,"
                    + " positive=?"
                    + " where id=?";
            prepare(genericQuery);
            setPsUpdateFields(cr);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CommentRateDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static long countAll() {
        return countWhere("1=1");
    }

    public static long countWhere(String where) {
        try {
            genericQuery = "SELECT COUNT(*) AS rowcount FROM comment_rate WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(CommentRateDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static boolean userRated(long userId, long commentId) {
        return countWhere("user_id=" + userId + " and comment_id=" + commentId) > 0;
    }

    public static void delete(CommentRate cr) {
        delete(cr.getId());
    }

    public static void delete(long id) {
        try {
            genericQuery = "delete from comment_rate where id=?";
            prepare(genericQuery);
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CommentRateDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
