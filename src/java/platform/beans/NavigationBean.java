/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platform.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import utils.Utils;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class NavigationBean {

    private long itemId;
    private long holderId;
    private String typeName;

    public NavigationBean() {
        this(1, 0, "index");
    }

    public NavigationBean(long itemId, long holderId, String typeName) {
        System.out.println("DEBUG ::: NavBean construct");
        this.itemId = itemId;
        this.holderId = holderId;
        this.typeName = typeName;
        System.out.println("DEBUG ::: construct params: " + itemId + " " + holderId + " " + typeName);
    }

    public void init() {
    }

    public String redirect() {
        System.out.println("DEBUG ::: Redirect start");
        itemId = Long.parseLong(Utils.getParam("itemId"));
        holderId = Long.parseLong(Utils.getParam("holderId"));
        typeName = Utils.getParam("typeName");
        System.out.println("DEBUG ::: Params: " + itemId + " " + holderId + " " + typeName);
        String address = typeName + "/view.xhtml?itemId=" + itemId + "&amp;holderId=" + holderId;
        System.out.println("DEBUG ::: redirecting to " + address);
        return address;
    }

    public long getHolderId() {
        return holderId;
    }

    public void setHolderId(long holderId) {
        this.holderId = holderId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }
}
