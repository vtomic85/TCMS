/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package comment.beans;

import comment.dao.ComponentTypeDAO;
import comment.model.ComponentType;
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
public class ComponentTypeListBean {
    private LinkedList<ComponentType> componentTypes;
    private boolean listEmpty;

    public ComponentTypeListBean() {
    }

    @PostConstruct
    public void refresh() {
        if (componentTypes == null) {
            componentTypes = new LinkedList<>();
        }
        componentTypes = ComponentTypeDAO.getAll();
    }

    public boolean isListEmpty() {
        if (componentTypes == null) {
            return true;
        }
        return componentTypes.isEmpty();
    }

    public LinkedList<ComponentType> getComponentTypes() {
        return componentTypes;
    }

    public void setComponentTypes(LinkedList<ComponentType> componentTypes) {
        this.componentTypes = componentTypes;
    }

    public String editComponentType() {
        return "adminEditComponentType";
    }

    public String deleteComponentType() {
        ComponentTypeDAO.delete(Integer.parseInt(Utils.getParam("componentTypeId")));
        refresh();
        return null;
    }

    public String newComponentType() {
        return "adminEditComponentType";
    }
}
