/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platform.model;

/**
 *
 * @author Vladimir Tomic
 */
public class CMSElement {

    private long id;
    private String name;
    private String url; // e.g. "event/view.xhtml?id=1&amp;holderId=2"
    private String adminUrl; // e.g. "admin/event/eventForm.xhtml?eventId=1"
    private Object object; // a concrete Event, Page, News...
    private long objectId;
    private long objectHolderId;
    private long objectTypeId;
    private String objectTable; // "event", "news", "page"...

    public CMSElement(long id, String name, String url, String adminUrl, Object object, long objectId, long objectHolderId, String objectTable, long objectTypeId) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.adminUrl=adminUrl;
        this.object = object;
        this.objectId = objectId;
        this.objectHolderId = objectHolderId;
        this.objectTypeId = objectTypeId;
        this.objectTable = objectTable;
    }

    public CMSElement() {
        this(0, null, null, null, null, 0, 0, null, 0);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public long getObjectId() {
        return objectId;
    }

    public void setObjectId(long objectId) {
        this.objectId = objectId;
    }

    public long getObjectHolderId() {
        return objectHolderId;
    }

    public void setObjectHolderId(long objectHolderId) {
        this.objectHolderId = objectHolderId;
    }

    public String getObjectTable() {
        return objectTable;
    }

    public void setObjectTable(String objectTable) {
        this.objectTable = objectTable;
    }

    public long getObjectTypeId() {
        return objectTypeId;
    }

    public void setObjectTypeId(long objectTypeId) {
        this.objectTypeId = objectTypeId;
    }

    public String getAdminUrl() {
        return adminUrl;
    }

    public void setAdminUrl(String adminUrl) {
        this.adminUrl = adminUrl;
    }
}
