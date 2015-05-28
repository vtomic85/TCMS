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
package org.apache.myfaces.custom.navmenu.jscookmenu;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;
import javax.el.MethodExpression;
import javax.faces.el.MethodBinding;


// Generated from class org.apache.myfaces.custom.navmenu.jscookmenu.AbstractHtmlCommandJSCookMenu.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlCommandJSCookMenu extends org.apache.myfaces.custom.navmenu.jscookmenu.AbstractHtmlCommandJSCookMenu
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.Command";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.JSCookMenu";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.JSCookMenu";


    public HtmlCommandJSCookMenu()
    {
        setRendererType("org.apache.myfaces.JSCookMenu");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: layout
    private String _layout;
    
    public String getLayout()
    {
        if (_layout != null)
        {
            return _layout;
        }
        ValueExpression vb = getValueExpression("layout");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setLayout(String layout)
    {
        this._layout = layout;
    }
    // Property: theme
    private String _theme;
    
    public String getTheme()
    {
        if (_theme != null)
        {
            return _theme;
        }
        ValueExpression vb = getValueExpression("theme");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setTheme(String theme)
    {
        this._theme = theme;
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
    // Property: javascriptLocation
    private String _javascriptLocation;
    
    public String getJavascriptLocation()
    {
        if (_javascriptLocation != null)
        {
            return _javascriptLocation;
        }
        ValueExpression vb = getValueExpression("javascriptLocation");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setJavascriptLocation(String javascriptLocation)
    {
        this._javascriptLocation = javascriptLocation;
    }
    // Property: imageLocation
    private String _imageLocation;
    
    public String getImageLocation()
    {
        if (_imageLocation != null)
        {
            return _imageLocation;
        }
        ValueExpression vb = getValueExpression("imageLocation");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setImageLocation(String imageLocation)
    {
        this._imageLocation = imageLocation;
    }
    // Property: styleLocation
    private String _styleLocation;
    
    public String getStyleLocation()
    {
        if (_styleLocation != null)
        {
            return _styleLocation;
        }
        ValueExpression vb = getValueExpression("styleLocation");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setStyleLocation(String styleLocation)
    {
        this._styleLocation = styleLocation;
    }

    public Object saveState(FacesContext facesContext)
    {
        Object[] values = new Object[8];
        values[0] = super.saveState(facesContext);
        values[1] = _layout;
        values[2] = _theme;
        values[3] = _enabledOnUserRole;
        values[4] = _visibleOnUserRole;
        values[5] = _javascriptLocation;
        values[6] = _imageLocation;
        values[7] = _styleLocation;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _layout = (java.lang.String) values[1];
        _theme = (java.lang.String) values[2];
        _enabledOnUserRole = (java.lang.String) values[3];
        _visibleOnUserRole = (java.lang.String) values[4];
        _javascriptLocation = (java.lang.String) values[5];
        _imageLocation = (java.lang.String) values[6];
        _styleLocation = (java.lang.String) values[7];
    }
}
