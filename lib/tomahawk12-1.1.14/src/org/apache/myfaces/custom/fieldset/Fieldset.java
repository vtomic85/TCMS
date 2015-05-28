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
package org.apache.myfaces.custom.fieldset;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;
import javax.faces.convert.Converter;


// Generated from class org.apache.myfaces.custom.fieldset.AbstractFieldset.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class Fieldset extends org.apache.myfaces.custom.fieldset.AbstractFieldset
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.Output";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.Fieldset";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.FieldsetRenderer";


    public Fieldset()
    {
        setRendererType("org.apache.myfaces.FieldsetRenderer");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: legend
    private String _legend;
    
    public String getLegend()
    {
        if (_legend != null)
        {
            return _legend;
        }
        ValueExpression vb = getValueExpression("legend");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setLegend(String legend)
    {
        this._legend = legend;
    }
    // Property: escape
    private boolean _escape;
    
    private boolean _escapeSet;
    
    public boolean isEscape()
    {
        if (_escapeSet)
        {
            return _escape;
        }
        ValueExpression vb = getValueExpression("escape");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return true; 
    }

    public void setEscape(boolean escape)
    {
        this._escape = escape;
        this._escapeSet = true;        
    }

    public Object saveState(FacesContext facesContext)
    {
        Object[] values = new Object[4];
        values[0] = super.saveState(facesContext);
        values[1] = _legend;
        values[2] = Boolean.valueOf(_escape);
        values[3] = Boolean.valueOf(_escapeSet);
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _legend = (java.lang.String) values[1];
        _escape = ((Boolean) values[2]).booleanValue();
        _escapeSet = ((Boolean) values[3]).booleanValue();
    }
}
