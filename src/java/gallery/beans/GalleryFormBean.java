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
public class GalleryFormBean {

    private Gallery gallery;
    private long galleryId;
    private LinkedList<Image> imageList;

    public GalleryFormBean() {

    }

    public void init() {
        System.out.println("DEBUG ::: GalleryFormBean: galleryId=" + galleryId);
        if (galleryId > 0) {
            gallery = GalleryDAO.getById(galleryId);
            refreshImageList();
        } else {
            gallery = new Gallery();
        }
    }

    public void refreshImageList() {
        if (imageList == null) {
            imageList = new LinkedList<>();
        } else {
            imageList.clear();
        }
        imageList = ImageDAO.getAllWhere("gallery_id=" + galleryId);
    }

    public String deleteImage() {
        long imageId = Long.parseLong(Utils.getParam("imageId"));
        ImageDAO.delete(imageId);
        refreshImageList();
        return null;
    }

    public Gallery getGallery() {
        return gallery;
    }

    public void setGallery(Gallery gallery) {
        this.gallery = gallery;
    }

    public String save() {
        if (gallery.getId() == 0) {
            long newId = GalleryDAO.add(gallery);
            gallery.setId(newId);
        }
        GalleryDAO.update(gallery);
        return null;
    }

    public long getGalleryId() {
        return galleryId;
    }

    public void setGalleryId(long galleryId) {
        this.galleryId = galleryId;
    }

    public LinkedList<Image> getImageList() {
        refreshImageList();
        return imageList;
    }

    public void setImageList(LinkedList<Image> imageList) {
        this.imageList = imageList;
    }
}
