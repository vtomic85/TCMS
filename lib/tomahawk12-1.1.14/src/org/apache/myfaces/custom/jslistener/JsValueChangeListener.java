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
package org.apache.myfaces.custom.jslistener;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;


// Generated from class org.apache.myfaces.custom.jslistener.AbstractJsValueChangeListener.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class JsValueChangeListener extends org.apache.myfaces.custom.jslistener.AbstractJsValueChangeListener
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.Output";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.JsValueChangeListener";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.JsValueChangeListener";


    public JsValueChangeListener()
    {
        setRendererType("org.apache.myfaces.JsValueChangeListener");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: for
    private String _for;
    
    public String getFor()
    {
        if (_for != null)
        {
            return _for;
        }
        ValueExpression vb = getValueExpression("for");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setFor(String forParam)
    {
        this._for = forParam;
    }
    // Property: expressionValue
    private String _expressionValue;
    
    public String getExpressionValue()
    {
        if (_expressionValue != null)
        {
            return _expressionValue;
        }
        ValueExpression vb = getValueExpression("expressionValue");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setExpressionValue(String expressionValue)
    {
        this._expressionValue = expressionValue;
    }
    // Property: property
    private String _property;
    
    public String getProperty()
    {
        if (_property != null)
        {
            return _property;
        }
        ValueExpression vb = getValueExpression("property");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setProperty(String property)
    {
        this._property = property;
    }
    // Property: bodyTagEvent
    private String _bodyTagEvent;
    
    public String getBodyTagEvent()
    {
        if (_bodyTagEvent != null)
        {
            return _bodyTagEvent;
        }
        ValueExpression vb = getValueExpression("bodyTagEvent");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setBodyTagEvent(String bodyTagEvent)
    {
        this._bodyTagEvent = bodyTagEvent;
    }

    public Object saveState(FacesContext facesContext)
    {
        Object[] values = new Object[5];
        values[0] = super.saveState(facesContext);
        values[1] = _for;
        values[2] = _expressionValue;
        values[3] = _property;
        values[4] = _bodyTagEvent;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _for = (java.lang.String) values[1];
        _expressionValue = (java.lang.String) values[2];
        _property = (java.lang.String) values[3];
        _bodyTagEvent = (java.lang.String) values[4];
    }
}
