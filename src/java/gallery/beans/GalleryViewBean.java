/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gallery.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import gallery.dao.GalleryDAO;
import gallery.model.Gallery;
import image.dao.ImageDAO;
import image.model.Image;
import item.model.Item;
import java.util.LinkedList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import utils.Utils;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class GalleryViewBean {

    private long itemId;
    private Gallery gallery;
    private LinkedList<Image> galleryImages;

    public GalleryViewBean() {

    }

    public void init() {
        if (galleryImages == null) {
            galleryImages = new LinkedList<>();
        }
        galleryImages = ImageDAO.getAllWhere("gallery_id=" + itemId);
        gallery = GalleryDAO.getById(itemId);
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public Gallery getGallery() {
        return gallery;
    }

    public void setGallery(Gallery gallery) {
        this.gallery = gallery;
    }

    public LinkedList<Image> getGalleryImages() {
        return galleryImages;
    }

    public void setGalleryImages(LinkedList<Image> galleryImages) {
        this.galleryImages = galleryImages;
    }
}
