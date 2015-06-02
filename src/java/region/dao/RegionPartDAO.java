/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package region.dao;

import java.sql.PreparedStatement;
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

    private static String genericQuery;
    private static PreparedStatement ps;

    public RegionPartDAO() {

    }

    private static void prepare(String query) throws SQLException {
        ps = DBConnection.getInstance().getConn().prepareStatement(query);
    }

    private static void setPsInsertFields(int id, RegionPart rp) throws SQLException {
        ps.setInt(1, id);
        ps.setInt(2, rp.getRegionId());
        ps.setLong(3, rp.getPartId());
        ps.setInt(4, rp.getOrd());
        ps.setString(5, rp.getTitle());
        ps.setLong(6, rp.getTopListId());
    }

    private static void setPsUpdateFields(RegionPart rp) throws SQLException {
        ps.setInt(1, rp.getRegionId());
        ps.setLong(2, rp.getPartId());
        ps.setInt(3, rp.getOrd());
        ps.setString(4, rp.getTitle());
        ps.setLong(5, rp.getTopListId());
        ps.setInt(6, rp.getId());
    }

    public static ArrayList<RegionPart> getAll() {
        return getAllWhere("1=1");
    }

    public static ArrayList<RegionPart> getAllWhere(String where) {
        ArrayList<RegionPart> regionParts = new ArrayList<>();
        try {
            genericQuery = "SELECT * FROM region_part WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                regionParts.add(new RegionPart(
                        rs.getInt("id"),
                        rs.getInt("region_id"),
                        rs.getLong("part_id"),
                        rs.getInt("ord"),
                        rs.getString("title"),
                        rs.getLong("toplist_id")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegionPartDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return regionParts;
    }

    public static RegionPart getById(long id) {
        return getWhere("id=" + id);
    }

    public static RegionPart getWhere(String where) {
        RegionPart regionPart = new RegionPart();
        try {
            genericQuery = "SELECT * FROM region_part WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                regionPart = new RegionPart(
                        rs.getInt("id"),
                        rs.getInt("region_id"),
                        rs.getLong("part_id"),
                        rs.getInt("ord"),
                        rs.getString("title"),
                        rs.getLong("toplist_id"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegionPartDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return regionPart;
    }

    public static int add(RegionPart rp) {
        int last = -1;
        try {
            genericQuery = "SELECT MAX(id) AS last FROM region_part";
            prepare(genericQuery);
            ResultSet rs1 = ps.executeQuery();
            if (rs1.next()) {
                last = rs1.getInt("last");
            } else {
                last = 0;
            }
            genericQuery = "INSERT INTO region_part VALUES(?,?,?,?,?,?)";
            prepare(genericQuery);
            setPsInsertFields(++last, rp);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RegionPartDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(RegionPart rp) {
        try {
            genericQuery = "update region_part set "
                    + " region_id=?,"
                    + " part_id=?,"
                    + " ord=?,"
                    + " title=?,"
                    + " toplist_id=?"
                    + " where id=?";
            prepare(genericQuery);
            setPsUpdateFields(rp);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RegionPartDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static long countAll() {
        return countWhere("1=1");
    }

    public static long countWhere(String where) {
        try {
            genericQuery = "SELECT COUNT(*) AS rowcount FROM region_part WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(RegionPartDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static void delete(RegionPart rp) {
        delete(rp.getId());
    }

    public static void delete(int id) {
        deleteWhere("id=" + id);
    }

    public static void deleteWhere(String where) {
        try {
            genericQuery = "delete from region_part where " + where;
            prepare(genericQuery);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RegionPartDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
