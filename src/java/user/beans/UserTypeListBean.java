/*
 * To change this license header, choose License Headers in Projutt Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.beans;

import java.util.LinkedList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import user.dao.UserDAO;
import user.dao.UserTypeDAO;
import user.model.UserType;
import utils.Utils;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@RequestScoped
public class UserTypeListBean {

    private LinkedList<UserType> utList;
    private boolean listEmpty;

    public UserTypeListBean() {

    }

    @PostConstruct
    public void refresh() {
        if (utList == null) {
            utList = new LinkedList<>();
        }
        utList = UserTypeDAO.getAll();
    }

    public boolean isListEmpty() {
        if (utList == null) {
            return true;
        }
        return utList.isEmpty();
    }

    public LinkedList<UserType> getUtList() {
        return utList;
    }

    public void setUtList(LinkedList<UserType> utList) {
        this.utList = utList;
    }

    public String editUserType() {
        return "adminEditUserType";
    }

    public String deleteUserType() {
        int id = Integer.parseInt(Utils.getParam("utId"));
        if (id <= 0) {
            return null;
        }
        long countUsers = UserDAO.countWhere("type_id=" + id);
        if (countUsers > 0) {
            return null;
        }
        UserTypeDAO.delete(id);
        refresh();
        return null;
    }

    public String newUserType() {
        return "adminEditUserType";
    }
}
