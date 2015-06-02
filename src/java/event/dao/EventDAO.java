/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event.dao;

import event.model.Event;
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
public class EventDAO {

    private static String genericQuery;
    private static PreparedStatement ps;

    public EventDAO() {

    }

    private static void prepare(String query) throws SQLException {
        ps = DBConnection.getInstance().getConn().prepareStatement(query);
    }

    private static void setPsInsertFields(long id, Event event) throws SQLException {
        ps.setLong(1, id);
        ps.setLong(2, event.getItemId());
        ps.setString(3, event.getTitle());
        ps.setString(4, event.getLead());
        ps.setString(5, event.getBody());
        ps.setLong(6, event.getImageId());
        ps.setLong(7, event.getGalleryId());
        ps.setDate(8, event.getSqlEventDate());
        ps.setInt(9, event.getCategoryId());
        ps.setBoolean(10, event.isPublished());
        ps.setString(11, event.getAuthor());
        ps.setDate(12, event.getSqlDateCreated());
        ps.setInt(13, event.getComments());
        ps.setInt(14, event.getViews());
        ps.setString(15, event.getImgPath());
    }

    private static void setPsUpdateFields(Event event) throws SQLException {
        ps.setLong(1, event.getItemId());
        ps.setString(2, event.getTitle());
        ps.setString(3, event.getLead());
        ps.setString(4, event.getBody());
        ps.setLong(5, event.getImageId());
        ps.setLong(6, event.getGalleryId());
        ps.setDate(7, event.getSqlEventDate());
        ps.setInt(8, event.getCategoryId());
        ps.setBoolean(9, event.isPublished());
        ps.setString(10, event.getAuthor());
        ps.setDate(11, event.getSqlDateCreated());
        ps.setInt(12, event.getComments());
        ps.setInt(13, event.getViews());
        ps.setString(14, event.getImgPath());
        ps.setLong(15, event.getId());
    }

    public static LinkedList<Event> getAll() {
        return getAllWhere("1=1");
    }

    public static LinkedList<Event> getAllWhere(String where) {
        LinkedList<Event> events = new LinkedList<>();
        try {
            genericQuery = "SELECT * FROM event WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
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
        try {
            genericQuery = "SELECT * FROM event ORDER BY " + order + " LIMIT " + n;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
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
        try {
            genericQuery = "SELECT * FROM event ORDER BY " + order;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
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
        return getWhere("id=" + id);
    }

    public static Event getWhere(String where) {
        Event event = new Event();
        try {
            genericQuery = "SELECT * FROM event WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
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
            genericQuery = "SELECT MAX(id) AS last FROM event";
            prepare(genericQuery);
            ResultSet rs1 = ps.executeQuery();
            if (rs1.next()) {
                last = rs1.getLong("last");
            } else {
                last = 0;
            }
            genericQuery = "INSERT INTO event VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            prepare(genericQuery);
            setPsInsertFields(++last, event);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Event.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(Event event) {
        try {
            genericQuery = "update event set "
                    + " item_id=?,"
                    + " title=?,"
                    + " lead=?,"
                    + " body=?,"
                    + " image_id=?,"
                    + " gallery_id=?,"
                    + " event_date=?,"
                    + " category_id=?,"
                    + " published=?,"
                    + " author=?,"
                    + " date_created=?,"
                    + " comments=?,"
                    + " views=?,"
                    + " img_path=?"
                    + " where id=?";
            prepare(genericQuery);
            setPsUpdateFields(event);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EventDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static long countAll() {
        return countWhere("1=1");
    }

    public static long countWhere(String where) {
        try {
            genericQuery = "SELECT COUNT(*) AS rowcount FROM event WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(EventDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static void delete(Event event) {
        delete(event.getId());
    }

    public static void delete(long id) {
        try {
            genericQuery = "delete from event where id=?";
            prepare(genericQuery);
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EventDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
