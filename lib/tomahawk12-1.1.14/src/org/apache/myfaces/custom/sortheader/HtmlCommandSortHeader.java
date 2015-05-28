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
package org.apache.myfaces.custom.sortheader;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;
import javax.el.MethodExpression;
import javax.faces.el.MethodBinding;


// Generated from class org.apache.myfaces.custom.sortheader.AbstractHtmlCommandSortHeader.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlCommandSortHeader extends org.apache.myfaces.custom.sortheader.AbstractHtmlCommandSortHeader
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.Command";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.HtmlCommandSortHeader";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.SortHeader";


    public HtmlCommandSortHeader()
    {
        setRendererType("org.apache.myfaces.SortHeader");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: columnName
    private String _columnName;
    
    public String getColumnName()
    {
        if (_columnName != null)
        {
            return _columnName;
        }
        ValueExpression vb = getValueExpression("columnName");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setColumnName(String columnName)
    {
        this._columnName = columnName;
    }
    // Property: propertyName
    private String _propertyName;
    
    public String getPropertyName()
    {
        if (_propertyName != null)
        {
            return _propertyName;
        }
        ValueExpression vb = getValueExpression("propertyName");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setPropertyName(String propertyName)
    {
        this._propertyName = propertyName;
    }
    // Property: arrow
    private boolean _arrow;
    
    private boolean _arrowSet;
    
    public boolean isArrow()
    {
        if (_arrowSet)
        {
            return _arrow;
        }
        ValueExpression vb = getValueExpression("arrow");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return false; 
    }

    public void setArrow(boolean arrow)
    {
        this._arrow = arrow;
        this._arrowSet = true;        
    }

    public Object saveState(FacesContext facesContext)
    {
        Object[] values = new Object[5];
        values[0] = super.saveState(facesContext);
        values[1] = _columnName;
        values[2] = _propertyName;
        values[3] = Boolean.valueOf(_arrow);
        values[4] = Boolean.valueOf(_arrowSet);
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _columnName = (java.lang.String) values[1];
        _propertyName = (java.lang.String) values[2];
        _arrow = ((Boolean) values[3]).booleanValue();
        _arrowSet = ((Boolean) values[4]).booleanValue();
    }
}
