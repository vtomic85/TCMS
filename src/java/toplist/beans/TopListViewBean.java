/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toplist.beans;

import java.io.IOException;
import java.util.LinkedList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.FacesComponent;
import javax.faces.component.UIComponentBase;
import javax.faces.component.UINamingContainer;
import javax.faces.context.FacesContext;
import platform.model.CMSElement;
import toplist.dao.TopListDAO;
import toplist.model.TopList;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class TopListViewBean extends UIComponentBase {

    private LinkedList<CMSElement> elements;
    private long topListId;

    public TopListViewBean() {
        System.out.println("DEBUG ::: TopListViewBean:constructor");
        elements = new LinkedList<>();
    }

    public void init() {
        System.out.println("DEBUG ::: TopListViewBean:init");
//        long topListId = (long) getAttributes().get("topListId");
        System.out.println("DEBUG ::: TopListViewBean:init:toplistId=" + topListId);
        TopList topList = TopListDAO.getById(topListId);
        elements = topList.getList();
        System.out.println("DEBUG ::: TopListViewBean:init:topList size=" + elements.size());
    }

    @Override
    public void encodeBegin(FacesContext context) throws IOException {
        System.out.println("DEBUG ::: TopListViewBean:encodeBegin");
        long topListId = (long) getAttributes().get("topListId");
        System.out.println("DEBUG ::: TopListViewBean:encodeBegin:toplistId=" + topListId);
        TopList topList = TopListDAO.getById(topListId);
        elements = topList.getList();
        System.out.println("DEBUG ::: TopListViewBean:encodeBegin:topList size=" + elements.size());
        super.encodeBegin(context);
    }

    public void refreshElements() {
        if (elements == null) {
            elements = new LinkedList<>();
        }
        elements.clear();
        topListId = (long) getAttributes().get("topListId");
        System.out.println("DEBUG ::: TopListViewBean:refreshElements:toplistId=" + topListId);
        elements = TopListDAO.getById(topListId).getList();
    }

    @Override
    public String getFamily() {
        return "toplist.beans.TopListViewBean";
    }

    public LinkedList<CMSElement> getElements() {
        refreshElements();
        return elements;
    }

    public void setElements(LinkedList<CMSElement> elements) {
        this.elements = elements;
    }

    public long getTopListId() {
        return topListId;
    }

    public void setTopListId(long topListId) {
        this.topListId = topListId;
    }
}
