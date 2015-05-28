// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
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

import javax.faces.component.UIComponent;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;
import javax.faces.convert.Converter;


// Generated from class org.apache.myfaces.custom.fieldset.AbstractFieldset.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class FieldsetTag
    extends org.apache.myfaces.custom.htmlTag.HtmlTagTag
{
    public FieldsetTag()
    {    
    }
    
    public String getComponentType()
    {
        return "org.apache.myfaces.Fieldset";
    }

    public String getRendererType()
    {
        return "org.apache.myfaces.FieldsetRenderer";
    }

    private ValueExpression _legend;
    
    public void setLegend(ValueExpression legend)
    {
        _legend = legend;
    }
    private ValueExpression _escape;
    
    public void setEscape(ValueExpression escape)
    {
        _escape = escape;
    }

    protected void setProperties(UIComponent component)
    {
        if (!(component instanceof org.apache.myfaces.custom.fieldset.Fieldset))
        {
            throw new IllegalArgumentException("Component "+
                component.getClass().getName() +" is no org.apache.myfaces.custom.fieldset.Fieldset");
        }
        
        org.apache.myfaces.custom.fieldset.Fieldset comp = (org.apache.myfaces.custom.fieldset.Fieldset) component;
        
        super.setProperties(component);
        
        FacesContext context = getFacesContext();

        if (_legend != null)
        {
            comp.setValueExpression("legend", _legend);
        } 
        if (_escape != null)
        {
            comp.setValueExpression("escape", _escape);
        } 
    }

    public void release()
    {
        super.release();
        _legend = null;
        _escape = null;
    }
}
