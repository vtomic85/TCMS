/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toplist.model;

/**
 *
 * @author Vladimir Tomic
 */
public class TopListElementRelation {

    private long id;
    private long topListId;
    private long cmsElementId;

    public TopListElementRelation(long id, long topListId, long cmsElementId) {
        this.id = id;
        this.topListId = topListId;
        this.cmsElementId = cmsElementId;
    }

    public TopListElementRelation() {
        this(0, 0, 0);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTopListId() {
        return topListId;
    }

    public void setTopListId(long topListId) {
        this.topListId = topListId;
    }

    public long getCmsElementId() {
        return cmsElementId;
    }

    public void setCmsElementId(long cmsElementId) {
        this.cmsElementId = cmsElementId;
    }
}
