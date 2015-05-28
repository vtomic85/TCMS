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
package org.apache.myfaces.custom.navigation;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;
import javax.el.MethodExpression;
import javax.faces.el.MethodBinding;


// Generated from class org.apache.myfaces.custom.navigation.AbstractHtmlCommandNavigation.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlCommandNavigation extends org.apache.myfaces.custom.navigation.AbstractHtmlCommandNavigation
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.Command";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.HtmlCommandNavigation";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.Navigation";


    public HtmlCommandNavigation()
    {
        setRendererType("org.apache.myfaces.Navigation");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: open
    private boolean _open ;
     
    public boolean isOpen()
    {
        return _open;
    }

    public void setOpen(boolean open)
    {
        this._open = open;
    }
    // Property: active
    private boolean _active ;
     
    public boolean isActive()
    {
        return _active;
    }

    public void setActive(boolean active)
    {
        this._active = active;
    }

    public Object saveState(FacesContext facesContext)
    {
        Object[] values = new Object[5];
        values[0] = super.saveState(facesContext);
        values[1] = Boolean.valueOf(_open);
        values[2] = Boolean.valueOf(_active);
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _open = ((Boolean) values[1]).booleanValue();
        _active = ((Boolean) values[2]).booleanValue();
    }
}
