/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import page.model.Page;
import utils.DBConnection;

/**
 *
 * @author Vladimir Tomic
 */
public class PageDAO {

    public static LinkedList<Page> getAll() {
        LinkedList<Page> pages = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM page");
        try {
            while (rs.next()) {
                pages.add(new Page(
                        rs.getLong("id"),
                        rs.getLong("item_id"),
                        rs.getString("title"),
                        rs.getString("subtitle"),
                        rs.getString("body"),
                        rs.getString("author"),
                        rs.getTimestamp("date_created"),
                        rs.getBoolean("published"),
                        rs.getInt("comments"),
                        rs.getInt("views"),
                        rs.getString("img_path")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Page.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pages;
    }

    public static LinkedList<Page> getAllWhere(String where) {
        LinkedList<Page> pages = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM page WHERE " + where);
        try {
            while (rs.next()) {
                pages.add(new Page(
                        rs.getLong("id"),
                        rs.getLong("item_id"),
                        rs.getString("title"),
                        rs.getString("subtitle"),
                        rs.getString("body"),
                        rs.getString("author"),
                        rs.getTimestamp("date_created"),
                        rs.getBoolean("published"),
                        rs.getInt("comments"),
                        rs.getInt("views"),
                        rs.getString("img_path")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Page.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pages;
    }

    public static LinkedList<Page> getNOrderBy(int n, String order) {
        LinkedList<Page> pages = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM page ORDER BY " + order + " LIMIT " + n);
        try {
            while (rs.next()) {
                pages.add(new Page(
                        rs.getLong("id"),
                        rs.getLong("item_id"),
                        rs.getString("title"),
                        rs.getString("subtitle"),
                        rs.getString("body"),
                        rs.getString("author"),
                        rs.getTimestamp("date_created"),
                        rs.getBoolean("published"),
                        rs.getInt("comments"),
                        rs.getInt("views"),
                        rs.getString("img_path")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Page.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pages;
    }

    public static LinkedList<Page> getAllOrderBy(String order) {
        LinkedList<Page> pages = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM page ORDER BY " + order);
        try {
            while (rs.next()) {
                pages.add(new Page(
                        rs.getLong("id"),
                        rs.getLong("item_id"),
                        rs.getString("title"),
                        rs.getString("subtitle"),
                        rs.getString("body"),
                        rs.getString("author"),
                        rs.getTimestamp("date_created"),
                        rs.getBoolean("published"),
                        rs.getInt("comments"),
                        rs.getInt("views"),
                        rs.getString("img_path")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Page.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pages;
    }

    public static Page getById(long id) {
        Page page = new Page();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM page WHERE id=" + id);
        try {
            if (rs.next()) {
                page = new Page(
                        rs.getLong("id"),
                        rs.getLong("item_id"),
                        rs.getString("title"),
                        rs.getString("subtitle"),
                        rs.getString("body"),
                        rs.getString("author"),
                        rs.getTimestamp("date_created"),
                        rs.getBoolean("published"),
                        rs.getInt("comments"),
                        rs.getInt("views"),
                        rs.getString("img_path"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Page.class.getName()).log(Level.SEVERE, null, ex);
        }
        return page;
    }

    public static Page getWhere(String where) {
        Page page = new Page();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM page WHERE " + where);
        try {
            if (rs.next()) {
                page = new Page(
                        rs.getLong("id"),
                        rs.getLong("item_id"),
                        rs.getString("title"),
                        rs.getString("subtitle"),
                        rs.getString("body"),
                        rs.getString("author"),
                        rs.getTimestamp("date_created"),
                        rs.getBoolean("published"),
                        rs.getInt("comments"),
                        rs.getInt("views"),
                        rs.getString("img_path"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Page.class.getName()).log(Level.SEVERE, null, ex);
        }
        return page;
    }

    public static long add(Page page) {
        long last = -1L;
        try {
            String query1 = "SELECT MAX(id) AS last FROM page";
            ResultSet rs1 = DBConnection.getInstance().executeQuery(query1);

            try {
                if (rs1.next()) {
                    last = rs1.getLong("last");
                } else {
                    last = 0;
                }
                String query2 = "INSERT INTO page VALUES(" + ++last + ", " + page.getItemId() + ", '"
                        + page.getTitle() + "', '" + page.getSubtitle() + "', '" + page.getBody() + "', '"
                        + page.getAuthor() + "', '" + page.getSqlDateCreated() + "', " + page.isPublished() + ", "
                        + page.getComments() + ", " + page.getViews() + ", '" + page.getImgPath() + "')";
                DBConnection.getInstance().executeUpdate(query2);

            } catch (SQLException ex) {
                Logger.getLogger(Page.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(Page.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(Page page) {
        String query = "update page set "
                + " item_id=" + page.getItemId() + ","
                + " title='" + page.getTitle() + "',"
                + " subtitle='" + page.getSubtitle() + "',"
                + " body='" + page.getBody() + "',"
                + " author='" + page.getAuthor() + "',"
                + " date_created='" + page.getSqlDateCreated() + "',"
                + " published=" + page.isPublished() + ","
                + " comments=" + page.getComments() + ","
                + " views=" + page.getViews() + ","
                + " img_path='" + page.getImgPath() + "'"
                + " where id=" + page.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

    public static long countAll() {
        try {
            String query = "SELECT COUNT(*) AS rowcount FROM page";
            ResultSet rs = DBConnection.getInstance().executeQuery(query);
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(PageDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static long countWhere(String where) {
        try {
            String query = "SELECT COUNT(*) AS rowcount FROM page WHERE " + where;
            ResultSet rs = DBConnection.getInstance().executeQuery(query);
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(PageDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static void delete(long id) {
        String query = "delete from page where id=" + id;
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(Page page) {
        String query = "delete from page where id=" + page.getId();
        DBConnection.getInstance().executeUpdate(query);
    }
}
