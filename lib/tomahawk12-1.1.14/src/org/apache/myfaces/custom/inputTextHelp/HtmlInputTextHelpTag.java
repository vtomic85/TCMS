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
package org.apache.myfaces.custom.inputTextHelp;

import javax.faces.component.UIComponent;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;
import javax.faces.convert.Converter;
import javax.faces.event.MethodExpressionValueChangeListener;
import javax.faces.validator.MethodExpressionValidator;
import javax.faces.el.MethodBinding;


// Generated from class org.apache.myfaces.custom.inputTextHelp.AbstractHtmlInputTextHelp.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlInputTextHelpTag
    extends org.apache.myfaces.generated.taglib.html.ext.HtmlInputTextTag
{
    public HtmlInputTextHelpTag()
    {    
    }
    
    public String getComponentType()
    {
        return "org.apache.myfaces.HtmlInputTextHelp";
    }

    public String getRendererType()
    {
        return "org.apache.myfaces.TextHelp";
    }

    private ValueExpression _helpText;
    
    public void setHelpText(ValueExpression helpText)
    {
        _helpText = helpText;
    }
    private ValueExpression _selectText;
    
    public void setSelectText(ValueExpression selectText)
    {
        _selectText = selectText;
    }

    protected void setProperties(UIComponent component)
    {
        if (!(component instanceof org.apache.myfaces.custom.inputTextHelp.HtmlInputTextHelp))
        {
            throw new IllegalArgumentException("Component "+
                component.getClass().getName() +" is no org.apache.myfaces.custom.inputTextHelp.HtmlInputTextHelp");
        }
        
        org.apache.myfaces.custom.inputTextHelp.HtmlInputTextHelp comp = (org.apache.myfaces.custom.inputTextHelp.HtmlInputTextHelp) component;
        
        super.setProperties(component);
        
        FacesContext context = getFacesContext();

        if (_helpText != null)
        {
            comp.setValueExpression("helpText", _helpText);
        } 
        if (_selectText != null)
        {
            comp.setValueExpression("selectText", _selectText);
        } 
    }

    public void release()
    {
        super.release();
        _helpText = null;
        _selectText = null;
    }
}
