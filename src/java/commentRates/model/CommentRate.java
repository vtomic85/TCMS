/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commentRates.model;

/**
 *
 * @author Vladimir Tomic
 */
public class CommentRate {

    private long id;
    private long userId;
    private long commentId;
    private boolean positive;

    public CommentRate(long id, long userId, long commentId, boolean positive) {
        this.id = id;
        this.userId = userId;
        this.commentId = commentId;
        this.positive = positive;
    }

    public CommentRate() {
        this(0, 0, 0, false);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getCommentId() {
        return commentId;
    }

    public void setCommentId(long commentId) {
        this.commentId = commentId;
    }

    public boolean isPositive() {
        return positive;
    }

    public void setPositive(boolean positive) {
        this.positive = positive;
    }
}
