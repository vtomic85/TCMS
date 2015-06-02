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
import gallery.dao.GalleryDAO;
import gallery.model.Gallery;
import image.dao.ImageDAO;
import item.dao.ItemDAO;
import item.model.Item;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class EventFormBean {

    private Event event;
    private long eventId;
    private List<EventCategory> categoryList;
    private List<Item> holderList;
    private List<Gallery> galleryList;

    public EventFormBean() {

    }

    public void init() {
        System.out.println("DEBUG ::: EventFormBean: eventId=" + eventId);
        holderList = new LinkedList<>();
        categoryList = new LinkedList<>();
        galleryList = new LinkedList<>();
        if (eventId > 0) {
            event = EventDAO.getById(eventId);
        } else {
            event = new Event();
        }
    }

    public String deleteImage() {
        long imgId = event.getImageId();
        event.setImageId(0);
        EventDAO.update(event);
        ImageDAO.delete(imgId);
        return null;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String save() {
        Date d = new Date();
        event.setDateCreated(new java.sql.Date(d.getTime()));
        if (event.getId() == 0) {
            if (event.getEventDate() == null) {
                event.setEventDate(new java.sql.Date(d.getTime()));
            }
            event.calcUtilToSqlDates();
            eventId = EventDAO.add(event);
            event.setId(eventId);
            event.createCmsElement();
        } else {
            event.updateCmsElement();
        }
        event.calcUtilToSqlDates();
        EventDAO.update(event);
        return null;
    }

    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public List<EventCategory> getCategoryList() {
        categoryList = EventCategoryDAO.getAll();
        return categoryList;
    }

    public void setCategoryList(List<EventCategory> categoryList) {
        this.categoryList = categoryList;
    }

    public List<Item> getHolderList() {
        holderList = ItemDAO.getEventHolders();
        return holderList;
    }

    public void setHolderList(List<Item> holderList) {
        this.holderList = holderList;
    }

    public List<Gallery> getGalleryList() {
        galleryList = GalleryDAO.getAll();
        return galleryList;
    }

    public void setGalleryList(List<Gallery> galleryList) {
        this.galleryList = galleryList;
    }
}
