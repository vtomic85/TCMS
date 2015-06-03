/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userpart.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import userpart.model.UserPartConfig;
import utils.DBConnection;

/**
 *
 * @author Vladimir Tomic
 */
public class UserPartConfigDAO {

    private static String genericQuery;
    private static PreparedStatement ps;

    public UserPartConfigDAO() {

    }

    private static void prepare(String query) throws SQLException {
        ps = DBConnection.getInstance().getConn().prepareStatement(query);
    }

    private static void setPsInsertFields(long id, UserPartConfig upc) throws SQLException {
        ps.setLong(1, id);
        ps.setString(2, upc.getName());
        ps.setBoolean(3, upc.isHasTitle());
        ps.setBoolean(4, upc.isHasSubtitle());
        ps.setBoolean(5, upc.isHasLead());
        ps.setBoolean(6, upc.isHasBody());
        ps.setBoolean(7, upc.isHasDateCreated());
        ps.setBoolean(8, upc.isHasDateModified());
        ps.setBoolean(9, upc.isHasAuthor());
        ps.setBoolean(10, upc.isHasImage());
        ps.setBoolean(11, upc.isHasGallery());
    }

    private static void setPsUpdateFields(UserPartConfig upc) throws SQLException {
        ps.setString(1, upc.getName());
        ps.setBoolean(2, upc.isHasTitle());
        ps.setBoolean(3, upc.isHasSubtitle());
        ps.setBoolean(4, upc.isHasLead());
        ps.setBoolean(5, upc.isHasBody());
        ps.setBoolean(6, upc.isHasDateCreated());
        ps.setBoolean(7, upc.isHasDateModified());
        ps.setBoolean(8, upc.isHasAuthor());
        ps.setBoolean(9, upc.isHasImage());
        ps.setBoolean(10, upc.isHasGallery());
        ps.setLong(11, upc.getId());
    }

    public static LinkedList<UserPartConfig> getAll() {
        return getAllWhere("1=1");
    }

    public static LinkedList<UserPartConfig> getAllWhere(String where) {
        LinkedList<UserPartConfig> userPartConfigs = new LinkedList<>();
        try {
            genericQuery = "SELECT * FROM user_part_config WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                userPartConfigs.add(new UserPartConfig(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getBoolean("title"),
                        rs.getBoolean("subtitle"),
                        rs.getBoolean("lead"),
                        rs.getBoolean("body"),
                        rs.getBoolean("date_created"),
                        rs.getBoolean("date_modified"),
                        rs.getBoolean("author"),
                        rs.getBoolean("image"),
                        rs.getBoolean("gallery")));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserPartConfig.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userPartConfigs;
    }

    public static UserPartConfig getById(long id) {
        return getWhere("id=" + id);
    }

    public static UserPartConfig getWhere(String where) {
        UserPartConfig userPartConfig = new UserPartConfig();
        try {
            genericQuery = "SELECT * FROM user_part_config WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                userPartConfig = new UserPartConfig(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getBoolean("title"),
                        rs.getBoolean("subtitle"),
                        rs.getBoolean("lead"),
                        rs.getBoolean("body"),
                        rs.getBoolean("date_created"),
                        rs.getBoolean("date_modified"),
                        rs.getBoolean("author"),
                        rs.getBoolean("image"),
                        rs.getBoolean("gallery"));
            } else {
                userPartConfig = null;
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserPartConfig.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userPartConfig;
    }

    public static long add(UserPartConfig upc) {
        long last = -1L;
        try {
            genericQuery = "SELECT MAX(id) AS last FROM user_part_config";
            prepare(genericQuery);
            ResultSet rs1 = ps.executeQuery();
            if (rs1.next()) {
                last = rs1.getLong("last");
            } else {
                last = 0;
            }
            genericQuery = "INSERT INTO user_part_config VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            prepare(genericQuery);
            setPsInsertFields(++last, upc);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserPartConfig.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(UserPartConfig upc) {
        try {
            genericQuery = "update user_part_config set"
                    + " name=?,"
                    + " title=?,"
                    + " subtitle=?,"
                    + " lead=?,"
                    + " body=?,"
                    + " date_created=?,"
                    + " date_modified=?,"
                    + " author=?,"
                    + " image=?,"
                    + " gallery=?"
                    + " where id=?";
            prepare(genericQuery);
            setPsUpdateFields(upc);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserPartConfigDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void delete(long id) {
        try {
            genericQuery = "delete from user_part_config where id=?";
            prepare(genericQuery);
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserPartConfigDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void delete(UserPartConfig upc) {
        delete(upc.getId());
    }

    public static long countAll() {
        return countWhere("1=1");
    }

    public static long countWhere(String where) {
        try {
            genericQuery = "SELECT COUNT(*) AS rowcount FROM user_part_config WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(UserPartConfigDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}
