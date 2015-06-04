/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page.beans;

import page.dao.PageDAO;
import page.model.Page;
import item.dao.ItemDAO;
import item.model.Item;
import java.util.LinkedList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class PageHolderViewBean {

    private long itemId;
    private LinkedList<Page> list;
    private LinkedList<Item> holders;
    private String itemName;

    public PageHolderViewBean() {

    }

    @PostConstruct
    public void init() {
        if (list == null) {
            list = new LinkedList<>();
        } else {
            list.clear();
        }
        if (holders == null) {
            holders = new LinkedList<>();
        } else {
            holders.clear();
        }
        list = PageDAO.getAllWhere("item_id=" + itemId);
        holders = ItemDAO.getAllWhere("parent_id=" + itemId);
        itemName = ItemDAO.getById(itemId).getName();
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public LinkedList<Page> getList() {
        return list;
    }

    public void setList(LinkedList<Page> list) {
        this.list = list;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public LinkedList<Item> getHolders() {
        return holders;
    }

    public void setHolders(LinkedList<Item> holders) {
        this.holders = holders;
    }
}
