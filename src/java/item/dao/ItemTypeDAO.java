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
import utils.DBConnection;

/**
 *
 * @author Vladimir Tomic
 */
public class ItemTypeDAO {

    public static LinkedList<ItemType> getAll() {
        LinkedList<ItemType> itemTypes = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM item_type");
        try {
            while (rs.next()) {
                itemTypes.add(new ItemType(
                        rs.getInt("id"),
                        rs.getString("name")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ItemType.class.getName()).log(Level.SEVERE, null, ex);
        }
        return itemTypes;
    }

    public static LinkedList<ItemType> getAllWhere(String where) {
        System.out.println("DEBUG ::: ItemTypeDAO: where=" + where);
        LinkedList<ItemType> itemTypes = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM item_type where " + where);
        try {
            while (rs.next()) {
                itemTypes.add(new ItemType(
                        rs.getInt("id"),
                        rs.getString("name")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ItemType.class.getName()).log(Level.SEVERE, null, ex);
        }
        return itemTypes;
    }

    public static ItemType getById(long id) {
        ItemType item_type = new ItemType();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM item_type WHERE id=" + id);
        try {
            if (rs.next()) {
                item_type = new ItemType(
                        rs.getInt("id"),
                        rs.getString("name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ItemType.class.getName()).log(Level.SEVERE, null, ex);
        }
        return item_type;
    }

    public static ItemType getWhere(String where) {
        ItemType item_type = new ItemType();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM item_type WHERE " + where);
        try {
            if (rs.next()) {
                item_type = new ItemType(
                        rs.getInt("id"),
                        rs.getString("name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ItemType.class.getName()).log(Level.SEVERE, null, ex);
        }
        return item_type;
    }

    public static long add(ItemType itemType) {
        long last = -1L;
        try {
            String query1 = "SELECT MAX(id) AS last FROM item_type";
            ResultSet rs1 = DBConnection.getInstance().executeQuery(query1);

            try {
                if (rs1.next()) {
                    last = rs1.getLong("last");
                } else {
                    last = 0;
                }
                String query2 = "INSERT INTO item_type VALUES(" + ++last + ",'"
                        + itemType.getName() + "')";
                DBConnection.getInstance().executeUpdate(query2);

            } catch (SQLException ex) {
                Logger.getLogger(ItemType.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(ItemType.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(ItemType itemType) {
        String query = "update item_type set "
                + " name='" + itemType.getName() + "',"
                + " where id=" + itemType.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(long id) {
        String query = "delete from item_type where id=" + id;
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(ItemType item_type) {
        String query = "delete from item_type where id=" + item_type.getId();
        DBConnection.getInstance().executeUpdate(query);
    }
}
