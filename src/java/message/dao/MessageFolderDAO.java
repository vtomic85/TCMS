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
import message.model.MessageFolder;
import utils.DBConnection;

/**
 *
 * @author Vladimir Tomic
 */
public class MessageFolderDAO {

    public static LinkedList<MessageFolder> getAll() {
        LinkedList<MessageFolder> messageFolders = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM message_folder");
        try {
            while (rs.next()) {
                messageFolders.add(new MessageFolder(
                        rs.getInt("id"),
                        rs.getString("name")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MessageFolder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return messageFolders;
    }

    public static LinkedList<MessageFolder> getAllWhere(String where) {
        LinkedList<MessageFolder> messageFolders = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM message_folder WHERE " + where);
        try {
            while (rs.next()) {
                messageFolders.add(new MessageFolder(
                        rs.getInt("id"),
                        rs.getString("name")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MessageFolder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return messageFolders;
    }

    public static MessageFolder getById(long id) {
        MessageFolder messageFolder = new MessageFolder();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM message_folder WHERE id=" + id);
        try {
            if (rs.next()) {
                messageFolder = new MessageFolder(
                        rs.getInt("id"),
                        rs.getString("name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MessageFolder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return messageFolder;
    }

    public static long add(MessageFolder messageFolder) {
        int last = -1;
        try {
            String query1 = "SELECT MAX(id) AS last FROM message_folder";
            ResultSet rs1 = DBConnection.getInstance().executeQuery(query1);

            try {
                if (rs1.next()) {
                    last = rs1.getInt("last");
                } else {
                    last = 0;
                }
                String query2 = "INSERT INTO message_folder VALUES(" + ++last + ", '"
                        + messageFolder.getName() + "')";
                DBConnection.getInstance().executeUpdate(query2);

            } catch (SQLException ex) {
                Logger.getLogger(MessageFolder.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(MessageFolder.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(MessageFolder messageFolder) {
        String query = "update message_folder set "
                + " name='" + messageFolder.getName() + "'"
                + " where id=" + messageFolder.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(long id) {
        String query = "delete from message_folder where id=" + id;
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(MessageFolder messageFolder) {
        String query = "delete from message_folder where id=" + messageFolder.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void deleteForUser(long userId) {
        String query = "delete from message_folder where to=" + userId;
        DBConnection.getInstance().executeUpdate(query);
    }
}
