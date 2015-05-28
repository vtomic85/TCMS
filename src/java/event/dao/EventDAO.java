/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event.dao;

import event.model.Event;
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
public class EventDAO {

    public EventDAO() {

    }

    public static LinkedList<Event> getAll() {
        LinkedList<Event> events = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM event");
        try {
            while (rs.next()) {
                events.add(new Event(
                        rs.getLong("id"),
                        rs.getLong("item_id"),
                        rs.getString("title"),
                        rs.getString("lead"),
                        rs.getString("body"),
                        rs.getLong("image_id"),
                        rs.getLong("gallery_id"),
                        rs.getDate("event_date"),
                        rs.getInt("category_id"),
                        rs.getBoolean("published"),
                        rs.getString("author"),
                        rs.getDate("date_created"),
                        rs.getInt("comments"),
                        rs.getInt("views"),
                        rs.getString("img_path")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Event.class.getName()).log(Level.SEVERE, null, ex);
        }
        return events;
    }

    public static LinkedList<Event> getAllWhere(String where) {
        LinkedList<Event> events = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM event WHERE " + where);
        try {
            while (rs.next()) {
                events.add(new Event(
                        rs.getLong("id"),
                        rs.getLong("item_id"),
                        rs.getString("title"),
                        rs.getString("lead"),
                        rs.getString("body"),
                        rs.getLong("image_id"),
                        rs.getLong("gallery_id"),
                        rs.getDate("event_date"),
                        rs.getInt("category_id"),
                        rs.getBoolean("published"),
                        rs.getString("author"),
                        rs.getDate("date_created"),
                        rs.getInt("comments"),
                        rs.getInt("views"),
                        rs.getString("img_path")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Event.class.getName()).log(Level.SEVERE, null, ex);
        }
        return events;
    }

    public static LinkedList<Event> getNOrderBy(int n, String order) {
        LinkedList<Event> events = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM event ORDER BY " + order + " LIMIT " + n);
        try {
            while (rs.next()) {
                events.add(new Event(
                        rs.getLong("id"),
                        rs.getLong("item_id"),
                        rs.getString("title"),
                        rs.getString("lead"),
                        rs.getString("body"),
                        rs.getLong("image_id"),
                        rs.getLong("gallery_id"),
                        rs.getDate("event_date"),
                        rs.getInt("category_id"),
                        rs.getBoolean("published"),
                        rs.getString("author"),
                        rs.getDate("date_created"),
                        rs.getInt("comments"),
                        rs.getInt("views"),
                        rs.getString("img_path")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Event.class.getName()).log(Level.SEVERE, null, ex);
        }
        return events;
    }

    public static LinkedList<Event> getAllOrderBy(String order) {
        LinkedList<Event> events = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM event ORDER BY " + order);
        try {
            while (rs.next()) {
                events.add(new Event(
                        rs.getLong("id"),
                        rs.getLong("item_id"),
                        rs.getString("title"),
                        rs.getString("lead"),
                        rs.getString("body"),
                        rs.getLong("image_id"),
                        rs.getLong("gallery_id"),
                        rs.getDate("event_date"),
                        rs.getInt("category_id"),
                        rs.getBoolean("published"),
                        rs.getString("author"),
                        rs.getDate("date_created"),
                        rs.getInt("comments"),
                        rs.getInt("views"),
                        rs.getString("img_path")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Event.class.getName()).log(Level.SEVERE, null, ex);
        }
        return events;
    }

    public static Event getById(long id) {
        Event event = new Event();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM event WHERE id=" + id);
        try {
            if (rs.next()) {
                event = new Event(
                        rs.getLong("id"),
                        rs.getLong("item_id"),
                        rs.getString("title"),
                        rs.getString("lead"),
                        rs.getString("body"),
                        rs.getLong("image_id"),
                        rs.getLong("gallery_id"),
                        rs.getDate("event_date"),
                        rs.getInt("category_id"),
                        rs.getBoolean("published"),
                        rs.getString("author"),
                        rs.getDate("date_created"),
                        rs.getInt("comments"),
                        rs.getInt("views"),
                        rs.getString("img_path"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Event.class.getName()).log(Level.SEVERE, null, ex);
        }
        return event;
    }

    public static Event getWhere(String where) {
        Event event = new Event();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM event WHERE " + where);
        try {
            if (rs.next()) {
                event = new Event(
                        rs.getLong("id"),
                        rs.getLong("item_id"),
                        rs.getString("title"),
                        rs.getString("lead"),
                        rs.getString("body"),
                        rs.getLong("image_id"),
                        rs.getLong("gallery_id"),
                        rs.getDate("event_date"),
                        rs.getInt("category_id"),
                        rs.getBoolean("published"),
                        rs.getString("author"),
                        rs.getDate("date_created"),
                        rs.getInt("comments"),
                        rs.getInt("views"),
                        rs.getString("img_path"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Event.class.getName()).log(Level.SEVERE, null, ex);
        }
        return event;
    }

    public static long add(Event event) {
        long last = -1L;
        try {
            String query1 = "SELECT MAX(id) AS last FROM event";
            ResultSet rs1 = DBConnection.getInstance().executeQuery(query1);

            try {
                if (rs1.next()) {
                    last = rs1.getLong("last");
                } else {
                    last = 0;
                }
                String query2 = "INSERT INTO event VALUES(" + ++last + ","
                        + event.getItemId() + ",'"
                        + event.getTitle() + "','"
                        + event.getLead() + "','"
                        + event.getBody() + "',"
                        + event.getImageId() + ","
                        + event.getGalleryId() + ",'"
                        + event.getSqlEventDate() + "',"
                        + event.getCategoryId() + ","
                        + event.isPublished() + ",'"
                        + event.getAuthor() + "','"
                        + event.getSqlDateCreated() + "',"
                        + event.getComments() + ","
                        + event.getViews() + ",'"
                        + event.getImgPath() + "')";
                DBConnection.getInstance().executeUpdate(query2);

            } catch (SQLException ex) {
                Logger.getLogger(Event.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(Event.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(Event event) {
        String query = "update event set "
                + " item_id=" + event.getItemId() + ","
                + " title='" + event.getTitle() + "',"
                + " lead='" + event.getLead() + "',"
                + " body='" + event.getBody() + "',"
                + " image_id=" + event.getImageId() + ","
                + " gallery_id=" + event.getGalleryId() + ","
                + " event_date='" + event.getSqlEventDate() + "',"
                + " category_id=" + event.getCategoryId() + ","
                + " published=" + event.isPublished() + ","
                + " author='" + event.getAuthor() + "',"
                + " date_created='" + event.getSqlDateCreated() + "',"
                + " comments=" + event.getComments() + ","
                + " views=" + event.getViews() + ","
                + " img_path='" + event.getImgPath() + "'"
                + " where id=" + event.getId();
        System.out.println("DEBUG ::: EventDAO ::: update query=" + query);
        DBConnection.getInstance().executeUpdate(query);
    }

    public static long countAll() {
        try {
            String query = "SELECT COUNT(*) AS rowcount FROM event";
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
            String query = "SELECT COUNT(*) AS rowcount FROM event WHERE " + where;
            ResultSet rs = DBConnection.getInstance().executeQuery(query);
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(EventDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static void delete(Event event) {
        String query = "delete from event where id=" + event.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(long id) {
        String query = "delete from event where id=" + id;
        DBConnection.getInstance().executeUpdate(query);
    }
}
