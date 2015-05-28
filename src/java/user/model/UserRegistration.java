/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.model;

/**
 *
 * @author Vladimir Tomic
 */
public class UserRegistration {

    private long id;
    private String username;
    private String password;
    private String email;
    private boolean approved;

    public UserRegistration(long id, String username, String password, String email,boolean approved) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email=email;
        this.approved = approved;
    }

    public UserRegistration() {
        this(0, null, null, null,false);
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
}
