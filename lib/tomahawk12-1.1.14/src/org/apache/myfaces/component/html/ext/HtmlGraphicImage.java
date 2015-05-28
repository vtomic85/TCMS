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


// Generated from class org.apache.myfaces.component.html.ext.AbstractHtmlGraphicImage.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlGraphicImage extends org.apache.myfaces.component.html.ext.AbstractHtmlGraphicImage
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.Graphic";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.HtmlGraphicImage";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.Image";


    public HtmlGraphicImage()
    {
        setRendererType("org.apache.myfaces.Image");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: border
    private String _border;
    
    public String getBorder()
    {
        if (_border != null)
        {
            return _border;
        }
        ValueExpression vb = getValueExpression("border");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setBorder(String border)
    {
        this._border = border;
    }
    // Property: hspace
    private String _hspace;
    
    public String getHspace()
    {
        if (_hspace != null)
        {
            return _hspace;
        }
        ValueExpression vb = getValueExpression("hspace");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setHspace(String hspace)
    {
        this._hspace = hspace;
    }
    // Property: vspace
    private String _vspace;
    
    public String getVspace()
    {
        if (_vspace != null)
        {
            return _vspace;
        }
        ValueExpression vb = getValueExpression("vspace");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setVspace(String vspace)
    {
        this._vspace = vspace;
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
    // Property: align
    private String _align;
    
    public String getAlign()
    {
        if (_align != null)
        {
            return _align;
        }
        ValueExpression vb = getValueExpression("align");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setAlign(String align)
    {
        this._align = align;
    }

    public Object saveState(FacesContext facesContext)
    {
        Object[] values = new Object[9];
        values[0] = super.saveState(facesContext);
        values[1] = _border;
        values[2] = _hspace;
        values[3] = _vspace;
        values[4] = _enabledOnUserRole;
        values[5] = _visibleOnUserRole;
        values[6] = Boolean.valueOf(_forceId);
        values[7] = Boolean.valueOf(_forceIdIndex);
        values[8] = _align;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _border = (java.lang.String) values[1];
        _hspace = (java.lang.String) values[2];
        _vspace = (java.lang.String) values[3];
        _enabledOnUserRole = (java.lang.String) values[4];
        _visibleOnUserRole = (java.lang.String) values[5];
        _forceId = ((Boolean) values[6]).booleanValue();
        _forceIdIndex = ((Boolean) values[7]).booleanValue();
        _align = (java.lang.String) values[8];
    }
}
