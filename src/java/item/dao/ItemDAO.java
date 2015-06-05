/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item.dao;

import item.model.Item;
import java.sql.PreparedStatement;
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

    private static String genericQuery;
    private static PreparedStatement ps;

    public ItemDAO() {

    }

    private static void prepare(String query) throws SQLException {
        ps = DBConnection.getInstance().getConn().prepareStatement(query);
    }

    private static void setPsInsertFields(long id, Item item) throws SQLException {
        ps.setLong(1, id);
        ps.setLong(2, item.getParentId());
        ps.setInt(3, item.getLevel());
        ps.setInt(4, item.getTypeId());
        ps.setString(5, item.getName());
        ps.setBoolean(6, item.isPublished());
        ps.setBoolean(7, item.isPrimaryNavigation());
        ps.setBoolean(8, item.isSecondaryNavigation());
        ps.setLong(9, item.getContentId());
        ps.setString(10, item.getImgPath());
    }

    private static void setPsUpdateFields(Item item) throws SQLException {
        ps.setLong(1, item.getParentId());
        ps.setInt(2, item.getLevel());
        ps.setInt(3, item.getTypeId());
        ps.setString(4, item.getName());
        ps.setBoolean(5, item.isPublished());
        ps.setBoolean(6, item.isPrimaryNavigation());
        ps.setBoolean(7, item.isSecondaryNavigation());
        ps.setLong(8, item.getContentId());
        ps.setString(9, item.getImgPath());
        ps.setLong(10, item.getId());
    }

    public static LinkedList<Item> getAll() {
        return getAllWhere("1=1");
    }

    public static LinkedList<Item> getAllOrdBy(String order) {
        LinkedList<Item> items = new LinkedList<>();
        try {
            genericQuery = "SELECT * FROM item ORDER BY " + order;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
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
                        rs.getLong("content_id"),
                        rs.getString("img_path")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return items;
    }

    public static LinkedList<Item> getAllOrdByLevel() {
        return getAllOrdBy("level desc,id asc");
    }

    public static Item getById(long id) {
        return getWhere("id=" + id);
    }

    public static Item getWhere(String where) {
        Item item = new Item();
        try {
            genericQuery = "SELECT * FROM item WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
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
                        rs.getLong("content_id"),
                        rs.getString("img_path"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return item;
    }

    public static synchronized LinkedList<Item> getAllWhere(String where) {
        LinkedList<Item> list = new LinkedList<>();
        try {
            genericQuery = "SELECT * FROM item WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
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
                        rs.getLong("content_id"),
                        rs.getString("img_path"));
                list.add(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static LinkedList<Item> getPageHolders() {
        return getAllWhere("type_id=" + Commons.ITEMTYPE_PAGE_HOLDER);
    }

    public static LinkedList<Item> getNewsHolders() {
        return getAllWhere("type_id=" + Commons.ITEMTYPE_NEWS_HOLDER);
    }

    public static LinkedList<Item> getEventHolders() {
        return getAllWhere("type_id=" + Commons.ITEMTYPE_EVENT_HOLDER);
    }

    public static LinkedList<Item> getUserPartHolders() {
        return getAllWhere("type_id=" + Commons.ITEMTYPE_USER_PART_HOLDER);
    }

    public static LinkedList<Item> getAllHolders() {
        return getAllWhere("type_id in(" + Commons.ITEMTYPE_EVENT_HOLDER
                + "," + Commons.ITEMTYPE_NEWS_HOLDER
                + "," + Commons.ITEMTYPE_PAGE_HOLDER
                + "," + Commons.ITEMTYPE_USER_PART_HOLDER
                + ")");
    }

    public static int getNumOfIndexes() {
        try {
            genericQuery = "SELECT COUNT(*) FROM item WHERE type_id=?";
            prepare(genericQuery);
            ps.setInt(1, Commons.ITEMTYPE_INDEX);
            ResultSet rs = ps.executeQuery();
            return rs.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public static long add(Item item) {
        long last = -1L;
        try {
            genericQuery = "SELECT MAX(id) AS last FROM item";
            prepare(genericQuery);
            ResultSet rs1 = ps.executeQuery();
            if (rs1.next()) {
                last = rs1.getLong("last");
            } else {
                last = 0;
            }
            genericQuery = "INSERT INTO item VALUES(?,?,?,?,?,?,?,?,?,?)";
            prepare(genericQuery);
            setPsInsertFields(++last, item);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(Item item) {
        try {
            genericQuery = "update item set "
                    + " parent_id=?,"
                    + " level=?,"
                    + " type_id=?,"
                    + " name=?,"
                    + " published=?,"
                    + " primary_navigation=?,"
                    + " secondary_navigation=?,"
                    + " content_id=?,"
                    + " img_path=?"
                    + " where id=?";
            prepare(genericQuery);
            setPsUpdateFields(item);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static long countAll() {
        return countWhere("1=1");
    }

    public static long countWhere(String where) {
        try {
            genericQuery = "SELECT COUNT(*) AS rowcount FROM item WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static void delete(Item item) {
        delete(item.getId());
    }

    public static void delete(long id) {
        try {
            genericQuery = "delete from item where id=?";
            prepare(genericQuery);
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
