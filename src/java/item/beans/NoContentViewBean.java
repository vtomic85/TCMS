/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item.beans;

import item.dao.ItemDAO;
import item.model.Item;
import java.util.LinkedList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import platform.model.Commons;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class NoContentViewBean {

    private Item item;
    private long itemId;
    private int typeId;
    private LinkedList<Item> holders;
    private boolean holdersListEmpty;
    private String itemName;

    public NoContentViewBean() {

    }

    public void init() {
        if (itemId > 0) {
            item = ItemDAO.getById(itemId);
            holders = ItemDAO.getAllWhere("parent_id=" + itemId);
            holdersListEmpty = holders.isEmpty();
        }
        itemName=ItemDAO.getById(itemId).getName();
        typeId = Commons.ITEMTYPE_NO_CONTENT;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
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

    public LinkedList<Item> getHolders() {
        return holders;
    }

    public void setHolders(LinkedList<Item> holders) {
        this.holders = holders;
    }

    public boolean isHoldersListEmpty() {
        return holdersListEmpty;
    }

    public void setHoldersListEmpty(boolean holdersListEmpty) {
        this.holdersListEmpty = holdersListEmpty;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
