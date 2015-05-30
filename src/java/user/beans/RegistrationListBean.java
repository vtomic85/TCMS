/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.beans;

import java.util.Date;
import java.util.LinkedList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import platform.model.Commons;
import user.dao.UserDAO;
import user.dao.UserRegistrationDAO;
import user.model.User;
import user.model.UserRegistration;
import utils.Utils;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@RequestScoped
public class RegistrationListBean {

    private LinkedList<UserRegistration> requests;

    public RegistrationListBean() {

    }

    @PostConstruct
    public void refresh() {
        if (requests == null) {
            requests = new LinkedList<>();
        }
        requests = UserRegistrationDAO.getAllOrdByApproved();
    }

    public boolean isListEmpty() {
        if (requests == null) {
            return true;
        }
        return requests.isEmpty();
    }

    public LinkedList<UserRegistration> getRequests() {
        return requests;
    }

    public void setRequests(LinkedList<UserRegistration> requests) {
        this.requests = requests;
    }

    public String approveRequest() {
        UserRegistration ur = UserRegistrationDAO.getById(Long.parseLong(Utils.getParam("requestId")));
        User u = new User(0, ur.getUsername(), ur.getPassword(), Commons.USERTYPE_USER, ur.getFirstName(), ur.getLastName(),
                ur.getEmail(), ur.getAddress(), ur.getCity(), 190, ur.getDateOfBirth() == null ? new Date() : ur.getDateOfBirth(),
                ur.getPhone(), true, null);
        UserDAO.addNoPassEncryption(u);
        ur.setApproved(true);
        UserRegistrationDAO.update(ur);
        refresh();
        return null;
    }

    public String rejectRequest() {
        UserRegistrationDAO.delete(Long.parseLong(Utils.getParam("requestId")));
        refresh();
        return null;
    }
}
