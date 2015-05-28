/*
 * To change this license header, choose License Headers in Projutt Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.beans;

import user.dao.UserTypeDAO;
import user.model.UserType;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class UserTypeFormBean {

    private UserType ut;
    private long utId;

    public UserTypeFormBean() {

    }

//    @PostConstruct
    public void init() {
        if (utId > 0) {
            ut = UserTypeDAO.getById(utId);
        } else {
            ut = new UserType();
        }
    }

    public UserType getUt() {
        return ut;
    }

    public void setUt(UserType ut) {
        this.ut = ut;
    }

    public String save() {
        if (ut.getId() == 0) {
            long id = UserTypeDAO.insert(ut);
            ut.setId(id);
        }
        UserTypeDAO.update(ut);
        return "adminUserTypeList";
    }

    public long getUtId() {
        return utId;
    }

    public void setUtId(long utId) {
        this.utId = utId;
    }
}
