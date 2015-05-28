/*
 * To change this license header, choose License Headers in Projitemt Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item.beans;

import item.dao.ItemDAO;
import item.dao.ItemTypeDAO;
import item.model.Item;
import item.model.ItemType;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class ItemFormBean {

    private Item item;
    private long itemId;
    private List<ItemType> typeList;
    private List<Item> parentList;

    public ItemFormBean() {

    }

    public void init() {
        if (itemId > 0) {
            item = ItemDAO.getById(itemId);
        } else {
            item = new Item();
        }
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String save() {
        if (item.getId() == 0) {
            long newId = ItemDAO.add(item);
            item.setId(newId);
        }
        item.setLevel(ItemDAO.getById(item.getParentId()).getLevel() + 1); // da li je level uopste potreban???
        // Ako item promeni level (parenta), da li ce i njegova deca automatski biti pomerena???
        ItemDAO.update(item);
        return null;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public List<ItemType> getTypeList() {
        typeList = ItemTypeDAO.getAll();
        return typeList;
    }

    public void setTypeList(List<ItemType> typeList) {
        this.typeList = typeList;
    }

    public List<Item> getParentList() {
        parentList = ItemDAO.getAll();
        return parentList;
    }

    public void setParentList(List<Item> parentList) {
        this.parentList = parentList;
    }
}
