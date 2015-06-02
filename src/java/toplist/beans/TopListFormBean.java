/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toplist.beans;

import item.dao.ItemTypeDAO;
import item.model.ItemType;
import java.util.LinkedList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlSelectOneMenu;
import javax.faces.event.AjaxBehaviorEvent;
import platform.dao.CMSElementDAO;
import toplist.dao.TopListDAO;
import toplist.dao.TopListElementRelationDAO;
import platform.model.CMSElement;
import platform.model.Commons;
import toplist.model.TopList;
import toplist.model.TopListElementRelation;
import utils.Utils;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class TopListFormBean {

    private TopList topList;
    private long topListId;
    private long typeId;
    private List<CMSElement> elementList; // elements currently in the list
    private List<ItemType> typeList; // event, page, news...
//    private List<CMSElement> itemsList; // elements that could be added to the list
//    private long newElementId;
//    private CMSElement newElement;
//    private boolean isAddingElement;

    public TopListFormBean() {

    }

    public void init() {
        elementList = new LinkedList<>();
        typeList = new LinkedList<>();
//        itemsList = new LinkedList<>();
        if (topListId > 0) {
            topList = TopListDAO.getById(topListId);
            elementList = CMSElementDAO.getForTopList(topListId);
            typeId = topList.getTypeId();
            System.out.println("DEBUG ::: TopListFormBean:init:topList typeId=" + typeId);
        } else {
            topList = new TopList();
            elementList = new LinkedList<>();
        }
        typeList = ItemTypeDAO.getAllWhere("id in (" + Commons.ITEMTYPE_EVENT + ","
                + Commons.ITEMTYPE_NEWS + "," + Commons.ITEMTYPE_PAGE + ","
                + Commons.ITEMTYPE_USER_PART + ")");
//        itemsList = CMSElementDAO.getAllByType(typeId);
//        isAddingElement = false;
    }

//    public void changeCMSElement(AjaxBehaviorEvent event) {
//        System.out.println("DEBUG ::: TopListFormBean:changeCMSElement id=" + ((HtmlSelectOneMenu) event.getComponent()).getSubmittedValue());
//    }
//    public String addNewElement() {
//        System.out.println("DEBUG ::: TopListFormBean:addNewElement");
//        isAddingElement = true;
//        return null;
//    }
//    public boolean contains(long elementId) {
//        for (CMSElement el : elementList) {
//            if (el.getId() == elementId) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public String saveNewElement() {
//        if (!contains(newElementId)) {
//            System.out.println("DEBUG ::: SAVING ELEMENT ID=" + newElementId);
//            TopListElementRelation tlre = new TopListElementRelation(0, topListId, newElementId);
//            TopListElementRelationDAO.insert(tlre);
//            newElement = CMSElementDAO.getById(newElementId);
//            elementList.add(newElement);
//            System.out.println("DEBUG ::: TopListFormBean:saveNewElement:element added");
//        } else {
//            System.out.println("Element " + newElementId + " already in the list!");
//        }
//        isAddingElement = false;
//        return null;
//    }
    public String removeElement() {
        CMSElement el = CMSElementDAO.getById(Long.parseLong(Utils.getParam("elementId")));
        elementList.remove(el);
        TopListElementRelationDAO.deleteWhere("toplist_id=" + topListId + " and cms_element_id=" + el.getId());
        init();
        return null;
    }

    public TopList getTopList() {
        return topList;
    }

    public void setTopList(TopList topList) {
        this.topList = topList;
    }

    public String save() {
        if (topList.getId() == 0) {
            long newId = TopListDAO.add(topList);
            topList.setId(newId);
        }
        TopListDAO.update(topList);
        return null;
    }

    public long getTopListId() {
        return topListId;
    }

    public void setTopListId(long topListId) {
        this.topListId = topListId;
    }

    public void setElementList(List<CMSElement> elementList) {
        this.elementList = elementList;
    }

    public List<CMSElement> getElementList() {
        return elementList;
    }

//    public boolean isIsAddingElement() {
//        return isAddingElement;
//    }
//
//    public void setIsAddingElement(boolean isAddingElement) {
//        System.out.println("DEBUG ::: TopListFormBean:isAddingElement=" + isAddingElement);
//        this.isAddingElement = isAddingElement;
//    }
    public long getTypeId() {
        return typeId;
    }

    public void setTypeId(long typeId) {
        this.typeId = typeId;
    }

    public List<ItemType> getTypeList() {
        if (typeList == null) {
            typeList = new LinkedList<>();
        } else {
            typeList.clear();
        }
        typeList = ItemTypeDAO.getAllWhere("id in ("
                + Commons.ITEMTYPE_EVENT + ","
                + Commons.ITEMTYPE_NEWS + ","
                + Commons.ITEMTYPE_PAGE + ","
                + Commons.ITEMTYPE_USER_PART + ")");
        return typeList;
    }

    public void setTypeList(List<ItemType> typeList) {
        this.typeList = typeList;
    }

//    public List<CMSElement> getItemsList() {
//        if (itemsList == null) {
//            itemsList = new LinkedList<>();
//        } else {
//            itemsList.clear();
//        }
//        itemsList = CMSElementDAO.getAllByType(topList.getTypeId());
//        return itemsList;
//    }
//
//    public void setItemsList(List<CMSElement> itemsList) {
//        this.itemsList = itemsList;
//    }
//    public long getNewElementId() {
//        return newElementId;
//    }
//
//    public void setNewElementId(long newElementId) {
//        this.newElementId = newElementId;
//    }
//    public CMSElement getNewElement() {
//        return newElement;
//    }
//
//    public void setNewElement(CMSElement newElement) {
//        this.newElement = newElement;
//    }
}
