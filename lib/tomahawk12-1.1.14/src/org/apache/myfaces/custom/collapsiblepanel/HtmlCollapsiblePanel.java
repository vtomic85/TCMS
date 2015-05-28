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
package org.apache.myfaces.custom.collapsiblepanel;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;
import javax.faces.convert.Converter;
import javax.faces.el.MethodBinding;


// Generated from class org.apache.myfaces.custom.collapsiblepanel.AbstractHtmlCollapsiblePanel.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlCollapsiblePanel extends org.apache.myfaces.custom.collapsiblepanel.AbstractHtmlCollapsiblePanel
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.Panel";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.HtmlCollapsiblePanel";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.CollapsiblePanel";


    public HtmlCollapsiblePanel()
    {
        setRendererType("org.apache.myfaces.CollapsiblePanel");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: var
    private String _var;
    
    public String getVar()
    {
        if (_var != null)
        {
            return _var;
        }
        ValueExpression vb = getValueExpression("var");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setVar(String var)
    {
        this._var = var;
    }
    // Property: titleVar
    private String _titleVar;
    
    public String getTitleVar()
    {
        if (_titleVar != null)
        {
            return _titleVar;
        }
        ValueExpression vb = getValueExpression("titleVar");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setTitleVar(String titleVar)
    {
        this._titleVar = titleVar;
    }
    // Property: indicatorStyleClass
    private String _indicatorStyleClass;
    
    public String getIndicatorStyleClass()
    {
        if (_indicatorStyleClass != null)
        {
            return _indicatorStyleClass;
        }
        ValueExpression vb = getValueExpression("indicatorStyleClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setIndicatorStyleClass(String indicatorStyleClass)
    {
        this._indicatorStyleClass = indicatorStyleClass;
    }
    // Property: indicatorStyle
    private String _indicatorStyle;
    
    public String getIndicatorStyle()
    {
        if (_indicatorStyle != null)
        {
            return _indicatorStyle;
        }
        ValueExpression vb = getValueExpression("indicatorStyle");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setIndicatorStyle(String indicatorStyle)
    {
        this._indicatorStyle = indicatorStyle;
    }
    // Property: titleStyleClass
    private String _titleStyleClass;
    
    public String getTitleStyleClass()
    {
        if (_titleStyleClass != null)
        {
            return _titleStyleClass;
        }
        ValueExpression vb = getValueExpression("titleStyleClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setTitleStyleClass(String titleStyleClass)
    {
        this._titleStyleClass = titleStyleClass;
    }
    // Property: titleStyle
    private String _titleStyle;
    
    public String getTitleStyle()
    {
        if (_titleStyle != null)
        {
            return _titleStyle;
        }
        ValueExpression vb = getValueExpression("titleStyle");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setTitleStyle(String titleStyle)
    {
        this._titleStyle = titleStyle;
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
    // Property: style
    private String _style;
    
    public String getStyle()
    {
        if (_style != null)
        {
            return _style;
        }
        ValueExpression vb = getValueExpression("style");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setStyle(String style)
    {
        this._style = style;
    }
    // Property: styleClass
    private String _styleClass;
    
    public String getStyleClass()
    {
        if (_styleClass != null)
        {
            return _styleClass;
        }
        ValueExpression vb = getValueExpression("styleClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setStyleClass(String styleClass)
    {
        this._styleClass = styleClass;
    }

    public Object saveState(FacesContext facesContext)
    {
        Object[] values = new Object[24];
        values[0] = super.saveState(facesContext);
        values[1] = _var;
        values[2] = _titleVar;
        values[3] = _indicatorStyleClass;
        values[4] = _indicatorStyle;
        values[5] = _titleStyleClass;
        values[6] = _titleStyle;
        values[7] = _onclick;
        values[8] = _ondblclick;
        values[9] = _onkeydown;
        values[10] = _onkeypress;
        values[11] = _onkeyup;
        values[12] = _onmousedown;
        values[13] = _onmousemove;
        values[14] = _onmouseout;
        values[15] = _onmouseover;
        values[16] = _onmouseup;
        values[17] = _enabledOnUserRole;
        values[18] = _visibleOnUserRole;
        values[19] = _dir;
        values[20] = _lang;
        values[21] = _title;
        values[22] = _style;
        values[23] = _styleClass;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _var = (java.lang.String) values[1];
        _titleVar = (java.lang.String) values[2];
        _indicatorStyleClass = (java.lang.String) values[3];
        _indicatorStyle = (java.lang.String) values[4];
        _titleStyleClass = (java.lang.String) values[5];
        _titleStyle = (java.lang.String) values[6];
        _onclick = (java.lang.String) values[7];
        _ondblclick = (java.lang.String) values[8];
        _onkeydown = (java.lang.String) values[9];
        _onkeypress = (java.lang.String) values[10];
        _onkeyup = (java.lang.String) values[11];
        _onmousedown = (java.lang.String) values[12];
        _onmousemove = (java.lang.String) values[13];
        _onmouseout = (java.lang.String) values[14];
        _onmouseover = (java.lang.String) values[15];
        _onmouseup = (java.lang.String) values[16];
        _enabledOnUserRole = (java.lang.String) values[17];
        _visibleOnUserRole = (java.lang.String) values[18];
        _dir = (java.lang.String) values[19];
        _lang = (java.lang.String) values[20];
        _title = (java.lang.String) values[21];
        _style = (java.lang.String) values[22];
        _styleClass = (java.lang.String) values[23];
    }
}
