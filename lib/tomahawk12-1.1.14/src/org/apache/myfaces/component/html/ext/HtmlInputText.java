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


// Generated from class org.apache.myfaces.component.html.ext.AbstractHtmlInputText.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlInputText extends org.apache.myfaces.component.html.ext.AbstractHtmlInputText
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.Input";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.HtmlInputText";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.Text";


    public HtmlInputText()
    {
        setRendererType("org.apache.myfaces.Text");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: disabledOnClientSide
    private boolean _disabledOnClientSide;
    
    private boolean _disabledOnClientSideSet;
    
    public boolean isDisabledOnClientSide()
    {
        if (_disabledOnClientSideSet)
        {
            return _disabledOnClientSide;
        }
        ValueExpression vb = getValueExpression("disabledOnClientSide");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return false;
    }

    public void setDisabledOnClientSide(boolean disabledOnClientSide)
    {
        this._disabledOnClientSide = disabledOnClientSide;
        this._disabledOnClientSideSet = true;        
    }
    // Property: autocomplete
    private String _autocomplete;
    
    public String getAutocomplete()
    {
        if (_autocomplete != null)
        {
            return _autocomplete;
        }
        ValueExpression vb = getValueExpression("autocomplete");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setAutocomplete(String autocomplete)
    {
        this._autocomplete = autocomplete;
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
    // Property: align
    private String _align;
    
    public String getAlign()
    {
        if (_align != null)
        {
            return _align;
        }
        ValueExpression vb = getValueExpression("align");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setAlign(String align)
    {
        this._align = align;
    }

    public Object saveState(FacesContext facesContext)
    {
        Object[] values = new Object[15];
        values[0] = super.saveState(facesContext);
        values[1] = Boolean.valueOf(_disabledOnClientSide);
        values[2] = Boolean.valueOf(_disabledOnClientSideSet);
        values[3] = _autocomplete;
        values[4] = _displayValueOnly;
        values[5] = _displayValueOnlyStyle;
        values[6] = _displayValueOnlyStyleClass;
        values[7] = _enabledOnUserRole;
        values[8] = _visibleOnUserRole;
        values[9] = Boolean.valueOf(_forceId);
        values[10] = Boolean.valueOf(_forceIdIndex);
        values[11] = _datafld;
        values[12] = _datasrc;
        values[13] = _dataformatas;
        values[14] = _align;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _disabledOnClientSide = ((Boolean) values[1]).booleanValue();
        _disabledOnClientSideSet = ((Boolean) values[2]).booleanValue();
        _autocomplete = (java.lang.String) values[3];
        _displayValueOnly = (java.lang.Boolean) values[4];
        _displayValueOnlyStyle = (java.lang.String) values[5];
        _displayValueOnlyStyleClass = (java.lang.String) values[6];
        _enabledOnUserRole = (java.lang.String) values[7];
        _visibleOnUserRole = (java.lang.String) values[8];
        _forceId = ((Boolean) values[9]).booleanValue();
        _forceIdIndex = ((Boolean) values[10]).booleanValue();
        _datafld = (java.lang.String) values[11];
        _datasrc = (java.lang.String) values[12];
        _dataformatas = (java.lang.String) values[13];
        _align = (java.lang.String) values[14];
    }
}
