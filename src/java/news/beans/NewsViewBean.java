/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package news.beans;

import comment.dao.CommentDAO;
import comment.model.Comment;
import image.dao.ImageDAO;
import image.model.Image;
import java.util.LinkedList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import news.dao.NewsDAO;
import news.model.News;
import platform.model.Commons;
import user.model.User;
import utils.Utils;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@RequestScoped
public class NewsViewBean {

    private News item;
    private long itemId;
    private int typeId;
    private LinkedList<Comment> comments;
    private long publishedCommentsCount;
    private boolean commentListEmpty;
    private LinkedList<Image> galleryImages;

    public NewsViewBean() {

    }

    public void init() {
        if (itemId > 0) {
            item = NewsDAO.getById(itemId);
            item.setViews(item.getViews() + 1);
            NewsDAO.update(item);
            if (comments == null) {
                comments = new LinkedList<>();
            }
            if (galleryImages == null) {
                galleryImages = new LinkedList<>();
            }
            galleryImages = ImageDAO.getAllWhere("gallery_id=" + item.getGalleryId());
            comments = CommentDAO.getAllFor(Commons.ITEMTYPE_NEWS, itemId);
            publishedCommentsCount = CommentDAO.countWhere("component_type_id=" + Commons.ITEMTYPE_NEWS + " and component_id=" + itemId + " and published=1");
        }
        typeId = Commons.ITEMTYPE_NEWS;
    }

    public String leaveComment() {
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

    public News getItem() {
        return item;
    }

    public void setItem(News item) {
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
        comments = CommentDAO.getAllFor(Commons.ITEMTYPE_NEWS, itemId);
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
