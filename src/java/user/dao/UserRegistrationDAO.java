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
import user.model.UserRegistration;
import utils.DBConnection;

/**
 *
 * @author Vladimir Tomic
 */
public class UserRegistrationDAO {

    private static String genericQuery;
    private static PreparedStatement ps;

    public UserRegistrationDAO() {

    }

    private static void prepare(String query) throws SQLException {
        ps = DBConnection.getInstance().getConn().prepareStatement(query);
    }

    private static void setPsInsertFields(long id, UserRegistration ur) throws SQLException {
        ps.setLong(1, id);
        ps.setString(2, ur.getUsername());
        ps.setString(3, ur.getPassword());
        ps.setString(4, ur.getEmail());
        ps.setString(5, ur.getFirstName());
        ps.setString(6, ur.getLastName());
        ps.setString(7, ur.getAddress());
        ps.setString(8, ur.getCity());
        ps.setString(9, ur.getPhone());
        ps.setDate(10, ur.getSqlDateOfBirth());
        ps.setBoolean(11, ur.isApproved());
    }

    private static void setPsUpdateFields(UserRegistration ur) throws SQLException {
        ps.setString(1, ur.getUsername());
        ps.setString(2, ur.getEmail());
        ps.setString(3, ur.getFirstName());
        ps.setString(4, ur.getLastName());
        ps.setString(5, ur.getAddress());
        ps.setString(6, ur.getCity());
        ps.setString(7, ur.getPhone());
        ps.setDate(8, ur.getSqlDateOfBirth());
        ps.setBoolean(9, ur.isApproved());
        ps.setLong(10, ur.getId());
    }

    private static void setPsUpdatePassFields(UserRegistration ur) throws SQLException {
        ps.setString(1, ur.getUsername());
        ps.setString(2, ur.getPassword());
        ps.setString(3, ur.getEmail());
        ps.setString(4, ur.getFirstName());
        ps.setString(5, ur.getLastName());
        ps.setString(6, ur.getAddress());
        ps.setString(7, ur.getCity());
        ps.setString(8, ur.getPhone());
        ps.setDate(9, ur.getSqlDateOfBirth());
        ps.setBoolean(10, ur.isApproved());
        ps.setLong(11, ur.getId());
    }

    public static LinkedList<UserRegistration> getAll() {
        return getAllWhere("1=1");
    }

    public static LinkedList<UserRegistration> getAllOrdBy(String order) {
        LinkedList<UserRegistration> userRegistrations = new LinkedList<>();
        try {
            genericQuery = "SELECT * FROM user_registration ORDER BY " + order;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                userRegistrations.add(new UserRegistration(
                        rs.getLong("id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("email"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("address"),
                        rs.getString("city"),
                        rs.getString("phone"),
                        rs.getDate("date_of_birth"),
                        rs.getBoolean("approved")));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserRegistrationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userRegistrations;
    }

    public static LinkedList<UserRegistration> getAllOrdByApproved() {
        return getAllOrdBy("approved");
    }

    public static LinkedList<UserRegistration> getAllOrdByUsername() {
        return getAllOrdBy("username");
    }

    public static LinkedList<UserRegistration> getAllWhere(String where) {
        LinkedList<UserRegistration> userRegistrations = new LinkedList<>();
        try {
            genericQuery = "SELECT * FROM user_registration WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                userRegistrations.add(new UserRegistration(
                        rs.getLong("id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("email"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("address"),
                        rs.getString("city"),
                        rs.getString("phone"),
                        rs.getDate("date_of_birth"),
                        rs.getBoolean("approved")));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserRegistrationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userRegistrations;
    }

    public static UserRegistration getById(long id) {
        return getWhere("id=" + id);
    }

    public static UserRegistration getWhere(String where) {
        UserRegistration userRegistration = new UserRegistration();
        try {
            genericQuery = "SELECT * FROM user_registration WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                userRegistration = new UserRegistration(
                        rs.getLong("id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("email"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("address"),
                        rs.getString("city"),
                        rs.getString("phone"),
                        rs.getDate("date_of_birth"),
                        rs.getBoolean("approved"));
            } else {
                userRegistration = null;
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserRegistrationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userRegistration;
    }

    public static long add(UserRegistration ur) {
        long last = -1L;
        try {
            genericQuery = "SELECT MAX(id) AS last FROM user_registration";
            prepare(genericQuery);
            ResultSet rs1 = ps.executeQuery();
            if (rs1.next()) {
                last = rs1.getLong("last");
            } else {
                last = 0;
            }
            genericQuery = "INSERT INTO user_registration VALUES(?,?,MD5(?),?,?,?,?,?,?,?,?)";
            prepare(genericQuery);
            setPsInsertFields(++last, ur);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserRegistrationDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void updateNoPass(UserRegistration ur) {
        try {
            genericQuery = "update user_registration set"
                    + " username=?,"
                    + " email=?,"
                    + " first_name=?,"
                    + " last_name=?,"
                    + " address=?,"
                    + " city=?,"
                    + " phone=?,"
                    + " date_of_birth=?,"
                    + " approved=?"
                    + " where id=?";
            prepare(genericQuery);
            setPsUpdateFields(ur);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserRegistrationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void update(UserRegistration ur) {
        try {
            genericQuery = "update user_registration set"
                    + " username=?,"
                    + " password=?,"
                    + " email=?,"
                    + " first_name=?,"
                    + " last_name=?,"
                    + " address=?,"
                    + " city=?,"
                    + " phone=?,"
                    + " date_of_birth=?,"
                    + " approved=?"
                    + " where id=?";
            prepare(genericQuery);
            setPsUpdatePassFields(ur);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserRegistrationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static long countAll() {
        return countWhere("1=1");
    }

    public static long countWhere(String where) {
        try {
            genericQuery = "SELECT COUNT(*) AS rowcount FROM user_registration WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(UserRegistrationDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static void delete(UserRegistration ur) {
        delete(ur.getId());
    }

    public static void delete(long id) {
        try {
            genericQuery = "delete from user_registration where id=?";
            prepare(genericQuery);
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserRegistrationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
