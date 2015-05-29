/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platform.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import platform.dao.SystemParametersDAO;
import platform.model.SystemParameters;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@SessionScoped
public class SystemParametersBean {
    
    private SystemParameters sysParam;
    
    public SystemParametersBean() {
        this.sysParam = SystemParametersDAO.getById(1);
    }
    
    public String switchAutomaticRequestProcessing() {
        sysParam.setAutomaticRequestProcessing(!sysParam.isAutomaticRequestProcessing());
        SystemParametersDAO.update(sysParam);
        return null;
    }
    
    public SystemParameters getSysParam() {
        return sysParam;
    }
    
    public void setSysParam(SystemParameters sysParam) {
        this.sysParam = sysParam;
    }
}
