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
package org.apache.myfaces.custom.tree2;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;


// Generated from class org.apache.myfaces.custom.tree2.AbstractHtmlTree.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlTree extends org.apache.myfaces.custom.tree2.AbstractHtmlTree
{

    static public final String COMPONENT_FAMILY =
        "org.apache.myfaces.HtmlTree2";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.HtmlTree2";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.HtmlTree2";


    public HtmlTree()
    {
        setRendererType("org.apache.myfaces.HtmlTree2");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: showNav
    private boolean _showNav;
    
    private boolean _showNavSet;
    
    public boolean isShowNav()
    {
        if (_showNavSet)
        {
            return _showNav;
        }
        ValueExpression vb = getValueExpression("showNav");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return true; 
    }

    public void setShowNav(boolean showNav)
    {
        this._showNav = showNav;
        this._showNavSet = true;        
    }
    // Property: showLines
    private boolean _showLines;
    
    private boolean _showLinesSet;
    
    public boolean isShowLines()
    {
        if (_showLinesSet)
        {
            return _showLines;
        }
        ValueExpression vb = getValueExpression("showLines");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return true; 
    }

    public void setShowLines(boolean showLines)
    {
        this._showLines = showLines;
        this._showLinesSet = true;        
    }
    // Property: showRootNode
    private boolean _showRootNode;
    
    private boolean _showRootNodeSet;
    
    public boolean isShowRootNode()
    {
        if (_showRootNodeSet)
        {
            return _showRootNode;
        }
        ValueExpression vb = getValueExpression("showRootNode");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return true; 
    }

    public void setShowRootNode(boolean showRootNode)
    {
        this._showRootNode = showRootNode;
        this._showRootNodeSet = true;        
    }
    // Property: preserveToggle
    private boolean _preserveToggle;
    
    private boolean _preserveToggleSet;
    
    public boolean isPreserveToggle()
    {
        if (_preserveToggleSet)
        {
            return _preserveToggle;
        }
        ValueExpression vb = getValueExpression("preserveToggle");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return true; 
    }

    public void setPreserveToggle(boolean preserveToggle)
    {
        this._preserveToggle = preserveToggle;
        this._preserveToggleSet = true;        
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
        Object[] values = new Object[12];
        values[0] = super.saveState(facesContext);
        values[1] = Boolean.valueOf(_showNav);
        values[2] = Boolean.valueOf(_showNavSet);
        values[3] = Boolean.valueOf(_showLines);
        values[4] = Boolean.valueOf(_showLinesSet);
        values[5] = Boolean.valueOf(_showRootNode);
        values[6] = Boolean.valueOf(_showRootNodeSet);
        values[7] = Boolean.valueOf(_preserveToggle);
        values[8] = Boolean.valueOf(_preserveToggleSet);
        values[9] = _javascriptLocation;
        values[10] = _imageLocation;
        values[11] = _styleLocation;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _showNav = ((Boolean) values[1]).booleanValue();
        _showNavSet = ((Boolean) values[2]).booleanValue();
        _showLines = ((Boolean) values[3]).booleanValue();
        _showLinesSet = ((Boolean) values[4]).booleanValue();
        _showRootNode = ((Boolean) values[5]).booleanValue();
        _showRootNodeSet = ((Boolean) values[6]).booleanValue();
        _preserveToggle = ((Boolean) values[7]).booleanValue();
        _preserveToggleSet = ((Boolean) values[8]).booleanValue();
        _javascriptLocation = (java.lang.String) values[9];
        _imageLocation = (java.lang.String) values[10];
        _styleLocation = (java.lang.String) values[11];
    }
}
