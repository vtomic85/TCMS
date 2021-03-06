/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import message.dao.MessageDAO;
import message.model.Message;
import platform.model.Commons;
import utils.Utils;

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
        message.setFolderId(Commons.MESSAGEFOLDER_DELETED);
        message.calcUtilToSqlDates();
        MessageDAO.update(message);
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
