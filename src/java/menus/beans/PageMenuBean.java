/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus.beans;

import page.dao.PageDAO;
import page.model.Page;
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

    private LinkedList<Page> leftSideMenuItems;
    private Page currentItem;
    private long itemId;
    private long itemTypeId;
    private long holderId;

    public PageMenuBean() {

    }

    public void init() {
        leftSideMenuItems = new LinkedList<>();
        currentItem = PageDAO.getById(itemId);
        leftSideMenuItems.addAll(PageDAO.getAllWhere("published=1 and item_id=" + holderId + " and id<>" + itemId));
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public LinkedList<Page> getLeftSideMenuItems() {
        return leftSideMenuItems;
    }

    public void setLeftSideMenuItems(LinkedList<Page> leftSideMenuItems) {
        this.leftSideMenuItems = leftSideMenuItems;
    }

    public Page getCurrentItem() {
        return currentItem;
    }

    public void setCurrentItem(Page currentItem) {
        this.currentItem = currentItem;
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
