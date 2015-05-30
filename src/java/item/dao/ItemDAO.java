/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item.dao;

import item.model.Item;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import platform.model.Commons;
import utils.DBConnection;

/**
 *
 * @author Vladimir Tomic
 */
public class ItemDAO {

    public static LinkedList<Item> getAll() {
        LinkedList<Item> items = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM item");
        try {
            while (rs.next()) {
                items.add(new Item(
                        rs.getLong("id"),
                        rs.getLong("parent_id"),
                        rs.getInt("level"),
                        rs.getInt("type_id"),
                        rs.getString("name"),
                        rs.getBoolean("published"),
                        rs.getBoolean("primary_navigation"),
                        rs.getBoolean("secondary_navigation"),
                        rs.getLong("content_id")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
        }
        return items;
    }

    public static LinkedList<Item> getAllOrdBy(String order) {
        LinkedList<Item> items = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM item ORDER BY " + order);
        try {
            while (rs.next()) {
                items.add(new Item(
                        rs.getLong("id"),
                        rs.getLong("parent_id"),
                        rs.getInt("level"),
                        rs.getInt("type_id"),
                        rs.getString("name"),
                        rs.getBoolean("published"),
                        rs.getBoolean("primary_navigation"),
                        rs.getBoolean("secondary_navigation"),
                        rs.getLong("content_id")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
        }
        return items;
    }

    public static LinkedList<Item> getAllOrdByLevel() {
        LinkedList<Item> items = new LinkedList<>();
        items = getAllOrdBy("level desc");
        return items;
    }

    public static Item getById(long id) {
        Item item = new Item();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM item WHERE id=" + id);
        try {
            if (rs.next()) {
                item = new Item(
                        rs.getLong("id"),
                        rs.getLong("parent_id"),
                        rs.getInt("level"),
                        rs.getInt("type_id"),
                        rs.getString("name"),
                        rs.getBoolean("published"),
                        rs.getBoolean("primary_navigation"),
                        rs.getBoolean("secondary_navigation"),
                        rs.getLong("content_id"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
        }
        return item;
    }

    public static Item getWhere(String where) {
        Item item = new Item();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM item WHERE " + where);
        try {
            if (rs.next()) {
                item = new Item(
                        rs.getLong("id"),
                        rs.getLong("parent_id"),
                        rs.getInt("level"),
                        rs.getInt("type_id"),
                        rs.getString("name"),
                        rs.getBoolean("published"),
                        rs.getBoolean("primary_navigation"),
                        rs.getBoolean("secondary_navigation"),
                        rs.getLong("content_id"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
        }
        return item;
    }

    public static synchronized LinkedList<Item> getAllWhere(String where) {
        System.out.println("DEBUG ::: ItemDAO:getAllWhere:where=" + where);
        LinkedList<Item> list = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM item WHERE " + where);
        try {
            while (rs.next()) {
                Item item = new Item(
                        rs.getLong("id"),
                        rs.getLong("parent_id"),
                        rs.getInt("level"),
                        rs.getInt("type_id"),
                        rs.getString("name"),
                        rs.getBoolean("published"),
                        rs.getBoolean("primary_navigation"),
                        rs.getBoolean("secondary_navigation"),
                        rs.getLong("content_id"));
                list.add(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static LinkedList<Item> getPageHolders() {
        LinkedList<Item> holders = new LinkedList<>();
        holders = getAllWhere("type_id=" + Commons.ITEMTYPE_PAGE_HOLDER);
        return holders;
    }

    public static LinkedList<Item> getNewsHolders() {
        LinkedList<Item> holders = new LinkedList<>();
        holders = getAllWhere("type_id=" + Commons.ITEMTYPE_NEWS_HOLDER);
        return holders;
    }

    public static LinkedList<Item> getEventHolders() {
        LinkedList<Item> holders = new LinkedList<>();
        holders = getAllWhere("type_id=" + Commons.ITEMTYPE_EVENT_HOLDER);
        return holders;
    }

    public static LinkedList<Item> getAllHolders() {
        LinkedList<Item> holders = new LinkedList<>();
        holders = getAllWhere("type_id in(" + Commons.ITEMTYPE_EVENT_HOLDER
                + "," + Commons.ITEMTYPE_NEWS_HOLDER
                + "," + Commons.ITEMTYPE_PAGE_HOLDER
                + ")");
        return holders;
    }

    public static int getNumOfIndexes() {
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT COUNT(*) FROM item WHERE type_id=" + Commons.ITEMTYPE_INDEX);
        try {
            return rs.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public static long add(Item item) {
        long last = -1L;
        try {
            String query1 = "SELECT MAX(id) AS last FROM item";
            ResultSet rs1 = DBConnection.getInstance().executeQuery(query1);

            try {
                if (rs1.next()) {
                    last = rs1.getLong("last");
                } else {
                    last = 0;
                }
                String query2 = "INSERT INTO item VALUES(" + ++last + ","
                        + item.getParentId() + ","
                        + item.getLevel() + ","
                        + item.getTypeId() + ",'"
                        + item.getName() + "',"
                        + item.isPublished() + ","
                        + item.isPrimaryNavigation() + ","
                        + item.isSecondaryNavigation() + ","
                        + item.getContentId() + ")";
                DBConnection.getInstance().executeUpdate(query2);

            } catch (SQLException ex) {
                Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(Item item) {
        String query = "update item set "
                + " parent_id=" + item.getParentId() + ","
                + " level=" + item.getLevel() + ","
                + " type_id=" + item.getTypeId() + ","
                + " name='" + item.getName() + "',"
                + " published=" + item.isPublished() + ","
                + " primary_navigation=" + item.isPrimaryNavigation() + ","
                + " secondary_navigation=" + item.isSecondaryNavigation() + ","
                + " content_id=" + item.getContentId()
                + " where id=" + item.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(long id) {
        String query = "delete from item where id=" + id;
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(Item item) {
        String query = "delete from item where id=" + item.getId();
        DBConnection.getInstance().executeUpdate(query);
    }
}
