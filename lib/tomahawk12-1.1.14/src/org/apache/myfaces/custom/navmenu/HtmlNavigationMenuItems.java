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
package org.apache.myfaces.custom.navmenu;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;


// Generated from class org.apache.myfaces.custom.navmenu.AbstractHtmlNavigationMenuItems.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlNavigationMenuItems extends org.apache.myfaces.custom.navmenu.AbstractHtmlNavigationMenuItems
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.SelectItems";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.HtmlNavigationMenuItems";


    public HtmlNavigationMenuItems()
    {
        setRendererType(null);
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: rendered
    private boolean _rendered  = true;
     
    public boolean isRendered()
    {
        return _rendered;
    }

    public void setRendered(boolean rendered)
    {
        this._rendered = rendered;
    }

    public Object saveState(FacesContext facesContext)
    {
        Object[] values = new Object[3];
        values[0] = super.saveState(facesContext);
        values[1] = Boolean.valueOf(_rendered);
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _rendered = ((Boolean) values[1]).booleanValue();
    }
}
