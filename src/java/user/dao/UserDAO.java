/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import user.model.User;
import utils.DBConnection;

/**
 *
 * @author Vladimir Tomic
 */
public class UserDAO {

    private static String genericQuery;
    private static PreparedStatement ps;

    public UserDAO() {

    }

    private static void prepare(String query) throws SQLException {
        ps = DBConnection.getInstance().getConn().prepareStatement(query);
    }

    private static void setPsInsertFields(long id, User user) throws SQLException {
        ps.setLong(1, id);
        ps.setString(2, user.getUsername());
        ps.setString(3, user.getPassword());
        ps.setInt(4, user.getTypeId());
        ps.setString(5, user.getFirstName());
        ps.setString(6, user.getLastName());
        ps.setString(7, user.getEmail());
        ps.setString(8, user.getAddress());
        ps.setString(9, user.getCity());
        ps.setInt(10, user.getCountryId());
        ps.setDate(11, user.getSqlDateOfBirth());
        ps.setString(12, user.getPhone());
        ps.setBoolean(13, user.isActive());
        ps.setString(14, user.getImgPath());
    }

    private static void setPsUpdateFields(User user) throws SQLException {
        ps.setString(1, user.getUsername());
        ps.setString(2, user.getPassword());
        ps.setInt(3, user.getTypeId());
        ps.setString(4, user.getFirstName());
        ps.setString(5, user.getLastName());
        ps.setString(6, user.getEmail());
        ps.setString(7, user.getAddress());
        ps.setString(8, user.getCity());
        ps.setInt(9, user.getCountryId());
        ps.setDate(10, user.getSqlDateOfBirth());
        ps.setString(11, user.getPhone());
        ps.setBoolean(12, user.isActive());
        ps.setString(13, user.getImgPath());
        ps.setLong(14, user.getId());
    }

    public static LinkedList<User> getAll() {
        return getAllWhere("1=1");
    }

    public static LinkedList<User> getAllWhere(String where) {
        LinkedList<User> users = new LinkedList<>();
        try {
            genericQuery = "SELECT * FROM user WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                users.add(new User(
                        rs.getLong("id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getInt("type_id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("email"),
                        rs.getString("address"),
                        rs.getString("city"),
                        rs.getInt("country_id"),
                        rs.getDate("date_of_birth"),
                        rs.getString("phone"),
                        rs.getBoolean("active"),
                        rs.getString("img_path")));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;
    }

    public static User getById(long id) {
        return getWhere("id=" + id);
    }

    public static User getWhere(String where) {
        User user = new User();
        try {
            genericQuery = "SELECT * FROM user WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                user = new User(
                        rs.getLong("id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getInt("type_id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("email"),
                        rs.getString("address"),
                        rs.getString("city"),
                        rs.getInt("country_id"),
                        rs.getDate("date_of_birth"),
                        rs.getString("phone"),
                        rs.getBoolean("active"),
                        rs.getString("img_path"));
            } else {
                user = null;
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }

    public static LinkedList<User> getAllOrdByUsername() {
        return getAllOrdBy("username");
    }

    public static LinkedList<User> getAllOrdBy(String order) {
        LinkedList<User> users = new LinkedList<>();
        try {
            genericQuery = "SELECT * FROM user ORDER BY " + order;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                users.add(new User(
                        rs.getLong("id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getInt("type_id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("email"),
                        rs.getString("address"),
                        rs.getString("city"),
                        rs.getInt("country_id"),
                        rs.getDate("date_of_birth"),
                        rs.getString("phone"),
                        rs.getBoolean("active"),
                        rs.getString("img_path")));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;
    }

    public static long add(User user) {
        long last = -1L;
        try {
            genericQuery = "SELECT MAX(id) AS last FROM user";
            prepare(genericQuery);
            ResultSet rs1 = ps.executeQuery();
            if (rs1.next()) {
                last = rs1.getLong("last");
            } else {
                last = 0;
            }
            genericQuery = "INSERT INTO user VALUES(?,?,MD5(?),?,?,?,?,?,?,?,?,?,?,?)";
            prepare(genericQuery);
            setPsInsertFields(++last, user);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static long addNoPassEnc(User user) {
        long last = -1L;
        try {
            genericQuery = "SELECT MAX(id) AS last FROM user";
            prepare(genericQuery);
            ResultSet rs1 = ps.executeQuery();
            if (rs1.next()) {
                last = rs1.getLong("last");
            } else {
                last = 0;
            }
            genericQuery = "INSERT INTO user VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            prepare(genericQuery);
            setPsInsertFields(++last, user);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void updateNoPassEnc(User user) {
        try {
           genericQuery = "update user set"
                    + " username=?,"
                    + " password=?,"
                    + " type_id=?,"
                    + " first_name=?,"
                    + " last_name=?,"
                    + " email=?,"
                    + " address=?,"
                    + " city=?,"
                    + " country_id=?,"
                    + " date_of_birth=?,"
                    + " phone=?,"
                    + " active=?,"
                    + " img_path=?"
                    + " where id=?";
            prepare(genericQuery);
            setPsUpdateFields(user);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void updatePassEnc(User user) {
        try {
            genericQuery = "update user set"
                    + " username=?,"
                    + " password=MD5(?),"
                    + " type_id=?,"
                    + " first_name=?,"
                    + " last_name=?,"
                    + " email=?,"
                    + " address=?,"
                    + " city=?,"
                    + " country_id=?,"
                    + " date_of_birth=?,"
                    + " phone=?,"
                    + " active=?,"
                    + " img_path=?"
                    + " where id=?";
            prepare(genericQuery);
            setPsUpdateFields(user);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void delete(long id) {
        try {
            genericQuery = "delete from user where id=?";
            prepare(genericQuery);
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void delete(User user) {
        delete(user.getId());
    }

    public static int passwordOk(String username, String password) {
        String whereUser = "username='" + username + "'";
        String whereUserPass = "username='" + username + "' and password=MD5('" + password + "')";
        // Does the username exist?
        User user = getWhere(whereUser);
        if (user == null) {
            return 0;
        }
        // Is the password correct?
        user = getWhere(whereUserPass);
        if (user == null) {
            return -1;
        } else {
            return 1;
        }
    }

    public static long countAll() {
        return countWhere("1=1");
    }

    public static long countWhere(String where) {
        try {
            genericQuery = "SELECT COUNT(*) AS rowcount FROM user WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}
