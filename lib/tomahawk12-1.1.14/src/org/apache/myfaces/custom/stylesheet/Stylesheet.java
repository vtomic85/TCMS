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
package org.apache.myfaces.custom.stylesheet;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;


// Generated from class org.apache.myfaces.custom.stylesheet.AbstractStylesheet.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class Stylesheet extends org.apache.myfaces.custom.stylesheet.AbstractStylesheet
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.Output";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.Stylesheet";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.Stylesheet";


    public Stylesheet()
    {
        setRendererType("org.apache.myfaces.Stylesheet");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: path
    private String _path;
    
    public String getPath()
    {
        if (_path != null)
        {
            return _path;
        }
        ValueExpression vb = getValueExpression("path");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setPath(String path)
    {
        this._path = path;
    }
    // Property: inline
    private boolean _inline;
    
    private boolean _inlineSet;
    
    public boolean isInline()
    {
        if (_inlineSet)
        {
            return _inline;
        }
        ValueExpression vb = getValueExpression("inline");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return false; 
    }

    public void setInline(boolean inline)
    {
        this._inline = inline;
        this._inlineSet = true;        
    }
    // Property: filtered
    private boolean _filtered;
    
    private boolean _filteredSet;
    
    public boolean isFiltered()
    {
        if (_filteredSet)
        {
            return _filtered;
        }
        ValueExpression vb = getValueExpression("filtered");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return false; 
    }

    public void setFiltered(boolean filtered)
    {
        this._filtered = filtered;
        this._filteredSet = true;        
    }
    // Property: media
    private String _media;
    
    public String getMedia()
    {
        if (_media != null)
        {
            return _media;
        }
        ValueExpression vb = getValueExpression("media");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setMedia(String media)
    {
        this._media = media;
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
        Object[] values = new Object[9];
        values[0] = super.saveState(facesContext);
        values[1] = _path;
        values[2] = Boolean.valueOf(_inline);
        values[3] = Boolean.valueOf(_inlineSet);
        values[4] = Boolean.valueOf(_filtered);
        values[5] = Boolean.valueOf(_filteredSet);
        values[6] = _media;
        values[7] = _enabledOnUserRole;
        values[8] = _visibleOnUserRole;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _path = (java.lang.String) values[1];
        _inline = ((Boolean) values[2]).booleanValue();
        _inlineSet = ((Boolean) values[3]).booleanValue();
        _filtered = ((Boolean) values[4]).booleanValue();
        _filteredSet = ((Boolean) values[5]).booleanValue();
        _media = (java.lang.String) values[6];
        _enabledOnUserRole = (java.lang.String) values[7];
        _visibleOnUserRole = (java.lang.String) values[8];
    }
}
