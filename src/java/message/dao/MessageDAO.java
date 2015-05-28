/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message.dao;

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

    public static LinkedList<Message> getAll() {
        LinkedList<Message> messages = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM message");
        try {
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
            Logger.getLogger(Message.class.getName()).log(Level.SEVERE, null, ex);
        }
        return messages;
    }

    public static LinkedList<Message> getAllWhere(String where) {
        LinkedList<Message> messages = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM message WHERE " + where);
        try {
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
            Logger.getLogger(Message.class.getName()).log(Level.SEVERE, null, ex);
        }
        return messages;
    }

    public static Message getWhere(String where) {
        Message message = new Message();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM message WHERE " + where);
        try {
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
            Logger.getLogger(Message.class.getName()).log(Level.SEVERE, null, ex);
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
        Message message = new Message();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM message WHERE id=" + id);
        try {
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
            }
        } catch (SQLException ex) {
            Logger.getLogger(Message.class.getName()).log(Level.SEVERE, null, ex);
        }
        return message;
    }

    public static long add(Message message) {
        message.calcUtilToSqlDates();
        long last = -1L;
        try {
            String query1 = "SELECT MAX(id) AS last FROM message";
            ResultSet rs1 = DBConnection.getInstance().executeQuery(query1);

            try {
                if (rs1.next()) {
                    last = rs1.getLong("last");
                } else {
                    last = 0;
                }
                String query2 = "INSERT INTO message VALUES(" + ++last + ", "
                        + message.getFromId() + ", "
                        + message.getToId() + ", '"
                        + message.getSqlDate()+ "', '"
                        + message.getSubject() + "', '"
                        + message.getBody() + "', "
                        + message.isRead() + ", "
                        + message.getFolderId() + ", "
                        + message.getOwnerId() + ")";
                DBConnection.getInstance().executeUpdate(query2);

            } catch (SQLException ex) {
                Logger.getLogger(Message.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(Message.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(Message message) {
        message.calcUtilToSqlDates();
        String query = "update message set "
                + " from_id=" + message.getFromId() + ","
                + " to_id=" + message.getToId() + ","
                + " subject='" + message.getSubject() + "',"
                + " body='" + message.getBody() + "',"
                + " date='" + message.getSqlDate() + "',"
                + " msg_read=" + message.isRead() + ","
                + " folder_id=" + message.getFolderId() + ","
                + " owner_id=" + message.getOwnerId()
                + " where id=" + message.getId();
        System.out.println("DEBUG ::: MessageDAO:update:query=" + query);
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(long messageId, long ownerId, boolean permanently) {
        String query = "delete from message where id=" + messageId;
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void discard(Message message) {
        String query = "delete from message where id=" + message.getId();
        DBConnection.getInstance().executeUpdate(query);
    }
//    public static void delete(Message message) {
//        String query = "delete from message where id=" + message.getId();
//        DBConnection.getInstance().executeUpdate(query);
//    }
//
//    public static void deleteForUser(long userId) {
//        String query = "delete from message where to=" + userId;
//        DBConnection.getInstance().executeUpdate(query);
//    }
}
