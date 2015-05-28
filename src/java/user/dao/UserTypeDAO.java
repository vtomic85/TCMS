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
import user.model.UserType;
import utils.DBConnection;

/**
 *
 * @author Vladimir Tomic
 */
public class UserTypeDAO {

    public static LinkedList<UserType> getAll() {
        LinkedList<UserType> usertypes = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM user_type");
        try {
            while (rs.next()) {
                usertypes.add(new UserType(
                        rs.getLong("id"),
                        rs.getString("name")));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserType.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usertypes;
    }

    public static LinkedList<UserType> getAllWhere(String where) {
        LinkedList<UserType> usertypes = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM user_type WHERE " + where);
        try {
            while (rs.next()) {
                usertypes.add(new UserType(
                        rs.getLong("id"),
                        rs.getString("name")));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserType.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usertypes;
    }

    public static UserType getById(long id) {
        UserType userType = new UserType();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM user_type WHERE id=" + id);
        try {
            if (rs.next()) {
                userType=new UserType(
                        rs.getLong("id"),
                        rs.getString("name"));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserType.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userType;
    }

    public static UserType getWhere(String where) {
        UserType userType = new UserType();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM user_type WHERE " + where);
        try {
            if (rs.next()) {
                userType=new UserType(
                        rs.getLong("id"),
                        rs.getString("name"));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserType.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userType;
    }

    public static long insert(UserType user) {
        long last = 0L;
        try {
            String query1 = "SELECT MAX(id) AS last FROM user_type";
            ResultSet rs1 = DBConnection.getInstance().executeQuery(query1);

            try {
                if (rs1.next()) {
                    last = rs1.getLong("last");
                } else {
                    last = 0;
                }
                String query2 = "INSERT INTO user_type VALUES(" + ++last + ", '" + user.getName() + "')";
                DBConnection.getInstance().executeUpdate(query2);
                rs1.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserType.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(UserType.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(UserType usertype) {
        String query = "update user_type set name='" + usertype.getName() + "' where id=" + usertype.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(int id) {
        String query = "delete from user_type where id=" + id;
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(UserType usertype) {
        String query = "delete from user_type where id=" + usertype.getId();
        DBConnection.getInstance().executeUpdate(query);
    }
    public static long countAll() {
        try {
            String query = "SELECT COUNT(*) AS rowcount FROM user_type";
            ResultSet rs = DBConnection.getInstance().executeQuery(query);
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(UserTypeDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static long countWhere(String where) {
        try {
            String query = "SELECT COUNT(*) AS rowcount FROM user_type WHERE " + where;
            ResultSet rs = DBConnection.getInstance().executeQuery(query);
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(UserTypeDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}
