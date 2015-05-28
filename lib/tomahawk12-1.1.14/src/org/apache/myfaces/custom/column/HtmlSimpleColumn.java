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
package org.apache.myfaces.custom.column;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;


// Generated from class org.apache.myfaces.custom.column.AbstractHtmlSimpleColumn.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlSimpleColumn extends org.apache.myfaces.custom.column.AbstractHtmlSimpleColumn
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.Column";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.HtmlColumn";


    public HtmlSimpleColumn()
    {
        setRendererType(null);
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: groupBy
    private boolean _groupBy;
    
    private boolean _groupBySet;
    
    public boolean isGroupBy()
    {
        if (_groupBySet)
        {
            return _groupBy;
        }
        ValueExpression vb = getValueExpression("groupBy");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return false; 
    }

    public void setGroupBy(boolean groupBy)
    {
        this._groupBy = groupBy;
        this._groupBySet = true;        
    }
    // Property: groupByValue
    private Object _groupByValue;
    
    public Object getGroupByValue()
    {
        if (_groupByValue != null)
        {
            return _groupByValue;
        }
        ValueExpression vb = getValueExpression("groupByValue");
        if (vb != null)
        {
            return  vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setGroupByValue(Object groupByValue)
    {
        this._groupByValue = groupByValue;
    }
    // Property: defaultSorted
    private boolean _defaultSorted;
    
    private boolean _defaultSortedSet;
    
    public boolean isDefaultSorted()
    {
        if (_defaultSortedSet)
        {
            return _defaultSorted;
        }
        ValueExpression vb = getValueExpression("defaultSorted");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return false; 
    }

    public void setDefaultSorted(boolean defaultSorted)
    {
        this._defaultSorted = defaultSorted;
        this._defaultSortedSet = true;        
    }
    // Property: sortable
    private boolean _sortable;
    
    private boolean _sortableSet;
    
    public boolean isSortable()
    {
        if (_sortableSet)
        {
            return _sortable;
        }
        ValueExpression vb = getValueExpression("sortable");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return false; 
    }

    public void setSortable(boolean sortable)
    {
        this._sortable = sortable;
        this._sortableSet = true;        
    }
    // Property: sortPropertyName
    private String _sortPropertyName;
    
    public String getSortPropertyName()
    {
        if (_sortPropertyName != null)
        {
            return _sortPropertyName;
        }
        ValueExpression vb = getValueExpression("sortPropertyName");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setSortPropertyName(String sortPropertyName)
    {
        this._sortPropertyName = sortPropertyName;
    }
    // Property: footerdir
    private String _footerdir;
    
    public String getFooterdir()
    {
        if (_footerdir != null)
        {
            return _footerdir;
        }
        ValueExpression vb = getValueExpression("footerdir");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setFooterdir(String footerdir)
    {
        this._footerdir = footerdir;
    }
    // Property: footerlang
    private String _footerlang;
    
    public String getFooterlang()
    {
        if (_footerlang != null)
        {
            return _footerlang;
        }
        ValueExpression vb = getValueExpression("footerlang");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setFooterlang(String footerlang)
    {
        this._footerlang = footerlang;
    }
    // Property: footeronclick
    private String _footeronclick;
    
    public String getFooteronclick()
    {
        if (_footeronclick != null)
        {
            return _footeronclick;
        }
        ValueExpression vb = getValueExpression("footeronclick");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setFooteronclick(String footeronclick)
    {
        this._footeronclick = footeronclick;
    }
    // Property: footerondblclick
    private String _footerondblclick;
    
    public String getFooterondblclick()
    {
        if (_footerondblclick != null)
        {
            return _footerondblclick;
        }
        ValueExpression vb = getValueExpression("footerondblclick");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setFooterondblclick(String footerondblclick)
    {
        this._footerondblclick = footerondblclick;
    }
    // Property: footeronkeydown
    private String _footeronkeydown;
    
    public String getFooteronkeydown()
    {
        if (_footeronkeydown != null)
        {
            return _footeronkeydown;
        }
        ValueExpression vb = getValueExpression("footeronkeydown");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setFooteronkeydown(String footeronkeydown)
    {
        this._footeronkeydown = footeronkeydown;
    }
    // Property: footeronkeypress
    private String _footeronkeypress;
    
    public String getFooteronkeypress()
    {
        if (_footeronkeypress != null)
        {
            return _footeronkeypress;
        }
        ValueExpression vb = getValueExpression("footeronkeypress");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setFooteronkeypress(String footeronkeypress)
    {
        this._footeronkeypress = footeronkeypress;
    }
    // Property: footeronkeyup
    private String _footeronkeyup;
    
    public String getFooteronkeyup()
    {
        if (_footeronkeyup != null)
        {
            return _footeronkeyup;
        }
        ValueExpression vb = getValueExpression("footeronkeyup");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setFooteronkeyup(String footeronkeyup)
    {
        this._footeronkeyup = footeronkeyup;
    }
    // Property: footeronmousedown
    private String _footeronmousedown;
    
    public String getFooteronmousedown()
    {
        if (_footeronmousedown != null)
        {
            return _footeronmousedown;
        }
        ValueExpression vb = getValueExpression("footeronmousedown");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setFooteronmousedown(String footeronmousedown)
    {
        this._footeronmousedown = footeronmousedown;
    }
    // Property: footeronmousemove
    private String _footeronmousemove;
    
    public String getFooteronmousemove()
    {
        if (_footeronmousemove != null)
        {
            return _footeronmousemove;
        }
        ValueExpression vb = getValueExpression("footeronmousemove");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setFooteronmousemove(String footeronmousemove)
    {
        this._footeronmousemove = footeronmousemove;
    }
    // Property: footeronmouseout
    private String _footeronmouseout;
    
    public String getFooteronmouseout()
    {
        if (_footeronmouseout != null)
        {
            return _footeronmouseout;
        }
        ValueExpression vb = getValueExpression("footeronmouseout");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setFooteronmouseout(String footeronmouseout)
    {
        this._footeronmouseout = footeronmouseout;
    }
    // Property: footeronmouseover
    private String _footeronmouseover;
    
    public String getFooteronmouseover()
    {
        if (_footeronmouseover != null)
        {
            return _footeronmouseover;
        }
        ValueExpression vb = getValueExpression("footeronmouseover");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setFooteronmouseover(String footeronmouseover)
    {
        this._footeronmouseover = footeronmouseover;
    }
    // Property: footeronmouseup
    private String _footeronmouseup;
    
    public String getFooteronmouseup()
    {
        if (_footeronmouseup != null)
        {
            return _footeronmouseup;
        }
        ValueExpression vb = getValueExpression("footeronmouseup");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setFooteronmouseup(String footeronmouseup)
    {
        this._footeronmouseup = footeronmouseup;
    }
    // Property: footerstyle
    private String _footerstyle;
    
    public String getFooterstyle()
    {
        if (_footerstyle != null)
        {
            return _footerstyle;
        }
        ValueExpression vb = getValueExpression("footerstyle");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setFooterstyle(String footerstyle)
    {
        this._footerstyle = footerstyle;
    }
    // Property: footerstyleClass
    private String _footerstyleClass;
    
    public String getFooterstyleClass()
    {
        if (_footerstyleClass != null)
        {
            return _footerstyleClass;
        }
        ValueExpression vb = getValueExpression("footerstyleClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setFooterstyleClass(String footerstyleClass)
    {
        this._footerstyleClass = footerstyleClass;
    }
    // Property: footertitle
    private String _footertitle;
    
    public String getFootertitle()
    {
        if (_footertitle != null)
        {
            return _footertitle;
        }
        ValueExpression vb = getValueExpression("footertitle");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setFootertitle(String footertitle)
    {
        this._footertitle = footertitle;
    }
    // Property: headerdir
    private String _headerdir;
    
    public String getHeaderdir()
    {
        if (_headerdir != null)
        {
            return _headerdir;
        }
        ValueExpression vb = getValueExpression("headerdir");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setHeaderdir(String headerdir)
    {
        this._headerdir = headerdir;
    }
    // Property: headerlang
    private String _headerlang;
    
    public String getHeaderlang()
    {
        if (_headerlang != null)
        {
            return _headerlang;
        }
        ValueExpression vb = getValueExpression("headerlang");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setHeaderlang(String headerlang)
    {
        this._headerlang = headerlang;
    }
    // Property: headeronclick
    private String _headeronclick;
    
    public String getHeaderonclick()
    {
        if (_headeronclick != null)
        {
            return _headeronclick;
        }
        ValueExpression vb = getValueExpression("headeronclick");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setHeaderonclick(String headeronclick)
    {
        this._headeronclick = headeronclick;
    }
    // Property: headerondblclick
    private String _headerondblclick;
    
    public String getHeaderondblclick()
    {
        if (_headerondblclick != null)
        {
            return _headerondblclick;
        }
        ValueExpression vb = getValueExpression("headerondblclick");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setHeaderondblclick(String headerondblclick)
    {
        this._headerondblclick = headerondblclick;
    }
    // Property: headeronkeydown
    private String _headeronkeydown;
    
    public String getHeaderonkeydown()
    {
        if (_headeronkeydown != null)
        {
            return _headeronkeydown;
        }
        ValueExpression vb = getValueExpression("headeronkeydown");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setHeaderonkeydown(String headeronkeydown)
    {
        this._headeronkeydown = headeronkeydown;
    }
    // Property: headeronkeypress
    private String _headeronkeypress;
    
    public String getHeaderonkeypress()
    {
        if (_headeronkeypress != null)
        {
            return _headeronkeypress;
        }
        ValueExpression vb = getValueExpression("headeronkeypress");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setHeaderonkeypress(String headeronkeypress)
    {
        this._headeronkeypress = headeronkeypress;
    }
    // Property: headeronkeyup
    private String _headeronkeyup;
    
    public String getHeaderonkeyup()
    {
        if (_headeronkeyup != null)
        {
            return _headeronkeyup;
        }
        ValueExpression vb = getValueExpression("headeronkeyup");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setHeaderonkeyup(String headeronkeyup)
    {
        this._headeronkeyup = headeronkeyup;
    }
    // Property: headeronmousedown
    private String _headeronmousedown;
    
    public String getHeaderonmousedown()
    {
        if (_headeronmousedown != null)
        {
            return _headeronmousedown;
        }
        ValueExpression vb = getValueExpression("headeronmousedown");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setHeaderonmousedown(String headeronmousedown)
    {
        this._headeronmousedown = headeronmousedown;
    }
    // Property: headeronmousemove
    private String _headeronmousemove;
    
    public String getHeaderonmousemove()
    {
        if (_headeronmousemove != null)
        {
            return _headeronmousemove;
        }
        ValueExpression vb = getValueExpression("headeronmousemove");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setHeaderonmousemove(String headeronmousemove)
    {
        this._headeronmousemove = headeronmousemove;
    }
    // Property: headeronmouseout
    private String _headeronmouseout;
    
    public String getHeaderonmouseout()
    {
        if (_headeronmouseout != null)
        {
            return _headeronmouseout;
        }
        ValueExpression vb = getValueExpression("headeronmouseout");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setHeaderonmouseout(String headeronmouseout)
    {
        this._headeronmouseout = headeronmouseout;
    }
    // Property: headeronmouseover
    private String _headeronmouseover;
    
    public String getHeaderonmouseover()
    {
        if (_headeronmouseover != null)
        {
            return _headeronmouseover;
        }
        ValueExpression vb = getValueExpression("headeronmouseover");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setHeaderonmouseover(String headeronmouseover)
    {
        this._headeronmouseover = headeronmouseover;
    }
    // Property: headeronmouseup
    private String _headeronmouseup;
    
    public String getHeaderonmouseup()
    {
        if (_headeronmouseup != null)
        {
            return _headeronmouseup;
        }
        ValueExpression vb = getValueExpression("headeronmouseup");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setHeaderonmouseup(String headeronmouseup)
    {
        this._headeronmouseup = headeronmouseup;
    }
    // Property: headerstyle
    private String _headerstyle;
    
    public String getHeaderstyle()
    {
        if (_headerstyle != null)
        {
            return _headerstyle;
        }
        ValueExpression vb = getValueExpression("headerstyle");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setHeaderstyle(String headerstyle)
    {
        this._headerstyle = headerstyle;
    }
    // Property: headerstyleClass
    private String _headerstyleClass;
    
    public String getHeaderstyleClass()
    {
        if (_headerstyleClass != null)
        {
            return _headerstyleClass;
        }
        ValueExpression vb = getValueExpression("headerstyleClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setHeaderstyleClass(String headerstyleClass)
    {
        this._headerstyleClass = headerstyleClass;
    }
    // Property: headertitle
    private String _headertitle;
    
    public String getHeadertitle()
    {
        if (_headertitle != null)
        {
            return _headertitle;
        }
        ValueExpression vb = getValueExpression("headertitle");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setHeadertitle(String headertitle)
    {
        this._headertitle = headertitle;
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
    // Property: colspan
    private String _colspan;
    
    public String getColspan()
    {
        if (_colspan != null)
        {
            return _colspan;
        }
        ValueExpression vb = getValueExpression("colspan");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setColspan(String colspan)
    {
        this._colspan = colspan;
    }
    // Property: headercolspan
    private String _headercolspan;
    
    public String getHeadercolspan()
    {
        if (_headercolspan != null)
        {
            return _headercolspan;
        }
        ValueExpression vb = getValueExpression("headercolspan");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setHeadercolspan(String headercolspan)
    {
        this._headercolspan = headercolspan;
    }
    // Property: footercolspan
    private String _footercolspan;
    
    public String getFootercolspan()
    {
        if (_footercolspan != null)
        {
            return _footercolspan;
        }
        ValueExpression vb = getValueExpression("footercolspan");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setFootercolspan(String footercolspan)
    {
        this._footercolspan = footercolspan;
    }
    // Property: columnId
    private String _columnId;
    
    public String getColumnId()
    {
        if (_columnId != null)
        {
            return _columnId;
        }
        ValueExpression vb = getValueExpression("columnId");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setColumnId(String columnId)
    {
        this._columnId = columnId;
    }

    public Object saveState(FacesContext facesContext)
    {
        Object[] values = new Object[59];
        values[0] = super.saveState(facesContext);
        values[1] = Boolean.valueOf(_groupBy);
        values[2] = Boolean.valueOf(_groupBySet);
        values[3] = _groupByValue;
        values[4] = Boolean.valueOf(_defaultSorted);
        values[5] = Boolean.valueOf(_defaultSortedSet);
        values[6] = Boolean.valueOf(_sortable);
        values[7] = Boolean.valueOf(_sortableSet);
        values[8] = _sortPropertyName;
        values[9] = _footerdir;
        values[10] = _footerlang;
        values[11] = _footeronclick;
        values[12] = _footerondblclick;
        values[13] = _footeronkeydown;
        values[14] = _footeronkeypress;
        values[15] = _footeronkeyup;
        values[16] = _footeronmousedown;
        values[17] = _footeronmousemove;
        values[18] = _footeronmouseout;
        values[19] = _footeronmouseover;
        values[20] = _footeronmouseup;
        values[21] = _footerstyle;
        values[22] = _footerstyleClass;
        values[23] = _footertitle;
        values[24] = _headerdir;
        values[25] = _headerlang;
        values[26] = _headeronclick;
        values[27] = _headerondblclick;
        values[28] = _headeronkeydown;
        values[29] = _headeronkeypress;
        values[30] = _headeronkeyup;
        values[31] = _headeronmousedown;
        values[32] = _headeronmousemove;
        values[33] = _headeronmouseout;
        values[34] = _headeronmouseover;
        values[35] = _headeronmouseup;
        values[36] = _headerstyle;
        values[37] = _headerstyleClass;
        values[38] = _headertitle;
        values[39] = _dir;
        values[40] = _lang;
        values[41] = _onclick;
        values[42] = _ondblclick;
        values[43] = _onkeydown;
        values[44] = _onkeypress;
        values[45] = _onkeyup;
        values[46] = _onmousedown;
        values[47] = _onmousemove;
        values[48] = _onmouseout;
        values[49] = _onmouseover;
        values[50] = _onmouseup;
        values[51] = _style;
        values[52] = _styleClass;
        values[53] = _title;
        values[54] = _width;
        values[55] = _colspan;
        values[56] = _headercolspan;
        values[57] = _footercolspan;
        values[58] = _columnId;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _groupBy = ((Boolean) values[1]).booleanValue();
        _groupBySet = ((Boolean) values[2]).booleanValue();
        _groupByValue =  values[3];
        _defaultSorted = ((Boolean) values[4]).booleanValue();
        _defaultSortedSet = ((Boolean) values[5]).booleanValue();
        _sortable = ((Boolean) values[6]).booleanValue();
        _sortableSet = ((Boolean) values[7]).booleanValue();
        _sortPropertyName = (java.lang.String) values[8];
        _footerdir = (java.lang.String) values[9];
        _footerlang = (java.lang.String) values[10];
        _footeronclick = (java.lang.String) values[11];
        _footerondblclick = (java.lang.String) values[12];
        _footeronkeydown = (java.lang.String) values[13];
        _footeronkeypress = (java.lang.String) values[14];
        _footeronkeyup = (java.lang.String) values[15];
        _footeronmousedown = (java.lang.String) values[16];
        _footeronmousemove = (java.lang.String) values[17];
        _footeronmouseout = (java.lang.String) values[18];
        _footeronmouseover = (java.lang.String) values[19];
        _footeronmouseup = (java.lang.String) values[20];
        _footerstyle = (java.lang.String) values[21];
        _footerstyleClass = (java.lang.String) values[22];
        _footertitle = (java.lang.String) values[23];
        _headerdir = (java.lang.String) values[24];
        _headerlang = (java.lang.String) values[25];
        _headeronclick = (java.lang.String) values[26];
        _headerondblclick = (java.lang.String) values[27];
        _headeronkeydown = (java.lang.String) values[28];
        _headeronkeypress = (java.lang.String) values[29];
        _headeronkeyup = (java.lang.String) values[30];
        _headeronmousedown = (java.lang.String) values[31];
        _headeronmousemove = (java.lang.String) values[32];
        _headeronmouseout = (java.lang.String) values[33];
        _headeronmouseover = (java.lang.String) values[34];
        _headeronmouseup = (java.lang.String) values[35];
        _headerstyle = (java.lang.String) values[36];
        _headerstyleClass = (java.lang.String) values[37];
        _headertitle = (java.lang.String) values[38];
        _dir = (java.lang.String) values[39];
        _lang = (java.lang.String) values[40];
        _onclick = (java.lang.String) values[41];
        _ondblclick = (java.lang.String) values[42];
        _onkeydown = (java.lang.String) values[43];
        _onkeypress = (java.lang.String) values[44];
        _onkeyup = (java.lang.String) values[45];
        _onmousedown = (java.lang.String) values[46];
        _onmousemove = (java.lang.String) values[47];
        _onmouseout = (java.lang.String) values[48];
        _onmouseover = (java.lang.String) values[49];
        _onmouseup = (java.lang.String) values[50];
        _style = (java.lang.String) values[51];
        _styleClass = (java.lang.String) values[52];
        _title = (java.lang.String) values[53];
        _width = (java.lang.String) values[54];
        _colspan = (java.lang.String) values[55];
        _headercolspan = (java.lang.String) values[56];
        _footercolspan = (java.lang.String) values[57];
        _columnId = (java.lang.String) values[58];
    }
}
