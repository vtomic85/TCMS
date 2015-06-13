/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toplist.beans;

import java.io.IOException;
import java.util.LinkedList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import platform.model.CMSElement;
import toplist.dao.TopListDAO;
import toplist.model.TopList;
import utils.Utils;

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
        elements = new LinkedList<>();
    }

    @PostConstruct
    public void init() {
        long topListId1 = Long.parseLong(Utils.getParam("topListId"));
        long topListId2 = Long.parseLong(Utils.getSessionAttribute("topListId").toString());
        TopList topList = TopListDAO.getById(topListId);
        elements = topList.getList();
    }

    @Override
    public void encodeBegin(FacesContext context) throws IOException {
        long topListId = (long) getAttributes().get("topListId");
        TopList topList = TopListDAO.getById(topListId);
        elements = topList.getList();
        super.encodeBegin(context);
    }

    public void refreshElements() {
        if (elements == null) {
            elements = new LinkedList<>();
        }
        elements.clear();
        topListId = (long) getAttributes().get("topListId");
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
