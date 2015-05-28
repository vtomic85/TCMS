/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part.beans;

import item.dao.ItemTypeDAO;
import item.model.ItemType;
import java.util.LinkedList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import part.dao.PartDAO;
import part.model.Part;
import platform.model.Commons;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class PartFormBean {
    
    private Part part;
    private long partId;
    private LinkedList<ItemType> itemTypeList;
    
    public PartFormBean() {
        
    }
    
    public void init() {
        if (partId > 0) {
            part = PartDAO.getById(partId);
        } else {
            part = new Part();
        }
        if (itemTypeList == null) {
            itemTypeList = new LinkedList<>();
        } else {
            itemTypeList.clear();
        }
        itemTypeList = ItemTypeDAO.getAllWhere("id in (" + Commons.ITEMTYPE_EVENT + "," + Commons.ITEMTYPE_NEWS + "," + Commons.ITEMTYPE_PAGE + ")");
    }
    
    public Part getPart() {
        return part;
    }
    
    public void setPart(Part part) {
        this.part = part;
    }
    
    public String save() {
        if (part.getId() == 0) {
            long newId = PartDAO.add(part);
            part.setId(newId);
        } else {
            PartDAO.update(part);
        }
        return "adminPartList";
    }
    
    public long getPartId() {
        return partId;
    }
    
    public void setPartId(long partId) {
        this.partId = partId;
    }
    
    public LinkedList<ItemType> getItemTypeList() {
        return itemTypeList;
    }
    
    public void setItemTypeList(LinkedList<ItemType> itemTypeList) {
        this.itemTypeList = itemTypeList;
    }
}
