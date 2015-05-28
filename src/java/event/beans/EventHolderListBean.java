/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import platform.beans.AbstractHolderListBean;
import platform.model.Commons;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@RequestScoped
public class EventHolderListBean extends AbstractHolderListBean {

    public EventHolderListBean() {
        this.typeId = Commons.ITEMTYPE_EVENT_HOLDER;
    }
}
