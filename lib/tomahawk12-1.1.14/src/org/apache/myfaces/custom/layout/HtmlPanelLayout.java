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
package org.apache.myfaces.custom.layout;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;


// Generated from class org.apache.myfaces.custom.layout.AbstractHtmlPanelLayout.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlPanelLayout extends org.apache.myfaces.custom.layout.AbstractHtmlPanelLayout
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.Panel";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.HtmlPanelLayout";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.Layout";


    public HtmlPanelLayout()
    {
        setRendererType("org.apache.myfaces.Layout");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: footerClass
    private String _footerClass;
    
    public String getFooterClass()
    {
        if (_footerClass != null)
        {
            return _footerClass;
        }
        ValueExpression vb = getValueExpression("footerClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setFooterClass(String footerClass)
    {
        this._footerClass = footerClass;
    }
    // Property: headerClass
    private String _headerClass;
    
    public String getHeaderClass()
    {
        if (_headerClass != null)
        {
            return _headerClass;
        }
        ValueExpression vb = getValueExpression("headerClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setHeaderClass(String headerClass)
    {
        this._headerClass = headerClass;
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
        return "classic"; 
    }

    public void setLayout(String layout)
    {
        this._layout = layout;
    }
    // Property: navigationClass
    private String _navigationClass;
    
    public String getNavigationClass()
    {
        if (_navigationClass != null)
        {
            return _navigationClass;
        }
        ValueExpression vb = getValueExpression("navigationClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setNavigationClass(String navigationClass)
    {
        this._navigationClass = navigationClass;
    }
    // Property: bodyClass
    private String _bodyClass;
    
    public String getBodyClass()
    {
        if (_bodyClass != null)
        {
            return _bodyClass;
        }
        ValueExpression vb = getValueExpression("bodyClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setBodyClass(String bodyClass)
    {
        this._bodyClass = bodyClass;
    }
    // Property: headerStyle
    private String _headerStyle;
    
    public String getHeaderStyle()
    {
        if (_headerStyle != null)
        {
            return _headerStyle;
        }
        ValueExpression vb = getValueExpression("headerStyle");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setHeaderStyle(String headerStyle)
    {
        this._headerStyle = headerStyle;
    }
    // Property: navigationStyle
    private String _navigationStyle;
    
    public String getNavigationStyle()
    {
        if (_navigationStyle != null)
        {
            return _navigationStyle;
        }
        ValueExpression vb = getValueExpression("navigationStyle");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setNavigationStyle(String navigationStyle)
    {
        this._navigationStyle = navigationStyle;
    }
    // Property: bodyStyle
    private String _bodyStyle;
    
    public String getBodyStyle()
    {
        if (_bodyStyle != null)
        {
            return _bodyStyle;
        }
        ValueExpression vb = getValueExpression("bodyStyle");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setBodyStyle(String bodyStyle)
    {
        this._bodyStyle = bodyStyle;
    }
    // Property: footerStyle
    private String _footerStyle;
    
    public String getFooterStyle()
    {
        if (_footerStyle != null)
        {
            return _footerStyle;
        }
        ValueExpression vb = getValueExpression("footerStyle");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setFooterStyle(String footerStyle)
    {
        this._footerStyle = footerStyle;
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
    // Property: datafld
    private String _datafld;
    
    public String getDatafld()
    {
        if (_datafld != null)
        {
            return _datafld;
        }
        ValueExpression vb = getValueExpression("datafld");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setDatafld(String datafld)
    {
        this._datafld = datafld;
    }
    // Property: datasrc
    private String _datasrc;
    
    public String getDatasrc()
    {
        if (_datasrc != null)
        {
            return _datasrc;
        }
        ValueExpression vb = getValueExpression("datasrc");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setDatasrc(String datasrc)
    {
        this._datasrc = datasrc;
    }
    // Property: dataformatas
    private String _dataformatas;
    
    public String getDataformatas()
    {
        if (_dataformatas != null)
        {
            return _dataformatas;
        }
        ValueExpression vb = getValueExpression("dataformatas");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setDataformatas(String dataformatas)
    {
        this._dataformatas = dataformatas;
    }
    // Property: bgcolor
    private String _bgcolor;
    
    public String getBgcolor()
    {
        if (_bgcolor != null)
        {
            return _bgcolor;
        }
        ValueExpression vb = getValueExpression("bgcolor");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setBgcolor(String bgcolor)
    {
        this._bgcolor = bgcolor;
    }
    // Property: border
    private int _border;
    
    private boolean _borderSet;
    
    public int getBorder()
    {
        if (_borderSet)
        {
            return _border;
        }
        ValueExpression vb = getValueExpression("border");
        if (vb != null)
        {
            return ((Integer) vb.getValue(getFacesContext().getELContext())).intValue();
        }
        return Integer.MIN_VALUE; 
    }

    public void setBorder(int border)
    {
        this._border = border;
        this._borderSet = true;        
    }
    // Property: cellpadding
    private String _cellpadding;
    
    public String getCellpadding()
    {
        if (_cellpadding != null)
        {
            return _cellpadding;
        }
        ValueExpression vb = getValueExpression("cellpadding");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setCellpadding(String cellpadding)
    {
        this._cellpadding = cellpadding;
    }
    // Property: cellspacing
    private String _cellspacing;
    
    public String getCellspacing()
    {
        if (_cellspacing != null)
        {
            return _cellspacing;
        }
        ValueExpression vb = getValueExpression("cellspacing");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setCellspacing(String cellspacing)
    {
        this._cellspacing = cellspacing;
    }
    // Property: frame
    private String _frame;
    
    public String getFrame()
    {
        if (_frame != null)
        {
            return _frame;
        }
        ValueExpression vb = getValueExpression("frame");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setFrame(String frame)
    {
        this._frame = frame;
    }
    // Property: rules
    private String _rules;
    
    public String getRules()
    {
        if (_rules != null)
        {
            return _rules;
        }
        ValueExpression vb = getValueExpression("rules");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setRules(String rules)
    {
        this._rules = rules;
    }
    // Property: summary
    private String _summary;
    
    public String getSummary()
    {
        if (_summary != null)
        {
            return _summary;
        }
        ValueExpression vb = getValueExpression("summary");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setSummary(String summary)
    {
        this._summary = summary;
    }
    // Property: width
    private String _width;
    
    public String getWidth()
    {
        if (_width != null)
        {
            return _width;
        }
        ValueExpression vb = getValueExpression("width");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setWidth(String width)
    {
        this._width = width;
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
        Object[] values = new Object[36];
        values[0] = super.saveState(facesContext);
        values[1] = _footerClass;
        values[2] = _headerClass;
        values[3] = _layout;
        values[4] = _navigationClass;
        values[5] = _bodyClass;
        values[6] = _headerStyle;
        values[7] = _navigationStyle;
        values[8] = _bodyStyle;
        values[9] = _footerStyle;
        values[10] = _onclick;
        values[11] = _ondblclick;
        values[12] = _onkeydown;
        values[13] = _onkeypress;
        values[14] = _onkeyup;
        values[15] = _onmousedown;
        values[16] = _onmousemove;
        values[17] = _onmouseout;
        values[18] = _onmouseover;
        values[19] = _onmouseup;
        values[20] = _dir;
        values[21] = _lang;
        values[22] = _title;
        values[23] = _datafld;
        values[24] = _datasrc;
        values[25] = _dataformatas;
        values[26] = _bgcolor;
        values[27] = Integer.valueOf(_border);
        values[28] = Boolean.valueOf(_borderSet);
        values[29] = _cellpadding;
        values[30] = _cellspacing;
        values[31] = _frame;
        values[32] = _rules;
        values[33] = _summary;
        values[34] = _width;
        values[35] = _align;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _footerClass = (java.lang.String) values[1];
        _headerClass = (java.lang.String) values[2];
        _layout = (java.lang.String) values[3];
        _navigationClass = (java.lang.String) values[4];
        _bodyClass = (java.lang.String) values[5];
        _headerStyle = (java.lang.String) values[6];
        _navigationStyle = (java.lang.String) values[7];
        _bodyStyle = (java.lang.String) values[8];
        _footerStyle = (java.lang.String) values[9];
        _onclick = (java.lang.String) values[10];
        _ondblclick = (java.lang.String) values[11];
        _onkeydown = (java.lang.String) values[12];
        _onkeypress = (java.lang.String) values[13];
        _onkeyup = (java.lang.String) values[14];
        _onmousedown = (java.lang.String) values[15];
        _onmousemove = (java.lang.String) values[16];
        _onmouseout = (java.lang.String) values[17];
        _onmouseover = (java.lang.String) values[18];
        _onmouseup = (java.lang.String) values[19];
        _dir = (java.lang.String) values[20];
        _lang = (java.lang.String) values[21];
        _title = (java.lang.String) values[22];
        _datafld = (java.lang.String) values[23];
        _datasrc = (java.lang.String) values[24];
        _dataformatas = (java.lang.String) values[25];
        _bgcolor = (java.lang.String) values[26];
        _border = ((Integer) values[27]).intValue();
        _borderSet = ((Boolean) values[28]).booleanValue();
        _cellpadding = (java.lang.String) values[29];
        _cellspacing = (java.lang.String) values[30];
        _frame = (java.lang.String) values[31];
        _rules = (java.lang.String) values[32];
        _summary = (java.lang.String) values[33];
        _width = (java.lang.String) values[34];
        _align = (java.lang.String) values[35];
    }
}
