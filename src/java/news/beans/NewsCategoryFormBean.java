/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package news.beans;

import java.util.LinkedList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import news.dao.NewsCategoryDAO;
import news.model.NewsCategory;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class NewsCategoryFormBean {

    private NewsCategory nc;
    private long ncId;
    private LinkedList<NewsCategory> parents;

    public NewsCategoryFormBean() {

    }

    public void init() {
        parents = new LinkedList<>();
        parents = NewsCategoryDAO.getAll();
        System.out.println("DEBUG ::: NCFB:init, id=" + ncId);
        if (ncId > 0) {
            nc = NewsCategoryDAO.getById(ncId);
            System.out.println("DEBUG ::: NCFB:init:nc=" + nc.getId() + ", " + nc.getParentName() + ", " + nc.getName());
        } else {
            nc = new NewsCategory();
        }
    }

    public NewsCategory getNc() {
        return nc;
    }

    public void setNc(NewsCategory nc) {
        this.nc = nc;
    }

    public String save() {
        if (nc.getId() == 0) {
            long id = NewsCategoryDAO.add(nc);
            nc.setId(id);
        }
        NewsCategoryDAO.update(nc);
        return "adminNewsCategoryList";
    }

    public long getNcId() {
        return ncId;
    }

    public void setNcId(long ncId) {
        this.ncId = ncId;
    }

    public LinkedList<NewsCategory> getParents() {
        return parents;
    }

    public void setParents(LinkedList<NewsCategory> parents) {
        this.parents = parents;
    }
}
