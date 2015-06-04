/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus.beans;

import userpart.dao.UserPartDAO;
import userpart.model.UserPart;
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
public class UserPartMenuBean {

    private LinkedList<Item> leftSideMenuItems;
    private LinkedList<UserPart> topMenuItems;
    private Item currentItem;
    private long itemId;
    private long itemTypeId;
    private long holderId;

    public UserPartMenuBean() {

    }

    public void init() {
        if (itemId == 0) {
            itemId = 1;
        }
        leftSideMenuItems = new LinkedList<>();
        topMenuItems = new LinkedList<>();
        currentItem = ItemDAO.getById(holderId);
        leftSideMenuItems.addAll(ItemDAO.getAllWhere("published=1 and primary_navigation=1 and parent_id=" + currentItem.getParentId()));
        if (holderId > 0) {
            topMenuItems.addAll(UserPartDAO.getAllWhere("published=1 and item_id=" + holderId + " and id<>" + itemId));
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

    public LinkedList<UserPart> getTopMenuItems() {
        return topMenuItems;
    }

    public void setTopMenuItems(LinkedList<UserPart> topMenuItems) {
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
