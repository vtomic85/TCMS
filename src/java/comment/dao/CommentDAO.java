/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comment.dao;

import comment.model.Comment;
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
public class CommentDAO {

    private static String genericQuery;
    private static PreparedStatement ps;

    public CommentDAO() {

    }

    private static void prepare(String query) throws SQLException {
        ps = DBConnection.getInstance().getConn().prepareStatement(query);
    }

    private static void setPsInsertFields(long id, Comment comment) throws SQLException {
        ps.setLong(1, id);
        ps.setInt(2, comment.getComponentTypeId());
        ps.setLong(3, comment.getComponentId());
        ps.setLong(4, comment.getUserId());
        ps.setString(5, comment.getUserName());
        ps.setString(6, comment.getBody());
        ps.setDate(7, comment.getSqlDateCreated());
        ps.setBoolean(8, comment.isPublished());
        ps.setInt(9, comment.getPositiveVotes());
        ps.setInt(10, comment.getNegativeVotes());
    }

    private static void setPsUpdateFields(Comment comment) throws SQLException {
        ps.setInt(1, comment.getComponentTypeId());
        ps.setLong(2, comment.getComponentId());
        ps.setLong(3, comment.getUserId());
        ps.setString(4, comment.getUserName());
        ps.setString(5, comment.getBody());
        ps.setDate(6, comment.getSqlDateCreated());
        ps.setBoolean(7, comment.isPublished());
        ps.setInt(8, comment.getPositiveVotes());
        ps.setInt(9, comment.getNegativeVotes());
        ps.setLong(10, comment.getId());
    }

    public static LinkedList<Comment> getAll() {
        return getAllWhere("1=1");
    }

    public static LinkedList<Comment> getAllWhere(String where) {
        LinkedList<Comment> comments = new LinkedList<>();
        try {
            genericQuery = "SELECT * FROM comment WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                comments.add(new Comment(
                        rs.getLong("id"),
                        rs.getInt("component_type_id"),
                        rs.getLong("component_id"),
                        rs.getLong("user_id"),
                        rs.getString("user_name"),
                        rs.getString("body"),
                        rs.getDate("date_created"),
                        rs.getBoolean("published"),
                        rs.getInt("positive_votes"),
                        rs.getInt("negative_votes")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CommentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return comments;
    }

    public static LinkedList<Comment> getAllFor(int componentTypeId, long componentId) {
        return getAllWhere("component_type_id=" + componentTypeId + " and component_id=" + componentId);
    }

    public static Comment getById(long id) {
        return getWhere("id=" + id);
    }

    public static Comment getWhere(String where) {
        Comment comment = new Comment();
        try {
            genericQuery = "SELECT * FROM comment WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                comment = new Comment(
                        rs.getLong("id"),
                        rs.getInt("component_type_id"),
                        rs.getLong("component_id"),
                        rs.getLong("user_id"),
                        rs.getString("user_name"),
                        rs.getString("body"),
                        rs.getDate("date_created"),
                        rs.getBoolean("published"),
                        rs.getInt("positive_votes"),
                        rs.getInt("negative_votes"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CommentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return comment;
    }

    public static long add(Comment comment) {
        long last = -1L;
        try {
            genericQuery = "SELECT MAX(id) AS last FROM comment";
            prepare(genericQuery);
            ResultSet rs1 = ps.executeQuery();
            if (rs1.next()) {
                last = rs1.getLong("last");
            } else {
                last = 0;
            }
            genericQuery = "INSERT INTO comment VALUES(?,?,?,?,?,?,?,?,?,?)";
            prepare(genericQuery);
            setPsInsertFields(++last, comment);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Comment.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(Comment comment) {
        try {
            genericQuery = "update comment set"
                    + " component_type_id=?,"
                    + " component_id=?,"
                    + " user_id=?,"
                    + " user_name=?,"
                    + " body=?,"
                    + " date_created=?,"
                    + " published=?,"
                    + " positive_votes=?,"
                    + " negative_votes=?"
                    + " where id=?";
            prepare(genericQuery);
            setPsUpdateFields(comment);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CommentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static long countAll() {
        return countWhere("1=1");
    }

    public static long countWhere(String where) {
        try {
            genericQuery = "SELECT COUNT(*) AS rowcount FROM comment WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(CommentDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static void delete(Comment comment) {
        delete(comment.getId());
    }

    public static void delete(long id) {
        try {
            genericQuery = "delete from comment where id=?";
            prepare(genericQuery);
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CommentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
