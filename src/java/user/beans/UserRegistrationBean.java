/*
 * To change this license header, choose License Headers in Projusert Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import user.dao.UserDAO;
import user.dao.UserRegistrationDAO;
import user.model.UserRegistration;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class UserRegistrationBean {

    private UserRegistration userRegistration;
    private boolean usernameExists;
    private boolean emailExists;
    private String message;

    public UserRegistrationBean() {

    }

    public void init() {
        userRegistration = new UserRegistration();
        usernameExists = false;
        emailExists = false;
        message = "";
    }

    public UserRegistration getUserRegistration() {
        return userRegistration;
    }

    public void setUserRegistration(UserRegistration user) {
        this.userRegistration = user;
    }

    public String save() {
        if (userRegistration.getId() == 0) {
            checkUsername();
            checkEmail();
            if (usernameExists) {
                message = "Username already exists!";
            } else if (emailExists) {
                message = "E-mail already exists!";
            } else {
                long newId = UserRegistrationDAO.add(userRegistration);
                userRegistration.setId(newId);
                userRegistration = new UserRegistration();
                message = "Registration successfull!";
            }
        }
        return "userRegistration";
    }

    public String checkUsername() {
        usernameExists = UserDAO.getWhere("username='" + userRegistration.getUsername() + "'") != null;
        return null;
    }
    public String checkEmail(){
        emailExists = UserDAO.getWhere("email='" + userRegistration.getEmail()+ "'") != null;
        return null;
    }

    public boolean isUsernameExists() {
        return usernameExists;
    }

    public void setUsernameExists(boolean usernameExists) {
        this.usernameExists = usernameExists;
    }

    public boolean isEmailExists() {
        return emailExists;
    }

    public void setEmailExists(boolean emailExists) {
        this.emailExists = emailExists;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
