/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gallery.beans;

import gallery.dao.GalleryDAO;
import gallery.model.Gallery;
import image.dao.ImageDAO;
import image.model.Image;
import java.util.LinkedList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class GalleryViewBean {

    private long contentId;
    private Gallery gallery;
    private LinkedList<Image> galleryImages;

    public GalleryViewBean() {

    }

    public void init() {
        if (galleryImages == null) {
            galleryImages = new LinkedList<>();
        }
        galleryImages = ImageDAO.getAllWhere("gallery_id=" + contentId);
        gallery = GalleryDAO.getById(contentId);
    }

    public long getContentId() {
        return contentId;
    }

    public void setContentId(long contentId) {
        this.contentId = contentId;
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
