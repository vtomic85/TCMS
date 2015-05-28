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
import platform.model.Country;
import utils.DBConnection;

/**
 *
 * @author Vladimir Tomic
 */
public class CountryDAO {
    public static LinkedList<Country> getAll() {
        LinkedList<Country> countries = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM country ORDER BY id ASC");
        try {
            while (rs.next()) {
                countries.add(new Country(
                        rs.getInt("id"),
                        rs.getString("code"),
                        rs.getString("name")));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Country.class.getName()).log(Level.SEVERE, null, ex);
        }
        return countries;
    }

    public static LinkedList<Country> getAllWhere(String where) {
        LinkedList<Country> countries = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM country WHERE " + where);
        try {
            while (rs.next()) {
                countries.add(new Country(
                        rs.getInt("id"),
                        rs.getString("code"),
                        rs.getString("name")));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Country.class.getName()).log(Level.SEVERE, null, ex);
        }
        return countries;
    }

    public static Country getById(long id) {
        Country country = new Country();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM country WHERE id=" + id);
        try {
            if (rs.next()) {
                country = new Country(
                        rs.getInt("id"),
                        rs.getString("code"),
                        rs.getString("name"));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Country.class.getName()).log(Level.SEVERE, null, ex);
        }
        return country;
    }

    public static Country getWhere(String where) {
        Country country = new Country();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM country WHERE " + where);
        try {
            if (rs.next()) {
                country = new Country(
                        rs.getInt("id"),
                        rs.getString("code"),
                        rs.getString("name"));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Country.class.getName()).log(Level.SEVERE, null, ex);
        }
        return country;
    }

    public static long insert(Country country) {
        long last = 0L;
        try {
            String query1 = "SELECT MAX(id) AS last FROM country";
            ResultSet rs1 = DBConnection.getInstance().executeQuery(query1);

            try {
                if (rs1.next()) {
                    last = rs1.getLong("last");
                } else {
                    last = 0;
                }
                String query2 = "INSERT INTO country VALUES(" + ++last + ", '"
                        + country.getCode() + "', '"
                        + country.getName() + "')";
                DBConnection.getInstance().executeUpdate(query2);
                country.setId(last);
                rs1.close();
            } catch (SQLException ex) {
                Logger.getLogger(Country.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(Country.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(Country country) {
        String query = "update country set"
                + " code='" + country.getCode() + "',"
                + " name='" + country.getName() + "'"
                + " where id=" + country.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(int id) {
        String query = "delete from country where id=" + id;
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(Country country) {
        String query = "delete from country where id=" + country.getId();
        DBConnection.getInstance().executeUpdate(query);
    }
}
