/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package part.beans;

import java.util.LinkedList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import part.dao.PartDAO;
import part.model.Part;
import utils.Utils;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@RequestScoped
public class PartListBean {
    private LinkedList<Part> parts;
    private boolean listEmpty;

    public PartListBean() {
    }

    @PostConstruct
    public void refresh() {
        if (parts == null) {
            parts = new LinkedList<>();
        }
        parts = PartDAO.getAll();
    }

    public boolean isListEmpty() {
        if (parts == null) {
            return true;
        }
        return parts.isEmpty();
    }

    public LinkedList<Part> getParts() {
        return parts;
    }

    public void setParts(LinkedList<Part> parts) {
        this.parts = parts;
    }

    public String editPart() {
        return "adminEditPart";
    }

    public String deletePart() {
        PartDAO.delete(Long.parseLong(Utils.getParam("partId")));
        refresh();
        return null;
    }

    public String newPart() {
        return "adminEditPart";
    }
    
}
