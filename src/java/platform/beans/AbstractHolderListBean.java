/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platform.beans;

import item.dao.ItemDAO;
import item.model.Item;
import java.util.LinkedList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import platform.model.Commons;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@RequestScoped
public abstract class AbstractHolderListBean {

    protected LinkedList<Item> holderList;
    protected boolean holderListEmpty;
    protected int typeId;

    public AbstractHolderListBean() {
    }

    @PostConstruct
    public void refresh() {
        if (holderList == null) {
            holderList = new LinkedList<>();
        } else {
            holderList.clear();
        }
        switch (typeId) {
            case Commons.ITEMTYPE_PAGE_HOLDER:
                holderList = ItemDAO.getPageHolders();
                break;
            case Commons.ITEMTYPE_NEWS_HOLDER:
                holderList = ItemDAO.getNewsHolders();
                break;
            case Commons.ITEMTYPE_EVENT_HOLDER:
                holderList = ItemDAO.getEventHolders();
                break;
            default:
                break;
        }
    }

    public boolean isHolderListEmpty() {
        if (holderList == null) {
            return true;
        }
        return holderList.size() == 0;
    }

    public LinkedList<Item> getHolderList() {
        return holderList;
    }

    public void setHolderList(LinkedList<Item> holderList) {
        this.holderList = holderList;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }
}
