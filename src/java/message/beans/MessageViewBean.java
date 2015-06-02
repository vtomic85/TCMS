/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message.beans;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import message.dao.MessageDAO;
import message.model.Message;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class MessageViewBean {

    private long messageId;
    private Message message;

    public MessageViewBean() {

    }

    public void init() {
        message = MessageDAO.getById(messageId);
        message.setRead(true);
        MessageDAO.update(message);
    }

    public String delete() {
        MessageDAO.delete(message);
        return "inbox";
    }

    public long getMessageId() {
        return messageId;
    }

    public void setMessageId(long messageId) {
        this.messageId = messageId;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
