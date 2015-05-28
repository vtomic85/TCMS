/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comment.dao;

import comment.model.Comment;
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

    public CommentDAO() {

    }

    public static LinkedList<Comment> getAll() {
        LinkedList<Comment> comments = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM comment");
        try {
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
            Logger.getLogger(Comment.class.getName()).log(Level.SEVERE, null, ex);
        }
        return comments;
    }

    public static LinkedList<Comment> getAllWhere(String where) {
        LinkedList<Comment> comments = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM comment WHERE " + where);
        try {
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
            Logger.getLogger(Comment.class.getName()).log(Level.SEVERE, null, ex);
        }
        return comments;
    }

    public static LinkedList<Comment> getAllFor(int componentTypeId, long componentId) {
        return getAllWhere("component_type_id=" + componentTypeId + " and component_id=" + componentId);
    }

    public static Comment getById(long id) {
        Comment comment = new Comment();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM comment WHERE id=" + id);
        try {
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
            Logger.getLogger(Comment.class.getName()).log(Level.SEVERE, null, ex);
        }
        return comment;
    }

    public static Comment getWhere(String where) {
        Comment comment = new Comment();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM comment WHERE " + where);
        try {
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
            Logger.getLogger(Comment.class.getName()).log(Level.SEVERE, null, ex);
        }
        return comment;
    }

    public static long add(Comment comment) {
        long last = -1L;
        try {
            String query1 = "SELECT MAX(id) AS last FROM comment";
            ResultSet rs1 = DBConnection.getInstance().executeQuery(query1);

            try {
                if (rs1.next()) {
                    last = rs1.getLong("last");
                } else {
                    last = 0;
                }

                String query2 = "INSERT INTO comment VALUES(" + ++last + ","
                        + comment.getComponentTypeId() + ","
                        + comment.getComponentId() + ","
                        + comment.getUserId() + ",'"
                        + comment.getUserName() + "','"
                        + comment.getBody() + "','"
                        + comment.getSqlDateCreated() + "',"
                        + comment.isPublished() + ","
                        + comment.getPositiveVotes() + ","
                        + comment.getNegativeVotes() + ")";
                DBConnection.getInstance().executeUpdate(query2);

            } catch (SQLException ex) {
                Logger.getLogger(Comment.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(Comment.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(Comment comment) {
        String query = "update comment set "
                + " component_type_id=" + comment.getComponentTypeId() + ","
                + " component_id=" + comment.getComponentId() + ","
                + " user_id=" + comment.getUserId() + ","
                + " user_name='" + comment.getUserName() + "',"
                + " body='" + comment.getBody() + "',"
                + " date_created='" + comment.getSqlDateCreated() + "',"
                + " published=" + comment.isPublished() + ","
                + " positive_votes=" + comment.getPositiveVotes() + ","
                + " negative_votes=" + comment.getNegativeVotes()
                + " where id=" + comment.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

    public static long countAll() {
        try {
            String query = "SELECT COUNT(*) AS rowcount FROM comment";
            ResultSet rs = DBConnection.getInstance().executeQuery(query);
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(CommentDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static long countWhere(String where) {
        try {
            String query = "SELECT COUNT(*) AS rowcount FROM comment WHERE " + where;
            ResultSet rs = DBConnection.getInstance().executeQuery(query);
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(CommentDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static void delete(Comment comment) {
        String query = "delete from comment where id=" + comment.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(long id) {
        String query = "delete from comment where id=" + id;
        DBConnection.getInstance().executeUpdate(query);
    }
}
