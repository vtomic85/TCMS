/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userpart.beans;

import comment.dao.CommentDAO;
import comment.model.Comment;
import userpart.dao.UserPartDAO;
import userpart.model.UserPart;
import image.dao.ImageDAO;
import image.model.Image;
import java.util.LinkedList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import platform.model.Commons;
import user.model.User;
import utils.Utils;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class UserPartViewBean {

    private UserPart item;
    private long itemId;
    private int typeId;
    private LinkedList<Comment> comments;
    private long publishedCommentsCount;
    private boolean commentListEmpty;
    private LinkedList<Image> galleryImages;

    public UserPartViewBean() {

    }

    public void init() {
        if (itemId > 0) {
            item = UserPartDAO.getById(itemId);
            item.setViews(item.getViews() + 1);
            UserPartDAO.update(item);
            if (comments == null) {
                comments = new LinkedList<>();
            }
            if (galleryImages == null) {
                galleryImages = new LinkedList<>();
            }
            galleryImages = ImageDAO.getAllWhere("gallery_id=" + item.getGalleryId());
            comments = CommentDAO.getAllFor(Commons.ITEMTYPE_USER_PART, itemId);
            publishedCommentsCount = CommentDAO.countWhere("component_type_id=" + Commons.ITEMTYPE_USER_PART + " and component_id=" + itemId + " and published=1");
        }
        typeId = Commons.ITEMTYPE_USER_PART;
    }

    public String leaveComment() {
        Utils.setSessionAttribute("componentId", itemId);
        Utils.setSessionAttribute("componentTypeId", Commons.ITEMTYPE_USER_PART);
        Utils.setSessionAttribute("holderId", item.getItemId());
        User u = ((User) ((HttpSession) (FacesContext.getCurrentInstance()).getExternalContext().getSession(false)).getAttribute("user"));
        Utils.setSessionAttribute("isLoginOk", u != null);
        return "leaveComment";
    }

    public String upvote() {
        long commentId = Long.parseLong(Utils.getParam("commentId"));
        Comment comment = CommentDAO.getById(commentId);
        comment.setPositiveVotes(comment.getPositiveVotes() + 1);
        CommentDAO.update(comment);
        return null;
    }

    public String downvote() {
        long commentId = Long.parseLong(Utils.getParam("commentId"));
        Comment comment = CommentDAO.getById(commentId);
        comment.setNegativeVotes(comment.getNegativeVotes() + 1);
        CommentDAO.update(comment);
        return null;
    }

    public UserPart getItem() {
        return item;
    }

    public void setItem(UserPart item) {
        this.item = item;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public boolean isCommentListEmpty() {
        if (comments == null) {
            return true;
        }
        return comments.isEmpty();
    }

    public LinkedList<Comment> getComments() {
        if (comments == null) {
            comments = new LinkedList<>();
        }
        comments = CommentDAO.getAllFor(Commons.ITEMTYPE_USER_PART, itemId);
        return comments;
    }

    public void setComments(LinkedList<Comment> comments) {
        this.comments = comments;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public long getPublishedCommentsCount() {
        return publishedCommentsCount;
    }

    public void setPublishedCommentsCount(long publishedCommentsCount) {
        this.publishedCommentsCount = publishedCommentsCount;
    }

    public LinkedList<Image> getGalleryImages() {
        return galleryImages;
    }

    public void setGalleryImages(LinkedList<Image> galleryImages) {
        this.galleryImages = galleryImages;
    }
}
