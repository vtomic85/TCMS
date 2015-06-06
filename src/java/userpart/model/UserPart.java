package userpart.model;

import java.util.Date;
import userpart.dao.UserPartConfigDAO;

/**
 *
 * @author Vladimir Tomic
 */
public class UserPart {

    private long id;
    private long configId;
    private long itemId;
    private String name;
    private String title;
    private String subtitle;
    private String lead;
    private String body;
    private Date dateCreated;
    private Date dateModified;
    private String author;
    private String imgPath;
    private long galleryId;
    private java.sql.Date sqlDateCreated;
    private java.sql.Date sqlDateModified;
    private UserPartConfig myConfig;
    private int comments;
    private int views;
    private boolean published;

    public UserPart(long id, long configId, long itemId, String name, String title, String subtitle, String lead, String body, Date dateCreated, Date dateModified, String author, String imgPath, long galleryId, int comments, int views, boolean published) {
        this.id = id;
        this.configId = configId;
        this.itemId = itemId;
        this.name = name;
        this.title = title;
        this.subtitle = subtitle;
        this.lead = lead;
        this.body = body;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.author = author;
        this.imgPath = imgPath;
        this.galleryId = galleryId;
        this.sqlDateCreated = (dateCreated == null) ? null : new java.sql.Date(dateCreated.getTime());
        this.sqlDateModified = (dateModified == null) ? null : new java.sql.Date(dateModified.getTime());
        this.comments = comments;
        this.views = views;
        this.published = published;
    }

    public UserPart() {
        this(0, 0, 0, null, null, null, null, null, null, null, null, null, 0, 0, 0, false);
    }

//    private void setCmsElementFields(CMSElement cmsel) {
//        cmsel.setName(this.title);
//        cmsel.setObjectId(this.id);
//        cmsel.setObjectHolderId(this.itemId);
//        cmsel.setObjectTypeId(Commons.ITEMTYPE_NEWS);
//        cmsel.setObjectTable("news");
//        cmsel.setUrl("news/view.xhtml?id=" + this.id + "&amp;holderId=" + this.itemId);
//        cmsel.setAdminUrl("../news/newsForm.xhtml?newsId=" + this.id);
//    }
//
//    public long createCmsElement() {
//        CMSElement cmsel = new CMSElement();
//        setCmsElementFields(cmsel);
//        long cmsElementId = CMSElementDAO.insert(cmsel);
//        return cmsElementId;
//    }
//
//    public long updateCmsElement() {
//        CMSElement cmsel = CMSElementDAO.getById(this.id);
//        if (cmsel == null) {
//            cmsel = new CMSElement();
//            setCmsElementFields(cmsel);
//            CMSElementDAO.insert(cmsel);
//        } else {
//            setCmsElementFields(cmsel);
//            CMSElementDAO.update(cmsel);
//        }
//        return cmsel.getId();
//    }
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

    public long getConfigId() {
        return configId;
    }

    public void setConfigId(long configId) {
        this.configId = configId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public long getGalleryId() {
        return galleryId;
    }

    public void setGalleryId(long galleryId) {
        this.galleryId = galleryId;
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

    public UserPartConfig getMyConfig() {
        return UserPartConfigDAO.getById(configId);
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

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }
}
