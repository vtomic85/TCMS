/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customParts.beans;

import page.dao.PageDAO;
import page.model.Page;
import java.util.LinkedList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Vladimir Tomic
 */
@RequestScoped
@ManagedBean
public class TopCommentedPages {

    private LinkedList<Page> list;
    private boolean listEmpty;

    public TopCommentedPages() {

    }

    @PostConstruct
    public void refresh() {
        if (list == null) {
            list = new LinkedList<>();
        } else {
            list.clear();
        }
        list = PageDAO.getAllOrderBy("comments desc");
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
