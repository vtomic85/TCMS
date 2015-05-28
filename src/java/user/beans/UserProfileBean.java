/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.beans;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import platform.dao.CountryDAO;
import platform.model.Country;
import user.dao.UserDAO;
import user.model.User;
import utils.Utils;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class UserProfileBean {

    private User user;
    private long userId;
    private List<Country> countryList;

    public UserProfileBean() {

    }

    public void init() {
        userId = ((User) Utils.getSessionAttribute("user")).getId();
        if (userId > 0) {
            user = UserDAO.getById(userId);
            System.out.println("DEBUG ::: UserProfileBean init user imgPath=" + user.getImgPath());
        }
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String save() {
        user.calcUtilToSqlDates();
        UserDAO.updateNoPass(user);
        Utils.setSessionAttribute("user", user);
        System.out.println("DEBUG ::: UserProfileBean:save:user imgPath=" + user.getImgPath());
        return "userProfilePage";
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public List<Country> getCountryList() {
        countryList = CountryDAO.getAll();
        return countryList;
    }
}
