/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userpart.beans;

import java.util.LinkedList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import userpart.dao.UserPartConfigDAO;
import userpart.dao.UserPartDAO;
import userpart.model.UserPartConfig;
import utils.Utils;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@RequestScoped
public class UserPartConfigListBean {

    private LinkedList<UserPartConfig> list;
    private boolean listEmpty;

    public UserPartConfigListBean() {

    }

    @PostConstruct
    public void refresh() {
        if (list == null) {
            list = new LinkedList<>();
        }
        list = UserPartConfigDAO.getAll();
    }

    public boolean isListEmpty() {
        if (list == null) {
            return true;
        }
        return list.isEmpty();
    }

    public LinkedList<UserPartConfig> getList() {
        return list;
    }

    public void setList(LinkedList<UserPartConfig> list) {
        this.list = list;
    }

    public String editUserPartConfig() {
        return "adminEditUserPartConfig";
    }

    public String deleteUserPartConfig() {
        long id = Long.parseLong(Utils.getParam("upcId"));
        if (id <= 0) {
            return null;
        }
        long countUserParts = UserPartDAO.countWhere("config_id=" + id);
        if (countUserParts > 0) {
            return null;
        }
        UserPartConfigDAO.delete(id);
        refresh();
        return null;
    }

    public String newUserPartConfig() {
        return "adminEditUserPartConfig";
    }
}
