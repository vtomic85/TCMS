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
package org.apache.myfaces.custom.navmenu.htmlnavmenu;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;


// Generated from class org.apache.myfaces.custom.navmenu.htmlnavmenu.AbstractHtmlPanelNavigationMenu.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlPanelNavigationMenu extends org.apache.myfaces.custom.navmenu.htmlnavmenu.AbstractHtmlPanelNavigationMenu
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.Panel";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.HtmlPanelNavigationMenu";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.NavigationMenu";


    public HtmlPanelNavigationMenu()
    {
        setRendererType("org.apache.myfaces.NavigationMenu");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: itemClass
    private String _itemClass;
    
    public String getItemClass()
    {
        if (_itemClass != null)
        {
            return _itemClass;
        }
        ValueExpression vb = getValueExpression("itemClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setItemClass(String itemClass)
    {
        this._itemClass = itemClass;
    }
    // Property: openItemClass
    private String _openItemClass;
    
    public String getOpenItemClass()
    {
        if (_openItemClass != null)
        {
            return _openItemClass;
        }
        ValueExpression vb = getValueExpression("openItemClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setOpenItemClass(String openItemClass)
    {
        this._openItemClass = openItemClass;
    }
    // Property: activeItemClass
    private String _activeItemClass;
    
    public String getActiveItemClass()
    {
        if (_activeItemClass != null)
        {
            return _activeItemClass;
        }
        ValueExpression vb = getValueExpression("activeItemClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setActiveItemClass(String activeItemClass)
    {
        this._activeItemClass = activeItemClass;
    }
    // Property: separatorClass
    private String _separatorClass;
    
    public String getSeparatorClass()
    {
        if (_separatorClass != null)
        {
            return _separatorClass;
        }
        ValueExpression vb = getValueExpression("separatorClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setSeparatorClass(String separatorClass)
    {
        this._separatorClass = separatorClass;
    }
    // Property: itemStyle
    private String _itemStyle;
    
    public String getItemStyle()
    {
        if (_itemStyle != null)
        {
            return _itemStyle;
        }
        ValueExpression vb = getValueExpression("itemStyle");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setItemStyle(String itemStyle)
    {
        this._itemStyle = itemStyle;
    }
    // Property: openItemStyle
    private String _openItemStyle;
    
    public String getOpenItemStyle()
    {
        if (_openItemStyle != null)
        {
            return _openItemStyle;
        }
        ValueExpression vb = getValueExpression("openItemStyle");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setOpenItemStyle(String openItemStyle)
    {
        this._openItemStyle = openItemStyle;
    }
    // Property: activeItemStyle
    private String _activeItemStyle;
    
    public String getActiveItemStyle()
    {
        if (_activeItemStyle != null)
        {
            return _activeItemStyle;
        }
        ValueExpression vb = getValueExpression("activeItemStyle");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setActiveItemStyle(String activeItemStyle)
    {
        this._activeItemStyle = activeItemStyle;
    }
    // Property: separatorStyle
    private String _separatorStyle;
    
    public String getSeparatorStyle()
    {
        if (_separatorStyle != null)
        {
            return _separatorStyle;
        }
        ValueExpression vb = getValueExpression("separatorStyle");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setSeparatorStyle(String separatorStyle)
    {
        this._separatorStyle = separatorStyle;
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
    // Property: preprocessed
    private Boolean _preprocessed  = Boolean.valueOf(false);
     
    public Boolean getPreprocessed()
    {
        return _preprocessed;
    }

    public void setPreprocessed(Boolean preprocessed)
    {
        this._preprocessed = preprocessed;
    }
    // Property: expandAll
    private boolean _expandAll;
    
    private boolean _expandAllSet;
    
    public boolean isExpandAll()
    {
        if (_expandAllSet)
        {
            return _expandAll;
        }
        ValueExpression vb = getValueExpression("expandAll");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return false; 
    }

    public void setExpandAll(boolean expandAll)
    {
        this._expandAll = expandAll;
        this._expandAllSet = true;        
    }
    // Property: renderAll
    private boolean _renderAll;
    
    private boolean _renderAllSet;
    
    public boolean isRenderAll()
    {
        if (_renderAllSet)
        {
            return _renderAll;
        }
        ValueExpression vb = getValueExpression("renderAll");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return false; 
    }

    public void setRenderAll(boolean renderAll)
    {
        this._renderAll = renderAll;
        this._renderAllSet = true;        
    }
    // Property: disabled
    private boolean _disabled;
    
    private boolean _disabledSet;
    
    public boolean isDisabled()
    {
        if (_disabledSet)
        {
            return _disabled;
        }
        ValueExpression vb = getValueExpression("disabled");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return false; 
    }

    public void setDisabled(boolean disabled)
    {
        this._disabled = disabled;
        this._disabledSet = true;        
    }
    // Property: disabledStyle
    private String _disabledStyle;
    
    public String getDisabledStyle()
    {
        if (_disabledStyle != null)
        {
            return _disabledStyle;
        }
        ValueExpression vb = getValueExpression("disabledStyle");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setDisabledStyle(String disabledStyle)
    {
        this._disabledStyle = disabledStyle;
    }
    // Property: disabledStyleClass
    private String _disabledStyleClass;
    
    public String getDisabledStyleClass()
    {
        if (_disabledStyleClass != null)
        {
            return _disabledStyleClass;
        }
        ValueExpression vb = getValueExpression("disabledStyleClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setDisabledStyleClass(String disabledStyleClass)
    {
        this._disabledStyleClass = disabledStyleClass;
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
        Object[] values = new Object[45];
        values[0] = super.saveState(facesContext);
        values[1] = _itemClass;
        values[2] = _openItemClass;
        values[3] = _activeItemClass;
        values[4] = _separatorClass;
        values[5] = _itemStyle;
        values[6] = _openItemStyle;
        values[7] = _activeItemStyle;
        values[8] = _separatorStyle;
        values[9] = _layout;
        values[10] = _preprocessed;
        values[11] = Boolean.valueOf(_expandAll);
        values[12] = Boolean.valueOf(_expandAllSet);
        values[13] = Boolean.valueOf(_renderAll);
        values[14] = Boolean.valueOf(_renderAllSet);
        values[15] = Boolean.valueOf(_disabled);
        values[16] = Boolean.valueOf(_disabledSet);
        values[17] = _disabledStyle;
        values[18] = _disabledStyleClass;
        values[19] = _onclick;
        values[20] = _ondblclick;
        values[21] = _onkeydown;
        values[22] = _onkeypress;
        values[23] = _onkeyup;
        values[24] = _onmousedown;
        values[25] = _onmousemove;
        values[26] = _onmouseout;
        values[27] = _onmouseover;
        values[28] = _onmouseup;
        values[29] = _dir;
        values[30] = _lang;
        values[31] = _title;
        values[32] = _datafld;
        values[33] = _datasrc;
        values[34] = _dataformatas;
        values[35] = _bgcolor;
        values[36] = Integer.valueOf(_border);
        values[37] = Boolean.valueOf(_borderSet);
        values[38] = _cellpadding;
        values[39] = _cellspacing;
        values[40] = _frame;
        values[41] = _rules;
        values[42] = _summary;
        values[43] = _width;
        values[44] = _align;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _itemClass = (java.lang.String) values[1];
        _openItemClass = (java.lang.String) values[2];
        _activeItemClass = (java.lang.String) values[3];
        _separatorClass = (java.lang.String) values[4];
        _itemStyle = (java.lang.String) values[5];
        _openItemStyle = (java.lang.String) values[6];
        _activeItemStyle = (java.lang.String) values[7];
        _separatorStyle = (java.lang.String) values[8];
        _layout = (java.lang.String) values[9];
        _preprocessed = (java.lang.Boolean) values[10];
        _expandAll = ((Boolean) values[11]).booleanValue();
        _expandAllSet = ((Boolean) values[12]).booleanValue();
        _renderAll = ((Boolean) values[13]).booleanValue();
        _renderAllSet = ((Boolean) values[14]).booleanValue();
        _disabled = ((Boolean) values[15]).booleanValue();
        _disabledSet = ((Boolean) values[16]).booleanValue();
        _disabledStyle = (java.lang.String) values[17];
        _disabledStyleClass = (java.lang.String) values[18];
        _onclick = (java.lang.String) values[19];
        _ondblclick = (java.lang.String) values[20];
        _onkeydown = (java.lang.String) values[21];
        _onkeypress = (java.lang.String) values[22];
        _onkeyup = (java.lang.String) values[23];
        _onmousedown = (java.lang.String) values[24];
        _onmousemove = (java.lang.String) values[25];
        _onmouseout = (java.lang.String) values[26];
        _onmouseover = (java.lang.String) values[27];
        _onmouseup = (java.lang.String) values[28];
        _dir = (java.lang.String) values[29];
        _lang = (java.lang.String) values[30];
        _title = (java.lang.String) values[31];
        _datafld = (java.lang.String) values[32];
        _datasrc = (java.lang.String) values[33];
        _dataformatas = (java.lang.String) values[34];
        _bgcolor = (java.lang.String) values[35];
        _border = ((Integer) values[36]).intValue();
        _borderSet = ((Boolean) values[37]).booleanValue();
        _cellpadding = (java.lang.String) values[38];
        _cellspacing = (java.lang.String) values[39];
        _frame = (java.lang.String) values[40];
        _rules = (java.lang.String) values[41];
        _summary = (java.lang.String) values[42];
        _width = (java.lang.String) values[43];
        _align = (java.lang.String) values[44];
    }
}
