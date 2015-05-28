/*
 * To change this license header, choose License Headers in Projitemt Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item.beans;

import item.dao.ItemTypeDAO;
import item.dao.ItemDAO;
import item.model.Item;
import item.model.ItemType;
import java.util.LinkedList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import utils.Utils;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@RequestScoped
public class ItemListBean {

    private LinkedList<Item> items;
    private LinkedList<ItemType> types;
    private boolean listEmpty;

    public ItemListBean() {

    }

    @PostConstruct
    public void refresh() {
        if (items == null) {
            items = new LinkedList<>();
        }
        if (types == null) {
            types = new LinkedList<>();
        }
        items = ItemDAO.getAll();
        types = ItemTypeDAO.getAll();
    }

    public boolean isListEmpty() {
        if (items == null) {
            return true;
        }
        return items.isEmpty();
    }

    public LinkedList<Item> getItems() {
        return items;
    }

    public void setItems(LinkedList<Item> items) {
        this.items = items;
    }

    public String editItem() {
        return "adminEditItem";
    }

    public String deleteItem() {
        ItemDAO.delete(Long.parseLong(Utils.getParam("itemId")));
        refresh();
        return null;
    }

    public String newItem() {
        return "adminEditItem";
    }

    public LinkedList<ItemType> getCategories() {
        return types;
    }
}
