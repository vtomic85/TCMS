/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toplist.beans;

import toplist.dao.TopListDAO;
import toplist.model.TopList;
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
public class TopListListBean {

    private LinkedList<TopList> topLists;
    private boolean listEmpty;

    public TopListListBean() {
    }

    @PostConstruct
    public void refresh() {
        if (topLists == null) {
            topLists = new LinkedList<>();
        } else {
            topLists.clear();
        }
        topLists = TopListDAO.getAll();
        listEmpty = (topLists == null) ? true : ((topLists.size() == 0));
    }

    public boolean isListEmpty() {
        if (topLists == null) {
            return true;
        }
        return topLists.isEmpty();
    }

    public LinkedList<TopList> getTopLists() {
        return topLists;
    }

    public void setTopLists(LinkedList<TopList> topLists) {
        this.topLists = topLists;
    }

    public String editTopList() {
        return "adminEditTopList";
    }

    public String deleteTopList() {
        TopListDAO.delete(Long.parseLong(Utils.getParam("topListId")));
        refresh();
        return null;
    }

    public String newTopList() {
        return "adminEditTopList";
    }
}
