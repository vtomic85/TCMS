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
package org.apache.myfaces.custom.radio;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;


// Generated from class org.apache.myfaces.custom.radio.AbstractHtmlRadio.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlRadio extends org.apache.myfaces.custom.radio.AbstractHtmlRadio
{

    static public final String COMPONENT_FAMILY =
        "org.apache.myfaces.Radio";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.HtmlRadio";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.Radio";


    public HtmlRadio()
    {
        setRendererType("org.apache.myfaces.Radio");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: for
    private String _for;
    
    public String getFor()
    {
        if (_for != null)
        {
            return _for;
        }
        ValueExpression vb = getValueExpression("for");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setFor(String forParam)
    {
        this._for = forParam;
    }
    // Property: index
    private int _index;
    
    private boolean _indexSet;
    
    public int getIndex()
    {
        if (_indexSet)
        {
            return _index;
        }
        ValueExpression vb = getValueExpression("index");
        if (vb != null)
        {
            return ((Integer) vb.getValue(getFacesContext().getELContext())).intValue();
        }
        return Integer.MIN_VALUE; 
    }

    public void setIndex(int index)
    {
        this._index = index;
        this._indexSet = true;        
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
    // Property: onblur
    private String _onblur;
    
    public String getOnblur()
    {
        if (_onblur != null)
        {
            return _onblur;
        }
        ValueExpression vb = getValueExpression("onblur");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setOnblur(String onblur)
    {
        this._onblur = onblur;
    }
    // Property: onfocus
    private String _onfocus;
    
    public String getOnfocus()
    {
        if (_onfocus != null)
        {
            return _onfocus;
        }
        ValueExpression vb = getValueExpression("onfocus");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setOnfocus(String onfocus)
    {
        this._onfocus = onfocus;
    }
    // Property: accesskey
    private String _accesskey;
    
    public String getAccesskey()
    {
        if (_accesskey != null)
        {
            return _accesskey;
        }
        ValueExpression vb = getValueExpression("accesskey");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setAccesskey(String accesskey)
    {
        this._accesskey = accesskey;
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
    // Property: disabledClass
    private String _disabledClass;
    
    public String getDisabledClass()
    {
        if (_disabledClass != null)
        {
            return _disabledClass;
        }
        ValueExpression vb = getValueExpression("disabledClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setDisabledClass(String disabledClass)
    {
        this._disabledClass = disabledClass;
    }
    // Property: enabledClass
    private String _enabledClass;
    
    public String getEnabledClass()
    {
        if (_enabledClass != null)
        {
            return _enabledClass;
        }
        ValueExpression vb = getValueExpression("enabledClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setEnabledClass(String enabledClass)
    {
        this._enabledClass = enabledClass;
    }
    // Property: alt
    private String _alt;
    
    public String getAlt()
    {
        if (_alt != null)
        {
            return _alt;
        }
        ValueExpression vb = getValueExpression("alt");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setAlt(String alt)
    {
        this._alt = alt;
    }
    // Property: tabindex
    private String _tabindex;
    
    public String getTabindex()
    {
        if (_tabindex != null)
        {
            return _tabindex;
        }
        ValueExpression vb = getValueExpression("tabindex");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setTabindex(String tabindex)
    {
        this._tabindex = tabindex;
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
    // Property: onchange
    private String _onchange;
    
    public String getOnchange()
    {
        if (_onchange != null)
        {
            return _onchange;
        }
        ValueExpression vb = getValueExpression("onchange");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setOnchange(String onchange)
    {
        this._onchange = onchange;
    }
    // Property: onselect
    private String _onselect;
    
    public String getOnselect()
    {
        if (_onselect != null)
        {
            return _onselect;
        }
        ValueExpression vb = getValueExpression("onselect");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setOnselect(String onselect)
    {
        this._onselect = onselect;
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
        Object[] values = new Object[31];
        values[0] = super.saveState(facesContext);
        values[1] = _for;
        values[2] = Integer.valueOf(_index);
        values[3] = Boolean.valueOf(_indexSet);
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
        values[14] = _onblur;
        values[15] = _onfocus;
        values[16] = _accesskey;
        values[17] = _enabledOnUserRole;
        values[18] = _visibleOnUserRole;
        values[19] = _disabledClass;
        values[20] = _enabledClass;
        values[21] = _alt;
        values[22] = _tabindex;
        values[23] = _dir;
        values[24] = _lang;
        values[25] = _title;
        values[26] = _onchange;
        values[27] = _onselect;
        values[28] = _style;
        values[29] = _styleClass;
        values[30] = _align;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _for = (java.lang.String) values[1];
        _index = ((Integer) values[2]).intValue();
        _indexSet = ((Boolean) values[3]).booleanValue();
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
        _onblur = (java.lang.String) values[14];
        _onfocus = (java.lang.String) values[15];
        _accesskey = (java.lang.String) values[16];
        _enabledOnUserRole = (java.lang.String) values[17];
        _visibleOnUserRole = (java.lang.String) values[18];
        _disabledClass = (java.lang.String) values[19];
        _enabledClass = (java.lang.String) values[20];
        _alt = (java.lang.String) values[21];
        _tabindex = (java.lang.String) values[22];
        _dir = (java.lang.String) values[23];
        _lang = (java.lang.String) values[24];
        _title = (java.lang.String) values[25];
        _onchange = (java.lang.String) values[26];
        _onselect = (java.lang.String) values[27];
        _style = (java.lang.String) values[28];
        _styleClass = (java.lang.String) values[29];
        _align = (java.lang.String) values[30];
    }
}
