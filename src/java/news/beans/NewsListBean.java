/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package news.beans;

import java.io.Serializable;
import java.util.LinkedList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import news.dao.NewsCategoryDAO;
import news.dao.NewsDAO;
import news.model.News;
import news.model.NewsCategory;
import utils.Utils;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@RequestScoped
public class NewsListBean implements Serializable{

    private LinkedList<News> news;
    private LinkedList<NewsCategory> categories;
    private boolean listEmpty;

    public NewsListBean() {
    }

    @PostConstruct
    public void refresh() {
        if (news == null) {
            news = new LinkedList<>();
        }
        if (categories == null) {
            categories = new LinkedList<>();
        }
        news = NewsDAO.getAll();
        categories = NewsCategoryDAO.getAll();
    }

    public boolean isListEmpty() {
        if (news == null) {
            return true;
        }
        return news.isEmpty();
    }

    public LinkedList<News> getNews() {
        return news;
    }

    public void setNews(LinkedList<News> news) {
        this.news = news;
    }

    public String editNews() {
        return "adminEditNews";
    }

    public String deleteNews() {
        NewsDAO.delete(Long.parseLong(Utils.getParam("newsId")));
        refresh();
        return null;
    }

    public String newNews() {
        return "adminEditNews";
    }

    public LinkedList<NewsCategory> getCategories() {
        return categories;
    }
}
