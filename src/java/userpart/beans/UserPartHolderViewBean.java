/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userpart.beans;

import userpart.dao.UserPartDAO;
import userpart.model.UserPart;
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
public class UserPartHolderViewBean {

    private long itemId;
    private LinkedList<UserPart> list;
    private LinkedList<Item> holders;
    private String itemName;

    public UserPartHolderViewBean() {

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
        list = UserPartDAO.getAllWhere("item_id=" + itemId);
        holders = ItemDAO.getAllWhere("parent_id=" + itemId);
        itemName = ItemDAO.getById(itemId).getName();
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public LinkedList<UserPart> getList() {
        return list;
    }

    public void setList(LinkedList<UserPart> list) {
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
