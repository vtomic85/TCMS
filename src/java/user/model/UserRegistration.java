/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.model;

import java.util.Date;

/**
 *
 * @author Vladimir Tomic
 */
public class UserRegistration {

    private long id;
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
    private boolean approved;

    public UserRegistration(long id, String username, String password, String email, String firstName, String lastName, String address, String city, String phone, Date dateOfBirth, boolean approved) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
        this.sqlDateOfBirth = (dateOfBirth == null) ? null : new java.sql.Date(dateOfBirth.getTime());
        this.approved = approved;
    }

    public UserRegistration() {
        this(0, null, null, null, null, null, null, null, null, new Date(), false);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
