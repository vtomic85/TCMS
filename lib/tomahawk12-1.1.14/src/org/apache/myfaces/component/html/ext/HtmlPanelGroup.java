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


// Generated from class org.apache.myfaces.component.html.ext.AbstractHtmlPanelGroup.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlPanelGroup extends org.apache.myfaces.component.html.ext.AbstractHtmlPanelGroup
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.Panel";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.HtmlPanelGroup";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.Group";


    public HtmlPanelGroup()
    {
        setRendererType("org.apache.myfaces.Group");
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
        return "block"; 
    }

    public void setLayout(String layout)
    {
        this._layout = layout;
    }
    // Property: colspan
    private int _colspan;
    
    private boolean _colspanSet;
    
    public int getColspan()
    {
        if (_colspanSet)
        {
            return _colspan;
        }
        ValueExpression vb = getValueExpression("colspan");
        if (vb != null)
        {
            return ((Integer) vb.getValue(getFacesContext().getELContext())).intValue();
        }
        return Integer.MIN_VALUE; 
    }

    public void setColspan(int colspan)
    {
        this._colspan = colspan;
        this._colspanSet = true;        
    }
    // Property: onclick
    private String _onclick;
    
    public String getOnclick()
    {
        if (_onclick != null)
        {
            return _onclick;
        }
        ValueExpression vb = getValueExpression("onclick");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setOnclick(String onclick)
    {
        this._onclick = onclick;
    }
    // Property: ondblclick
    private String _ondblclick;
    
    public String getOndblclick()
    {
        if (_ondblclick != null)
        {
            return _ondblclick;
        }
        ValueExpression vb = getValueExpression("ondblclick");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setOndblclick(String ondblclick)
    {
        this._ondblclick = ondblclick;
    }
    // Property: onkeydown
    private String _onkeydown;
    
    public String getOnkeydown()
    {
        if (_onkeydown != null)
        {
            return _onkeydown;
        }
        ValueExpression vb = getValueExpression("onkeydown");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setOnkeydown(String onkeydown)
    {
        this._onkeydown = onkeydown;
    }
    // Property: onkeypress
    private String _onkeypress;
    
    public String getOnkeypress()
    {
        if (_onkeypress != null)
        {
            return _onkeypress;
        }
        ValueExpression vb = getValueExpression("onkeypress");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setOnkeypress(String onkeypress)
    {
        this._onkeypress = onkeypress;
    }
    // Property: onkeyup
    private String _onkeyup;
    
    public String getOnkeyup()
    {
        if (_onkeyup != null)
        {
            return _onkeyup;
        }
        ValueExpression vb = getValueExpression("onkeyup");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setOnkeyup(String onkeyup)
    {
        this._onkeyup = onkeyup;
    }
    // Property: onmousedown
    private String _onmousedown;
    
    public String getOnmousedown()
    {
        if (_onmousedown != null)
        {
            return _onmousedown;
        }
        ValueExpression vb = getValueExpression("onmousedown");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setOnmousedown(String onmousedown)
    {
        this._onmousedown = onmousedown;
    }
    // Property: onmousemove
    private String _onmousemove;
    
    public String getOnmousemove()
    {
        if (_onmousemove != null)
        {
            return _onmousemove;
        }
        ValueExpression vb = getValueExpression("onmousemove");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setOnmousemove(String onmousemove)
    {
        this._onmousemove = onmousemove;
    }
    // Property: onmouseout
    private String _onmouseout;
    
    public String getOnmouseout()
    {
        if (_onmouseout != null)
        {
            return _onmouseout;
        }
        ValueExpression vb = getValueExpression("onmouseout");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setOnmouseout(String onmouseout)
    {
        this._onmouseout = onmouseout;
    }
    // Property: onmouseover
    private String _onmouseover;
    
    public String getOnmouseover()
    {
        if (_onmouseover != null)
        {
            return _onmouseover;
        }
        ValueExpression vb = getValueExpression("onmouseover");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setOnmouseover(String onmouseover)
    {
        this._onmouseover = onmouseover;
    }
    // Property: onmouseup
    private String _onmouseup;
    
    public String getOnmouseup()
    {
        if (_onmouseup != null)
        {
            return _onmouseup;
        }
        ValueExpression vb = getValueExpression("onmouseup");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setOnmouseup(String onmouseup)
    {
        this._onmouseup = onmouseup;
    }
    // Property: displayValueOnly
    private Boolean _displayValueOnly;
    
    public Boolean getDisplayValueOnly()
    {
        if (_displayValueOnly != null)
        {
            return _displayValueOnly;
        }
        ValueExpression vb = getValueExpression("displayValueOnly");
        if (vb != null)
        {
            Object value = vb == null ? null : vb.getValue(getFacesContext().getELContext());
            if (!(value instanceof Boolean)){
                value = Boolean.valueOf(value.toString());
            }            
            return (Boolean) value;
        }
        return null;
    }

    public void setDisplayValueOnly(Boolean displayValueOnly)
    {
        this._displayValueOnly = displayValueOnly;
    }
    // Property: displayValueOnlyStyle
    private String _displayValueOnlyStyle;
    
    public String getDisplayValueOnlyStyle()
    {
        if (_displayValueOnlyStyle != null)
        {
            return _displayValueOnlyStyle;
        }
        ValueExpression vb = getValueExpression("displayValueOnlyStyle");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setDisplayValueOnlyStyle(String displayValueOnlyStyle)
    {
        this._displayValueOnlyStyle = displayValueOnlyStyle;
    }
    // Property: displayValueOnlyStyleClass
    private String _displayValueOnlyStyleClass;
    
    public String getDisplayValueOnlyStyleClass()
    {
        if (_displayValueOnlyStyleClass != null)
        {
            return _displayValueOnlyStyleClass;
        }
        ValueExpression vb = getValueExpression("displayValueOnlyStyleClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setDisplayValueOnlyStyleClass(String displayValueOnlyStyleClass)
    {
        this._displayValueOnlyStyleClass = displayValueOnlyStyleClass;
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
    // Property: dir
    private String _dir;
    
    public String getDir()
    {
        if (_dir != null)
        {
            return _dir;
        }
        ValueExpression vb = getValueExpression("dir");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setDir(String dir)
    {
        this._dir = dir;
    }
    // Property: lang
    private String _lang;
    
    public String getLang()
    {
        if (_lang != null)
        {
            return _lang;
        }
        ValueExpression vb = getValueExpression("lang");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setLang(String lang)
    {
        this._lang = lang;
    }
    // Property: title
    private String _title;
    
    public String getTitle()
    {
        if (_title != null)
        {
            return _title;
        }
        ValueExpression vb = getValueExpression("title");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setTitle(String title)
    {
        this._title = title;
    }

    public Object saveState(FacesContext facesContext)
    {
        Object[] values = new Object[24];
        values[0] = super.saveState(facesContext);
        values[1] = _layout;
        values[2] = Integer.valueOf(_colspan);
        values[3] = Boolean.valueOf(_colspanSet);
        values[4] = _onclick;
        values[5] = _ondblclick;
        values[6] = _onkeydown;
        values[7] = _onkeypress;
        values[8] = _onkeyup;
        values[9] = _onmousedown;
        values[10] = _onmousemove;
        values[11] = _onmouseout;
        values[12] = _onmouseover;
        values[13] = _onmouseup;
        values[14] = _displayValueOnly;
        values[15] = _displayValueOnlyStyle;
        values[16] = _displayValueOnlyStyleClass;
        values[17] = _enabledOnUserRole;
        values[18] = _visibleOnUserRole;
        values[19] = Boolean.valueOf(_forceId);
        values[20] = Boolean.valueOf(_forceIdIndex);
        values[21] = _dir;
        values[22] = _lang;
        values[23] = _title;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _layout = (java.lang.String) values[1];
        _colspan = ((Integer) values[2]).intValue();
        _colspanSet = ((Boolean) values[3]).booleanValue();
        _onclick = (java.lang.String) values[4];
        _ondblclick = (java.lang.String) values[5];
        _onkeydown = (java.lang.String) values[6];
        _onkeypress = (java.lang.String) values[7];
        _onkeyup = (java.lang.String) values[8];
        _onmousedown = (java.lang.String) values[9];
        _onmousemove = (java.lang.String) values[10];
        _onmouseout = (java.lang.String) values[11];
        _onmouseover = (java.lang.String) values[12];
        _onmouseup = (java.lang.String) values[13];
        _displayValueOnly = (java.lang.Boolean) values[14];
        _displayValueOnlyStyle = (java.lang.String) values[15];
        _displayValueOnlyStyleClass = (java.lang.String) values[16];
        _enabledOnUserRole = (java.lang.String) values[17];
        _visibleOnUserRole = (java.lang.String) values[18];
        _forceId = ((Boolean) values[19]).booleanValue();
        _forceIdIndex = ((Boolean) values[20]).booleanValue();
        _dir = (java.lang.String) values[21];
        _lang = (java.lang.String) values[22];
        _title = (java.lang.String) values[23];
    }
}
