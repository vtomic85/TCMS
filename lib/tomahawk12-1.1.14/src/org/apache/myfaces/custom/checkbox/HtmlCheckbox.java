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

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;


// Generated from class org.apache.myfaces.custom.checkbox.AbstractHtmlCheckbox.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlCheckbox extends org.apache.myfaces.custom.checkbox.AbstractHtmlCheckbox
{

    static public final String COMPONENT_FAMILY =
        "org.apache.myfaces.Checkbox";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.HtmlCheckbox";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.Checkbox";


    public HtmlCheckbox()
    {
        setRendererType("org.apache.myfaces.Checkbox");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: for
    private String _for;
    
    public String getFor()
    {
        if (_for != null)
        {
            return _for;
        }
        ValueExpression vb = getValueExpression("for");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setFor(String forParam)
    {
        this._for = forParam;
    }
    // Property: index
    private int _index;
    
    private boolean _indexSet;
    
    public int getIndex()
    {
        if (_indexSet)
        {
            return _index;
        }
        ValueExpression vb = getValueExpression("index");
        if (vb != null)
        {
            return ((Integer) vb.getValue(getFacesContext().getELContext())).intValue();
        }
        return Integer.MIN_VALUE; 
    }

    public void setIndex(int index)
    {
        this._index = index;
        this._indexSet = true;        
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
        Object[] values = new Object[6];
        values[0] = super.saveState(facesContext);
        values[1] = _for;
        values[2] = Integer.valueOf(_index);
        values[3] = Boolean.valueOf(_indexSet);
        values[4] = _enabledOnUserRole;
        values[5] = _visibleOnUserRole;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _for = (java.lang.String) values[1];
        _index = ((Integer) values[2]).intValue();
        _indexSet = ((Boolean) values[3]).booleanValue();
        _enabledOnUserRole = (java.lang.String) values[4];
        _visibleOnUserRole = (java.lang.String) values[5];
    }
}
