/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gallery.model;

import image.dao.ImageDAO;

/**
 *
 * @author Vladimir Tomic
 */
public class Gallery {
    
    private long id;
    private String title;
    private int numOfPics;
    
    public Gallery(long id, String title) {
        this.id = id;
        this.title = title;
    }
    
    public Gallery() {
        this(0, null);
    }
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public int getNumOfPics() {
        numOfPics = ImageDAO.countWhere("gallery_id=" + id);
        return numOfPics;
    }
}
