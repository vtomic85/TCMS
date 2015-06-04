/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus.beans;

import item.dao.ItemDAO;
import item.model.Item;
import java.util.LinkedList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import platform.model.Commons;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class IndexMenuBean {

    private LinkedList<Item> topMenuItems;
    private long itemId;

    public IndexMenuBean() {

    }

    public void init() {
        if (itemId == 0) { // Index
            itemId = 1;
        }
        topMenuItems = new LinkedList<>();
        topMenuItems.addAll(ItemDAO.getAllWhere("parent_id=" + itemId + " and published=1 and primary_navigation=1 order by id")); // fetch the children
    }

    public LinkedList<Item> getTopMenuItems() {
        return topMenuItems;
    }

    public void setTopMenuItems(LinkedList<Item> topMenuItems) {
        this.topMenuItems = topMenuItems;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

}
