/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus.beans;

import page.dao.PageDAO;
import page.model.Page;
import item.dao.ItemDAO;
import item.model.Item;
import java.util.LinkedList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class PageMenuBean {

    private LinkedList<Item> leftSideMenuItems;
    private LinkedList<Page> topMenuItems;
    private Item currentItem;
    private long itemId;
    private long itemTypeId;
    private long holderId;

    public PageMenuBean() {

    }

    public void init() {
        if (itemId == 0) {
            itemId = 1;
        }
        leftSideMenuItems = new LinkedList<>();
        topMenuItems = new LinkedList<>();
        currentItem = ItemDAO.getById(holderId);
        leftSideMenuItems.addAll(ItemDAO.getAllWhere("published=1 and level=" + currentItem.getLevel()));
        if (holderId > 0) {
            topMenuItems.addAll(PageDAO.getAllWhere("published=1 and item_id=" + holderId + " and id<>" + currentItem.getId()));
        }
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public LinkedList<Item> getLeftSideMenuItems() {
        return leftSideMenuItems;
    }

    public void setLeftSideMenuItems(LinkedList<Item> leftSideMenuItems) {
        this.leftSideMenuItems = leftSideMenuItems;
    }

    public Item getCurrentItem() {
        return currentItem;
    }

    public void setCurrentItem(Item currentItem) {
        this.currentItem = currentItem;
    }

    public LinkedList<Page> getTopMenuItems() {
        return topMenuItems;
    }

    public void setTopMenuItems(LinkedList<Page> topMenuItems) {
        this.topMenuItems = topMenuItems;
    }

    public long getHolderId() {
        return holderId;
    }

    public void setHolderId(long holderId) {
        this.holderId = holderId;
    }

    public long getItemTypeId() {
        return itemTypeId;
    }

    public void setItemTypeId(long itemTypeId) {
        this.itemTypeId = itemTypeId;
    }
}
