/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gallery.beans;

import gallery.dao.GalleryDAO;
import gallery.model.Gallery;
import java.util.LinkedList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import utils.Utils;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@RequestScoped
public class GalleryListBean {

    private LinkedList<Gallery> galleries;
    private boolean listEmpty;

    public GalleryListBean() {
    }

    @PostConstruct
    public void refresh() {
        if (galleries == null) {
            galleries = new LinkedList<>();
        }
        galleries = GalleryDAO.getAll();
    }

    public boolean isListEmpty() {
        if (galleries == null) {
            return true;
        }
        return galleries.isEmpty();
    }

    public LinkedList<Gallery> getGalleries() {
        return galleries;
    }

    public void setGalleries(LinkedList<Gallery> galleries) {
        this.galleries = galleries;
    }

    public String editGallery() {
        return "adminEditGallery";
    }

    public String deleteGallery() {
        GalleryDAO.delete(Long.parseLong(Utils.getParam("galleryId")));
        refresh();
        return null;
    }

    public String newGallery() {
        return "adminEditGallery";
    }
}
