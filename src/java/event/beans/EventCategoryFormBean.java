/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event.beans;

import event.dao.EventCategoryDAO;
import event.model.EventCategory;
import java.util.LinkedList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class EventCategoryFormBean {

    private EventCategory ec;
    private long ecId;
    private LinkedList<EventCategory> parents;

    public EventCategoryFormBean() {

    }

    public void init() {
        parents = new LinkedList<>();
        parents = EventCategoryDAO.getAll();
        if (ecId > 0) {
            ec = EventCategoryDAO.getById(ecId);
        } else {
            ec = new EventCategory();
        }
    }

    public EventCategory getEc() {
        return ec;
    }

    public void setEc(EventCategory ec) {
        this.ec = ec;
    }

    public String save() {
        if (ec.getId() == 0) {
            long id = EventCategoryDAO.add(ec);
            ec.setId(id);
        }
        EventCategoryDAO.update(ec);
        return "adminEventCategoryList";
    }

    public long getEcId() {
        return ecId;
    }

    public void setEcId(long ecId) {
        this.ecId = ecId;
    }

    public LinkedList<EventCategory> getParents() {
        return parents;
    }

    public void setParents(LinkedList<EventCategory> parents) {
        this.parents = parents;
    }
}
