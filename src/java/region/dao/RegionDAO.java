/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package region.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import region.model.Region;
import utils.DBConnection;

/**
 *
 * @author Vladimir Tomic
 */
public class RegionDAO {

    private static String genericQuery;
    private static PreparedStatement ps;

    public RegionDAO() {

    }

    private static void prepare(String query) throws SQLException {
        ps = DBConnection.getInstance().getConn().prepareStatement(query);
    }

    private static void setPsInsertFields(long id, Region region) throws SQLException {
        ps.setLong(1, id);
        ps.setString(2, region.getName());
        ps.setInt(3, region.getOrd());
        ps.setInt(4, region.getWidth());
        ps.setBoolean(5, region.isRight());
    }

    private static void setPsUpdateFields(Region region) throws SQLException {
        ps.setString(1, region.getName());
        ps.setInt(2, region.getOrd());
        ps.setInt(3, region.getWidth());
        ps.setBoolean(4, region.isRight());
        ps.setLong(5, region.getId());
    }

    public static ArrayList<Region> getAll() {
        return getAllWhere("1=1");
    }

    public static ArrayList<Region> getAllWhere(String where) {
        ArrayList<Region> regions = new ArrayList<>();
        try {
            genericQuery = "SELECT * FROM region WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                regions.add(new Region(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getInt("ord"),
                        rs.getInt("width"),
                        rs.getBoolean("right_aligned")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Region.class.getName()).log(Level.SEVERE, null, ex);
        }
        return regions;
    }

    public static ArrayList<Region> getAllOrdBy(String ord) {
        ArrayList<Region> regions = new ArrayList<>();
        try {
            genericQuery = "SELECT * FROM region ORDER BY " + ord;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                regions.add(new Region(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getInt("ord"),
                        rs.getInt("width"),
                        rs.getBoolean("right_aligned")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Region.class.getName()).log(Level.SEVERE, null, ex);
        }
        return regions;
    }

    public static Region getById(long id) {
        return getWhere("id=" + id);
    }

    public static Region getWhere(String where) {
        Region region = new Region();
        try {
            genericQuery = "SELECT * FROM region WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                region = new Region(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getInt("ord"),
                        rs.getInt("width"),
                        rs.getBoolean("right_aligned"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Region.class.getName()).log(Level.SEVERE, null, ex);
        }
        return region;
    }

    public static long add(Region region) {
        long last = -1L;
        try {
            genericQuery = "SELECT MAX(id) AS last FROM region";
            prepare(genericQuery);
            ResultSet rs1 = ps.executeQuery();
            if (rs1.next()) {
                last = rs1.getLong("last");
            } else {
                last = 0;
            }
            genericQuery = "INSERT INTO region VALUES(?,?,?,?,?)";
            prepare(genericQuery);
            setPsInsertFields(++last, region);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Region.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(Region region) {
        try {
            genericQuery = "update region set "
                    + " name=?,"
                    + " ord=?,"
                    + " width=?,"
                    + " right_aligned=?"
                    + " where id=?";
            prepare(genericQuery);
            setPsUpdateFields(region);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RegionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int getMinOrd() {
        try {
            genericQuery = "SELECT MIN(ord) AS min_ord FROM region";
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            rs.next();
            return rs.getInt("min_ord");
        } catch (SQLException ex) {
            Logger.getLogger(RegionDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static int getMaxOrd() {
        try {
            genericQuery = "SELECT MAX(ord) AS max_ord FROM region";
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            rs.next();
            return rs.getInt("max_ord");
        } catch (SQLException ex) {
            Logger.getLogger(RegionDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static long countAll() {
        return countWhere("1=1");
    }

    public static long countWhere(String where) {
        try {
            genericQuery = "SELECT COUNT(*) AS rowcount FROM comment WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(RegionDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static void delete(long id) {
        try {
            genericQuery = "delete from region_part where region_id=?";
            prepare(genericQuery);
            ps.setLong(1, id);
            ps.executeUpdate();
            genericQuery = "delete from region where id=?";
            prepare(genericQuery);
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RegionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void delete(Region region) {
        delete(region.getId());
    }
}
