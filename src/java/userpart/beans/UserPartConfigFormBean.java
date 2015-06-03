/*
 * To change this license header, choose License Headers in Projutt Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userpart.beans;

import userpart.dao.UserPartConfigDAO;
import userpart.model.UserPartConfig;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class UserPartConfigFormBean {

    private UserPartConfig upc;
    private long upcId;

    public UserPartConfigFormBean() {

    }

//    @PostConstruct
    public void init() {
        if (upcId > 0) {
            upc = UserPartConfigDAO.getById(upcId);
        } else {
            upc = new UserPartConfig();
        }
    }

    public UserPartConfig getUpc() {
        return upc;
    }

    public void setUpc(UserPartConfig upc) {
        this.upc = upc;
    }

    public String save() {
        if (upc.getId() == 0) {
            long id = UserPartConfigDAO.add(upc);
            upc.setId(id);
        }
        UserPartConfigDAO.update(upc);
        return "adminUserPartConfigList";
    }

    public long getUpcId() {
        return upcId;
    }

    public void setUpcId(long upcId) {
        this.upcId = upcId;
    }
}
