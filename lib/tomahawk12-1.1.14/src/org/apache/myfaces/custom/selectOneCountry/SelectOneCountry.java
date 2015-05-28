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
package org.apache.myfaces.custom.selectOneCountry;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;
import javax.faces.convert.Converter;
import javax.faces.el.MethodBinding;


// Generated from class org.apache.myfaces.custom.selectOneCountry.AbstractSelectOneCountry.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class SelectOneCountry extends org.apache.myfaces.custom.selectOneCountry.AbstractSelectOneCountry
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.SelectOne";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.SelectOneCountry";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.SelectOneCountryRenderer";


    public SelectOneCountry()
    {
        setRendererType("org.apache.myfaces.SelectOneCountryRenderer");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: maxLength
    private Integer _maxLength;
    
    public Integer getMaxLength()
    {
        if (_maxLength != null)
        {
            return _maxLength;
        }
        ValueExpression vb = getValueExpression("maxLength");
        if (vb != null)
        {
            Object value = vb == null ? null : vb.getValue(getFacesContext().getELContext());
            if (!(value instanceof Integer)){
                value = Integer.valueOf(value.toString());
            }            
            return (Integer) value;
        }
        return null;
    }

    public void setMaxLength(Integer maxLength)
    {
        this._maxLength = maxLength;
    }
    // Property: emptySelection
    private String _emptySelection;
    
    public String getEmptySelection()
    {
        if (_emptySelection != null)
        {
            return _emptySelection;
        }
        ValueExpression vb = getValueExpression("emptySelection");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setEmptySelection(String emptySelection)
    {
        this._emptySelection = emptySelection;
    }

    public Object saveState(FacesContext facesContext)
    {
        Object[] values = new Object[3];
        values[0] = super.saveState(facesContext);
        values[1] = _maxLength;
        values[2] = _emptySelection;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _maxLength = (java.lang.Integer) values[1];
        _emptySelection = (java.lang.String) values[2];
    }
}
