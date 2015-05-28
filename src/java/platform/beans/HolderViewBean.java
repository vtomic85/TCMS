/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platform.beans;

import event.dao.EventDAO;
import event.model.Event;
import java.util.LinkedList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import news.dao.NewsDAO;
import news.model.News;
import page.dao.PageDAO;
import page.model.Page;
import platform.model.Commons;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@RequestScoped
public class HolderViewBean {

    private long itemId;
    private int typeId;
    private LinkedList list;

    public HolderViewBean() {

    }

    @PostConstruct
    public void init() {
        if (list == null) {
            switch (typeId) {
                case Commons.ITEMTYPE_EVENT_HOLDER:
                    list = new LinkedList<Event>();
                    list = EventDAO.getAll();
                    break;
                case Commons.ITEMTYPE_NEWS_HOLDER:
                    list = new LinkedList<News>();
                    list = NewsDAO.getAll();
                    break;
                case Commons.ITEMTYPE_PAGE_HOLDER:
                    list = new LinkedList<Page>();
                    list = PageDAO.getAll();
                    break;
                default:
                    break;
            }
        } else {
            list.clear();
        }
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public LinkedList getList() {
        return list;
    }

    public void setList(LinkedList list) {
        this.list = list;
    }

}
