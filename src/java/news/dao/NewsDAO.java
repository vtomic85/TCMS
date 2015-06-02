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
import news.model.News;
import utils.DBConnection;

/**
 *
 * @author Vladimir Tomic
 */
public class NewsDAO {

    private static String genericQuery;
    private static PreparedStatement ps;

    public NewsDAO() {

    }

    private static void prepare(String query) throws SQLException {
        ps = DBConnection.getInstance().getConn().prepareStatement(query);
    }

    private static void setPsInsertFields(long id, News news) throws SQLException {
        ps.setLong(1, id);
        ps.setLong(2, news.getItemId());
        ps.setString(3, news.getTitle());
        ps.setString(4, news.getLead());
        ps.setString(5, news.getBody());
        ps.setLong(6, news.getImageId());
        ps.setLong(7, news.getGalleryId());
        ps.setString(8, news.getAuthor());
        ps.setDate(9, news.getSqlDateCreated());
        ps.setDate(10, news.getSqlDateModified());
        ps.setInt(11, news.getCategoryId());
        ps.setBoolean(12, news.isPublished());
        ps.setInt(13, news.getComments());
        ps.setInt(14, news.getViews());
        ps.setString(15, news.getImgPath());
    }

    private static void setPsUpdateFields(News news) throws SQLException {
        ps.setLong(1, news.getItemId());
        ps.setString(2, news.getTitle());
        ps.setString(3, news.getLead());
        ps.setString(4, news.getBody());
        ps.setLong(5, news.getImageId());
        ps.setLong(6, news.getGalleryId());
        ps.setString(7, news.getAuthor());
        ps.setDate(8, news.getSqlDateCreated());
        ps.setDate(9, news.getSqlDateModified());
        ps.setInt(10, news.getCategoryId());
        ps.setBoolean(11, news.isPublished());
        ps.setInt(12, news.getComments());
        ps.setInt(13, news.getViews());
        ps.setString(14, news.getImgPath());
        ps.setLong(15, news.getId());
    }

    public static LinkedList<News> getAll() {
        return getAllWhere("1=1");
    }

    public static LinkedList<News> getAllWhere(String where) {
        LinkedList<News> news = new LinkedList<>();
        try {
            genericQuery = "SELECT * FROM news WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                news.add(new News(
                        rs.getLong("id"),
                        rs.getLong("item_id"),
                        rs.getString("title"),
                        rs.getString("lead"),
                        rs.getString("body"),
                        rs.getLong("image_id"),
                        rs.getLong("gallery_id"),
                        rs.getString("author"),
                        rs.getTimestamp("date_created"),
                        rs.getTimestamp("date_modified"),
                        rs.getInt("category_id"),
                        rs.getBoolean("published"),
                        rs.getInt("comments"),
                        rs.getInt("views"),
                        rs.getString("img_path")
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return news;
    }

    public static LinkedList<News> getNOrderBy(int n, String order) {
        LinkedList<News> news = new LinkedList<>();
        try {
            genericQuery = "SELECT * FROM news ORDER BY " + order + " LIMIT " + n;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                news.add(new News(
                        rs.getLong("id"),
                        rs.getLong("item_id"),
                        rs.getString("title"),
                        rs.getString("lead"),
                        rs.getString("body"),
                        rs.getLong("image_id"),
                        rs.getLong("gallery_id"),
                        rs.getString("author"),
                        rs.getTimestamp("date_created"),
                        rs.getTimestamp("date_modified"),
                        rs.getInt("category_id"),
                        rs.getBoolean("published"),
                        rs.getInt("comments"),
                        rs.getInt("views"),
                        rs.getString("img_path")
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return news;
    }

    public static LinkedList<News> getAllOrderBy(String order) {
        LinkedList<News> news = new LinkedList<>();
        try {
            genericQuery = "SELECT * FROM news ORDER BY " + order;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                news.add(new News(
                        rs.getLong("id"),
                        rs.getLong("item_id"),
                        rs.getString("title"),
                        rs.getString("lead"),
                        rs.getString("body"),
                        rs.getLong("image_id"),
                        rs.getLong("gallery_id"),
                        rs.getString("author"),
                        rs.getTimestamp("date_created"),
                        rs.getTimestamp("date_modified"),
                        rs.getInt("category_id"),
                        rs.getBoolean("published"),
                        rs.getInt("comments"),
                        rs.getInt("views"),
                        rs.getString("img_path")
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return news;
    }

    public static News getById(long id) {
        return getWhere("id=" + id);
    }

    public static News getWhere(String where) {
        News news = new News();
        try {
            genericQuery = "SELECT * FROM news WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                news = new News(
                        rs.getLong("id"),
                        rs.getLong("item_id"),
                        rs.getString("title"),
                        rs.getString("lead"),
                        rs.getString("body"),
                        rs.getLong("image_id"),
                        rs.getLong("gallery_id"),
                        rs.getString("author"),
                        rs.getTimestamp("date_created"),
                        rs.getTimestamp("date_modified"),
                        rs.getInt("category_id"),
                        rs.getBoolean("published"),
                        rs.getInt("comments"),
                        rs.getInt("views"),
                        rs.getString("img_path")
                );

            }
        } catch (SQLException ex) {
            Logger.getLogger(NewsDAO.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return news;
    }

    public static long add(News news) {
        long last = -1L;
        try {
            genericQuery = "SELECT MAX(id) AS last FROM news";
            prepare(genericQuery);
            ResultSet rs1 = ps.executeQuery();
            if (rs1.next()) {
                last = rs1.getLong("last");
            } else {
                last = 0;
            }
            genericQuery = "INSERT INTO news VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            prepare(genericQuery);
            setPsInsertFields(++last, news);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NewsDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(News news) {
        try {
            genericQuery = "update news set "
                    + " item_id=?,"
                    + " title=?,"
                    + " lead=?,"
                    + " body=?,"
                    + " image_id=?,"
                    + " gallery_id=?,"
                    + " author=?,"
                    + " date_created=?,"
                    + " date_modified=?,"
                    + " category_id=?,"
                    + " published=?,"
                    + " comments=?,"
                    + " views=?,"
                    + " img_path=?"
                    + " where id=?";
            prepare(genericQuery);
            setPsUpdateFields(news);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NewsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static long countAll() {
        return countWhere("1=1");
    }

    public static long countWhere(String where) {
        try {
            genericQuery = "SELECT COUNT(*) AS rowcount FROM news WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(NewsDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static void delete(News news) {
        delete(news.getId());
    }

    public static void delete(long id) {
        try {
            genericQuery = "delete from news where id=?";
            prepare(genericQuery);
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NewsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
