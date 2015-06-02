/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message.beans;

import java.util.LinkedList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import message.dao.MessageDAO;
import message.dao.MessageFolderDAO;
import message.model.Message;
import platform.model.Commons;
import user.dao.UserDAO;
import user.model.User;
import utils.Utils;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class MessageListBean {

    private LinkedList<Message> messages;
    private boolean listEmpty;
    private long ownerId;
    private int folderId;
    private String ownerUsername;
    private String folderName;

    public MessageListBean() {
    }

    public void init() {
        if (messages == null) {
            messages = new LinkedList<>();
        } else {
            messages.clear();
        }
        ownerId = ((User) ((HttpSession) (FacesContext.getCurrentInstance()).getExternalContext().getSession(false)).getAttribute("user")).getId();
        if (folderId < 1 || folderId > 4) {
            folderId = 1;
        }
        messages = MessageDAO.getAllWhere("owner_id=" + ownerId + " and folder_id=" + folderId);
        listEmpty = messages.isEmpty();
        ownerUsername = UserDAO.getById(ownerId).getUsername();
        folderName = MessageFolderDAO.getById(folderId).getName();
    }

    public boolean isListEmpty() {
        messages = MessageDAO.getAllWhere("owner_id=" + ownerId + " and folder_id=" + folderId);
        if (messages == null) {
            return true;
        }
        return messages.isEmpty();
    }

    public LinkedList<Message> getMessages() {
        messages = MessageDAO.getAllWhere("owner_id=" + ownerId + " and folder_id=" + folderId);
        return messages;
    }

    public void setMessages(LinkedList<Message> messages) {
        this.messages = messages;
    }

    public String editMessage() {
        return "adminEditMessage";
    }

    public String reply() {
        return "adminEditMessage";
    }

    public String changeFolder(int folderId) {
        this.folderId = folderId;
        messages = MessageDAO.getAllWhere("owner_id=" + ownerId + " and folder_id=" + folderId);
        return null;
    }

    public String markAsReadOrUnread() {
        Message msg = MessageDAO.getWhere("id=" + Long.parseLong(Utils.getParam("messageId")) + " and owner_id=" + Long.parseLong(Utils.getParam("ownerId")));
        msg.setRead(Boolean.parseBoolean(Utils.getParam("isRead")));
        msg.calcUtilToSqlDates();
        MessageDAO.update(msg);
        return null;
    }

    public String deleteMessage() {
        Message msg = MessageDAO.getWhere("id=" + Long.parseLong(Utils.getParam("messageId")));
        msg.setFolderId(Commons.MESSAGEFOLDER_DELETED);
        msg.calcUtilToSqlDates();
        MessageDAO.update(msg);
        return null;
    }

    public String permanentlyDeleteMessage() {
        Message msg = MessageDAO.getWhere("id=" + Long.parseLong(Utils.getParam("messageId")));
        msg.setFolderId(Commons.MESSAGEFOLDER_PERMANENTLY_DELETED);
        msg.calcUtilToSqlDates();
        MessageDAO.update(msg);
        return null;
    }

// It is possible to physically delete a draft message from the database
    public String discard() {
        Message msg = MessageDAO.getWhere("id=" + Long.parseLong(Utils.getParam("messageId")));
        MessageDAO.delete(msg);
        return "inbox";
    }

    public String newMessage() {
        return "adminEditMessage";
    }

    public String getOwnerUsername() {
        ownerUsername = UserDAO.getById(ownerId).getUsername();
        return ownerUsername;
    }

    public void setOwnerUsername(String ownerUsername) {
        this.ownerUsername = ownerUsername;
    }

    public String getFolderName() {
        folderName = MessageFolderDAO.getById(folderId).getName();
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    public int getFolderId() {
        return folderId;
    }

    public void setFolderId(int folderId) {
        this.folderId = folderId;
    }
}
