/*
 * To change this license header, choose License Headers in Projutt Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userpart.beans;

import gallery.dao.GalleryDAO;
import gallery.model.Gallery;
import item.dao.ItemDAO;
import item.model.Item;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import userpart.dao.UserPartConfigDAO;
import userpart.dao.UserPartDAO;
import userpart.model.UserPart;
import userpart.model.UserPartConfig;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class UserPartFormBean {

    private UserPart up;
    private long userPartId;
    private LinkedList<UserPartConfig> configList;
    private LinkedList<Gallery> galleryList;
    private List<Item> holderList;

    public UserPartFormBean() {

    }

    public void init() {
        if (userPartId > 0) {
            up = UserPartDAO.getById(userPartId);
        } else {
            up = new UserPart();
        }
        if (galleryList == null) {
            galleryList = new LinkedList<>();
        }
        galleryList = GalleryDAO.getAll();
        if (holderList == null) {
            holderList = new LinkedList<>();
        }
        holderList = ItemDAO.getUserPartHolders();
        if (configList == null) {
            configList = new LinkedList<>();
        }
        configList = UserPartConfigDAO.getAll();
    }

    public UserPart getUp() {
        return up;
    }

    public void setUp(UserPart up) {
        this.up = up;
    }

    public String save() {
        Date d = new Date();
        if (up.getId() == 0) {
            up.setDateCreated(new java.sql.Date(d.getTime()));
            up.setDateModified(new java.sql.Date(d.getTime()));
            up.calcUtilToSqlDates();
            long id = UserPartDAO.add(up);
            up.setId(id);
//            up.createCmsElement();
        } else {
//            up.updateCmsElement();
        }
        up.setDateModified(new java.sql.Date(d.getTime()));
        up.calcUtilToSqlDates();
        UserPartDAO.update(up);
        return null;
    }

    public long getUserPartId() {
        return userPartId;
    }

    public void setUserPartId(long userPartId) {
        this.userPartId = userPartId;
    }

    public LinkedList<UserPartConfig> getConfigList() {
        return configList;
    }

    public LinkedList<Gallery> getGalleryList() {
        return galleryList;
    }

    public List<Item> getHolderList() {
        return holderList;
    }

    public void setHolderList(List<Item> holderList) {
        this.holderList = holderList;
    }
}
