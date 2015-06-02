/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import item.model.ItemType;
import java.sql.PreparedStatement;
import utils.DBConnection;

/**
 *
 * @author Vladimir Tomic
 */
public class ItemTypeDAO {

    private static String genericQuery;
    private static PreparedStatement ps;

    public ItemTypeDAO() {

    }

    private static void prepare(String query) throws SQLException {
        ps = DBConnection.getInstance().getConn().prepareStatement(query);
    }

    private static void setPsInsertFields(long id, ItemType it) throws SQLException {
        ps.setLong(1, id);
        ps.setString(2, it.getName());
    }

    private static void setPsUpdateFields(ItemType it) throws SQLException {
        ps.setString(1, it.getName());
        ps.setLong(2, it.getId());
    }

    public static LinkedList<ItemType> getAll() {
        return getAllWhere("1=1");
    }

    public static LinkedList<ItemType> getAllWhere(String where) {
        LinkedList<ItemType> itemTypes = new LinkedList<>();
        try {
            genericQuery = "SELECT * FROM item_type WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                itemTypes.add(new ItemType(
                        rs.getInt("id"),
                        rs.getString("name")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ItemTypeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return itemTypes;
    }

    public static ItemType getById(long id) {
        return getWhere("id=" + id);
    }

    public static ItemType getWhere(String where) {
        ItemType item_type = new ItemType();
        try {
            genericQuery = "SELECT * FROM item_type WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                item_type = new ItemType(
                        rs.getInt("id"),
                        rs.getString("name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ItemTypeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return item_type;
    }

    public static long add(ItemType it) {
        long last = -1L;
        try {
            genericQuery = "SELECT MAX(id) AS last FROM item_type";
            prepare(genericQuery);
            ResultSet rs1 = ps.executeQuery();
            if (rs1.next()) {
                last = rs1.getLong("last");
            } else {
                last = 0;
            }
            genericQuery = "INSERT INTO item_type VALUES(?,?)";
            prepare(genericQuery);
            setPsInsertFields(++last, it);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ItemTypeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(ItemType it) {
        try {
            genericQuery = "update item_type set "
                    + " name=?"
                    + " where id=?";
            prepare(genericQuery);
            setPsUpdateFields(it);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ItemTypeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static long countAll() {
        return countWhere("1=1");
    }

    public static long countWhere(String where) {
        try {
            genericQuery = "SELECT COUNT(*) AS rowcount FROM item_type WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(ItemTypeDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static void delete(ItemType it) {
        delete(it.getId());
    }

    public static void delete(long id) {
        try {
            genericQuery = "delete from item_type where id=?";
            prepare(genericQuery);
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ItemTypeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
