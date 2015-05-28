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
package org.apache.myfaces.component.html.ext;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;
import javax.el.MethodExpression;
import javax.faces.el.MethodBinding;


// Generated from class org.apache.myfaces.component.html.ext.AbstractHtmlCommandButton.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlCommandButton extends org.apache.myfaces.component.html.ext.AbstractHtmlCommandButton
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.Command";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.HtmlCommandButton";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.Button";


    public HtmlCommandButton()
    {
        setRendererType("org.apache.myfaces.Button");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: actionFor
    private String _actionFor;
    
    public String getActionFor()
    {
        if (_actionFor != null)
        {
            return _actionFor;
        }
        ValueExpression vb = getValueExpression("actionFor");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setActionFor(String actionFor)
    {
        this._actionFor = actionFor;
    }
    // Property: enabledOnUserRole
    private String _enabledOnUserRole;
    
    public String getEnabledOnUserRole()
    {
        if (_enabledOnUserRole != null)
        {
            return _enabledOnUserRole;
        }
        ValueExpression vb = getValueExpression("enabledOnUserRole");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setEnabledOnUserRole(String enabledOnUserRole)
    {
        this._enabledOnUserRole = enabledOnUserRole;
    }
    // Property: visibleOnUserRole
    private String _visibleOnUserRole;
    
    public String getVisibleOnUserRole()
    {
        if (_visibleOnUserRole != null)
        {
            return _visibleOnUserRole;
        }
        ValueExpression vb = getValueExpression("visibleOnUserRole");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setVisibleOnUserRole(String visibleOnUserRole)
    {
        this._visibleOnUserRole = visibleOnUserRole;
    }
    // Property: forceId
    private boolean _forceId  = false;
     
    public boolean isForceId()
    {
        return _forceId;
    }

    public void setForceId(boolean forceId)
    {
        this._forceId = forceId;
    }
    // Property: forceIdIndex
    private boolean _forceIdIndex  = true;
     
    public boolean isForceIdIndex()
    {
        return _forceIdIndex;
    }

    public void setForceIdIndex(boolean forceIdIndex)
    {
        this._forceIdIndex = forceIdIndex;
    }

    public Object saveState(FacesContext facesContext)
    {
        Object[] values = new Object[6];
        values[0] = super.saveState(facesContext);
        values[1] = _actionFor;
        values[2] = _enabledOnUserRole;
        values[3] = _visibleOnUserRole;
        values[4] = Boolean.valueOf(_forceId);
        values[5] = Boolean.valueOf(_forceIdIndex);
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _actionFor = (java.lang.String) values[1];
        _enabledOnUserRole = (java.lang.String) values[2];
        _visibleOnUserRole = (java.lang.String) values[3];
        _forceId = ((Boolean) values[4]).booleanValue();
        _forceIdIndex = ((Boolean) values[5]).booleanValue();
    }
}
