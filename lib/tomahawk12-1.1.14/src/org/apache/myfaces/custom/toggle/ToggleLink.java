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
package org.apache.myfaces.custom.toggle;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;
import javax.faces.convert.Converter;


// Generated from class org.apache.myfaces.custom.toggle.AbstractToggleLink.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class ToggleLink extends org.apache.myfaces.custom.toggle.AbstractToggleLink
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.Output";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.ToggleLink";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.ToggleLink";


    public ToggleLink()
    {
        setRendererType("org.apache.myfaces.ToggleLink");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: for
    private String _for ;
     
    public String getFor()
    {
        return _for;
    }

    public void setFor(String forParam)
    {
        this._for = forParam;
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
    // Property: onClickFocusId
    private String _onClickFocusId ;
     
    public String getOnClickFocusId()
    {
        return _onClickFocusId;
    }

    public void setOnClickFocusId(String onClickFocusId)
    {
        this._onClickFocusId = onClickFocusId;
    }
    // Property: forceId
    private Boolean _forceId  = Boolean.valueOf(false);
     
    public Boolean getForceId()
    {
        return _forceId;
    }

    public void setForceId(Boolean forceId)
    {
        this._forceId = forceId;
    }
    // Property: forceIdIndex
    private Boolean _forceIdIndex  = Boolean.valueOf(true);
     
    public Boolean getForceIdIndex()
    {
        return _forceIdIndex;
    }

    public void setForceIdIndex(Boolean forceIdIndex)
    {
        this._forceIdIndex = forceIdIndex;
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

    public Object saveState(FacesContext facesContext)
    {
        Object[] values = new Object[9];
        values[0] = super.saveState(facesContext);
        values[1] = _for;
        values[2] = Boolean.valueOf(_disabled);
        values[3] = Boolean.valueOf(_disabledSet);
        values[4] = _onClickFocusId;
        values[5] = _forceId;
        values[6] = _forceIdIndex;
        values[7] = _enabledOnUserRole;
        values[8] = _visibleOnUserRole;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _for = (java.lang.String) values[1];
        _disabled = ((Boolean) values[2]).booleanValue();
        _disabledSet = ((Boolean) values[3]).booleanValue();
        _onClickFocusId = (java.lang.String) values[4];
        _forceId = (java.lang.Boolean) values[5];
        _forceIdIndex = (java.lang.Boolean) values[6];
        _enabledOnUserRole = (java.lang.String) values[7];
        _visibleOnUserRole = (java.lang.String) values[8];
    }
}
