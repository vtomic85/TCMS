/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package news.model;

import image.dao.ImageDAO;
import java.util.Date;
import news.dao.NewsCategoryDAO;
import platform.dao.CMSElementDAO;
import platform.model.CMSElement;
import platform.model.Commons;

/**
 *
 * @author Vladimir Tomic
 */
public class News {

    private long id;
    private long itemId;
    private String title;
    private String lead;
    private String body;
    private long imageId;
    private long galleryId;
    private String author;
    private Date dateCreated;
    private Date dateModified;
    private int categoryId;
    private boolean published;
    private String categoryName;
    private String imgPath;
    private java.sql.Date sqlDateCreated;
    private java.sql.Date sqlDateModified;
    private int comments;
    private int views;

    public News(long id, long itemId, String title, String lead, String body, long imageId, long galleryId, String author, Date dateCreated, Date dateModified, int categoryId, boolean published, int comments, int views, String imgPath) {
        this.id = id;
        this.itemId = itemId;
        this.title = title;
        this.lead = lead;
        this.body = body;
        this.imageId = imageId;
        this.galleryId = galleryId;
        this.author = author;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.categoryId = categoryId;
        this.published = published;
        this.sqlDateModified = (dateModified == null) ? null : new java.sql.Date(dateModified.getTime());
        this.sqlDateCreated = (dateCreated == null) ? null : new java.sql.Date(dateCreated.getTime());
        this.comments = comments;
        this.views = views;
        this.imgPath = imgPath;
    }

    public News() {
        this(0, 0, null, null, null, 0, 0, null, null, null, 0, false, 0, 0, null);
    }

    private void setCmsElementFields(CMSElement cmsel) {
        cmsel.setName(this.title);
        cmsel.setObjectId(this.id);
        cmsel.setObjectHolderId(this.itemId);
        cmsel.setObjectTypeId(Commons.ITEMTYPE_NEWS);
        cmsel.setObjectTable("news");
        cmsel.setUrl("news/view.xhtml?id=" + this.id + "&amp;holderId=" + this.itemId);
        cmsel.setAdminUrl("../news/newsForm.xhtml?newsId=" + this.id);
    }

    public long createCmsElement() {
        CMSElement cmsel = new CMSElement();
        setCmsElementFields(cmsel);
        long cmsElementId = CMSElementDAO.insert(cmsel);
        return cmsElementId;
    }

    public long updateCmsElement() {
        CMSElement cmsel = CMSElementDAO.getById(this.id);
        if (cmsel == null) {
            cmsel = new CMSElement();
            setCmsElementFields(cmsel);
            CMSElementDAO.insert(cmsel);
        } else {
            setCmsElementFields(cmsel);
            CMSElementDAO.update(cmsel);
        }
        return cmsel.getId();
    }

    public void calcUtilToSqlDates() {
        this.sqlDateModified = new java.sql.Date(dateModified.getTime());
        this.sqlDateCreated = new java.sql.Date(dateCreated.getTime());
    }

    public void calcSqlToUtilDates() {
        this.dateModified = new Date(sqlDateModified.getTime());
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

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public String getCategoryName() {
        return NewsCategoryDAO.getById(getCategoryId()).getName();
    }

    public java.sql.Date getSqlDateCreated() {
        return sqlDateCreated;
    }

    public void setSqlDateCreated(java.sql.Date sqlDateCreated) {
        this.sqlDateCreated = sqlDateCreated;
    }

    public java.sql.Date getSqlDateModified() {
        return sqlDateModified;
    }

    public void setSqlDateModified(java.sql.Date sqlDateModified) {
        this.sqlDateModified = sqlDateModified;
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

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getImgPath() {
        return imgPath;
    }
}
