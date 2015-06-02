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
import user.model.UserType;
import utils.DBConnection;

/**
 *
 * @author Vladimir Tomic
 */
public class UserTypeDAO {

    private static String genericQuery;
    private static PreparedStatement ps;

    public UserTypeDAO() {

    }

    private static void prepare(String query) throws SQLException {
        ps = DBConnection.getInstance().getConn().prepareStatement(query);
    }

    private static void setPsInsertFields(long id, UserType ut) throws SQLException {
        ps.setLong(1, id);
        ps.setString(2, ut.getName());

    }

    private static void setPsUpdateFields(UserType ut) throws SQLException {
        ps.setString(1, ut.getName());
        ps.setLong(2, ut.getId());
    }

    public static LinkedList<UserType> getAll() {
        return getAllWhere("1=1");
    }

    public static LinkedList<UserType> getAllWhere(String where) {
        LinkedList<UserType> usertypes = new LinkedList<>();
        try {
            genericQuery = "SELECT * FROM user_type WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                usertypes.add(new UserType(
                        rs.getLong("id"),
                        rs.getString("name")));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserTypeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usertypes;
    }

    public static UserType getById(long id) {
        return getWhere("id=" + id);
    }

    public static UserType getWhere(String where) {
        UserType userType = new UserType();
        try {
            genericQuery = "SELECT * FROM user_type WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                userType = new UserType(
                        rs.getLong("id"),
                        rs.getString("name"));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserTypeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userType;
    }

    public static long add(UserType ut) {
        long last = -1L;
        try {
            genericQuery = "SELECT MAX(id) AS last FROM user_type";
            prepare(genericQuery);
            ResultSet rs1 = ps.executeQuery();
            if (rs1.next()) {
                last = rs1.getLong("last");
            } else {
                last = 0;
            }
            genericQuery = "INSERT INTO user_type VALUES(?,?)";
            prepare(genericQuery);
            setPsInsertFields(++last, ut);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserTypeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(UserType ut) {
        try {
            genericQuery = "update user_part set"
                    + " name=?"
                    + " where id=?";
            prepare(genericQuery);
            setPsUpdateFields(ut);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserTypeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void delete(long id) {
        try {
            genericQuery = "delete from user_type where id=?";
            prepare(genericQuery);
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserTypeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void delete(UserType ut) {
        delete(ut.getId());
    }

    public static long countAll() {
        return countWhere("1=1");
    }

    public static long countWhere(String where) {
        try {
            genericQuery = "SELECT COUNT(*) AS rowcount FROM user_type WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(UserTypeDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}
