/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page.beans;

import item.dao.ItemDAO;
import item.model.Item;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import page.dao.PageDAO;
import page.model.Page;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class PageFormBean {

    private Page page;
    private long pageId;
    private List<Item> holderList;

    public PageFormBean() {

    }

    public void init() {
        holderList = new LinkedList<>();
        if (pageId > 0) {
            page = PageDAO.getById(pageId);
        } else {
            page = new Page();
        }
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public String save() {
        Date d = new Date();
        if (page.getId() == 0) {
            page.setDateCreated(new java.sql.Date(d.getTime()));
            page.calcUtilToSqlDates();
            long newId = PageDAO.add(page);
            page.setId(newId);
            page.createCmsElement();
        } else {
            page.updateCmsElement();
        }
        PageDAO.update(page);
        return null;
    }

    public long getPageId() {
        return pageId;
    }

    public void setPageId(long pageId) {
        this.pageId = pageId;
    }

    public List<Item> getHolderList() {
        holderList = ItemDAO.getPageHolders();
        return holderList;
    }

    public void setHolderList(List<Item> holderList) {
        this.holderList = holderList;
    }
}
