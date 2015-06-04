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
    private long itemTypeId;
    private long holderId;

    public IndexMenuBean() {

    }

    public void init() {
        topMenuItems = new LinkedList<>();
        if ((itemTypeId == Commons.ITEMTYPE_INDEX && itemId == 1) || itemId == 0) { // Index
            topMenuItems.addAll(ItemDAO.getAllWhere("parent_id=1 and published=1 and primary_navigation=1 order by id"));
            return;
        }
        if (itemTypeId == Commons.ITEMTYPE_CONTACT) { // Contact
            topMenuItems.add(ItemDAO.getWhere("id=1"));
            return;
        }
        // Else, make a chain from the current item's parent to the index
        Item item = ItemDAO.getWhere("id=" + holderId);
        topMenuItems.add(item);
        while (item.getParentId() > 0) {
            item = ItemDAO.getWhere("id=" + item.getParentId());
            topMenuItems.add(0, item);
        }
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

    public long getItemTypeId() {
        return itemTypeId;
    }

    public void setItemTypeId(long itemTypeId) {
        this.itemTypeId = itemTypeId;
    }

    public long getHolderId() {
        return holderId;
    }

    public void setHolderId(long holderId) {
        this.holderId = holderId;
    }

}
