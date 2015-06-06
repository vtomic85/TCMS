/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus.beans;

import event.dao.EventDAO;
import event.model.Event;
import java.util.LinkedList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class EventMenuBean {

    private LinkedList<Event> leftSideMenuItems;
    private Event currentItem;
    private long itemId;
    private long itemTypeId;
    private long holderId;

    public EventMenuBean() {

    }

    public void init() {
        leftSideMenuItems = new LinkedList<>();
        currentItem = EventDAO.getById(itemId);
        leftSideMenuItems.addAll(EventDAO.getAllWhere("published=1 and item_id=" + holderId + " and id<>" + itemId));
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public LinkedList<Event> getLeftSideMenuItems() {
        return leftSideMenuItems;
    }

    public void setLeftSideMenuItems(LinkedList<Event> leftSideMenuItems) {
        this.leftSideMenuItems = leftSideMenuItems;
    }

    public Event getCurrentItem() {
        return currentItem;
    }

    public void setCurrentItem(Event currentItem) {
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
