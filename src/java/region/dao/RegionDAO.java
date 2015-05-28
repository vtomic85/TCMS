/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package region.dao;

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

    public static ArrayList<Region> getAll() {
        ArrayList<Region> regions = new ArrayList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM region ORDER BY ord ASC");
        try {
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

    public static ArrayList<Region> getAllWhere(String where) {
        ArrayList<Region> regions = new ArrayList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM region WHERE " + where);
        try {
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
        Region region = new Region();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM region WHERE id=" + id);
        try {
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

    public static Region getWhere(String where) {
        Region region = new Region();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM region WHERE " + where);
        try {
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
            String query1 = "SELECT MAX(id) AS last FROM region";
            ResultSet rs1 = DBConnection.getInstance().executeQuery(query1);

            try {
                if (rs1.next()) {
                    last = rs1.getLong("last");
                } else {
                    last = 0;
                }
                String query2 = "INSERT INTO region VALUES("
                        + ++last + ",'"
                        + region.getName() + "',"
                        + region.getOrd() + ","
                        + region.getWidth() + ","
                        + region.isRight() + ")";

                DBConnection.getInstance().executeUpdate(query2);

            } catch (SQLException ex) {
                Logger.getLogger(Region.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(Region.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(Region region) {
        String query = "update region set "
                + " name='" + region.getName() + "',"
                + " ord=" + region.getOrd() + ","
                + " width=" + region.getWidth() + ","
                + " right_aligned=" + region.isRight()
                + " where id=" + region.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

    public static int getMinOrd() {
        try {
            String query = "SELECT MIN(ord) AS min_ord FROM region";
            ResultSet rs = DBConnection.getInstance().executeQuery(query);
            rs.next();
            int minOrd = rs.getInt("min_ord");
            System.out.println("DEBUG ::: RegionDAO:getMinOrd:minOrd=" + minOrd);
            return minOrd;
        } catch (SQLException ex) {
            Logger.getLogger(RegionDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static int getMaxOrd() {
        try {
            String query = "SELECT MAX(ord) AS max_ord FROM region";
            ResultSet rs = DBConnection.getInstance().executeQuery(query);
            rs.next();
            int minOrd = rs.getInt("max_ord");
            return minOrd;
        } catch (SQLException ex) {
            Logger.getLogger(RegionDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static long countAll() {
        try {
            String query = "SELECT COUNT(*) AS rowcount FROM region";
            ResultSet rs = DBConnection.getInstance().executeQuery(query);
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(RegionDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static long countWhere(String where) {
        try {
            String query = "SELECT COUNT(*) AS rowcount FROM region WHERE " + where;
            ResultSet rs = DBConnection.getInstance().executeQuery(query);
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(RegionDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static void delete(long id) {
        String query1 = "delete from region_part where region_id=" + id;
        DBConnection.getInstance().executeUpdate(query1);
        String query = "delete from region where id=" + id;
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(Region region) {
        String query1 = "delete from region_part where region_id=" + region.getId();
        DBConnection.getInstance().executeUpdate(query1);
        String query = "delete from region where id=" + region.getId();
        DBConnection.getInstance().executeUpdate(query);
    }
}
