/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customParts.beans;

import userpart.dao.UserPartDAO;
import userpart.model.UserPart;
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
public class TopCommentedUserParts {
    private LinkedList<UserPart> list;
    private boolean listEmpty;

    public TopCommentedUserParts() {

    }

    @PostConstruct
    public void refresh() {
        if (list == null) {
            list = new LinkedList<>();
        } else {
            list.clear();
        }
        list=UserPartDAO.getAllOrderBy("comments desc");
    }

    public LinkedList<UserPart> getList() {
        return list;
    }

    public void setList(LinkedList<UserPart> list) {
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
