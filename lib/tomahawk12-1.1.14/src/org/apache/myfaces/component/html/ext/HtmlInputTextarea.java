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
import javax.faces.convert.Converter;
import javax.faces.el.MethodBinding;


// Generated from class org.apache.myfaces.component.html.ext.AbstractHtmlInputTextarea.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlInputTextarea extends org.apache.myfaces.component.html.ext.AbstractHtmlInputTextarea
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.Input";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.HtmlInputTextarea";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.Textarea";


    public HtmlInputTextarea()
    {
        setRendererType("org.apache.myfaces.Textarea");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: wrap
    private String _wrap;
    
    public String getWrap()
    {
        if (_wrap != null)
        {
            return _wrap;
        }
        ValueExpression vb = getValueExpression("wrap");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setWrap(String wrap)
    {
        this._wrap = wrap;
    }
    // Property: displayValueOnly
    private Boolean _displayValueOnly;
    
    public Boolean getDisplayValueOnly()
    {
        if (_displayValueOnly != null)
        {
            return _displayValueOnly;
        }
        ValueExpression vb = getValueExpression("displayValueOnly");
        if (vb != null)
        {
            Object value = vb == null ? null : vb.getValue(getFacesContext().getELContext());
            if (!(value instanceof Boolean)){
                value = Boolean.valueOf(value.toString());
            }            
            return (Boolean) value;
        }
        return null;
    }

    public void setDisplayValueOnly(Boolean displayValueOnly)
    {
        this._displayValueOnly = displayValueOnly;
    }
    // Property: displayValueOnlyStyle
    private String _displayValueOnlyStyle;
    
    public String getDisplayValueOnlyStyle()
    {
        if (_displayValueOnlyStyle != null)
        {
            return _displayValueOnlyStyle;
        }
        ValueExpression vb = getValueExpression("displayValueOnlyStyle");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setDisplayValueOnlyStyle(String displayValueOnlyStyle)
    {
        this._displayValueOnlyStyle = displayValueOnlyStyle;
    }
    // Property: displayValueOnlyStyleClass
    private String _displayValueOnlyStyleClass;
    
    public String getDisplayValueOnlyStyleClass()
    {
        if (_displayValueOnlyStyleClass != null)
        {
            return _displayValueOnlyStyleClass;
        }
        ValueExpression vb = getValueExpression("displayValueOnlyStyleClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setDisplayValueOnlyStyleClass(String displayValueOnlyStyleClass)
    {
        this._displayValueOnlyStyleClass = displayValueOnlyStyleClass;
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
    // Property: datafld
    private String _datafld;
    
    public String getDatafld()
    {
        if (_datafld != null)
        {
            return _datafld;
        }
        ValueExpression vb = getValueExpression("datafld");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setDatafld(String datafld)
    {
        this._datafld = datafld;
    }
    // Property: datasrc
    private String _datasrc;
    
    public String getDatasrc()
    {
        if (_datasrc != null)
        {
            return _datasrc;
        }
        ValueExpression vb = getValueExpression("datasrc");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setDatasrc(String datasrc)
    {
        this._datasrc = datasrc;
    }
    // Property: dataformatas
    private String _dataformatas;
    
    public String getDataformatas()
    {
        if (_dataformatas != null)
        {
            return _dataformatas;
        }
        ValueExpression vb = getValueExpression("dataformatas");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setDataformatas(String dataformatas)
    {
        this._dataformatas = dataformatas;
    }

    public Object saveState(FacesContext facesContext)
    {
        Object[] values = new Object[12];
        values[0] = super.saveState(facesContext);
        values[1] = _wrap;
        values[2] = _displayValueOnly;
        values[3] = _displayValueOnlyStyle;
        values[4] = _displayValueOnlyStyleClass;
        values[5] = _enabledOnUserRole;
        values[6] = _visibleOnUserRole;
        values[7] = Boolean.valueOf(_forceId);
        values[8] = Boolean.valueOf(_forceIdIndex);
        values[9] = _datafld;
        values[10] = _datasrc;
        values[11] = _dataformatas;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _wrap = (java.lang.String) values[1];
        _displayValueOnly = (java.lang.Boolean) values[2];
        _displayValueOnlyStyle = (java.lang.String) values[3];
        _displayValueOnlyStyleClass = (java.lang.String) values[4];
        _enabledOnUserRole = (java.lang.String) values[5];
        _visibleOnUserRole = (java.lang.String) values[6];
        _forceId = ((Boolean) values[7]).booleanValue();
        _forceIdIndex = ((Boolean) values[8]).booleanValue();
        _datafld = (java.lang.String) values[9];
        _datasrc = (java.lang.String) values[10];
        _dataformatas = (java.lang.String) values[11];
    }
}
