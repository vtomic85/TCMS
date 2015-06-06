/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus.beans;

import news.dao.NewsDAO;
import news.model.News;
import java.util.LinkedList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class NewsMenuBean {

    private LinkedList<News> leftSideMenuItems;
    private News currentItem;
    private long itemId;
    private long itemTypeId;
    private long holderId;

    public NewsMenuBean() {

    }

    public void init() {
        leftSideMenuItems = new LinkedList<>();
        currentItem = NewsDAO.getById(itemId);
        leftSideMenuItems.addAll(NewsDAO.getAllWhere("published=1 and item_id=" + holderId + " and id<>" + itemId));
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public LinkedList<News> getLeftSideMenuItems() {
        return leftSideMenuItems;
    }

    public void setLeftSideMenuItems(LinkedList<News> leftSideMenuItems) {
        this.leftSideMenuItems = leftSideMenuItems;
    }

    public News getCurrentItem() {
        return currentItem;
    }

    public void setCurrentItem(News currentItem) {
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
