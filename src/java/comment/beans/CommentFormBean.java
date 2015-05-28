/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comment.beans;

import comment.dao.CommentDAO;
import comment.dao.ComponentTypeDAO;
import comment.model.Comment;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import user.model.User;
import utils.Utils;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class CommentFormBean {

    private Comment comment;
    private long commentId;
    private int componentTypeId;
    private long componentId;
    private long holderId;
    private boolean isLoginOk;
    private long userId;
    private String userName;
    private String componentTypeName;
    private String backUrl;

    public CommentFormBean() {

    }

    public void init() {
        componentId = (Long) Utils.getSessionAttribute("componentId");
        componentTypeId = (Integer) Utils.getSessionAttribute("componentTypeId");
        holderId = (Long) Utils.getSessionAttribute("holderId");
        isLoginOk = (Boolean) Utils.getSessionAttribute("isLoginOk");
        comment = new Comment();
        if (isLoginOk) {
            comment.setUserId(((User) ((HttpSession) (FacesContext.getCurrentInstance()).getExternalContext().getSession(false)).getAttribute("user")).getId());
            comment.setUserName(((User) ((HttpSession) (FacesContext.getCurrentInstance()).getExternalContext().getSession(false)).getAttribute("user")).getUsername());;
        } else {
            comment.setUserId(0);
            comment.setUserName("Anonymous");
        }
        comment.setComponentId(componentId);
        comment.setComponentTypeId(componentTypeId);
        System.out.println("DEBUG ::: CommentFormBean:init:comment componentId=" + comment.getComponentId() + ", comment compTypeId=" + comment.getComponentTypeId());
        componentTypeName = ComponentTypeDAO.getById(componentTypeId).getName().toLowerCase();
        backUrl = "../" + componentTypeName + "/view.xhtml?itemId=" + componentId + "&amp;holderId=" + holderId;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public void save() {
        Date d = new Date();
        comment.setDateCreated(new java.sql.Date(d.getTime()));
        comment.calcUtilToSqlDates();
        CommentDAO.add(comment);
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect(backUrl);
        } catch (IOException ex) {
            Logger.getLogger(CommentFormBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public long getCommentId() {
        return commentId;
    }

    public void setCommentId(long commentId) {
        this.commentId = commentId;
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

    public boolean isIsLoginOk() {
        return isLoginOk;
    }

    public void setIsLoginOk(boolean isLoginOk) {
        this.isLoginOk = isLoginOk;
    }

    public long getHolderId() {
        return holderId;
    }

    public void setHolderId(long holderId) {
        this.holderId = holderId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
