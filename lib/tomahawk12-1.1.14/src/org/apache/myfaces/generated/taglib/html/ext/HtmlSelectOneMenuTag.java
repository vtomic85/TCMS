// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
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
package org.apache.myfaces.generated.taglib.html.ext;

import javax.faces.component.UIComponent;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;
import javax.faces.convert.Converter;
import javax.faces.event.MethodExpressionValueChangeListener;
import javax.faces.validator.MethodExpressionValidator;
import javax.faces.el.MethodBinding;


// Generated from class org.apache.myfaces.component.html.ext.AbstractHtmlSelectOneMenu.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlSelectOneMenuTag
    extends org.apache.myfaces.shared_tomahawk.taglib.html.HtmlSelectOneMenuTag
{
    public HtmlSelectOneMenuTag()
    {    
    }
    
    public String getComponentType()
    {
        return "org.apache.myfaces.HtmlSelectOneMenu";
    }

    public String getRendererType()
    {
        return "org.apache.myfaces.Menu";
    }

    private ValueExpression _displayValueOnly;
    
    public void setDisplayValueOnly(ValueExpression displayValueOnly)
    {
        _displayValueOnly = displayValueOnly;
    }
    private ValueExpression _displayValueOnlyStyle;
    
    public void setDisplayValueOnlyStyle(ValueExpression displayValueOnlyStyle)
    {
        _displayValueOnlyStyle = displayValueOnlyStyle;
    }
    private ValueExpression _displayValueOnlyStyleClass;
    
    public void setDisplayValueOnlyStyleClass(ValueExpression displayValueOnlyStyleClass)
    {
        _displayValueOnlyStyleClass = displayValueOnlyStyleClass;
    }
    private ValueExpression _enabledOnUserRole;
    
    public void setEnabledOnUserRole(ValueExpression enabledOnUserRole)
    {
        _enabledOnUserRole = enabledOnUserRole;
    }
    private ValueExpression _visibleOnUserRole;
    
    public void setVisibleOnUserRole(ValueExpression visibleOnUserRole)
    {
        _visibleOnUserRole = visibleOnUserRole;
    }
    private String _forceId;
    
    public void setForceId(String forceId)
    {
        _forceId = forceId;
    }
    private String _forceIdIndex;
    
    public void setForceIdIndex(String forceIdIndex)
    {
        _forceIdIndex = forceIdIndex;
    }
    private ValueExpression _escape;
    
    public void setEscape(ValueExpression escape)
    {
        _escape = escape;
    }
    private ValueExpression _datafld;
    
    public void setDatafld(ValueExpression datafld)
    {
        _datafld = datafld;
    }
    private ValueExpression _datasrc;
    
    public void setDatasrc(ValueExpression datasrc)
    {
        _datasrc = datasrc;
    }
    private ValueExpression _dataformatas;
    
    public void setDataformatas(ValueExpression dataformatas)
    {
        _dataformatas = dataformatas;
    }

    protected void setProperties(UIComponent component)
    {
        if (!(component instanceof org.apache.myfaces.component.html.ext.HtmlSelectOneMenu))
        {
            throw new IllegalArgumentException("Component "+
                component.getClass().getName() +" is no org.apache.myfaces.component.html.ext.HtmlSelectOneMenu");
        }
        
        org.apache.myfaces.component.html.ext.HtmlSelectOneMenu comp = (org.apache.myfaces.component.html.ext.HtmlSelectOneMenu) component;
        
        super.setProperties(component);
        
        FacesContext context = getFacesContext();

        if (_displayValueOnly != null)
        {
            comp.setValueExpression("displayValueOnly", _displayValueOnly);
        } 
        if (_displayValueOnlyStyle != null)
        {
            comp.setValueExpression("displayValueOnlyStyle", _displayValueOnlyStyle);
        } 
        if (_displayValueOnlyStyleClass != null)
        {
            comp.setValueExpression("displayValueOnlyStyleClass", _displayValueOnlyStyleClass);
        } 
        if (_enabledOnUserRole != null)
        {
            comp.setValueExpression("enabledOnUserRole", _enabledOnUserRole);
        } 
        if (_visibleOnUserRole != null)
        {
            comp.setValueExpression("visibleOnUserRole", _visibleOnUserRole);
        } 
        if (_forceId != null)
        {
            comp.getAttributes().put("forceId", Boolean.valueOf(_forceId));
        } 
        if (_forceIdIndex != null)
        {
            comp.getAttributes().put("forceIdIndex", Boolean.valueOf(_forceIdIndex));
        } 
        if (_escape != null)
        {
            comp.setValueExpression("escape", _escape);
        } 
        if (_datafld != null)
        {
            comp.setValueExpression("datafld", _datafld);
        } 
        if (_datasrc != null)
        {
            comp.setValueExpression("datasrc", _datasrc);
        } 
        if (_dataformatas != null)
        {
            comp.setValueExpression("dataformatas", _dataformatas);
        } 
    }

    public void release()
    {
        super.release();
        _displayValueOnly = null;
        _displayValueOnlyStyle = null;
        _displayValueOnlyStyleClass = null;
        _enabledOnUserRole = null;
        _visibleOnUserRole = null;
        _forceId = null;
        _forceIdIndex = null;
        _escape = null;
        _datafld = null;
        _datasrc = null;
        _dataformatas = null;
    }
}
