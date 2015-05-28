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
package org.apache.myfaces.custom.dojo;

import javax.faces.component.UIComponent;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;
import javax.faces.convert.Converter;


// Generated from class org.apache.myfaces.custom.dojo.DojoInitializer.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class DojoInitializerTag
    extends javax.faces.webapp.UIComponentELTag
{
    public DojoInitializerTag()
    {    
    }
    
    public String getComponentType()
    {
        return "org.apache.myfaces.DojoInitializer";
    }

    public String getRendererType()
    {
        return "org.apache.myfaces.DojoInitializerRenderer";
    }

    private ValueExpression _allowQueryConfig;
    
    public void setAllowQueryConfig(ValueExpression allowQueryConfig)
    {
        _allowQueryConfig = allowQueryConfig;
    }
    private ValueExpression _baseScriptUri;
    
    public void setBaseScriptUri(ValueExpression baseScriptUri)
    {
        _baseScriptUri = baseScriptUri;
    }
    private ValueExpression _bindEncoding;
    
    public void setBindEncoding(ValueExpression bindEncoding)
    {
        _bindEncoding = bindEncoding;
    }
    private ValueExpression _debug;
    
    public void setDebug(ValueExpression debug)
    {
        _debug = debug;
    }
    private ValueExpression _debugAtAllCosts;
    
    public void setDebugAtAllCosts(ValueExpression debugAtAllCosts)
    {
        _debugAtAllCosts = debugAtAllCosts;
    }
    private ValueExpression _debugConsole;
    
    public void setDebugConsole(ValueExpression debugConsole)
    {
        _debugConsole = debugConsole;
    }
    private ValueExpression _debugContainerId;
    
    public void setDebugContainerId(ValueExpression debugContainerId)
    {
        _debugContainerId = debugContainerId;
    }
    private ValueExpression _expanded;
    
    public void setExpanded(ValueExpression expanded)
    {
        _expanded = expanded;
    }
    private ValueExpression _ignoreClassNames;
    
    public void setIgnoreClassNames(ValueExpression ignoreClassNames)
    {
        _ignoreClassNames = ignoreClassNames;
    }
    private ValueExpression _ioSendTransport;
    
    public void setIoSendTransport(ValueExpression ioSendTransport)
    {
        _ioSendTransport = ioSendTransport;
    }
    private ValueExpression _parseWidgets;
    
    public void setParseWidgets(ValueExpression parseWidgets)
    {
        _parseWidgets = parseWidgets;
    }
    private ValueExpression _preventBackButtonFix;
    
    public void setPreventBackButtonFix(ValueExpression preventBackButtonFix)
    {
        _preventBackButtonFix = preventBackButtonFix;
    }
    private ValueExpression _provide;
    
    public void setProvide(ValueExpression provide)
    {
        _provide = provide;
    }
    private ValueExpression _require;
    
    public void setRequire(ValueExpression require)
    {
        _require = require;
    }
    private ValueExpression _searchIds;
    
    public void setSearchIds(ValueExpression searchIds)
    {
        _searchIds = searchIds;
    }
    private ValueExpression _development;
    
    public void setDevelopment(ValueExpression development)
    {
        _development = development;
    }

    protected void setProperties(UIComponent component)
    {
        if (!(component instanceof org.apache.myfaces.custom.dojo.DojoInitializer))
        {
            throw new IllegalArgumentException("Component "+
                component.getClass().getName() +" is no org.apache.myfaces.custom.dojo.DojoInitializer");
        }
        
        org.apache.myfaces.custom.dojo.DojoInitializer comp = (org.apache.myfaces.custom.dojo.DojoInitializer) component;
        
        super.setProperties(component);
        
        FacesContext context = getFacesContext();

        if (_allowQueryConfig != null)
        {
            comp.setValueExpression("allowQueryConfig", _allowQueryConfig);
        } 
        if (_baseScriptUri != null)
        {
            comp.setValueExpression("baseScriptUri", _baseScriptUri);
        } 
        if (_bindEncoding != null)
        {
            comp.setValueExpression("bindEncoding", _bindEncoding);
        } 
        if (_debug != null)
        {
            comp.setValueExpression("debug", _debug);
        } 
        if (_debugAtAllCosts != null)
        {
            comp.setValueExpression("debugAtAllCosts", _debugAtAllCosts);
        } 
        if (_debugConsole != null)
        {
            comp.setValueExpression("debugConsole", _debugConsole);
        } 
        if (_debugContainerId != null)
        {
            comp.setValueExpression("debugContainerId", _debugContainerId);
        } 
        if (_expanded != null)
        {
            comp.setValueExpression("expanded", _expanded);
        } 
        if (_ignoreClassNames != null)
        {
            comp.setValueExpression("ignoreClassNames", _ignoreClassNames);
        } 
        if (_ioSendTransport != null)
        {
            comp.setValueExpression("ioSendTransport", _ioSendTransport);
        } 
        if (_parseWidgets != null)
        {
            comp.setValueExpression("parseWidgets", _parseWidgets);
        } 
        if (_preventBackButtonFix != null)
        {
            comp.setValueExpression("preventBackButtonFix", _preventBackButtonFix);
        } 
        if (_provide != null)
        {
            comp.setValueExpression("provide", _provide);
        } 
        if (_require != null)
        {
            comp.setValueExpression("require", _require);
        } 
        if (_searchIds != null)
        {
            comp.setValueExpression("searchIds", _searchIds);
        } 
        if (_development != null)
        {
            comp.setValueExpression("development", _development);
        } 
    }

    public void release()
    {
        super.release();
        _allowQueryConfig = null;
        _baseScriptUri = null;
        _bindEncoding = null;
        _debug = null;
        _debugAtAllCosts = null;
        _debugConsole = null;
        _debugContainerId = null;
        _expanded = null;
        _ignoreClassNames = null;
        _ioSendTransport = null;
        _parseWidgets = null;
        _preventBackButtonFix = null;
        _provide = null;
        _require = null;
        _searchIds = null;
        _development = null;
    }
}
