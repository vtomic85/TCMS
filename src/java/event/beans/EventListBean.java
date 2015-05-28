/*
 * To change this license header, choose License Headers in Projeventt Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event.beans;

import event.dao.EventCategoryDAO;
import event.dao.EventDAO;
import event.model.Event;
import event.model.EventCategory;
import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.SelectEvent;
import utils.Utils;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@RequestScoped
public class EventListBean implements Serializable{

    private LinkedList<Event> events;
    private LinkedList<EventCategory> categories;
    private boolean listEmpty;

    public EventListBean() {
    }

    @PostConstruct
    public void refresh() {
        if (events == null) {
            events = new LinkedList<>();
        }
        if (categories == null) {
            categories = new LinkedList<>();
        }
        events = EventDAO.getAll();
        categories = EventCategoryDAO.getAll();
    }

    public boolean isListEmpty() {
        if (events == null) {
            return true;
        }
        return events.isEmpty();
    }

    public LinkedList<Event> getEvents() {
        return events;
    }

    public void setEvents(LinkedList<Event> events) {
        this.events = events;
    }

    public String editEvent() {
        return "adminEditEvent";
    }

    public String deleteEvent() {
        EventDAO.delete(Long.parseLong(Utils.getParam("eventId")));
        refresh();
        return null;
    }

    public String newEvent() {
        return "adminEditEvent";
    }

    public LinkedList<EventCategory> getCategories() {
        return categories;
    }
}
