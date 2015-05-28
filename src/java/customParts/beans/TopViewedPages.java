/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customParts.beans;

import java.util.LinkedList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import page.dao.PageDAO;
import page.model.Page;

/**
 *
 * @author Vladimir Tomic
 */
@RequestScoped
@ManagedBean
public class TopViewedPages {

    private LinkedList<Page> list;
    private boolean listEmpty;

    public TopViewedPages() {

    }

    @PostConstruct
    public void refresh() {
        if (list == null) {
            list = new LinkedList<>();
        } else {
            list.clear();
        }
        list = PageDAO.getAllOrderBy("views desc");
    }

    public LinkedList<Page> getList() {
        return list;
    }

    public void setList(LinkedList<Page> list) {
        this.list = list;
    }

    public boolean isListEmpty() {
        if (list == null) {
            return true;
        } else {
            return list.isEmpty();
        }
    }

    public void setListEmpty(boolean listEmpty) {
        this.listEmpty = listEmpty;
    }
}
