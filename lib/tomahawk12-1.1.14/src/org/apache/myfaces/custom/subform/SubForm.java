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
package org.apache.myfaces.custom.subform;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;


// Generated from class org.apache.myfaces.custom.subform.AbstractSubForm.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class SubForm extends org.apache.myfaces.custom.subform.AbstractSubForm
    implements javax.faces.component.NamingContainer
{

    static public final String COMPONENT_FAMILY =
        "org.apache.myfaces.SubForm";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.SubForm";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.SubForm";


    public SubForm()
    {
        setRendererType("org.apache.myfaces.SubForm");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: preserveSubmittedValues
    private Boolean _preserveSubmittedValues;
    
    public Boolean getPreserveSubmittedValues()
    {
        if (_preserveSubmittedValues != null)
        {
            return _preserveSubmittedValues;
        }
        ValueExpression vb = getValueExpression("preserveSubmittedValues");
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

    public void setPreserveSubmittedValues(Boolean preserveSubmittedValues)
    {
        this._preserveSubmittedValues = preserveSubmittedValues;
    }

    public Object saveState(FacesContext facesContext)
    {
        Object[] values = new Object[2];
        values[0] = super.saveState(facesContext);
        values[1] = _preserveSubmittedValues;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _preserveSubmittedValues = (java.lang.Boolean) values[1];
    }
}
