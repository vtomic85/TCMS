/*
 * To change this license header, choose License Headers in Projusert Properties.
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
import user.dao.UserTypeDAO;
import user.model.User;
import user.model.UserType;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class UserFormBean {

    private User user;
    private long userId;
    private List<UserType> typeList;
    private List<Country> countryList;

    public UserFormBean() {

    }

    public void init() {
        if (userId > 0) {
            user = UserDAO.getById(userId);
        } else {
            user = new User();
        }
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String save() {
        if (user.getId() == 0) {
            user.calcUtilToSqlDates();
            long newId = UserDAO.add(user);
            user.setId(newId);
        }
        user.calcUtilToSqlDates();
        UserDAO.updateNoPass(user);
        return "adminUserList";
    }

//    public void upload(FileUploadEvent e) throws IOException {
//        FileUploadController.upload(e, "user", user.getId());
//    }
//    public String deleteUserImage() {
//        if (user.getImageId() > 0) {
//            ImageDAO.delete(user.getImageId());
//            user.setImageId(0);
//            UserDAO.update(user);
//            FacesMessage msg = new FacesMessage("Success! Image deleted!");
//            FacesContext.getCurrentInstance().addMessage(null, msg);
//        }
//        return null;
//    }
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public List<UserType> getTypeList() {
        typeList = UserTypeDAO.getAll();
        return typeList;
    }

    public List<Country> getCountryList() {
        countryList = CountryDAO.getAll();
        return countryList;
    }
}
