/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.beans;

import user.dao.UserTypeDAO;
import user.dao.UserDAO;
import user.model.User;
import user.model.UserType;
import java.util.LinkedList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import utils.Utils;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@RequestScoped
public class UserListBean {

    private LinkedList<User> users;
    private LinkedList<UserType> types;
    private boolean listEmpty;

    public UserListBean() {

    }

    @PostConstruct
    public void refresh() {
        if (users == null) {
            users = new LinkedList<>();
        }
        if (types == null) {
            types = new LinkedList<>();
        }
        users = UserDAO.getAll();
        types = UserTypeDAO.getAll();
    }

    public boolean isListEmpty() {
        if (users == null) {
            return true;
        }
        return users.isEmpty();
    }

    public LinkedList<User> getUsers() {
        return users;
    }

    public void setUsers(LinkedList<User> users) {
        this.users = users;
    }

    public String editUser() {
        return "adminEditUser";
    }

    public String deleteUser() {
        UserDAO.delete(Long.parseLong(Utils.getParam("userId")));
        refresh();
        return null;
    }

    public String newUser() {
        return "adminEditUser";
    }

    public LinkedList<UserType> getCategories() {
        return types;
    }
}
