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
package org.apache.myfaces.custom.popup;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;


// Generated from class org.apache.myfaces.custom.popup.AbstractHtmlPopup.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlPopup extends org.apache.myfaces.custom.popup.AbstractHtmlPopup
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.Panel";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.HtmlPopup";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.Popup";


    public HtmlPopup()
    {
        setRendererType("org.apache.myfaces.Popup");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
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
    // Property: displayAtDistanceX
    private Integer _displayAtDistanceX;
    
    public Integer getDisplayAtDistanceX()
    {
        if (_displayAtDistanceX != null)
        {
            return _displayAtDistanceX;
        }
        ValueExpression vb = getValueExpression("displayAtDistanceX");
        if (vb != null)
        {
            Object value = vb == null ? null : vb.getValue(getFacesContext().getELContext());
            if (!(value instanceof Integer)){
                value = Integer.valueOf(value.toString());
            }            
            return (Integer) value;
        }
        return null;
    }

    public void setDisplayAtDistanceX(Integer displayAtDistanceX)
    {
        this._displayAtDistanceX = displayAtDistanceX;
    }
    // Property: displayAtDistanceY
    private Integer _displayAtDistanceY;
    
    public Integer getDisplayAtDistanceY()
    {
        if (_displayAtDistanceY != null)
        {
            return _displayAtDistanceY;
        }
        ValueExpression vb = getValueExpression("displayAtDistanceY");
        if (vb != null)
        {
            Object value = vb == null ? null : vb.getValue(getFacesContext().getELContext());
            if (!(value instanceof Integer)){
                value = Integer.valueOf(value.toString());
            }            
            return (Integer) value;
        }
        return null;
    }

    public void setDisplayAtDistanceY(Integer displayAtDistanceY)
    {
        this._displayAtDistanceY = displayAtDistanceY;
    }
    // Property: closePopupOnExitingElement
    private Boolean _closePopupOnExitingElement;
    
    public Boolean getClosePopupOnExitingElement()
    {
        if (_closePopupOnExitingElement != null)
        {
            return _closePopupOnExitingElement;
        }
        ValueExpression vb = getValueExpression("closePopupOnExitingElement");
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

    public void setClosePopupOnExitingElement(Boolean closePopupOnExitingElement)
    {
        this._closePopupOnExitingElement = closePopupOnExitingElement;
    }
    // Property: closePopupOnExitingPopup
    private Boolean _closePopupOnExitingPopup;
    
    public Boolean getClosePopupOnExitingPopup()
    {
        if (_closePopupOnExitingPopup != null)
        {
            return _closePopupOnExitingPopup;
        }
        ValueExpression vb = getValueExpression("closePopupOnExitingPopup");
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

    public void setClosePopupOnExitingPopup(Boolean closePopupOnExitingPopup)
    {
        this._closePopupOnExitingPopup = closePopupOnExitingPopup;
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

    public Object saveState(FacesContext facesContext)
    {
        Object[] values = new Object[23];
        values[0] = super.saveState(facesContext);
        values[1] = _style;
        values[2] = _styleClass;
        values[3] = _displayAtDistanceX;
        values[4] = _displayAtDistanceY;
        values[5] = _closePopupOnExitingElement;
        values[6] = _closePopupOnExitingPopup;
        values[7] = _layout;
        values[8] = _onclick;
        values[9] = _ondblclick;
        values[10] = _onkeydown;
        values[11] = _onkeypress;
        values[12] = _onkeyup;
        values[13] = _onmousedown;
        values[14] = _onmousemove;
        values[15] = _onmouseout;
        values[16] = _onmouseover;
        values[17] = _onmouseup;
        values[18] = _enabledOnUserRole;
        values[19] = _visibleOnUserRole;
        values[20] = _dir;
        values[21] = _lang;
        values[22] = _title;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _style = (java.lang.String) values[1];
        _styleClass = (java.lang.String) values[2];
        _displayAtDistanceX = (java.lang.Integer) values[3];
        _displayAtDistanceY = (java.lang.Integer) values[4];
        _closePopupOnExitingElement = (java.lang.Boolean) values[5];
        _closePopupOnExitingPopup = (java.lang.Boolean) values[6];
        _layout = (java.lang.String) values[7];
        _onclick = (java.lang.String) values[8];
        _ondblclick = (java.lang.String) values[9];
        _onkeydown = (java.lang.String) values[10];
        _onkeypress = (java.lang.String) values[11];
        _onkeyup = (java.lang.String) values[12];
        _onmousedown = (java.lang.String) values[13];
        _onmousemove = (java.lang.String) values[14];
        _onmouseout = (java.lang.String) values[15];
        _onmouseover = (java.lang.String) values[16];
        _onmouseup = (java.lang.String) values[17];
        _enabledOnUserRole = (java.lang.String) values[18];
        _visibleOnUserRole = (java.lang.String) values[19];
        _dir = (java.lang.String) values[20];
        _lang = (java.lang.String) values[21];
        _title = (java.lang.String) values[22];
    }
}
