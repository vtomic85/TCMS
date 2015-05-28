/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package news.beans;

import java.util.LinkedList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import news.dao.NewsCategoryDAO;
import news.dao.NewsDAO;
import news.model.NewsCategory;
import utils.Utils;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@RequestScoped
public class NewsCategoryListBean {
    private LinkedList<NewsCategory> ncList;
    private boolean listEmpty;

    public NewsCategoryListBean() {

    }

    @PostConstruct
    public void refresh() {
        if (ncList == null) {
            ncList = new LinkedList<>();
        }
        ncList = NewsCategoryDAO.getAll();
    }

    public boolean isListEmpty() {
        if (ncList == null) {
            return true;
        }
        return ncList.isEmpty();
    }

    public LinkedList<NewsCategory> getNcList() {
        return ncList;
    }

    public void setNcList(LinkedList<NewsCategory> ncList) {
        this.ncList = ncList;
    }

    public String editNewsCategory() {
        return "adminEditNewsCategory";
    }

    public String deleteNewsCategory() {
        int id = Integer.parseInt(Utils.getParam("ncId"));
        if (id <= 0) {
            return null;
        }
        long countChildren = NewsCategoryDAO.countWhere("parent_id=" + id);
        if (countChildren > 0) {
            return null;
        }
        long countNews = NewsDAO.countWhere("category_id=" + id);
        if (countNews > 0) {
            return null;
        }
        NewsCategoryDAO.delete(id);
        refresh();
        return null;
    }

    public String newNewsCategory() {
        return "adminEditNewsCategory";
    }
}
