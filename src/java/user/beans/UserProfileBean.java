/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.beans;

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
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
    private String oldPassword;
    private String newPassword;
    private String confirmPassword;
    private UIComponent oldPasswordComponent;
    private UIComponent newPasswordComponent;
    private UIComponent confirmPasswordComponent;

    public UserProfileBean() {

    }

    public void init() {
        userId = ((User) Utils.getSessionAttribute("user")).getId();
        if (userId > 0) {
            user = UserDAO.getById(userId);
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
        UserDAO.updateNoPassEnc(user);
        Utils.setSessionAttribute("user", user);
        return "userProfilePage";
    }

    public String changePass() {
        FacesContext context = FacesContext.getCurrentInstance();
        if (!newPassword.equals(confirmPassword)) {
            newPassword = "";
            confirmPassword = "";
            context.addMessage(confirmPasswordComponent.getClientId(context), new FacesMessage("Passwords do not match!"));
            return null;
        }
        if (UserDAO.passwordOk(user.getUsername(), oldPassword) < 1) {
            oldPassword = "";
            context.addMessage(oldPasswordComponent.getClientId(context), new FacesMessage("Old password incorrect!"));
            return null;
        }
        user.setPassword(newPassword);
        UserDAO.updatePassEnc(user);
        newPassword = "";
        confirmPassword = "";
        oldPassword = "";
        context.addMessage(confirmPasswordComponent.getClientId(context), new FacesMessage("Password successfully changed!"));
        return null;
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

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public UIComponent getOldPasswordComponent() {
        return oldPasswordComponent;
    }

    public void setOldPasswordComponent(UIComponent oldPasswordComponent) {
        this.oldPasswordComponent = oldPasswordComponent;
    }

    public UIComponent getNewPasswordComponent() {
        return newPasswordComponent;
    }

    public void setNewPasswordComponent(UIComponent newPasswordComponent) {
        this.newPasswordComponent = newPasswordComponent;
    }

    public UIComponent getConfirmPasswordComponent() {
        return confirmPasswordComponent;
    }

    public void setConfirmPasswordComponent(UIComponent confirmPasswordComponent) {
        this.confirmPasswordComponent = confirmPasswordComponent;
    }
}
