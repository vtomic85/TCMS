/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package image.beans;

import event.dao.EventDAO;
import event.model.Event;
import image.dao.ImageDAO;
import image.model.Image;
import item.dao.ItemDAO;
import item.model.Item;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.Part;
import news.dao.NewsDAO;
import news.model.News;
import page.dao.PageDAO;
import page.model.Page;
import user.dao.UserDAO;
import user.model.User;
import userpart.dao.UserPartDAO;
import userpart.model.UserPart;
import utils.Utils;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class ImgDemo implements Serializable {

    private static final long serialVersionUID = 1L;

    private long objectId;
    private String objectType;
    private String backUrl;
    private Part part;

    public ImgDemo() {

    }

    public void init() {
    }

    public void uploadFile() throws IOException {
        String fileName = getFileName(part);
        String date = Long.toString((new Date()).getTime());
        String basePath = "D:" + File.separatorChar + "TCMS" + File.separatorChar + "web" + File.separatorChar + "resources" + File.separatorChar + "img" + File.separatorChar + objectType + File.separatorChar + objectType + "_" + objectId + date;
        File outputFilePath = new File(basePath + fileName);
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = part.getInputStream();
            outputStream = new FileOutputStream(outputFilePath);
            int read = 0;
            final byte[] bytes = new byte[1024];
            while ((read = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            String fullPath = "/resources/img/" + objectType + "/" + objectType + "_" + objectId + date + fileName;
            switch (objectType) {
                case "event":
                case "EVENT":
                case "Event":
                    Event e = EventDAO.getById(objectId);
                    e.setImgPath(fullPath);
                    EventDAO.update(e);
                    break;
                case "news":
                case "NEWS":
                case "News":
                    News n = NewsDAO.getById(objectId);
                    n.setImgPath(fullPath);
                    NewsDAO.update(n);
                    break;
                case "page":
                case "PAGE":
                case "Page":
                    Page p = PageDAO.getById(objectId);
                    p.setImgPath(fullPath);
                    PageDAO.update(p);
                    break;
                case "user":
                case "USER":
                case "User":
                    User u = UserDAO.getById(objectId);
                    u.setImgPath(fullPath);
                    UserDAO.updateNoPassEnc(u);
                    Utils.setSessionAttribute("user", u);
                    break;
                case "userPart":
                case "userpart":
                case "UserPart":
                case "USERPART":
                    UserPart up = UserPartDAO.getById(objectId);
                    up.setImgPath(fullPath);
                    UserPartDAO.update(up);
                    break;
                case "gallery":
                case "GALLERY":
                case "Gallery":
                    Image img = new Image();
                    img.setImgPath(fullPath);
                    img.setTitle("");
                    img.setGalleryId(objectId);
                    ImageDAO.add(img);
                    break;
                case "item":
                case "ITEM":
                case "Item":
                    Item item = ItemDAO.getById(objectId);
                    item.setImgPath(fullPath);
                    ItemDAO.update(item);
                    break;
                default:
                    break;
            }
        }
        // backUrl should look like "../event/eventForm.xhtml?eventId=123"
        backUrl = "../" + objectType + "/" + objectType + "Form.xhtml?" + objectType + "Id=" + objectId;
        // the only exception is UserPart, because of different case in the folder name and *Form.xhtml name
        if ("userpart".equals(objectType)
                || "userPart".equals(objectType)
                || "UserPart".equals(objectType)
                || "USERPART".equals(objectType)) {
            backUrl = "../userpart/userPartForm.xhtml?userPartId=" + objectId;
        }
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect(backUrl);
        } catch (IOException ex) {
            Logger.getLogger(ImgDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }

    // Extract file name from content-disposition header of file part
    private String getFileName(Part part) {
        final String partHeader = part.getHeader("content-disposition");
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(content.indexOf('=') + 1).trim()
                        .replace("\"", "");
            }
        }
        return null;
    }

    public long getObjectId() {
        return objectId;
    }

    public void setObjectId(long objectId) {
        this.objectId = objectId;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getBackUrl() {
        return backUrl;
    }

    public void setBackUrl(String backUrl) {
        this.backUrl = backUrl;
    }
}
