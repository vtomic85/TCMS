/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comment.model;

import comment.dao.ComponentTypeDAO;
import java.util.Date;
import user.dao.UserDAO;

/**
 *
 * @author Vladimir Tomic
 */
public class Comment {

    private long id;
    private int componentTypeId;    // component type
    private long componentId;       // component's ID in its table
    private long userId;            // 0 if Anonymous
    private String body;
    private Date dateCreated;
    private java.sql.Date sqlDateCreated;
    private String userName;
    private String componentTypeName;
    private String componentName;
    private boolean published;
    private int positiveVotes;
    private int negativeVotes;

    public Comment(long id, int componentTypeId, long componentId, long userId, String userName, String body, Date dateCreated, boolean published, int positiveVotes, int negativeVotes) {
        this.id = id;
        this.componentTypeId = componentTypeId;
        this.componentId = componentId;
        this.userId = userId;
        this.userName = userName;
        this.body = body;
        this.dateCreated = dateCreated;
        this.published = published;
        this.sqlDateCreated = (dateCreated == null) ? null : new java.sql.Date(dateCreated.getTime());
        this.positiveVotes = positiveVotes;
        this.negativeVotes = negativeVotes;
    }

    public Comment() {
        this(0, 0, 0, 0, "", "", null, false, 0, 0);
    }

    public void calcUtilToSqlDates() {
        this.sqlDateCreated = new java.sql.Date(dateCreated.getTime());
    }

    public void calcSqlToUtilDates() {
        this.dateCreated = new Date(sqlDateCreated.getTime());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getComponentTypeId() {
        return componentTypeId;
    }

    public void setComponentTypeId(int componentTypeId) {
        this.componentTypeId = componentTypeId;
    }

    public long getComponentId() {
        return componentId;
    }

    public void setComponentId(long componentId) {
        this.componentId = componentId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
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

    public java.sql.Date getSqlDateCreated() {
        return sqlDateCreated;
    }

    public void setSqlDateCreated(java.sql.Date sqlDateCreated) {
        this.sqlDateCreated = sqlDateCreated;
    }

    public String getUserName() {
        return userName;
    }

    public String getComponentTypeName() {
        return ComponentTypeDAO.getById(componentTypeId).getName();
    }

    public String getComponentName() {
        String tableName = getComponentTypeName();
        return ComponentTypeDAO.getComponentName(tableName, componentId);
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public int getPositiveVotes() {
        return positiveVotes;
    }

    public void setPositiveVotes(int positiveVotes) {
        this.positiveVotes = positiveVotes;
    }

    public int getNegativeVotes() {
        return negativeVotes;
    }

    public void setNegativeVotes(int negativeVotes) {
        this.negativeVotes = negativeVotes;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
