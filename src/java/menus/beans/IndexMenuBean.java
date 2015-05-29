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
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import platform.model.Commons;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@RequestScoped
public class IndexMenuBean {

    private LinkedList<Item> topMenuItems;

    public IndexMenuBean() {

    }

    @PostConstruct
    public void init() {
        topMenuItems = new LinkedList<>();
        String query="level=1 order by id";
/*        String query = "level=1 and type_id in ("
                + Commons.ITEMTYPE_EVENT_HOLDER + ","
                + Commons.ITEMTYPE_NEWS_HOLDER + ","
                + Commons.ITEMTYPE_PAGE_HOLDER
                + ") order by id";*/
        topMenuItems.addAll(ItemDAO.getAllWhere(query)); // fetch the holders
        System.out.println("DEBUG ::: IndexMenuBean init query=" + query);
        System.out.println("DEBUG ::: IndexMenuBean init list size=" + topMenuItems.size());
    }

    public LinkedList<Item> getTopMenuItems() {
        return topMenuItems;
    }

    public void setTopMenuItems(LinkedList<Item> topMenuItems) {
        this.topMenuItems = topMenuItems;
    }

}
