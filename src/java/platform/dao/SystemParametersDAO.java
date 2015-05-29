/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platform.dao;

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
    public static LinkedList<SystemParameters> getAll() {
        LinkedList<SystemParameters> systemParameters = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM system_parameters ORDER BY id ASC");
        try {
            while (rs.next()) {
                systemParameters.add(new SystemParameters(
                        rs.getInt("id"),
                        rs.getBoolean("automatic_request_processing")));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(SystemParameters.class.getName()).log(Level.SEVERE, null, ex);
        }
        return systemParameters;
    }

    public static LinkedList<SystemParameters> getAllWhere(String where) {
        LinkedList<SystemParameters> systemParameters = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM system_parameters WHERE " + where);
        try {
            while (rs.next()) {
                systemParameters.add(new SystemParameters(
                        rs.getInt("id"),
                        rs.getBoolean("automatic_request_processing")));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(SystemParameters.class.getName()).log(Level.SEVERE, null, ex);
        }
        return systemParameters;
    }

    public static SystemParameters getById(long id) {
        SystemParameters systemParameters = new SystemParameters();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM system_parameters WHERE id=" + id);
        try {
            if (rs.next()) {
                systemParameters = new SystemParameters(
                        rs.getInt("id"),
                        rs.getBoolean("automatic_request_processing"));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(SystemParameters.class.getName()).log(Level.SEVERE, null, ex);
        }
        return systemParameters;
    }

    public static SystemParameters getWhere(String where) {
        SystemParameters systemParameters = new SystemParameters();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM system_parameters WHERE " + where);
        try {
            if (rs.next()) {
                systemParameters = new SystemParameters(
                        rs.getInt("id"),
                        rs.getBoolean("automatic_request_processing"));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(SystemParameters.class.getName()).log(Level.SEVERE, null, ex);
        }
        return systemParameters;
    }

    public static long insert(SystemParameters systemParameters) {
        int last = 0;
        try {
            String query1 = "SELECT MAX(id) AS last FROM system_parameters";
            ResultSet rs1 = DBConnection.getInstance().executeQuery(query1);

            try {
                if (rs1.next()) {
                    last = rs1.getInt("last");
                } else {
                    last = 0;
                }
                String query2 = "INSERT INTO system_parameters VALUES(" + ++last + ","
                        + systemParameters.isAutomaticRequestProcessing()+ ")";
                DBConnection.getInstance().executeUpdate(query2);
                systemParameters.setId(last);
                rs1.close();
            } catch (SQLException ex) {
                Logger.getLogger(SystemParameters.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(SystemParameters.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(SystemParameters systemParameters) {
        String query = "update system_parameters set"
                + " automatic_request_processing=" + systemParameters.isAutomaticRequestProcessing()
                + " where id=" + systemParameters.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(int id) {
        String query = "delete from system_parameters where id=" + id;
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(SystemParameters systemParameters) {
        String query = "delete from system_parameters where id=" + systemParameters.getId();
        DBConnection.getInstance().executeUpdate(query);
    }
}
