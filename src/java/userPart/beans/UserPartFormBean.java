/*
 * To change this license header, choose License Headers in Projutt Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userPart.beans;

import gallery.dao.GalleryDAO;
import gallery.model.Gallery;
import java.util.Date;
import java.util.LinkedList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import userPart.dao.UserPartConfigDAO;
import userPart.dao.UserPartDAO;
import userPart.model.UserPart;
import userPart.model.UserPartConfig;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class UserPartFormBean {

    private UserPart up;
    private long upId;
    private LinkedList<UserPartConfig> configList;
    private LinkedList<Gallery> galleryList;

    public UserPartFormBean() {

    }

//    @PostConstruct
    public void init() {
        if (upId > 0) {
            up = UserPartDAO.getById(upId);
        } else {
            up = new UserPart();
        }
        if (galleryList == null) {
            galleryList = new LinkedList<>();
        }
        galleryList = GalleryDAO.getAll();
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

    public long getUpId() {
        return upId;
    }

    public void setUpId(long upId) {
        this.upId = upId;
    }

    public LinkedList<UserPartConfig> getConfigList() {
        return configList;
    }

    public LinkedList<Gallery> getGalleryList() {
        return galleryList;
    }
}
