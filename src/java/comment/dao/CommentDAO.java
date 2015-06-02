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
        LinkedList<Comment> comments = new LinkedList<>();
        try {
            String query = "SELECT * FROM comment";
            prepare(query);
            ResultSet rs = ps.executeQuery();
//        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM comment");
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
        } catch (SQLException ex) {
            Logger.getLogger(CommentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return comments;
    }

    public static LinkedList<Comment> getAllWhere(String where) {
        LinkedList<Comment> comments = new LinkedList<>();
        try {
            String query = "SELECT * FROM comment WHERE " + where;
            prepare(query);
            ResultSet rs = ps.executeQuery();
//        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM comment WHERE " + where);
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
//        Comment comment = new Comment();
//        try {
//            String query = "SELECT * FROM comment WHERE id=?";
//            prepare(query);
//            ps.setLong(1, comment.getId());
//            ResultSet rs = ps.executeQuery();
////        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM comment WHERE id=" + id);
//            try {
//                if (rs.next()) {
//                    comment = new Comment(
//                            rs.getLong("id"),
//                            rs.getInt("component_type_id"),
//                            rs.getLong("component_id"),
//                            rs.getLong("user_id"),
//                            rs.getString("user_name"),
//                            rs.getString("body"),
//                            rs.getDate("date_created"),
//                            rs.getBoolean("published"),
//                            rs.getInt("positive_votes"),
//                            rs.getInt("negative_votes"));
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(Comment.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(CommentDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return comment;
    }

    public static Comment getWhere(String where) {
        Comment comment = new Comment();
        try {
            String query = "SELECT * FROM comment WHERE " + where;
            prepare(query);
            ResultSet rs = ps.executeQuery();
//        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM comment WHERE " + where);
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
        } catch (SQLException ex) {
            Logger.getLogger(CommentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return comment;
    }

    public static long add(Comment comment) {
        long last = -1L;
        try {
            String query1 = "SELECT MAX(id) AS last FROM comment";
//            ResultSet rs1 = DBConnection.getInstance().executeQuery(query1);
            ps = DBConnection.getInstance().getConn().prepareStatement(query1);
            ResultSet rs1 = ps.executeQuery();

            try {
                if (rs1.next()) {
                    last = rs1.getLong("last");
                } else {
                    last = 0;
                }
                genericQuery = "INSERT INTO comment VALUES(?,?,?,?,?,?,?,?,?,?)";
                ps = DBConnection.getInstance().getConn().prepareStatement(genericQuery);
                setPsInsertFields(++last, comment);
                ps.executeUpdate();
//                ps.setLong(1, ++last);
//                ps.setInt(2, comment.getComponentTypeId());
//                ps.setLong(3, comment.getComponentId());
//                ps.setLong(4, comment.getUserId());
//                ps.setString(5, comment.getUserName());
//                ps.setString(6, comment.getBody());
//                ps.setDate(7, comment.getSqlDateCreated());
//                ps.setBoolean(8, comment.isPublished());
//                ps.setInt(9, comment.getPositiveVotes());
//                ps.setInt(10, comment.getNegativeVotes());

//                String query2 = "INSERT INTO comment VALUES(" + ++last + ","
//                        + comment.getComponentTypeId() + ","
//                        + comment.getComponentId() + ","
//                        + comment.getUserId() + ",'"
//                        + comment.getUserName() + "','"
//                        + comment.getBody() + "','"
//                        + comment.getSqlDateCreated() + "',"
//                        + comment.isPublished() + ","
//                        + comment.getPositiveVotes() + ","
//                        + comment.getNegativeVotes() + ")";
//                DBConnection.getInstance().executeUpdate(query2);
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
            ps = DBConnection.getInstance().getConn().prepareStatement(genericQuery);
            setPsUpdateFields(comment);
            ps.executeUpdate();
//            String query = "update comment set "
//                    + " component_type_id=" + comment.getComponentTypeId() + ","
//                    + " component_id=" + comment.getComponentId() + ","
//                    + " user_id=" + comment.getUserId() + ","
//                    + " user_name='" + comment.getUserName() + "',"
//                    + " body='" + comment.getBody() + "',"
//                    + " date_created='" + comment.getSqlDateCreated() + "',"
//                    + " published=" + comment.isPublished() + ","
//                    + " positive_votes=" + comment.getPositiveVotes() + ","
//                    + " negative_votes=" + comment.getNegativeVotes()
//                    + " where id=" + comment.getId();
//            DBConnection.getInstance().executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(CommentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static long countAll() {
        return countWhere("1=1");
//        try {
//            String query = "SELECT COUNT(*) AS rowcount FROM comment";
//            ps = DBConnection.getInstance().getConn().prepareStatement(query);
//            ResultSet rs = ps.executeQuery();
////            ResultSet rs = DBConnection.getInstance().executeQuery(query);
//            rs.next();
//            long count = rs.getLong("rowcount");
//            return count;
//        } catch (SQLException ex) {
//            Logger.getLogger(CommentDAO.class.getName()).log(Level.SEVERE, null, ex);
//            return 0;
//        }
    }

    public static long countWhere(String where) {
        try {
            String query = "SELECT COUNT(*) AS rowcount FROM comment WHERE " + where;
            ps = DBConnection.getInstance().getConn().prepareStatement(query);
            ResultSet rs = ps.executeQuery();
//            ResultSet rs = DBConnection.getInstance().executeQuery(query);
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(CommentDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static void delete(Comment comment) {
        try {
            //        String query = "delete from comment where id=" + comment.getId();
//        DBConnection.getInstance().executeUpdate(query);
            String query = "delete from comment where id=?";
            ps = DBConnection.getInstance().getConn().prepareStatement(query);
            ps.setLong(1, comment.getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CommentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void delete(long id) {
        try {
            //        String query = "delete from comment where id=" + id;
//        DBConnection.getInstance().executeUpdate(query);
            String query = "delete from comment where id=?";
            ps = DBConnection.getInstance().getConn().prepareStatement(query);
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CommentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
