/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message.beans;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Locale;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import message.dao.MessageDAO;
import message.model.Message;
import platform.model.Commons;
import user.dao.UserDAO;
import user.model.User;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class MessageFormBean {

    private Message message;
    private long messageId;
    private LinkedList<User> users; // a list of possible receivers
    private int source; // where did we come from (0-New, 1-Inbox, 2-Drafts)

    public MessageFormBean() {

    }

    public void init() {
        if (messageId > 0) { // replying to the existing message or editing a draft message
            message = MessageDAO.getById(messageId);
            if (message.getFolderId() == Commons.MESSAGEFOLDER_INBOX) { // replying
                source = Commons.MESSAGEFOLDER_INBOX;
                Date d = message.getDate();
                SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss", Locale.ENGLISH);
                StringBuffer formattedDate = new StringBuffer(sdf.format(d));
                StringBuffer fromUsername = new StringBuffer(message.getFromUsername());
                StringBuffer header = new StringBuffer("<br><br>=== On ");
                header.append(formattedDate).append(", ").append(fromUsername).append(" wrote: ===<br>");
                message.setBody(header + message.getBody());
                message.setSubject("RE: " + message.getSubject());
                message.setToId(message.getFromId());

            } else { // we're editing an existing draft message
                source = Commons.MESSAGEFOLDER_DRAFTS;
            }
        } else { // creating a new message from the scratch
            source = Commons.MESSAGEFOLDER_NEW_MESSAGE;
            message = new Message();
        }
        Date today = new Date();
        message.setDate(today);
        message.calcUtilToSqlDates();
//        message.setDate(new Timestamp(new java.util.Date().getTime()));
        message.setFromId(((User) ((HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false)).getAttribute("user")).getId());
        message.setOwnerId(((User) ((HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false)).getAttribute("user")).getId());

        // Generate a possible receivers list
        if (users == null) {
            users = new LinkedList<>();
        } else {
            users.clear();
        }
        users = UserDAO.getAllOrdByUsername();

        // if we're replying or creating a new message from scratch, we'll save a new message in the Drafts folder
        if (source == Commons.MESSAGEFOLDER_INBOX || source == Commons.MESSAGEFOLDER_NEW_MESSAGE) {
            message.setFolderId(Commons.MESSAGEFOLDER_DRAFTS);
            long draftId = MessageDAO.add(message);
            message.setId(draftId);
        } else { // if we're editing a draft, we only need to update it
            MessageDAO.update(message);
        }
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public String save() {
        // The message has been already saved in the Drafts folder. We just need to update it.
        MessageDAO.update(message);
        return "inbox";
    }

    public String send() {
        // Move it from the Drafts to the Sent folder
        message.setFolderId(Commons.MESSAGEFOLDER_SENT);
        message.setDate(new Date());
        message.calcUtilToSqlDates();
        MessageDAO.update(message);
        // Create an additional copy of the message and add it to the receiver's Inbox folder
        Message sentMsg = message.clone();
        sentMsg.setOwnerId(message.getToId());
        sentMsg.setFolderId(Commons.MESSAGEFOLDER_INBOX);
        MessageDAO.add(sentMsg);
        return "inbox";
    }

    public String cancel() {
        // Don't save any changes, just go back
        // If we were replying or creating a new message, we need to delete the draft that was created
        if (source == Commons.MESSAGEFOLDER_INBOX || source == Commons.MESSAGEFOLDER_NEW_MESSAGE) {
            MessageDAO.discard(message);
        } else {
        // We were editing a draft. Just go back without updating the database
        }
        return "inbox";
    }

    public long getMessageId() {
        return messageId;
    }

    public void setMessageId(long messageId) {
        this.messageId = messageId;
    }

    public LinkedList<User> getUsers() {
        if (users == null) {
            users = new LinkedList<>();
        } else {
            users.clear();
        }
        users = UserDAO.getAllOrdByUsername();
        return users;
    }

    public void setUsers(LinkedList<User> users) {
        this.users = users;
    }
}
