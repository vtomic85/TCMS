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
package org.apache.myfaces.custom.collapsiblepanel;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;
import javax.el.MethodExpression;
import javax.faces.el.MethodBinding;


// Generated from class org.apache.myfaces.custom.collapsiblepanel.AbstractHtmlHeaderLink.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlHeaderLink extends org.apache.myfaces.custom.collapsiblepanel.AbstractHtmlHeaderLink
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.Command";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.HtmlHeaderLink";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.HeaderLink";


    public HtmlHeaderLink()
    {
        setRendererType("org.apache.myfaces.HeaderLink");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: forceId
    private Boolean _forceId  = Boolean.valueOf(false);
     
    public Boolean getForceId()
    {
        return _forceId;
    }

    public void setForceId(Boolean forceId)
    {
        this._forceId = forceId;
    }
    // Property: forceIdIndex
    private Boolean _forceIdIndex  = Boolean.valueOf(true);
     
    public Boolean getForceIdIndex()
    {
        return _forceIdIndex;
    }

    public void setForceIdIndex(Boolean forceIdIndex)
    {
        this._forceIdIndex = forceIdIndex;
    }

    public Object saveState(FacesContext facesContext)
    {
        Object[] values = new Object[3];
        values[0] = super.saveState(facesContext);
        values[1] = _forceId;
        values[2] = _forceIdIndex;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _forceId = (java.lang.Boolean) values[1];
        _forceIdIndex = (java.lang.Boolean) values[2];
    }
}
