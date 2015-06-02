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
import news.model.News;
import utils.DBConnection;

/**
 *
 * @author Vladimir Tomic
 */
public class NewsDAO {

    public static LinkedList<News> getAll() {
        LinkedList<News> news = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM news");
        try {
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
            Logger.getLogger(News.class.getName()).log(Level.SEVERE, null, ex);
        }
        return news;
    }

    public static LinkedList<News> getAllWhere(String where) {
        System.out.println("DEBUG ::: NewsDAO:getAllWhere:where=" + where);
        LinkedList<News> news = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM news WHERE " + where);
        try {
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
            Logger.getLogger(News.class.getName()).log(Level.SEVERE, null, ex);
        }
        return news;
    }

    public static LinkedList<News> getNOrderBy(int n, String order) {
        LinkedList<News> news = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM news ORDER BY " + order + " LIMIT " + n);
        try {
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
            Logger.getLogger(News.class.getName()).log(Level.SEVERE, null, ex);
        }
        return news;
    }

    public static LinkedList<News> getAllOrderBy(String order) {
        LinkedList<News> news = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM news ORDER BY " + order);
        try {
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
            Logger.getLogger(News.class.getName()).log(Level.SEVERE, null, ex);
        }
        return news;
    }

    public static News getById(long id) {
        News news = new News();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM news WHERE id=" + id);
        try {
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
            Logger.getLogger(News.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return news;
    }

    public static News getWhere(String where) {
        News news = new News();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM news WHERE " + where);
        try {
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
            Logger.getLogger(News.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return news;
    }

    public static long add(News news) {
        long last = -1L;
        try {
            String query1 = "SELECT MAX(id) AS last FROM news";
            ResultSet rs1 = DBConnection.getInstance().executeQuery(query1);

            try {
                if (rs1.next()) {
                    last = rs1.getLong("last");
                } else {
                    last = 0;
                }
                
                String query2 = "INSERT INTO news VALUES(" + ++last + ","
                        + news.getItemId() + ",'"
                        + news.getTitle() + "','"
                        + news.getLead() + "','"
                        + news.getBody() + "',"
                        + news.getImageId() + ","
                        + news.getGalleryId() + ",'"
                        + news.getAuthor() + "','"
                        + news.getSqlDateCreated() + "','"
                        + news.getSqlDateModified() + "',"
                        + news.getCategoryId() + ","
                        + news.isPublished() + ","
                        + news.getComments() + ","
                        + news.getViews() + ",'"
                        + news.getImgPath() + "')";
                System.out.println("DEBUG ::: NewsDAO:add:query=" + query2);
                DBConnection.getInstance().executeUpdate(query2);

            } catch (SQLException ex) {
                Logger.getLogger(News.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

        } catch (Exception ex) {
            Logger.getLogger(News.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(News news) {
        String query = "update news set "
                + " item_id=" + news.getItemId() + ","
                + " title='" + news.getTitle() + "',"
                + " lead='" + news.getLead() + "',"
                + " body='" + news.getBody() + "',"
                + " image_id=" + news.getImageId() + ","
                + " gallery_id=" + news.getGalleryId() + ","
                + " author='" + news.getAuthor() + "',"
                + " date_created='" + news.getSqlDateCreated() + "',"
                + " date_modified='" + news.getSqlDateModified() + "',"
                + " category_id=" + news.getCategoryId() + ","
                + " published=" + news.isPublished() + ","
                + " comments=" + news.getComments() + ","
                + " views=" + news.getViews() + ","
                + " img_path='" + news.getImgPath() + "'"
                + " where id=" + news.getId();
        System.out.println("DEBUG ::: NewsDAO:update:query=" + query);
        DBConnection.getInstance().executeUpdate(query);
    }

    public static long countAll() {
        try {
            String query = "SELECT COUNT(*) AS rowcount FROM news";
            ResultSet rs = DBConnection.getInstance().executeQuery(query);
            rs.next();
            long count = rs.getLong("rowcount");
            return count;

        } catch (SQLException ex) {
            Logger.getLogger(NewsCategoryDAO.class
                    .getName()).log(Level.SEVERE, null, ex);

            return 0;
        }
    }

    public static long countWhere(String where) {
        try {
            String query = "SELECT COUNT(*) AS rowcount FROM news WHERE " + where;
            ResultSet rs = DBConnection.getInstance().executeQuery(query);
            rs.next();
            long count = rs.getLong("rowcount");
            return count;

        } catch (SQLException ex) {
            Logger.getLogger(NewsCategoryDAO.class
                    .getName()).log(Level.SEVERE, null, ex);

            return 0;
        }
    }

    public static void delete(long id) {
        String query = "delete from news where id=" + id;
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(News news) {
        String query = "delete from news where id=" + news.getId();
        DBConnection.getInstance().executeUpdate(query);
    }
}
