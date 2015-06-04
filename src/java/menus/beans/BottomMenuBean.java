/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus.beans;

import item.dao.ItemDAO;
import item.model.Item;
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
public class BottomMenuBean {

    private LinkedList<Item> bottomMenuItems;

    public BottomMenuBean() {
        System.out.println("DEBUG ::: BottomMenuBean:constructor");
    }

    @PostConstruct
    public void init() {
        System.out.println("DEBUG ::: BottomMenuBean:init");
        bottomMenuItems = new LinkedList<>();
        // I want Index, Contact and all the Items with level=1 in my secondary navigation
        bottomMenuItems.addAll(ItemDAO.getAllWhere("published=1 and secondary_navigation=1 and level in (0,1)"));
        System.out.println("DEBUG ::: BottomMenuBean:init:size=" + bottomMenuItems.size());
    }

    public LinkedList<Item> getBottomMenuItems() {
        System.out.println("DEBUG ::: BottomMenuBean:getter");
        return bottomMenuItems;
    }

    public void setBottomMenuItems(LinkedList<Item> bottomMenuItems) {
        System.out.println("DEBUG ::: BottomMenuBean:setter");
        this.bottomMenuItems = bottomMenuItems;
    }
}
