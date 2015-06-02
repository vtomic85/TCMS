/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import message.model.Message;
import platform.model.Commons;
import utils.DBConnection;

/**
 *
 * @author Vladimir Tomic
 */
public class MessageDAO {

    private static String genericQuery;
    private static PreparedStatement ps;

    public MessageDAO() {

    }

    private static void prepare(String query) throws SQLException {
        ps = DBConnection.getInstance().getConn().prepareStatement(query);
    }

    private static void setPsInsertFields(long id, Message msg) throws SQLException {
        ps.setLong(1, id);
        ps.setLong(2, msg.getFromId());
        ps.setLong(3, msg.getToId());
        ps.setDate(4, msg.getSqlDate());
        ps.setString(5, msg.getSubject());
        ps.setString(6, msg.getBody());
        ps.setBoolean(7, msg.isRead());
        ps.setInt(8, msg.getFolderId());
        ps.setLong(9, msg.getOwnerId());
    }

    private static void setPsUpdateFields(Message msg) throws SQLException {
        ps.setLong(1, msg.getFromId());
        ps.setLong(2, msg.getToId());
        ps.setDate(3, msg.getSqlDate());
        ps.setString(4, msg.getSubject());
        ps.setString(5, msg.getBody());        
        ps.setBoolean(6, msg.isRead());
        ps.setInt(7, msg.getFolderId());
        ps.setLong(8, msg.getOwnerId());
        ps.setLong(9, msg.getId());
    }

    public static LinkedList<Message> getAll() {
        return getAllWhere("1=1");
    }

    public static LinkedList<Message> getAllWhere(String where) {
        LinkedList<Message> messages = new LinkedList<>();
        try {
            genericQuery = "SELECT * FROM message WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                messages.add(new Message(
                        rs.getLong("id"),
                        rs.getLong("from_id"),
                        rs.getLong("to_id"),
                        rs.getString("subject"),
                        rs.getString("body"),
                        rs.getDate("date"),
                        rs.getBoolean("msg_read"),
                        rs.getInt("folder_id"),
                        rs.getLong("owner_id")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MessageDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return messages;
    }

    public static Message getWhere(String where) {
        Message message = new Message();
        try {
            genericQuery = "SELECT * FROM message WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                message = new Message(
                        rs.getLong("id"),
                        rs.getLong("from_id"),
                        rs.getLong("to_id"),
                        rs.getString("subject"),
                        rs.getString("body"),
                        rs.getDate("date"),
                        rs.getBoolean("msg_read"),
                        rs.getInt("folder_id"),
                        rs.getLong("owner_id"));
            } else {
                message = null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(MessageDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return message;
    }

    public static LinkedList<Message> getInboxForUser(long userId) {
        return getAllWhere("owner_id=" + userId + " and folder_id=" + Commons.MESSAGEFOLDER_INBOX);
    }

    public static LinkedList<Message> getDraftsForUser(long userId) {
        return getAllWhere("owner_id=" + userId + " and folder_id=" + Commons.MESSAGEFOLDER_DRAFTS);
    }

    public static LinkedList<Message> getSentForUser(long userId) {
        return getAllWhere("owner_id=" + userId + " and folder_id=" + Commons.MESSAGEFOLDER_SENT);
    }

    public static LinkedList<Message> getDeletedForUser(long userId) {
        return getAllWhere("owner_id=" + userId + " and folder_id=" + Commons.MESSAGEFOLDER_DELETED);
    }

    public static LinkedList<Message> getAllForUser(long userId) {
        return getAllWhere("owner_id=" + userId);
    }

    public static LinkedList<Message> getAllUnreadForUser(long userId) {
        return getAllWhere("owner_id=" + userId + " and msg_read=0");
    }

    public static Message getById(long id) {
        return getWhere("id=" + id);
    }

    public static long add(Message message) {
        long last = -1L;
        try {
            genericQuery = "SELECT MAX(id) AS last FROM message";
            prepare(genericQuery);
            ResultSet rs1 = ps.executeQuery();
            if (rs1.next()) {
                last = rs1.getLong("last");
            } else {
                last = 0;
            }
            genericQuery = "INSERT INTO message VALUES(?,?,?,?,?,?,?,?,?)";
            prepare(genericQuery);
            setPsInsertFields(++last, message);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MessageDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(Message message) {
        try {
            genericQuery = "update message set "
                    + " from_id=?,"
                    + " to_id=?,"
                    + " date=?,"
                    + " subject=?,"
                    + " body=?,"                    
                    + " msg_read=?,"
                    + " folder_id=?,"
                    + " owner_id=?"
                    + " where id=?";
            prepare(genericQuery);
            setPsUpdateFields(message);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MessageDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static long countAll() {
        return countWhere("1=1");
    }

    public static long countWhere(String where) {
        try {
            genericQuery = "SELECT COUNT(*) AS rowcount FROM message WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(MessageDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static void delete(Message message) {
        delete(message.getId());
    }

    public static void delete(long id) {
        try {
            genericQuery = "delete from message where id=?";
            prepare(genericQuery);
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MessageDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
