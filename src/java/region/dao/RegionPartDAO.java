/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package region.dao;

import region.model.RegionPart;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.DBConnection;

/**
 *
 * @author Vladimir Tomic
 */
public class RegionPartDAO {

    public static ArrayList<RegionPart> getAll() {
        ArrayList<RegionPart> regionParts = new ArrayList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM region_part ORDER BY ord ASC");
        try {
            while (rs.next()) {
                regionParts.add(new RegionPart(
                        rs.getInt("id"),
                        rs.getInt("region_id"),
                        rs.getInt("part_id"),
                        rs.getInt("ord"),
                        rs.getString("title"),
                        rs.getLong("toplist_id")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegionPart.class.getName()).log(Level.SEVERE, null, ex);
        }
        return regionParts;
    }

    public static ArrayList<RegionPart> getAllWhere(String where) {
        ArrayList<RegionPart> regionParts = new ArrayList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM region_part WHERE " + where + " ORDER BY ord ASC");
        try {
            while (rs.next()) {
                regionParts.add(new RegionPart(
                        rs.getInt("id"),
                        rs.getInt("region_id"),
                        rs.getInt("part_id"),
                        rs.getInt("ord"),
                        rs.getString("title"),
                        rs.getLong("toplist_id")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegionPart.class.getName()).log(Level.SEVERE, null, ex);
        }
        return regionParts;
    }

    public static RegionPart getById(long id) {
        RegionPart regionPart = new RegionPart();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM region_part WHERE id=" + id);
        try {
            if (rs.next()) {
                regionPart = new RegionPart(
                        rs.getInt("id"),
                        rs.getInt("region_id"),
                        rs.getInt("part_id"),
                        rs.getInt("ord"),
                        rs.getString("title"),
                        rs.getLong("toplist_id"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegionPart.class.getName()).log(Level.SEVERE, null, ex);
        }
        return regionPart;
    }

    public static RegionPart getWhere(String where) {
        RegionPart regionPart = new RegionPart();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM region_part WHERE " + where);
        try {
            if (rs.next()) {
                regionPart = new RegionPart(
                        rs.getInt("id"),
                        rs.getInt("region_id"),
                        rs.getInt("part_id"),
                        rs.getInt("ord"),
                        rs.getString("title"),
                        rs.getLong("toplist_id"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegionPart.class.getName()).log(Level.SEVERE, null, ex);
        }
        return regionPart;
    }

    public static int add(RegionPart regionPart) {
        int last = -1;
        try {
            String query1 = "SELECT MAX(id) AS last FROM region_part";
            ResultSet rs1 = DBConnection.getInstance().executeQuery(query1);

            try {
                if (rs1.next()) {
                    last = rs1.getInt("last");
                } else {
                    last = 0;
                }
                String query2 = "INSERT INTO region_part VALUES("
                        + ++last + ","
                        + regionPart.getRegionId() + ","
                        + regionPart.getPartId() + ","
                        + regionPart.getOrd() + ",'"
                        + regionPart.getTitle() + "',"
                        + regionPart.getTopListId() + ")";

                DBConnection.getInstance().executeUpdate(query2);

            } catch (SQLException ex) {
                Logger.getLogger(RegionPart.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(RegionPart.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(RegionPart regionPart) {
        String query = "update region_part set "
                + " region_id=" + regionPart.getRegionId() + ","
                + " part_id=" + regionPart.getPartId() + ","
                + " ord=" + regionPart.getOrd() + ","
                + " title='" + regionPart.getTitle() + "',"
                + " toplist_id=" + regionPart.getTopListId()
                + " where id=" + regionPart.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

    public static long countAll() {
        try {
            String query = "SELECT COUNT(*) AS rowcount FROM region_part";
            ResultSet rs = DBConnection.getInstance().executeQuery(query);
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(RegionPartDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static long countWhere(String where) {
        try {
            String query = "SELECT COUNT(*) AS rowcount FROM region_part WHERE " + where;
            ResultSet rs = DBConnection.getInstance().executeQuery(query);
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(RegionPartDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static void delete(long id) {
        String query = "delete from region_part where id=" + id;
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(RegionPart regionPart) {
        String query = "delete from region_part where id=" + regionPart.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void deleteWhere(String where) {
        String query = "delete from region_part where " + where;
        DBConnection.getInstance().executeUpdate(query);
    }
}
