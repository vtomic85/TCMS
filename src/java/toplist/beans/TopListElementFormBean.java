/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toplist.beans;

import comment.beans.CommentFormBean;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import platform.dao.CMSElementDAO;
import toplist.dao.TopListElementRelationDAO;
import platform.model.CMSElement;
import toplist.model.TopListElementRelation;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class TopListElementFormBean {

    private long topListId;
    private long newElementId;
    private long typeId;
    private String backUrl;
    private List<CMSElement> itemsList; // elements that could be added to the list

    public TopListElementFormBean() {

    }

    public void init() {
        itemsList = new LinkedList<>();
        itemsList = CMSElementDAO.getAllByType(typeId);
        backUrl = "topListForm.xhtml?topListId=" + topListId;
    }

    public void saveNewElement() {
        TopListElementRelation tlre = new TopListElementRelation(0, topListId, newElementId);
        TopListElementRelationDAO.add(tlre);
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect(backUrl);
        } catch (IOException ex) {
            Logger.getLogger(CommentFormBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public long getTopListId() {
        return topListId;
    }

    public void setTopListId(long topListId) {
        this.topListId = topListId;
    }

    public long getNewElementId() {
        return newElementId;
    }

    public void setNewElementId(long newElementId) {
        this.newElementId = newElementId;
    }

    public long getTypeId() {
        return typeId;
    }

    public void setTypeId(long typeId) {
        this.typeId = typeId;
    }

    public String getBackUrl() {
        return backUrl;
    }

    public void setBackUrl(String backUrl) {
        this.backUrl = backUrl;
    }

    public List<CMSElement> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<CMSElement> itemsList) {
        this.itemsList = itemsList;
    }
}
