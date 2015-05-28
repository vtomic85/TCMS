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
package org.apache.myfaces.custom.datalist;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;


// Generated from class org.apache.myfaces.custom.datalist.AbstractHtmlDataList.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlDataList extends org.apache.myfaces.custom.datalist.AbstractHtmlDataList
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.Data";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.HtmlDataList";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.List";


    public HtmlDataList()
    {
        setRendererType("org.apache.myfaces.List");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: rowCountVar
    private String _rowCountVar;
    
    public String getRowCountVar()
    {
        if (_rowCountVar != null)
        {
            return _rowCountVar;
        }
        ValueExpression vb = getValueExpression("rowCountVar");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setRowCountVar(String rowCountVar)
    {
        this._rowCountVar = rowCountVar;
    }
    // Property: rowIndexVar
    private String _rowIndexVar;
    
    public String getRowIndexVar()
    {
        if (_rowIndexVar != null)
        {
            return _rowIndexVar;
        }
        ValueExpression vb = getValueExpression("rowIndexVar");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setRowIndexVar(String rowIndexVar)
    {
        this._rowIndexVar = rowIndexVar;
    }
    // Property: layout
    private String _layout;
    
    public String getLayout()
    {
        if (_layout != null)
        {
            return _layout;
        }
        ValueExpression vb = getValueExpression("layout");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setLayout(String layout)
    {
        this._layout = layout;
    }
    // Property: itemStyleClass
    private String _itemStyleClass;
    
    public String getItemStyleClass()
    {
        if (_itemStyleClass != null)
        {
            return _itemStyleClass;
        }
        ValueExpression vb = getValueExpression("itemStyleClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setItemStyleClass(String itemStyleClass)
    {
        this._itemStyleClass = itemStyleClass;
    }
    // Property: itemOnClick
    private String _itemOnClick;
    
    public String getItemOnClick()
    {
        if (_itemOnClick != null)
        {
            return _itemOnClick;
        }
        ValueExpression vb = getValueExpression("itemOnClick");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setItemOnClick(String itemOnClick)
    {
        this._itemOnClick = itemOnClick;
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
        Object[] values = new Object[8];
        values[0] = super.saveState(facesContext);
        values[1] = _rowCountVar;
        values[2] = _rowIndexVar;
        values[3] = _layout;
        values[4] = _itemStyleClass;
        values[5] = _itemOnClick;
        values[6] = _enabledOnUserRole;
        values[7] = _visibleOnUserRole;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _rowCountVar = (java.lang.String) values[1];
        _rowIndexVar = (java.lang.String) values[2];
        _layout = (java.lang.String) values[3];
        _itemStyleClass = (java.lang.String) values[4];
        _itemOnClick = (java.lang.String) values[5];
        _enabledOnUserRole = (java.lang.String) values[6];
        _visibleOnUserRole = (java.lang.String) values[7];
    }
}
