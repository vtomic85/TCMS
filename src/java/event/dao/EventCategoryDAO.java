/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event.dao;

import event.model.EventCategory;
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

    public static LinkedList<EventCategory> getAll() {
        LinkedList<EventCategory> eventCategories = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM event_category");
        try {
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

    public static EventCategory getById(long id) {
        EventCategory event_category = new EventCategory();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM event_category WHERE id=" + id);
        try {
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

    public static EventCategory getWhere(String where) {
        EventCategory event_category = new EventCategory();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM event_category WHERE " + where);
        try {
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
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM event_category WHERE " + where);
        try {
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

    public static long add(EventCategory eventCategory) {
        long last = 0L;
        try {
            String query1 = "SELECT MAX(id) AS last FROM event_category";
            ResultSet rs1 = DBConnection.getInstance().executeQuery(query1);

            try {
                if (rs1.next()) {
                    last = rs1.getLong("last");
                } else {
                    last = 0;
                }
                String query2 = "INSERT INTO event_category VALUES(" + ++last + ","
                        + eventCategory.getParentId() + ", '"
                        + eventCategory.getName() + "')";
                DBConnection.getInstance().executeUpdate(query2);

            } catch (SQLException ex) {
                Logger.getLogger(EventCategory.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(EventCategory.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(EventCategory eventCategory) {
        String query = "update event_category set "
                + " parent_id=" + eventCategory.getParentId() + ","
                + " name='" + eventCategory.getName() + "'"
                + " where id=" + eventCategory.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(int id) {
        String query = "delete from event_category where id=" + id;
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(EventCategory event_category) {
        String query = "delete from event_category where id=" + event_category.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

    public static long countAll() {
        try {
            String query = "SELECT COUNT(*) AS rowcount FROM event_category";
            ResultSet rs = DBConnection.getInstance().executeQuery(query);
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(EventCategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static long countWhere(String where) {
        try {
            String query = "SELECT COUNT(*) AS rowcount FROM event_category WHERE " + where;
            ResultSet rs = DBConnection.getInstance().executeQuery(query);
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(EventCategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}
