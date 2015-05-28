/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package news.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import news.model.NewsCategory;
import utils.DBConnection;

/**
 *
 * @author Vladimir Tomic
 */
public class NewsCategoryDAO {

    public static LinkedList<NewsCategory> getAll() {
        LinkedList<NewsCategory> newsCategories = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM news_category");
        try {
            while (rs.next()) {
                newsCategories.add(new NewsCategory(
                        rs.getInt("id"),
                        rs.getInt("parent_id"),
                        rs.getString("name")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewsCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return newsCategories;
    }

    public static NewsCategory getById(long id) {
        NewsCategory news_category = new NewsCategory();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM news_category WHERE id=" + id);
        try {
            if (rs.next()) {
                news_category = new NewsCategory(
                        rs.getInt("id"),
                        rs.getInt("parent_id"),
                        rs.getString("name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewsCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return news_category;
    }

    public static NewsCategory getWhere(String where) {
        NewsCategory news_category = new NewsCategory();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM news_category WHERE " + where);
        try {
            if (rs.next()) {
                news_category = new NewsCategory(
                        rs.getInt("id"),
                        rs.getInt("parent_id"),
                        rs.getString("name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewsCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return news_category;
    }
    public static LinkedList<NewsCategory> getAllWhere(String where) {
        LinkedList<NewsCategory> newsCategories = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM news_category WHERE "+where);
        try {
            while (rs.next()) {
                newsCategories.add(new NewsCategory(
                        rs.getInt("id"),
                        rs.getInt("parent_id"),
                        rs.getString("name")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewsCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return newsCategories;
    }

    public static long insert(NewsCategory newsCategory) {
        long last = 0L;
        try {
            String query1 = "SELECT MAX(id) AS last FROM news_category";
            ResultSet rs1 = DBConnection.getInstance().executeQuery(query1);

            try {
                if (rs1.next()) {
                    last = rs1.getLong("last");
                } else {
                    last = 0;
                }
                String query2 = "INSERT INTO news_category VALUES(" + ++last + ","
                        + newsCategory.getParentId() + ", '"
                        + newsCategory.getName() + "')";
                DBConnection.getInstance().executeUpdate(query2);

            } catch (SQLException ex) {
                Logger.getLogger(NewsCategory.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(NewsCategory.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(NewsCategory newsCategory) {
        String query = "update news_category set "
                + " parent_id=" + newsCategory.getParentId() + ","
                + " name='" + newsCategory.getName() + "',"
                + " where id=" + newsCategory.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(long id) {
        String query = "delete from news_category where id=" + id;
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(NewsCategory news_category) {
        String query = "delete from news_category where id=" + news_category.getId();
        DBConnection.getInstance().executeUpdate(query);
    }
    public static long countAll() {
        try {
            String query = "SELECT COUNT(*) AS rowcount FROM news_category";
            ResultSet rs = DBConnection.getInstance().executeQuery(query);
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(NewsCategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static long countWhere(String where) {
        try {
            String query = "SELECT COUNT(*) AS rowcount FROM news_category WHERE " + where;
            ResultSet rs = DBConnection.getInstance().executeQuery(query);
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(NewsCategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}
