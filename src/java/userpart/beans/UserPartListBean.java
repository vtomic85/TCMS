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
import userpart.dao.UserPartDAO;
import userpart.model.UserPart;
import utils.Utils;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@RequestScoped
public class UserPartListBean {

    private LinkedList<UserPart> list;
    private boolean listEmpty;

    public UserPartListBean() {

    }

    @PostConstruct
    public void refresh() {
        if (list == null) {
            list = new LinkedList<>();
        }
        list = UserPartDAO.getAll();
    }

    public boolean isListEmpty() {
        if (list == null) {
            return true;
        }
        return list.isEmpty();
    }

    public LinkedList<UserPart> getList() {
        return list;
    }

    public void setList(LinkedList<UserPart> list) {
        this.list = list;
    }

    public String editUserPart() {
        return "adminEditUserPart";
    }

    public String deleteUserPart() {
        long id = Long.parseLong(Utils.getParam("userPartId"));
        if (id <= 0) {
            return null;
        }
        UserPartDAO.delete(id);
        refresh();
        return null;
    }

    public String newUserPart() {
        return "adminEditUserPart";
    }
}
