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

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;
import javax.faces.convert.Converter;
import javax.faces.el.MethodBinding;


// Generated from class org.apache.myfaces.custom.inputTextHelp.AbstractHtmlInputTextHelp.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlInputTextHelp extends org.apache.myfaces.custom.inputTextHelp.AbstractHtmlInputTextHelp
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.Input";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.HtmlInputTextHelp";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.TextHelp";


    public HtmlInputTextHelp()
    {
        setRendererType("org.apache.myfaces.TextHelp");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: helpText
    private String _helpText;
    
    public String getHelpText()
    {
        if (_helpText != null)
        {
            return _helpText;
        }
        ValueExpression vb = getValueExpression("helpText");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setHelpText(String helpText)
    {
        this._helpText = helpText;
    }
    // Property: selectText
    private boolean _selectText;
    
    private boolean _selectTextSet;
    
    public boolean isSelectText()
    {
        if (_selectTextSet)
        {
            return _selectText;
        }
        ValueExpression vb = getValueExpression("selectText");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return false; 
    }

    public void setSelectText(boolean selectText)
    {
        this._selectText = selectText;
        this._selectTextSet = true;        
    }

    public Object saveState(FacesContext facesContext)
    {
        Object[] values = new Object[4];
        values[0] = super.saveState(facesContext);
        values[1] = _helpText;
        values[2] = Boolean.valueOf(_selectText);
        values[3] = Boolean.valueOf(_selectTextSet);
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _helpText = (java.lang.String) values[1];
        _selectText = ((Boolean) values[2]).booleanValue();
        _selectTextSet = ((Boolean) values[3]).booleanValue();
    }
}
