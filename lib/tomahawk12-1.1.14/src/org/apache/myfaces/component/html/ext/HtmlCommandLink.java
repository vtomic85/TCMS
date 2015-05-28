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


// Generated from class org.apache.myfaces.component.html.ext.AbstractHtmlCommandLink.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlCommandLink extends org.apache.myfaces.component.html.ext.AbstractHtmlCommandLink
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.Command";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.HtmlCommandLink";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.Link";


    public HtmlCommandLink()
    {
        setRendererType("org.apache.myfaces.Link");
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
    // Property: disabled
    private boolean _disabled;
    
    private boolean _disabledSet;
    
    public boolean isDisabled()
    {
        if (_disabledSet)
        {
            return _disabled;
        }
        ValueExpression vb = getValueExpression("disabled");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return false; 
    }

    public void setDisabled(boolean disabled)
    {
        this._disabled = disabled;
        this._disabledSet = true;        
    }
    // Property: disabledStyle
    private String _disabledStyle;
    
    public String getDisabledStyle()
    {
        if (_disabledStyle != null)
        {
            return _disabledStyle;
        }
        ValueExpression vb = getValueExpression("disabledStyle");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setDisabledStyle(String disabledStyle)
    {
        this._disabledStyle = disabledStyle;
    }
    // Property: disabledStyleClass
    private String _disabledStyleClass;
    
    public String getDisabledStyleClass()
    {
        if (_disabledStyleClass != null)
        {
            return _disabledStyleClass;
        }
        ValueExpression vb = getValueExpression("disabledStyleClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setDisabledStyleClass(String disabledStyleClass)
    {
        this._disabledStyleClass = disabledStyleClass;
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
        Object[] values = new Object[10];
        values[0] = super.saveState(facesContext);
        values[1] = _actionFor;
        values[2] = Boolean.valueOf(_disabled);
        values[3] = Boolean.valueOf(_disabledSet);
        values[4] = _disabledStyle;
        values[5] = _disabledStyleClass;
        values[6] = _enabledOnUserRole;
        values[7] = _visibleOnUserRole;
        values[8] = Boolean.valueOf(_forceId);
        values[9] = Boolean.valueOf(_forceIdIndex);
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _actionFor = (java.lang.String) values[1];
        _disabled = ((Boolean) values[2]).booleanValue();
        _disabledSet = ((Boolean) values[3]).booleanValue();
        _disabledStyle = (java.lang.String) values[4];
        _disabledStyleClass = (java.lang.String) values[5];
        _enabledOnUserRole = (java.lang.String) values[6];
        _visibleOnUserRole = (java.lang.String) values[7];
        _forceId = ((Boolean) values[8]).booleanValue();
        _forceIdIndex = ((Boolean) values[9]).booleanValue();
    }
}
