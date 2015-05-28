/*
 * To change this license header, choose License Headers in Projusert Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.beans;

import java.util.Date;
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

    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String phone;
    private Date dateOfBirth;
    private java.sql.Date sqlDateOfBirth;
    private boolean registeredUsernameExists;
    private boolean registeredEmailExists;
    private boolean requestedUsernameExists;
    private boolean requestedEmailExists;
    private boolean fieldsEmpty;
    private String message;
    private boolean registrationAttempted;

    public UserRegistrationBean() {

    }

    public void init() {
        registeredUsernameExists = true;
        registeredEmailExists = true;
        requestedUsernameExists = true;
        requestedEmailExists = true;
        fieldsEmpty = true;
        message = "";
        registrationAttempted = false;
    }

    public String save() {
        checkParameters();
        if (fieldsEmpty) {
            message = "You have to enter username, password and e-mail!";
        } else if (registeredUsernameExists) {
            message = "A registered user with that username already exists!";
        } else if (registeredEmailExists) {
            message = "A registered user with that e-mail already exists!";
        } else if (requestedUsernameExists) {
            message = "A registration request with that username already exists!";
        } else if (requestedEmailExists) {
            message = "A registration request with that e-mail already exists!";
        } else {
            UserRegistration ur = new UserRegistration(0, username, password, email, firstName, lastName, address, city, phone, dateOfBirth, false);
            long newId = UserRegistrationDAO.add(ur);
            ur.setId(newId);
            message = "Registration successfull!";
        }
        registrationAttempted = true;
        System.out.println("DEBUG ::: UserRegistrationBean:save:" + message);
        return null;
    }

    public String checkParameters() {
        registeredUsernameExists = UserDAO.getWhere("username='" + username + "'") != null;
        registeredEmailExists = UserDAO.getWhere("email='" + email + "'") != null;
        requestedUsernameExists = UserRegistrationDAO.getWhere("username='" + username + "'") != null;
        requestedEmailExists = UserRegistrationDAO.getWhere("email='" + email + "'") != null;
        fieldsEmpty = username.isEmpty() || password.isEmpty() || email.isEmpty();
        return null;
    }

    public void calcUtilToSqlDates() {
        if (dateOfBirth != null) {
            this.sqlDateOfBirth = new java.sql.Date(dateOfBirth.getTime());
        } else {
            this.sqlDateOfBirth = new java.sql.Date(new Date().getTime());
        }
    }

    public void calcSqlToUtilDates() {
        this.dateOfBirth = new Date(sqlDateOfBirth.getTime());
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isRegistrationAttempted() {
        return registrationAttempted;
    }

    public void setRegistrationAttempted(boolean registrationAttempted) {
        this.registrationAttempted = registrationAttempted;
    }

    public boolean isRegisteredUsernameExists() {
        return registeredUsernameExists;
    }

    public void setRegisteredUsernameExists(boolean registeredUsernameExists) {
        this.registeredUsernameExists = registeredUsernameExists;
    }

    public boolean isRegisteredEmailExists() {
        return registeredEmailExists;
    }

    public void setRegisteredEmailExists(boolean registeredEmailExists) {
        this.registeredEmailExists = registeredEmailExists;
    }

    public boolean isRequestedUsernameExists() {
        return requestedUsernameExists;
    }

    public void setRequestedUsernameExists(boolean requestedUsernameExists) {
        this.requestedUsernameExists = requestedUsernameExists;
    }

    public boolean isRequestedEmailExists() {
        return requestedEmailExists;
    }

    public void setRequestedEmailExists(boolean requestedEmailExists) {
        this.requestedEmailExists = requestedEmailExists;
    }

    public boolean isFieldsEmpty() {
        return fieldsEmpty;
    }

    public void setFieldsEmpty(boolean fieldsEmpty) {
        this.fieldsEmpty = fieldsEmpty;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public java.sql.Date getSqlDateOfBirth() {
        return sqlDateOfBirth;
    }

    public void setSqlDateOfBirth(java.sql.Date sqlDateOfBirth) {
        this.sqlDateOfBirth = sqlDateOfBirth;
    }
}
