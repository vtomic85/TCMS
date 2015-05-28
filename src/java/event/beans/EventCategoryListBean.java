/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event.beans;

import event.dao.EventCategoryDAO;
import event.dao.EventDAO;
import event.model.EventCategory;
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
public class EventCategoryListBean {

    private LinkedList<EventCategory> ecList;
    private boolean listEmpty;

    public EventCategoryListBean() {

    }

    @PostConstruct
    public void refresh() {
        if (ecList == null) {
            ecList = new LinkedList<>();
        }
        ecList = EventCategoryDAO.getAll();
    }

    public boolean isListEmpty() {
        if (ecList == null) {
            return true;
        }
        return ecList.isEmpty();
    }

    public LinkedList<EventCategory> getEcList() {
        return ecList;
    }

    public void setEcList(LinkedList<EventCategory> ecList) {
        this.ecList = ecList;
    }

    public String editEventCategory() {
        return "adminEditEventCategory";
    }

    public String deleteEventCategory() {
        int id = Integer.parseInt(Utils.getParam("ecId"));
        if (id <= 0) {
            return null;
        }
        long countChildren = EventCategoryDAO.countWhere("parent_id=" + id);
        if (countChildren > 0) {
            return null;
        }
        long countEvents = EventDAO.countWhere("category_id=" + id);
        if (countEvents > 0) {
            return null;
        }
        EventCategoryDAO.delete(id);
        refresh();
        return null;
    }

    public String newEventCategory() {
        return "adminEditEventCategory";
    }
}
