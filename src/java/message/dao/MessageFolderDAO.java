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
import message.model.MessageFolder;
import utils.DBConnection;

/**
 *
 * @author Vladimir Tomic
 */
public class MessageFolderDAO {

    private static String genericQuery;
    private static PreparedStatement ps;

    public MessageFolderDAO() {

    }

    private static void prepare(String query) throws SQLException {
        ps = DBConnection.getInstance().getConn().prepareStatement(query);
    }

    private static void setPsInsertFields(int id, MessageFolder mf) throws SQLException {
        ps.setInt(1, id);
        ps.setString(2, mf.getName());
    }

    private static void setPsUpdateFields(MessageFolder mf) throws SQLException {
        ps.setString(1, mf.getName());
        ps.setInt(2, mf.getId());
    }

    public static LinkedList<MessageFolder> getAll() {
        return getAllWhere("1=1");
    }

    public static LinkedList<MessageFolder> getAllWhere(String where) {
        LinkedList<MessageFolder> messageFolders = new LinkedList<>();
        try {
            genericQuery = "SELECT * FROM message_folder WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                messageFolders.add(new MessageFolder(
                        rs.getInt("id"),
                        rs.getString("name")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MessageFolderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return messageFolders;
    }

    public static MessageFolder getById(long id) {
        return getWhere("id=" + id);
    }

    public static MessageFolder getWhere(String where) {
        MessageFolder mf = new MessageFolder();
        try {
            genericQuery = "SELECT * FROM message_folder WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mf = new MessageFolder(
                        rs.getInt("id"),
                        rs.getString("name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MessageFolderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mf;
    }

    public static long add(MessageFolder mf) {
        int last = -1;
        try {
            genericQuery = "SELECT MAX(id) AS last FROM message_folder";
            prepare(genericQuery);
            ResultSet rs1 = ps.executeQuery();
            if (rs1.next()) {
                last = rs1.getInt("last");
            } else {
                last = 0;
            }
            String query2 = "INSERT INTO message_folder VALUES(?,?)";
            prepare(genericQuery);
            setPsInsertFields(++last, mf);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MessageFolderDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(MessageFolder mf) {
        try {
            genericQuery = "update message_folder set "
                    + " name=?"
                    + " where id=?";
            prepare(genericQuery);
            setPsUpdateFields(mf);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MessageFolderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static long countAll() {
        return countWhere("1=1");
    }

    public static long countWhere(String where) {
        try {
            genericQuery = "SELECT COUNT(*) AS rowcount FROM message_folder WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(MessageFolderDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static void delete(MessageFolder mf) {
        delete(mf.getId());
    }

    public static void delete(int id) {
        try {
            genericQuery = "delete from message_folder where id=?";
            prepare(genericQuery);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MessageFolderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void deleteForUser(long userId) {
        try {
            genericQuery = "delete from message_folder where to=" + userId;
            prepare(genericQuery);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MessageFolderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
