/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platform.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.DBConnection;

/**
 *
 * @author Vladimir Tomic
 * @param <T>
 */
public class BaseDAO<T> {

    static String tableName;

    public BaseDAO() {
    }

    public static long countAll() {
        try {
            ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM " + tableName);
            long size = 0;
            while (rs.next()) {
                size++;
            }
            return size;
        } catch (SQLException ex) {
            Logger.getLogger(BaseDAO.class.getName()).log(Level.SEVERE, null, ex);
            return -1L;
        }
    }

    public static long count(String where) {
        try {
            ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM " + tableName + " WHERE " + where);
            long size = 0;
            while (rs.next()) {
                size++;
            }
            return size;
        } catch (SQLException ex) {
            Logger.getLogger(BaseDAO.class.getName()).log(Level.SEVERE, null, ex);
            return -1L;
        }
    }

    public static void delete(long id) {
        String query = "delete from " + tableName + " where id=" + id;
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(int id) {
        String query = "delete from " + tableName + " where id=" + id;
        System.out.println("QUERY=" + query);
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void deleteAll() {
        String query = "delete from event where 1=1";
        DBConnection.getInstance().executeUpdate(query);
    }
}
