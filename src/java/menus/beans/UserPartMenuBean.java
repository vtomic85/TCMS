/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus.beans;

import java.util.LinkedList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import userpart.dao.UserPartDAO;
import userpart.model.UserPart;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class UserPartMenuBean {

    private LinkedList<UserPart> leftSideMenuItems;
    private UserPart currentItem;
    private long itemId;
    private long itemTypeId;
    private long holderId;

    public UserPartMenuBean() {

    }

    public void init() {
        leftSideMenuItems = new LinkedList<>();
        currentItem = UserPartDAO.getById(itemId);
        leftSideMenuItems.addAll(UserPartDAO.getAllWhere("published=1 and item_id=" + holderId + " and id<>" + itemId));
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public LinkedList<UserPart> getLeftSideMenuItems() {
        return leftSideMenuItems;
    }

    public void setLeftSideMenuItems(LinkedList<UserPart> leftSideMenuItems) {
        this.leftSideMenuItems = leftSideMenuItems;
    }

    public UserPart getCurrentItem() {
        return currentItem;
    }

    public void setCurrentItem(UserPart currentItem) {
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
