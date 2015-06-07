/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platform.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import message.dao.MessageDAO;
import platform.model.Commons;
import user.dao.UserDAO;
import user.model.User;
import utils.Utils;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@RequestScoped
public class UnreadMessagesBean {

    private long unreadCount;

    public UnreadMessagesBean() {
        long userId = ((User) Utils.getSessionAttribute("user")).getId();
        if (userId > 0) {
            unreadCount = MessageDAO.countWhere("owner_id=" + userId
                    + " and folder_id=" + Commons.MESSAGEFOLDER_INBOX
                    + " and msg_read=0");
        } else {
            unreadCount = 0;
        }
    }

    public long getUnreadCount() {
        return unreadCount;
    }

    public void setUnreadCount(long unreadCount) {
        this.unreadCount = unreadCount;
    }
}
