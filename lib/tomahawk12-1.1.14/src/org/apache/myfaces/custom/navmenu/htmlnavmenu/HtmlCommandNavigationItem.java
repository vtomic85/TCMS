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
package org.apache.myfaces.custom.navmenu.htmlnavmenu;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;
import javax.el.MethodExpression;
import javax.faces.el.MethodBinding;


// Generated from class org.apache.myfaces.custom.navmenu.htmlnavmenu.AbstractHtmlCommandNavigationItem.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlCommandNavigationItem extends org.apache.myfaces.custom.navmenu.htmlnavmenu.AbstractHtmlCommandNavigationItem
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.Command";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.HtmlCommandNavigationItem";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.NavigationMenu";


    public HtmlCommandNavigationItem()
    {
        setRendererType("org.apache.myfaces.NavigationMenu");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: open
    private boolean _open;
    
    private boolean _openSet;
    
    protected boolean isSetOpen()
    {
        return _openSet;
    }
    final protected boolean isLocalOpen()
    {
        return _open;
    }
     
    public boolean isOpen()
    {
        if (_openSet)
        {
            return _open;
        }
        ValueExpression vb = getValueExpression("open");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return false; 
    }

    public void setOpen(boolean open)
    {
        this._open = open;
        this._openSet = true;        
    }
    // Property: active
    private boolean _active;
    
    private boolean _activeSet;
    
    protected boolean isSetActive()
    {
        return _activeSet;
    }
    final protected boolean isLocalActive()
    {
        return _active;
    }
     
    public boolean isActive()
    {
        if (_activeSet)
        {
            return _active;
        }
        ValueExpression vb = getValueExpression("active");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return false; 
    }

    public void setActive(boolean active)
    {
        this._active = active;
        this._activeSet = true;        
    }
    // Property: activeOnViewIds
    private String _activeOnViewIds;
    
    public String getActiveOnViewIds()
    {
        if (_activeOnViewIds != null)
        {
            return _activeOnViewIds;
        }
        ValueExpression vb = getValueExpression("activeOnViewIds");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setActiveOnViewIds(String activeOnViewIds)
    {
        this._activeOnViewIds = activeOnViewIds;
    }
    // Property: externalLink
    private String _externalLink;
    
    public String getExternalLink()
    {
        if (_externalLink != null)
        {
            return _externalLink;
        }
        ValueExpression vb = getValueExpression("externalLink");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setExternalLink(String externalLink)
    {
        this._externalLink = externalLink;
    }

    public Object saveState(FacesContext facesContext)
    {
        Object[] values = new Object[7];
        values[0] = super.saveState(facesContext);
        values[1] = Boolean.valueOf(_open);
        values[2] = Boolean.valueOf(_openSet);
        values[3] = Boolean.valueOf(_active);
        values[4] = Boolean.valueOf(_activeSet);
        values[5] = _activeOnViewIds;
        values[6] = _externalLink;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _open = ((Boolean) values[1]).booleanValue();
        _openSet = ((Boolean) values[2]).booleanValue();
        _active = ((Boolean) values[3]).booleanValue();
        _activeSet = ((Boolean) values[4]).booleanValue();
        _activeOnViewIds = (java.lang.String) values[5];
        _externalLink = (java.lang.String) values[6];
    }
}
