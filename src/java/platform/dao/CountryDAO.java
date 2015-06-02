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
import platform.model.Country;
import utils.DBConnection;

/**
 *
 * @author Vladimir Tomic
 */
public class CountryDAO {

    private static String genericQuery;
    private static PreparedStatement ps;

    public CountryDAO() {

    }

    private static void prepare(String query) throws SQLException {
        ps = DBConnection.getInstance().getConn().prepareStatement(query);
    }

    private static void setPsInsertFields(int id, Country country) throws SQLException {
        ps.setInt(1, id);
        ps.setString(2, country.getCode());
        ps.setString(3, country.getName());
    }

    private static void setPsUpdateFields(Country country) throws SQLException {
        ps.setString(1, country.getCode());
        ps.setString(2, country.getName());
        ps.setInt(3, country.getId());
    }

    public static LinkedList<Country> getAll() {
        return getAllWhere("1=1");
    }

    public static LinkedList<Country> getAllWhere(String where) {
        LinkedList<Country> countries = new LinkedList<>();
        try {
            genericQuery = "SELECT * FROM country WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                countries.add(new Country(
                        rs.getInt("id"),
                        rs.getString("code"),
                        rs.getString("name")));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CountryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return countries;
    }

    public static Country getById(long id) {
        return getWhere("id=" + id);
    }

    public static Country getWhere(String where) {
        Country country = new Country();
        try {
            genericQuery = "SELECT * FROM country WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                country = new Country(
                        rs.getInt("id"),
                        rs.getString("code"),
                        rs.getString("name"));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CountryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return country;
    }

    public static int add(Country country) {
        int last = -1;
        try {
            genericQuery = "SELECT MAX(id) AS last FROM country";
            prepare(genericQuery);
            ResultSet rs1 = ps.executeQuery();
            if (rs1.next()) {
                last = rs1.getInt("last");
            } else {
                last = 0;
            }
            genericQuery = "INSERT INTO country VALUES(?,?,?)";
            prepare(genericQuery);
            setPsInsertFields(++last, country);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CountryDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(Country country) {
        try {
            String query = "update country set"
                    + " code=?,"
                    + " name=?"
                    + " where id=?";
            prepare(genericQuery);
            setPsUpdateFields(country);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CountryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static long countAll() {
        return countWhere("1=1");
    }

    public static long countWhere(String where) {
        try {
            genericQuery = "SELECT COUNT(*) AS rowcount FROM country WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(CountryDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static void delete(Country country) {
        delete(country.getId());
    }

    public static void delete(long id) {
        try {
            genericQuery = "delete from country where id=?";
            prepare(genericQuery);
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CountryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
