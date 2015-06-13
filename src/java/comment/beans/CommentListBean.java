/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comment.beans;

import comment.dao.CommentDAO;
import comment.model.Comment;
import event.dao.EventDAO;
import event.model.Event;
import java.util.LinkedList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import news.dao.NewsDAO;
import news.model.News;
import page.dao.PageDAO;
import page.model.Page;
import platform.model.Commons;
import utils.Utils;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@RequestScoped
public class CommentListBean {

    private LinkedList<Comment> comments;
    private boolean listEmpty;

    public CommentListBean() {
    }

    @PostConstruct
    public void refresh() {
        if (comments == null) {
            comments = new LinkedList<>();
        }
        comments = CommentDAO.getAllWhere("published=0");
    }

    public boolean isListEmpty() {
        if (comments == null) {
            return true;
        }
        return comments.isEmpty();
    }

    public LinkedList<Comment> getComments() {
        refresh();
        return comments;
    }

    public void setComments(LinkedList<Comment> comments) {
        this.comments = comments;
    }

    public String editComment() {
        return "adminEditComment";
    }

    public String deleteComment() {
        CommentDAO.delete(Long.parseLong(Utils.getParam("commentId")));
        refresh();
        return null;
    }

    public String publishComment() {
        Comment c = CommentDAO.getById(Long.parseLong(Utils.getParam("commentId")));
        c.setPublished(true);
        CommentDAO.update(c);
        // Increment the number of comments
        int compTypeId = c.getComponentTypeId();
        long compId = c.getComponentId();
        switch (compTypeId) {
            case Commons.ITEMTYPE_EVENT:
                Event e = EventDAO.getById(compId);
                e.setComments(e.getComments() + 1);
                EventDAO.update(e);
                break;
            case Commons.ITEMTYPE_NEWS:
                News n = NewsDAO.getById(compId);
                n.setComments(n.getComments() + 1);
                NewsDAO.update(n);
                break;
            case Commons.ITEMTYPE_PAGE:
                Page p = PageDAO.getById(compId);
                p.setComments(p.getComments() + 1);
                PageDAO.update(p);
                break;
            default:
                break;
        }
        return null;
    }

    public String newComment() {
        return "adminEditComment";
    }
}
