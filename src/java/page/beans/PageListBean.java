/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page.beans;

import java.io.Serializable;
import java.util.LinkedList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import page.dao.PageDAO;
import page.model.Page;
import utils.Utils;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@RequestScoped
public class PageListBean implements Serializable {

    private LinkedList<Page> pages;
    private boolean listEmpty;

    public PageListBean() {
    }

    @PostConstruct
    public void refresh() {
        if (pages == null) {
            pages = new LinkedList<>();
        }
        pages = PageDAO.getAll();
    }

    public boolean isListEmpty() {
        if (pages == null) {
            return true;
        }
        return pages.isEmpty();
    }

    public LinkedList<Page> getPages() {
        return pages;
    }

    public void setPages(LinkedList<Page> pages) {
        this.pages = pages;
    }

    public String editPage() {
        return "adminEditPage";
    }

    public String deletePage() {
        PageDAO.delete(Long.parseLong(Utils.getParam("pageId")));
        refresh();
        return null;
    }

    public String newPage() {
        return "adminEditPage";
    }
}
