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
package org.apache.myfaces.custom.document;

import javax.faces.component.UIComponent;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;


// Generated from class org.apache.myfaces.custom.document.AbstractDocumentBody.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class DocumentBodyTag
    extends org.apache.myfaces.custom.document.AbstractDocumentTag
{
    public DocumentBodyTag()
    {    
    }
    
    public String getComponentType()
    {
        return "org.apache.myfaces.DocumentBody";
    }

    public String getRendererType()
    {
        return "org.apache.myfaces.DocumentBody";
    }

    private ValueExpression _onload;
    
    public void setOnload(ValueExpression onload)
    {
        _onload = onload;
    }
    private ValueExpression _onunload;
    
    public void setOnunload(ValueExpression onunload)
    {
        _onunload = onunload;
    }
    private ValueExpression _onresize;
    
    public void setOnresize(ValueExpression onresize)
    {
        _onresize = onresize;
    }
    private ValueExpression _onkeypress;
    
    public void setOnkeypress(ValueExpression onkeypress)
    {
        _onkeypress = onkeypress;
    }
    private ValueExpression _style;
    
    public void setStyle(ValueExpression style)
    {
        _style = style;
    }
    private ValueExpression _styleClass;
    
    public void setStyleClass(ValueExpression styleClass)
    {
        _styleClass = styleClass;
    }

    protected void setProperties(UIComponent component)
    {
        if (!(component instanceof org.apache.myfaces.custom.document.DocumentBody))
        {
            throw new IllegalArgumentException("Component "+
                component.getClass().getName() +" is no org.apache.myfaces.custom.document.DocumentBody");
        }
        
        org.apache.myfaces.custom.document.DocumentBody comp = (org.apache.myfaces.custom.document.DocumentBody) component;
        
        super.setProperties(component);
        
        FacesContext context = getFacesContext();

        if (_onload != null)
        {
            comp.setValueExpression("onload", _onload);
        } 
        if (_onunload != null)
        {
            comp.setValueExpression("onunload", _onunload);
        } 
        if (_onresize != null)
        {
            comp.setValueExpression("onresize", _onresize);
        } 
        if (_onkeypress != null)
        {
            comp.setValueExpression("onkeypress", _onkeypress);
        } 
        if (_style != null)
        {
            comp.setValueExpression("style", _style);
        } 
        if (_styleClass != null)
        {
            comp.setValueExpression("styleClass", _styleClass);
        } 
    }

    public void release()
    {
        super.release();
        _onload = null;
        _onunload = null;
        _onresize = null;
        _onkeypress = null;
        _style = null;
        _styleClass = null;
    }
}
