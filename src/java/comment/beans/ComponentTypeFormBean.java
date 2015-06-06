/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comment.beans;

import comment.dao.ComponentTypeDAO;
import comment.model.ComponentType;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class ComponentTypeFormBean {

    private ComponentType componentType;
    private long componentTypeId;

    public ComponentTypeFormBean() {

    }

    public void init() {
        if (componentTypeId > 0) {
            componentType = ComponentTypeDAO.getById(componentTypeId);
        } else {
            componentType = new ComponentType();
        }
    }

    public ComponentType getComponentType() {
        return componentType;
    }

    public void setComponentType(ComponentType componentType) {
        this.componentType = componentType;
    }

    public String save() {
        if (componentType.getId() == 0) {
            long newId = ComponentTypeDAO.insert(componentType);
            componentType.setId(newId);
        }
        ComponentTypeDAO.update(componentType);
        return null;
    }

//    public void upload(FileUploadEvent e) throws IOException {
//        FileUploadController.upload(e, "componentType", componentType.getId());
//    }
//
//    public String deleteComponentTypeImage() {
//        if (componentType.getImageId() > 0) {
//            ImageDAO.delete(componentType.getImageId());
//            componentType.setImageId(0);
//            ComponentTypeDAO.update(componentType);
//            FacesMessage msg = new FacesMessage("Success! Image deleted!");
//            FacesContext.getCurrentInstance().addMessage(null, msg);
//        }
//        return null;
//    }
    public long getComponentTypeId() {
        return componentTypeId;
    }

    public void setComponentTypeId(long componentTypeId) {
        this.componentTypeId = componentTypeId;
    }
}
