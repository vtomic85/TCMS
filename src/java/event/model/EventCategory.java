/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event.model;

import event.dao.EventCategoryDAO;

/**
 *
 * @author Vladimir Tomic
 */
public class EventCategory {

    private long id;
    private long parentId;
    private String name;
    private String parentName;

    public EventCategory(long id, long parentId, String name) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
    }

    public EventCategory() {
        this(0, 0, null);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentName() {
        if (parentId > 0) {
            parentName = EventCategoryDAO.getById(parentId).getName();
        } else {
            parentName = "---";
        }
        return parentName;
    }
}
