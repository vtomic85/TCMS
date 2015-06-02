/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.*;
import java.util.logging.*;

/**
 *
 * @author Vladimir Tomic
 */
public class DBConnection {

    private final String dbDriver = "com.mysql.jdbc.Driver";
    private final String dbName = "jdbc:mysql://localhost:3306/tcms?useUnicode=true&characterEncoding=UTF-8&characterSetResults=UTF-8";
    private final String dbUsername = "root";
    private final String dbPassword = "";
    private Connection conn = null;
    private Statement stat = null;
    private ResultSet resultSet = null;
    private static DBConnection instance;

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

    private DBConnection() {
        try {
            if (conn == null) {
                Class.forName(dbDriver);
                conn = DriverManager.getConnection(dbName, dbUsername, dbPassword);
            }
            if (stat != null) {
                stat.close();
            }
            stat = conn.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void executeUpdate(String query) {
        try {
            stat.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet executeQuery(String query) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (stat == null) {
            }
            resultSet = stat.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultSet;
    }

    public Connection getConn() {
        return conn;
    }
}
