/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.dao;

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

    public static LinkedList<UserRegistration> getAll() {
        LinkedList<UserRegistration> userRegistrations = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM user_registration");
        try {
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
            Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userRegistrations;
    }
public static LinkedList<UserRegistration> getAllOrdByApproved() {
        LinkedList<UserRegistration> userRegistrations = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM user_registration ORDER BY approved ASC");
        try {
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
            Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userRegistrations;
    }
    public static LinkedList<UserRegistration> getAllWhere(String where) {
        LinkedList<UserRegistration> userRegistrations = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM user_registration WHERE " + where);
        try {
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
            Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userRegistrations;
    }

    public static UserRegistration getById(long id) {
        UserRegistration userRegistration = new UserRegistration();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM user_registration WHERE id=" + id);
        try {
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
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userRegistration;
    }

    public static UserRegistration getWhere(String where) {
        System.out.println("DEBUG ::: UserRegistrationDAO:getWhere:" + where);
        UserRegistration userRegistration = new UserRegistration();
        String query = "SELECT * FROM user_registration WHERE " + where;
        ResultSet rs = DBConnection.getInstance().executeQuery(query);
        try {
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
            Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userRegistration;
    }

    public static LinkedList<UserRegistration> getAllOrdByUsername() {
        LinkedList<UserRegistration> userRegistrations = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM user_registration ORDER BY username");
        try {
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
            Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userRegistrations;
    }

    public static long add(UserRegistration userRegistration) {
        long last = 0;
        try {
            String query1 = "SELECT MAX(id) AS last FROM user_registration";
            ResultSet rs1 = DBConnection.getInstance().executeQuery(query1);

            try {
                if (rs1.next()) {
                    last = rs1.getLong("last");
                } else {
                    last = 0;
                }
                String query2 = "INSERT INTO user_registration VALUES(" + ++last + ", '"
                        + userRegistration.getUsername() + "',MD5('"
                        + userRegistration.getPassword() + "'),'"
                        + userRegistration.getEmail() + "','"
                        + userRegistration.getFirstName() + "','"
                        + userRegistration.getLastName() + "','"
                        + userRegistration.getAddress() + "','"
                        + userRegistration.getCity() + "','"
                        + userRegistration.getPhone() + "','"
                        + userRegistration.getSqlDateOfBirth() + "',"
                        + userRegistration.isApproved() + ")";
                DBConnection.getInstance().executeUpdate(query2);
                userRegistration.setId(last);
                rs1.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void updateNoPass(UserRegistration userRegistration) {
        String query = "update user_registration set"
                + " username='" + userRegistration.getUsername() + "',"
                + " email='" + userRegistration.getEmail() + "',"
                + " first_name='" + userRegistration.getFirstName() + "',"
                + " last_name='" + userRegistration.getLastName() + "',"
                + " address='" + userRegistration.getAddress() + "',"
                + " city='" + userRegistration.getCity() + "',"
                + " phone='" + userRegistration.getPhone() + "',"
                + " date_of_birth='" + userRegistration.getSqlDateOfBirth() + "',"
                + " approved=" + userRegistration.isApproved()
                + " where id=" + userRegistration.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void update(UserRegistration userRegistration) {
        String query = "update user_registration set"
                + " username='" + userRegistration.getUsername() + "',"
                + " password=MD5('" + userRegistration.getPassword() + "'),"
                + " email='" + userRegistration.getEmail() + "',"
                + " first_name='" + userRegistration.getFirstName() + "',"
                + " last_name='" + userRegistration.getLastName() + "',"
                + " address='" + userRegistration.getAddress() + "',"
                + " city='" + userRegistration.getCity() + "',"
                + " phone='" + userRegistration.getPhone() + "',"
                + " date_of_birth='" + userRegistration.getSqlDateOfBirth() + "',"
                + " approved=" + userRegistration.isApproved()
                + " where id=" + userRegistration.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(long id) {
        String query = "delete from user_registration where id=" + id;
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(UserRegistration userRegistration) {
        String query = "delete from user_registration where id=" + userRegistration.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

    public static long countAll() {
        try {
            String query = "SELECT COUNT(*) AS rowcount FROM user_registration";
            ResultSet rs = DBConnection.getInstance().executeQuery(query);
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(UserRegistrationDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static long countWhere(String where) {
        try {
            String query = "SELECT COUNT(*) AS rowcount FROM user_registration WHERE " + where;
            ResultSet rs = DBConnection.getInstance().executeQuery(query);
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(UserRegistrationDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}
