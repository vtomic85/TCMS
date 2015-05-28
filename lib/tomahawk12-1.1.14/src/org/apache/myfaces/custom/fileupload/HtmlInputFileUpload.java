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
package org.apache.myfaces.custom.fileupload;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;
import javax.faces.convert.Converter;
import javax.faces.el.MethodBinding;


// Generated from class org.apache.myfaces.custom.fileupload.AbstractHtmlInputFileUpload.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlInputFileUpload extends org.apache.myfaces.custom.fileupload.AbstractHtmlInputFileUpload
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.Input";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.HtmlInputFileUpload";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.FileUpload";


    public HtmlInputFileUpload()
    {
        setRendererType("org.apache.myfaces.FileUpload");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: storage
    private String _storage;
    
    public String getStorage()
    {
        if (_storage != null)
        {
            return _storage;
        }
        ValueExpression vb = getValueExpression("storage");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setStorage(String storage)
    {
        this._storage = storage;
    }
    // Property: accept
    private String _accept;
    
    public String getAccept()
    {
        if (_accept != null)
        {
            return _accept;
        }
        ValueExpression vb = getValueExpression("accept");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setAccept(String accept)
    {
        this._accept = accept;
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
        Object[] values = new Object[6];
        values[0] = super.saveState(facesContext);
        values[1] = _storage;
        values[2] = _accept;
        values[3] = _enabledOnUserRole;
        values[4] = _visibleOnUserRole;
        values[5] = _align;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _storage = (java.lang.String) values[1];
        _accept = (java.lang.String) values[2];
        _enabledOnUserRole = (java.lang.String) values[3];
        _visibleOnUserRole = (java.lang.String) values[4];
        _align = (java.lang.String) values[5];
    }
}
