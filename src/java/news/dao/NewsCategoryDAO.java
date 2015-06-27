/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package news.dao;

import java.sql.PreparedStatement;
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

    private static String genericQuery;
    private static PreparedStatement ps;

    public NewsCategoryDAO() {

    }

    private static void prepare(String query) throws SQLException {
        ps = DBConnection.getInstance().getConn().prepareStatement(query);
    }

    private static void setPsInsertFields(long id, NewsCategory nc) throws SQLException {
        ps.setLong(1, id);
        ps.setLong(2, nc.getParentId());
        ps.setString(3, nc.getName());
    }

    private static void setPsUpdateFields(NewsCategory nc) throws SQLException {
        ps.setLong(1, nc.getParentId());
        ps.setString(2, nc.getName());
        ps.setLong(3, nc.getId());
    }

    public static LinkedList<NewsCategory> getAll() {
        return getAllWhere("1=1");
    }

    public static NewsCategory getById(long id) {
        System.out.println("DEBUG ::: NCDAO:getById=" + id);
        return getWhere("id=" + id);
    }

    public static NewsCategory getWhere(String where) {
        NewsCategory news_category = new NewsCategory();
        try {
            genericQuery = "SELECT * FROM news_category WHERE " + where;
            System.out.println("DEBUG ::: NCDAO:query=" + genericQuery);
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("DEBUG ::: NCDAO:adding:" + rs.getLong("id")
                        + ", " + rs.getLong("parent_id")
                        + ", " + rs.getString("name"));
                news_category = new NewsCategory(
                        rs.getLong("id"),
                        rs.getLong("parent_id"),
                        rs.getString("name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewsCategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return news_category;
    }

    public static LinkedList<NewsCategory> getAllWhere(String where) {
        LinkedList<NewsCategory> newsCategories = new LinkedList<>();
        try {
            genericQuery = "SELECT * FROM news_category WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                newsCategories.add(new NewsCategory(
                        rs.getLong("id"),
                        rs.getLong("parent_id"),
                        rs.getString("name")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewsCategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return newsCategories;
    }

    public static long add(NewsCategory newsCategory) {
        long last = -1L;
        try {
            genericQuery = "SELECT MAX(id) AS last FROM news_category";
            prepare(genericQuery);
            ResultSet rs1 = ps.executeQuery();
            try {
                if (rs1.next()) {
                    last = rs1.getLong("last");
                } else {
                    last = 0;
                }
                genericQuery = "INSERT INTO news_category VALUES(?,?,?)";
                prepare(genericQuery);
                setPsInsertFields(++last, newsCategory);
                ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(NewsCategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewsCategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(NewsCategory newsCategory) {
        try {
            genericQuery = "update news_category set "
                    + " parent_id=?,"
                    + " name=?"
                    + " where id=?";
            prepare(genericQuery);
            setPsUpdateFields(newsCategory);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NewsCategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static long countAll() {
        return countWhere("1=1");
    }

    public static long countWhere(String where) {
        try {
            genericQuery = "SELECT COUNT(*) AS rowcount FROM news_category WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(NewsCategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static void delete(NewsCategory newsCategory) {
        delete(newsCategory.getId());
    }

    public static void delete(long id) {
        try {
            genericQuery = "delete from news_category where id=?";
            prepare(genericQuery);
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NewsCategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
