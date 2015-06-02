/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page.dao;

import java.sql.PreparedStatement;
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

    private static String genericQuery;
    private static PreparedStatement ps;

    public PageDAO() {

    }

    private static void prepare(String query) throws SQLException {
        ps = DBConnection.getInstance().getConn().prepareStatement(query);
    }

    private static void setPsInsertFields(long id, Page page) throws SQLException {
        ps.setLong(1, id);
        ps.setLong(2, page.getItemId());
        ps.setString(3, page.getTitle());
        ps.setString(4, page.getSubtitle());
        ps.setString(5, page.getBody());
        ps.setString(6, page.getAuthor());
        ps.setDate(7, page.getSqlDateCreated());
        ps.setBoolean(8, page.isPublished());
        ps.setInt(9, page.getComments());
        ps.setInt(10, page.getViews());
        ps.setString(11, page.getImgPath());

    }

    private static void setPsUpdateFields(Page page) throws SQLException {
        ps.setLong(1, page.getItemId());
        ps.setString(2, page.getTitle());
        ps.setString(3, page.getSubtitle());
        ps.setString(4, page.getBody());
        ps.setString(5, page.getAuthor());
        ps.setDate(6, page.getSqlDateCreated());
        ps.setBoolean(7, page.isPublished());
        ps.setInt(8, page.getComments());
        ps.setInt(9, page.getViews());
        ps.setString(10, page.getImgPath());
        ps.setLong(11, page.getId());
    }

    public static LinkedList<Page> getAll() {
        return getAllWhere("1=1");
    }

    public static LinkedList<Page> getAllWhere(String where) {
        LinkedList<Page> pages = new LinkedList<>();
        try {
            genericQuery = "SELECT * FROM page WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
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
            Logger.getLogger(PageDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pages;
    }

    public static LinkedList<Page> getNOrderBy(int n, String order) {
        LinkedList<Page> pages = new LinkedList<>();
        try {
            genericQuery = "SELECT * FROM page ORDER BY " + order + " LIMIT " + n;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
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
            Logger.getLogger(PageDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pages;
    }

    public static LinkedList<Page> getAllOrderBy(String order) {
        LinkedList<Page> pages = new LinkedList<>();
        try {
            genericQuery = "SELECT * FROM page ORDER BY " + order;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
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
            Logger.getLogger(PageDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pages;
    }

    public static Page getById(long id) {
        return getWhere("id=" + id);
    }

    public static Page getWhere(String where) {
        Page page = new Page();
        try {
            genericQuery = "SELECT * FROM page WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
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
            Logger.getLogger(PageDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return page;
    }

    public static long add(Page page) {
        long last = -1L;
        try {
            genericQuery = "SELECT MAX(id) AS last FROM page";
            prepare(genericQuery);
            ResultSet rs1 = ps.executeQuery();
            if (rs1.next()) {
                last = rs1.getLong("last");
            } else {
                last = 0;
            }
            genericQuery = "INSERT INTO page VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            prepare(genericQuery);
            setPsInsertFields(++last, page);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PageDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(Page page) {
        try {
            genericQuery = "update page set "
                    + " item_id=?,"
                    + " title=?,"
                    + " subtitle=?,"
                    + " body=?,"
                    + " author=?,"
                    + " date_created=?,"
                    + " published=?,"
                    + " comments=?,"
                    + " views=?,"
                    + " img_path=?"
                    + " where id=?";
            prepare(genericQuery);
            setPsUpdateFields(page);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PageDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static long countAll() {
        return countWhere("1=1");
    }

    public static long countWhere(String where) {
        try {
            genericQuery = "SELECT COUNT(*) AS rowcount FROM page WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(PageDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static void delete(Page page) {
        delete(page.getId());
    }

    public static void delete(long id) {
        try {
            genericQuery = "delete from page where id=?";
            prepare(genericQuery);
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PageDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
