package message.model;

import message.dao.MessageFolderDAO;
import user.dao.UserDAO;
import java.util.Date;

/**
 *
 * @author Vladimir Tomic
 */
public class Message {

    private long id;
    private long fromId; // user ID (sender)
    private long toId; // user ID (receiver)
    private Date date;
    private String subject;
    private String body;
    private boolean read;
    private int folderId;
    private long ownerId; // user ID (one msg for the sender, one for the receiver)
    private String fromUsername;
    private String toUsername;
    private String ownerUsername;
    private String folderName;
    private java.sql.Date sqlDate;

    public Message(long id, long from, long to, String subject, String body, Date date, boolean read, int folderId, long ownerId) {
        this.id = id;
        this.fromId = from;
        this.toId = to;
        this.subject = subject;
        this.body = body;
        this.date = date;
        this.read = read;
        this.folderId = folderId;
        this.ownerId = ownerId;
        calcUtilToSqlDates();
    }

    public Message() {
        this(0, 0, 0, "", "", new Date(), false, 0, 0);
    }

    @Override
    public Message clone() {
        Message msg = new Message(this.id, this.fromId, this.toId, this.subject, this.body, this.date, this.read, this.folderId, this.ownerId);
        msg.calcUtilToSqlDates();
        return msg;
    }

    public void calcUtilToSqlDates() {
        this.sqlDate = new java.sql.Date(date.getTime());
    }

    public void calcSqlToUtilDates() {
        this.date = new Date(sqlDate.getTime());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getFromId() {
        return fromId;
    }

    public void setFromId(long fromId) {
        this.fromId = fromId;
    }

    public long getToId() {
        return toId;
    }

    public void setToId(long toId) {
        this.toId = toId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public String getFromUsername() {
        if (fromId > 0) {
            fromUsername = UserDAO.getById(fromId).getUsername();
        } else {
            fromUsername = "---";
        }
        return fromUsername;
    }

    public void setFromUsername(String fromUsername) {
        this.fromUsername = fromUsername;
    }

    public String getToUsername() {
        if (toId > 0) {
            toUsername = UserDAO.getById(toId).getUsername();
        } else {
            toUsername = "---";
        }
        return toUsername;
    }

    public void setToUsername(String toUsername) {
        this.toUsername = toUsername;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getFolderId() {
        return folderId;
    }

    public void setFolderId(int folderId) {
        this.folderId = folderId;
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

    public String getOwnerUsername() {
        ownerUsername = UserDAO.getById(ownerId).getUsername();
        return ownerUsername;
    }

    public void setOwnerUsername(String ownerUsername) {
        this.ownerUsername = ownerUsername;
    }

    public java.sql.Date getSqlDate() {
        return sqlDate;
    }

    public void setSqlDate(java.sql.Date sqlDate) {
        this.sqlDate = sqlDate;
    }
}
