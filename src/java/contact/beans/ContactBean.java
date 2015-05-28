/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contact.beans;

import contact.dao.ContactDAO;
import contact.model.Contact;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@RequestScoped
public class ContactBean {

    private Contact contact;
    
    public ContactBean (){
        this.contact=ContactDAO.getById(1L);
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
    
    public void update(){
        FacesContext context = FacesContext.getCurrentInstance();
        ContactDAO.update(contact);
        FacesMessage message = new FacesMessage("Data successfully updated.");
        context.addMessage("adminContactForm:contactUpdate", message);
    }
}
