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
import user.model.User;
import utils.DBConnection;

/**
 *
 * @author Vladimir Tomic
 */
public class UserDAO {

    public static LinkedList<User> getAll() {
        LinkedList<User> users = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM user");
        try {
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
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;
    }

    public static LinkedList<User> getAllWhere(String where) {
        LinkedList<User> users = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM user WHERE " + where);
        try {
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
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;
    }

    public static User getById(long id) {
        User user = new User();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM user WHERE id=" + id);
        try {
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
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }

    public static User getWhere(String where) {
        System.out.println("DEBUG ::: UserDAO:getWhere:" + where);
        User user = new User();
        String query = "SELECT * FROM user WHERE " + where;
        ResultSet rs = DBConnection.getInstance().executeQuery(query);
        try {
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
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }

    public static LinkedList<User> getAllOrdByUsername() {
        LinkedList<User> users = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM user ORDER BY username");
        try {
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
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;
    }

    public static long add(User user) {
        long last = 0;
        try {
            String query1 = "SELECT MAX(id) AS last FROM user";
            ResultSet rs1 = DBConnection.getInstance().executeQuery(query1);

            try {
                if (rs1.next()) {
                    last = rs1.getLong("last");
                } else {
                    last = 0;
                }
                String query2 = "INSERT INTO user VALUES(" + ++last + ", '"
                        + user.getUsername() + "', MD5('"
                        + user.getPassword() + "'),"
                        + user.getTypeId() + ", '"
                        + user.getFirstName() + "', '"
                        + user.getLastName() + "', '"
                        + user.getEmail() + "', '"
                        + user.getAddress() + "', '"
                        + user.getCity() + "', "
                        + user.getCountryId() + ", '"
                        + user.getSqlDateOfBirth() + "', '"
                        + user.getPhone() + "',"
                        + user.isActive() + ",'"
                        + user.getImgPath() + "')";
                DBConnection.getInstance().executeUpdate(query2);
                user.setId(last);
                rs1.close();
            } catch (SQLException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void updateNoPass(User user) {
        String query = "update user set"
                + " type_id=" + user.getTypeId() + ","
                + " first_name='" + user.getFirstName() + "',"
                + " last_name='" + user.getLastName() + "',"
                + " email='" + user.getEmail() + "',"
                + " address='" + user.getAddress() + "',"
                + " city='" + user.getCity() + "',"
                + " country_id=" + user.getCountryId() + ","
                + " date_of_birth='" + user.getSqlDateOfBirth() + "',"
                + " phone='" + user.getPhone() + "',"
                + " active=" + user.isActive() + ","
                + " img_path='" + user.getImgPath() + "'"
                + " where id=" + user.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void update(User user) {
        String query = "update user set"
                + " username='" + user.getUsername() + "',"
                + " password=MD5('" + user.getPassword() + "'),"
                + " type_id=" + user.getTypeId() + ","
                + " first_name='" + user.getFirstName() + "',"
                + " last_name='" + user.getLastName() + "',"
                + " email='" + user.getEmail() + "',"
                + " address='" + user.getAddress() + "',"
                + " city='" + user.getCity() + "',"
                + " country_id=" + user.getCountryId() + ","
                + " date_of_birth='" + user.getSqlDateOfBirth() + "',"
                + " phone='" + user.getPhone() + "',"
                + " active=" + user.isActive() + ","
                + " img_path='" + user.getImgPath() + "'"
                + " where id=" + user.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(long id) {
        String query = "delete from user where id=" + id;
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(User user) {
        String query = "delete from user where id=" + user.getId();
        DBConnection.getInstance().executeUpdate(query);
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
        try {
            String query = "SELECT COUNT(*) AS rowcount FROM user";
            ResultSet rs = DBConnection.getInstance().executeQuery(query);
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static long countWhere(String where) {
        try {
            String query = "SELECT COUNT(*) AS rowcount FROM user WHERE " + where;
            ResultSet rs = DBConnection.getInstance().executeQuery(query);
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}
