/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platform.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import platform.model.SystemParameters;
import utils.DBConnection;

/**
 *
 * @author Vladimir Tomic
 */
public class SystemParametersDAO {

    private static String genericQuery;
    private static PreparedStatement ps;

    public SystemParametersDAO() {

    }

    private static void prepare(String query) throws SQLException {
        ps = DBConnection.getInstance().getConn().prepareStatement(query);
    }

    private static void setPsInsertFields(int id, SystemParameters sp) throws SQLException {
        ps.setInt(1, id);
        ps.setBoolean(2, sp.isAutomaticRequestProcessing());
    }

    private static void setPsUpdateFields(SystemParameters sp) throws SQLException {
        ps.setBoolean(1, sp.isAutomaticRequestProcessing());
        ps.setInt(2, sp.getId());
    }

    public static LinkedList<SystemParameters> getAll() {
        return getAllWhere("1=1");
    }

    public static LinkedList<SystemParameters> getAllWhere(String where) {
        LinkedList<SystemParameters> systemParameters = new LinkedList<>();
        try {
            genericQuery = "SELECT * FROM system_parameters WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                systemParameters.add(new SystemParameters(
                        rs.getInt("id"),
                        rs.getBoolean("automatic_request_processing")));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(SystemParametersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return systemParameters;
    }

    public static SystemParameters getById(long id) {
        return getWhere("id=" + id);
    }

    public static SystemParameters getWhere(String where) {
        SystemParameters systemParameters = new SystemParameters();
        try {
            genericQuery = "SELECT * FROM system_parameters WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                systemParameters = new SystemParameters(
                        rs.getInt("id"),
                        rs.getBoolean("automatic_request_processing"));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(SystemParametersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return systemParameters;
    }

    public static long add(SystemParameters sp) {
        int last = -1;
        try {
            genericQuery = "SELECT MAX(id) AS last FROM system_parameters";
            prepare(genericQuery);
            ResultSet rs1 = ps.executeQuery();
            if (rs1.next()) {
                last = rs1.getInt("last");
            } else {
                last = 0;
            }
            genericQuery = "INSERT INTO system_parameters VALUES(?,?)";
            prepare(genericQuery);
            setPsInsertFields(++last, sp);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SystemParametersDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(SystemParameters sp) {
        try {
            genericQuery = "update system_parameters set"
                    + " automatic_request_processing=?"
                    + " where id=?";
            prepare(genericQuery);
            setPsUpdateFields(sp);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SystemParametersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static long countAll() {
        return countWhere("1=1");
    }

    public static long countWhere(String where) {
        try {
            genericQuery = "SELECT COUNT(*) AS rowcount FROM system_parameters WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(SystemParametersDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static void delete(SystemParameters sp) {
        delete(sp.getId());
    }

    public static void delete(long id) {
        try {
            genericQuery = "delete from system_parameters where id=?";
            prepare(genericQuery);
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SystemParametersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
