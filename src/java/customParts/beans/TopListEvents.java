/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customParts.beans;

import event.dao.EventDAO;
import event.model.Event;
import java.util.LinkedList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import platform.dao.CMSElementDAO;
import toplist.dao.TopListElementRelationDAO;
import platform.model.CMSElement;
import platform.model.Commons;
import toplist.model.TopListElementRelation;

/**
 *
 * @author Vladimir Tomic
 */
@ViewScoped
@ManagedBean
public class TopListEvents {

    private LinkedList<Event> list;
    private boolean listEmpty;
    private long topListId;

    public TopListEvents() {
        init();
    }

    @PostConstruct
    public void init() {
        topListId = Long.parseLong(FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("topListId"));
        if (list == null) {
            list = new LinkedList<>();
        } else {
            list.clear();
        }
        LinkedList<TopListElementRelation> tlreList = TopListElementRelationDAO.getAllWhere("toplist_id=" + topListId);
        LinkedList<CMSElement> cmsElList = new LinkedList<>();
        for (TopListElementRelation tlre : tlreList) {
            cmsElList.add(CMSElementDAO.getById(tlre.getCmsElementId()));
        }
        for (CMSElement cmsEl : cmsElList) {
            if (cmsEl.getObjectTypeId() == Commons.ITEMTYPE_EVENT) {
                list.add(EventDAO.getById(cmsEl.getObjectId()));
            }
        }
    }

    public LinkedList<Event> getList() {
        return list;
    }

    public void setList(LinkedList<Event> list) {
        this.list = list;
    }

    public boolean isListEmpty() {
        if (list == null) {
            return true;
        } else {
            return list.isEmpty();
        }
    }

    public void setListEmpty(boolean listEmpty) {
        this.listEmpty = listEmpty;
    }

    public long getTopListId() {
        return topListId;
    }

    public void setTopListId(long topListId) {
        this.topListId = topListId;
    }
}
