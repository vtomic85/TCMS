/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event.model;

import event.dao.EventCategoryDAO;
import item.dao.ItemDAO;
import java.io.Serializable;
import java.util.Date;
import platform.dao.CMSElementDAO;
import platform.model.CMSElement;
import platform.model.Commons;

/**
 *
 * @author Vladimir Tomic
 */
public class Event implements Serializable {

    private long id;
    private long itemId;
    private String title;
    private String lead;
    private String body;
    private long imageId;
    private long galleryId;
    private Date eventDate;
    private int categoryId;
    private boolean published;
    private String author;
    private Date dateCreated;
    private String categoryName;
    private String holderName;
    private java.sql.Date sqlDateCreated;
    private java.sql.Date sqlEventDate;
    private int comments;
    private int views;
    private String imgPath;

    public Event(long id, long itemId, String title, String lead, String body, long imageId, long galleryId, Date eventDate, int categoryId, boolean published, String author, Date dateCreated, int comments, int views, String imgPath) {
        this.id = id;
        this.itemId = itemId;
        this.title = title;
        this.lead = lead;
        this.body = body;
        this.imageId = imageId;
        this.galleryId = galleryId;
        this.eventDate = eventDate;
        this.categoryId = categoryId;
        this.published = published;
        this.author = author;
        this.dateCreated = dateCreated;
        this.sqlEventDate = (eventDate == null) ? null : new java.sql.Date(eventDate.getTime());
        this.sqlDateCreated = (dateCreated == null) ? null : new java.sql.Date(dateCreated.getTime());
        this.comments = comments;
        this.views = views;
        this.imgPath = imgPath;
    }

    public Event() {
        this(0, 0, null, null, null, 0, 0, null, 0, false, null, null, 0, 0, null);
    }

    private void setCmsElementFields(CMSElement cmsel) {
        cmsel.setName(this.title);
        cmsel.setObjectId(this.id);
        cmsel.setObjectHolderId(this.itemId);
        cmsel.setObjectTypeId(Commons.ITEMTYPE_EVENT);
        cmsel.setObjectTable("event");
        cmsel.setUrl("event/view.xhtml?id=" + this.id + "&amp;holderId=" + this.itemId);
        cmsel.setAdminUrl("../event/eventForm.xhtml?eventId=" + this.id);
    }

    public long createCmsElement() {
        CMSElement cmsel = new CMSElement();
        setCmsElementFields(cmsel);
        long cmsElementId = CMSElementDAO.add(cmsel);
        return cmsElementId;
    }

    public long updateCmsElement() {
        CMSElement cmsel = CMSElementDAO.getWhere("object_id=" + this.id + " and object_type_id=" + Commons.ITEMTYPE_EVENT);
        if (cmsel == null) {
            cmsel = new CMSElement();
            setCmsElementFields(cmsel);
            CMSElementDAO.add(cmsel);
        } else {
            setCmsElementFields(cmsel);
            CMSElementDAO.update(cmsel);
        }
        return cmsel.getId();
    }

    public void calcUtilToSqlDates() {
        this.sqlEventDate = new java.sql.Date(eventDate.getTime());
        this.sqlDateCreated = new java.sql.Date(dateCreated.getTime());
    }

    public void calcSqlToUtilDates() {
        this.eventDate = new Date(sqlEventDate.getTime());
        this.dateCreated = new Date(sqlDateCreated.getTime());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLead() {
        return lead;
    }

    public void setLead(String lead) {
        this.lead = lead;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public long getImageId() {
        return imageId;
    }

    public void setImageId(long imageId) {
        this.imageId = imageId;
    }

    public long getGalleryId() {
        return galleryId;
    }

    public void setGalleryId(long galleryId) {
        this.galleryId = galleryId;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getCategoryName() {
        return EventCategoryDAO.getById(getCategoryId()).getName();
    }

    public String getHolderName() {
        return ItemDAO.getById(itemId).getName();
    }

    public java.sql.Date getSqlDateCreated() {
        return sqlDateCreated;
    }

    public void setSqlDateCreated(java.sql.Date sqlDateCreated) {
        this.sqlDateCreated = sqlDateCreated;
    }

    public java.sql.Date getSqlEventDate() {
        return sqlEventDate;
    }

    public void setSqlEventDate(java.sql.Date sqlEventDate) {
        this.sqlEventDate = sqlEventDate;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Event)) {
            return false;
        }

        Event compare = (Event) obj;

        return compare.getId() == this.getId();
    }

    @Override
    public int hashCode() {
        int hash = 1;

        return hash * 31 + title.hashCode();
    }

    @Override
    public String toString() {
        return "Event{" + "title=" + title + ", author=" + author + ", holder name=" + holderName + '}';
    }
}
