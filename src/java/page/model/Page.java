/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page.model;

import java.util.Date;
import platform.dao.CMSElementDAO;
import platform.model.CMSElement;
import platform.model.Commons;

/**
 *
 * @author Vladimir Tomic
 */
public class Page {

    private long id;
    private long itemId;
    private String title;
    private String subtitle;
    private String body;
    private String author;
    private Date dateCreated;
    private boolean published;
    private java.sql.Date sqlDateCreated;
    private int comments;
    private int views;
    private String imgPath;

    public Page(long id, long itemId, String title, String subtitle, String body, String author, Date dateCreated, boolean published, int comments, int views, String imgPath) {
        this.id = id;
        this.itemId = itemId;
        this.title = title;
        this.subtitle = subtitle;
        this.body = body;
        this.author = author;
        this.dateCreated = dateCreated;
        this.published = published;
        this.sqlDateCreated = (dateCreated == null) ? null : new java.sql.Date(dateCreated.getTime());
        this.comments = comments;
        this.views = views;
        this.imgPath = imgPath;
    }

    public Page() {
        this(0, 0, null, null, null, null, null, false, 0, 0, null);
    }

    private void setCmsElementFields(CMSElement cmsel) {
        cmsel.setName(this.title);
        cmsel.setObjectId(this.id);
        cmsel.setObjectHolderId(this.itemId);
        cmsel.setObjectTypeId(Commons.ITEMTYPE_PAGE);
        cmsel.setObjectTable("page");
        cmsel.setUrl("page/view.xhtml?id=" + this.id + "&amp;holderId=" + this.itemId);
        cmsel.setAdminUrl("../page/pageForm.xhtml?pageId=" + this.id);
    }

    public long createCmsElement() {
        CMSElement cmsel = new CMSElement();
        setCmsElementFields(cmsel);
        long cmsElementId = CMSElementDAO.add(cmsel);
        return cmsElementId;
    }

    public long updateCmsElement() {
        CMSElement cmsel = CMSElementDAO.getById(this.id);
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
        this.sqlDateCreated = new java.sql.Date(dateCreated.getTime());
    }

    public void calcSqlToUtilDates() {
        this.dateCreated = new java.util.Date(sqlDateCreated.getTime());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
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

    public java.sql.Date getSqlDateCreated() {
        return sqlDateCreated;
    }

    public void setSqlDateCreated(java.sql.Date sqlDateCreated) {
        this.sqlDateCreated = sqlDateCreated;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
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
}
