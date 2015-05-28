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
import javax.el.MethodExpression;
import javax.faces.el.MethodBinding;


// Generated from class org.apache.myfaces.custom.navmenu.AbstractUINavigationMenuItem.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class UINavigationMenuItem extends org.apache.myfaces.custom.navmenu.AbstractUINavigationMenuItem
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.SelectItem";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.NavigationMenuItem";


    public UINavigationMenuItem()
    {
        setRendererType(null);
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: icon
    private String _icon;
    
    public String getIcon()
    {
        if (_icon != null)
        {
            return _icon;
        }
        ValueExpression vb = getValueExpression("icon");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setIcon(String icon)
    {
        this._icon = icon;
    }
    // Property: split
    private boolean _split;
    
    private boolean _splitSet;
    
    public boolean isSplit()
    {
        if (_splitSet)
        {
            return _split;
        }
        ValueExpression vb = getValueExpression("split");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return false; 
    }

    public void setSplit(boolean split)
    {
        this._split = split;
        this._splitSet = true;        
    }
    // Property: open
    private boolean _open  = false;
     
    public boolean isOpen()
    {
        return _open;
    }

    public void setOpen(boolean open)
    {
        this._open = open;
    }
    // Property: active
    private boolean _active  = false;
     
    public boolean isActive()
    {
        return _active;
    }

    public void setActive(boolean active)
    {
        this._active = active;
    }
    // Property: immediate
    private boolean _immediate  = true;
     
    public boolean isImmediate()
    {
        return _immediate;
    }

    public void setImmediate(boolean immediate)
    {
        this._immediate = immediate;
    }
    // Property: externalLink
    private String _externalLink ;
     
    public String getExternalLink()
    {
        return _externalLink;
    }

    public void setExternalLink(String externalLink)
    {
        this._externalLink = externalLink;
    }
    // Property: actionExpression
    private MethodExpression _actionExpression ;
     
    public MethodExpression getActionExpression()
    {
        return _actionExpression;
    }

    public void setActionExpression(MethodExpression actionExpression)
    {
        this._actionExpression = actionExpression;
    }
    // Property: actionListener
    private MethodBinding _actionListener ;
     
    public MethodBinding getActionListener()
    {
        return _actionListener;
    }

    public void setActionListener(MethodBinding actionListener)
    {
        this._actionListener = actionListener;
    }
    // Property: target
    private String _target;
    
    public String getTarget()
    {
        if (_target != null)
        {
            return _target;
        }
        ValueExpression vb = getValueExpression("target");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setTarget(String target)
    {
        this._target = target;
    }
    // Property: disabled
    private boolean _disabled;
    
    private boolean _disabledSet;
    
    public boolean isDisabled()
    {
        if (_disabledSet)
        {
            return _disabled;
        }
        ValueExpression vb = getValueExpression("disabled");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return false; 
    }

    public void setDisabled(boolean disabled)
    {
        this._disabled = disabled;
        this._disabledSet = true;        
    }
    // Property: disabledStyle
    private String _disabledStyle;
    
    public String getDisabledStyle()
    {
        if (_disabledStyle != null)
        {
            return _disabledStyle;
        }
        ValueExpression vb = getValueExpression("disabledStyle");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setDisabledStyle(String disabledStyle)
    {
        this._disabledStyle = disabledStyle;
    }
    // Property: disabledStyleClass
    private String _disabledStyleClass;
    
    public String getDisabledStyleClass()
    {
        if (_disabledStyleClass != null)
        {
            return _disabledStyleClass;
        }
        ValueExpression vb = getValueExpression("disabledStyleClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setDisabledStyleClass(String disabledStyleClass)
    {
        this._disabledStyleClass = disabledStyleClass;
    }
    // Property: activeOnViewIds
    private String _activeOnViewIds ;
     
    final protected String getLocalActiveOnViewIds()
    {
        return _activeOnViewIds;
    }
     
    public String getActiveOnViewIds()
    {
        return _activeOnViewIds;
    }

    public void setActiveOnViewIds(String activeOnViewIds)
    {
        this._activeOnViewIds = activeOnViewIds;
    }
    // Property: enabledOnUserRole
    private String _enabledOnUserRole;
    
    public String getEnabledOnUserRole()
    {
        if (_enabledOnUserRole != null)
        {
            return _enabledOnUserRole;
        }
        ValueExpression vb = getValueExpression("enabledOnUserRole");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setEnabledOnUserRole(String enabledOnUserRole)
    {
        this._enabledOnUserRole = enabledOnUserRole;
    }
    // Property: visibleOnUserRole
    private String _visibleOnUserRole;
    
    public String getVisibleOnUserRole()
    {
        if (_visibleOnUserRole != null)
        {
            return _visibleOnUserRole;
        }
        ValueExpression vb = getValueExpression("visibleOnUserRole");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setVisibleOnUserRole(String visibleOnUserRole)
    {
        this._visibleOnUserRole = visibleOnUserRole;
    }

    public Object saveState(FacesContext facesContext)
    {
        Object[] values = new Object[21];
        values[0] = super.saveState(facesContext);
        values[1] = _icon;
        values[2] = Boolean.valueOf(_split);
        values[3] = Boolean.valueOf(_splitSet);
        values[4] = Boolean.valueOf(_open);
        values[5] = Boolean.valueOf(_active);
        values[6] = Boolean.valueOf(_immediate);
        values[7] = _externalLink;
        values[8] = saveAttachedState(facesContext,_actionExpression);
        values[9] = saveAttachedState(facesContext,_actionListener);
        values[10] = _target;
        values[11] = Boolean.valueOf(_disabled);
        values[12] = Boolean.valueOf(_disabledSet);
        values[13] = _disabledStyle;
        values[14] = _disabledStyleClass;
        values[15] = _activeOnViewIds;
        values[16] = _enabledOnUserRole;
        values[17] = _visibleOnUserRole;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _icon = (java.lang.String) values[1];
        _split = ((Boolean) values[2]).booleanValue();
        _splitSet = ((Boolean) values[3]).booleanValue();
        _open = ((Boolean) values[4]).booleanValue();
        _active = ((Boolean) values[5]).booleanValue();
        _immediate = ((Boolean) values[6]).booleanValue();
        _externalLink = (java.lang.String) values[7];
        _actionExpression = (javax.el.MethodExpression) restoreAttachedState(facesContext,values[8]); 
        _actionListener = (javax.faces.el.MethodBinding) restoreAttachedState(facesContext,values[9]); 
        _target = (java.lang.String) values[10];
        _disabled = ((Boolean) values[11]).booleanValue();
        _disabledSet = ((Boolean) values[12]).booleanValue();
        _disabledStyle = (java.lang.String) values[13];
        _disabledStyleClass = (java.lang.String) values[14];
        _activeOnViewIds = (java.lang.String) values[15];
        _enabledOnUserRole = (java.lang.String) values[16];
        _visibleOnUserRole = (java.lang.String) values[17];
    }
}
