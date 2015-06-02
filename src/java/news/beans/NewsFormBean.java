/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package news.beans;

import gallery.dao.GalleryDAO;
import gallery.model.Gallery;
import image.dao.ImageDAO;
import item.dao.ItemDAO;
import item.model.Item;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import news.dao.NewsCategoryDAO;
import news.dao.NewsDAO;
import news.model.News;
import news.model.NewsCategory;
import org.primefaces.event.FileUploadEvent;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class NewsFormBean {

    private News news;
    private long newsId;
    private List<NewsCategory> categoryList;
    private List<Item> holderList;
    private List<Gallery> galleryList;

    public NewsFormBean() {

    }

    public void init() {
        holderList = new LinkedList<>();
        categoryList = new LinkedList<>();
        galleryList = new LinkedList<>();
        if (newsId > 0) {
            news = NewsDAO.getById(newsId);
        } else {
            news = new News();
        }
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

    public String save() {
        Date d = new Date();
        if (news.getId() == 0) {
            news.setDateCreated(new java.sql.Date(d.getTime()));
            news.setDateModified(new java.sql.Date(d.getTime()));
            news.calcUtilToSqlDates();
            newsId = NewsDAO.add(news);
            news.setId(newsId);
            news.createCmsElement();
        } else {
            news.updateCmsElement();
        }
        news.setDateModified(new java.sql.Date(d.getTime()));
        news.calcUtilToSqlDates();

        NewsDAO.update(news);
        return null;
    }

    public long getNewsId() {
        return newsId;
    }

    public void setNewsId(long newsId) {
        this.newsId = newsId;
    }

    public List<NewsCategory> getCategoryList() {
        categoryList = NewsCategoryDAO.getAll();
        return categoryList;
    }

    public void setCategoryList(List<NewsCategory> categoryList) {
        this.categoryList = categoryList;
    }

    public List<Item> getHolderList() {
        holderList = ItemDAO.getNewsHolders();
        return holderList;
    }

    public void setHolderList(List<Item> holderList) {
        this.holderList = holderList;
    }

    public List<Gallery> getGalleryList() {
        galleryList = GalleryDAO.getAll();
        return galleryList;
    }

    public void setGalleryList(List<Gallery> galleryList) {
        this.galleryList = galleryList;
    }
}
