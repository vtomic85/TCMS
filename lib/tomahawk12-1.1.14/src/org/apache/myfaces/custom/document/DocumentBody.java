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
package org.apache.myfaces.custom.document;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;


// Generated from class org.apache.myfaces.custom.document.AbstractDocumentBody.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class DocumentBody extends org.apache.myfaces.custom.document.AbstractDocumentBody
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.Data";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.DocumentBody";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.DocumentBody";


    public DocumentBody()
    {
        setRendererType("org.apache.myfaces.DocumentBody");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: onload
    private String _onload;
    
    public String getOnload()
    {
        if (_onload != null)
        {
            return _onload;
        }
        ValueExpression vb = getValueExpression("onload");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setOnload(String onload)
    {
        this._onload = onload;
    }
    // Property: onunload
    private String _onunload;
    
    public String getOnunload()
    {
        if (_onunload != null)
        {
            return _onunload;
        }
        ValueExpression vb = getValueExpression("onunload");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setOnunload(String onunload)
    {
        this._onunload = onunload;
    }
    // Property: onresize
    private String _onresize;
    
    public String getOnresize()
    {
        if (_onresize != null)
        {
            return _onresize;
        }
        ValueExpression vb = getValueExpression("onresize");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setOnresize(String onresize)
    {
        this._onresize = onresize;
    }
    // Property: onkeypress
    private String _onkeypress;
    
    public String getOnkeypress()
    {
        if (_onkeypress != null)
        {
            return _onkeypress;
        }
        ValueExpression vb = getValueExpression("onkeypress");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setOnkeypress(String onkeypress)
    {
        this._onkeypress = onkeypress;
    }
    // Property: style
    private String _style;
    
    public String getStyle()
    {
        if (_style != null)
        {
            return _style;
        }
        ValueExpression vb = getValueExpression("style");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setStyle(String style)
    {
        this._style = style;
    }
    // Property: styleClass
    private String _styleClass;
    
    public String getStyleClass()
    {
        if (_styleClass != null)
        {
            return _styleClass;
        }
        ValueExpression vb = getValueExpression("styleClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setStyleClass(String styleClass)
    {
        this._styleClass = styleClass;
    }

    public Object saveState(FacesContext facesContext)
    {
        Object[] values = new Object[7];
        values[0] = super.saveState(facesContext);
        values[1] = _onload;
        values[2] = _onunload;
        values[3] = _onresize;
        values[4] = _onkeypress;
        values[5] = _style;
        values[6] = _styleClass;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _onload = (java.lang.String) values[1];
        _onunload = (java.lang.String) values[2];
        _onresize = (java.lang.String) values[3];
        _onkeypress = (java.lang.String) values[4];
        _style = (java.lang.String) values[5];
        _styleClass = (java.lang.String) values[6];
    }
}
