// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package org.apache.myfaces.custom.checkbox;

import javax.faces.component.UIComponent;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;


// Generated from class org.apache.myfaces.custom.checkbox.AbstractHtmlCheckbox.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlCheckboxTag
    extends javax.faces.webapp.UIComponentELTag
{
    public HtmlCheckboxTag()
    {    
    }
    
    public String getComponentType()
    {
        return "org.apache.myfaces.HtmlCheckbox";
    }

    public String getRendererType()
    {
        return "org.apache.myfaces.Checkbox";
    }

    private ValueExpression _for;
    
    public void setFor(ValueExpression forParam)
    {
        _for = forParam;
    }
    private ValueExpression _index;
    
    public void setIndex(ValueExpression index)
    {
        _index = index;
    }
    private ValueExpression _enabledOnUserRole;
    
    public void setEnabledOnUserRole(ValueExpression enabledOnUserRole)
    {
        _enabledOnUserRole = enabledOnUserRole;
    }
    private ValueExpression _visibleOnUserRole;
    
    public void setVisibleOnUserRole(ValueExpression visibleOnUserRole)
    {
        _visibleOnUserRole = visibleOnUserRole;
    }

    protected void setProperties(UIComponent component)
    {
        if (!(component instanceof org.apache.myfaces.custom.checkbox.HtmlCheckbox))
        {
            throw new IllegalArgumentException("Component "+
                component.getClass().getName() +" is no org.apache.myfaces.custom.checkbox.HtmlCheckbox");
        }
        
        org.apache.myfaces.custom.checkbox.HtmlCheckbox comp = (org.apache.myfaces.custom.checkbox.HtmlCheckbox) component;
        
        super.setProperties(component);
        
        FacesContext context = getFacesContext();

        if (_for != null)
        {
            comp.setValueExpression("for", _for);
        } 
        if (_index != null)
        {
            comp.setValueExpression("index", _index);
        } 
        if (_enabledOnUserRole != null)
        {
            comp.setValueExpression("enabledOnUserRole", _enabledOnUserRole);
        } 
        if (_visibleOnUserRole != null)
        {
            comp.setValueExpression("visibleOnUserRole", _visibleOnUserRole);
        } 
    }

    public void release()
    {
        super.release();
        _for = null;
        _index = null;
        _enabledOnUserRole = null;
        _visibleOnUserRole = null;
    }
}
