/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event.dao;

import event.model.EventCategory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.DBConnection;

/**
 *
 * @author Vladimir Tomic
 */
public class EventCategoryDAO {

    private static String genericQuery;
    private static PreparedStatement ps;

    public EventCategoryDAO() {

    }

    private static void prepare(String query) throws SQLException {
        ps = DBConnection.getInstance().getConn().prepareStatement(query);
    }

    private static void setPsInsertFields(long id, EventCategory ec) throws SQLException {
        ps.setLong(1, id);
        ps.setLong(2, ec.getParentId());
        ps.setString(3, ec.getName());

    }

    private static void setPsUpdateFields(EventCategory ec) throws SQLException {
        ps.setLong(1, ec.getParentId());
        ps.setString(2, ec.getName());
        ps.setLong(3, ec.getId());
    }

    public static LinkedList<EventCategory> getAll() {
        return getAllWhere("1=1");
    }

    public static EventCategory getById(long id) {
        return getWhere("id=" + id);
    }

    public static EventCategory getWhere(String where) {
        EventCategory event_category = new EventCategory();
        try {
            genericQuery = "SELECT * FROM event_category WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                event_category = new EventCategory(
                        rs.getInt("id"),
                        rs.getInt("parent_id"),
                        rs.getString("name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EventCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return event_category;
    }

    public static LinkedList<EventCategory> getAllWhere(String where) {
        LinkedList<EventCategory> eventCategories = new LinkedList<>();
        try {
            genericQuery = "SELECT * FROM event_category WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                eventCategories.add(new EventCategory(
                        rs.getInt("id"),
                        rs.getInt("parent_id"),
                        rs.getString("name")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EventCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return eventCategories;
    }

    public static long add(EventCategory ec) {
        long last = 0L;
        try {
            genericQuery = "SELECT MAX(id) AS last FROM event_category";
            prepare(genericQuery);
            ResultSet rs1 = ps.executeQuery();
            if (rs1.next()) {
                last = rs1.getLong("last");
            } else {
                last = 0;
            }
            genericQuery = "INSERT INTO event_category VALUES(?,?,?)";
            prepare(genericQuery);
            setPsInsertFields(++last, ec);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EventCategory.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(EventCategory ec) {
        try {
            genericQuery = "update event_category set "
                    + " parent_id=?,"
                    + " name=?"
                    + " where id=?";
            prepare(genericQuery);
            setPsUpdateFields(ec);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EventCategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static long countAll() {
        return countWhere("1=1");
    }

    public static long countWhere(String where) {
        try {
            genericQuery = "SELECT COUNT(*) AS rowcount FROM event_category WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(EventCategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static void delete(EventCategory ec) {
        delete(ec.getId());
    }

    public static void delete(long id) {
        try {
            genericQuery = "delete from event_category where id=?";
            prepare(genericQuery);
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EventCategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
