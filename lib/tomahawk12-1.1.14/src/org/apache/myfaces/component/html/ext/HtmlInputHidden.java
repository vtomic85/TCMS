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


// Generated from class org.apache.myfaces.component.html.ext.AbstractHtmlInputHidden.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlInputHidden extends org.apache.myfaces.component.html.ext.AbstractHtmlInputHidden
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.Input";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.HtmlInputHidden";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.Hidden";


    public HtmlInputHidden()
    {
        setRendererType("org.apache.myfaces.Hidden");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
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

    public Object saveState(FacesContext facesContext)
    {
        Object[] values = new Object[3];
        values[0] = super.saveState(facesContext);
        values[1] = Boolean.valueOf(_forceId);
        values[2] = Boolean.valueOf(_forceIdIndex);
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _forceId = ((Boolean) values[1]).booleanValue();
        _forceIdIndex = ((Boolean) values[2]).booleanValue();
    }
}
