/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus.beans;

import item.dao.ItemDAO;
import item.model.Item;
import java.io.Serializable;
import java.util.LinkedList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class BottomMenuBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private LinkedList<Item> bottomMenuItems;

    public BottomMenuBean() {
    }

    @PostConstruct
    public void init() {
        bottomMenuItems = new LinkedList<>();
        // I want Index, Contact and all the Items with level=1 in my secondary navigation
        bottomMenuItems.addAll(ItemDAO.getAllWhere("published=1 and secondary_navigation=1 and level in (0,1)"));
    }

    public LinkedList<Item> getBottomMenuItems() {
        return bottomMenuItems;
    }

    public void setBottomMenuItems(LinkedList<Item> bottomMenuItems) {
        this.bottomMenuItems = bottomMenuItems;
    }
}
