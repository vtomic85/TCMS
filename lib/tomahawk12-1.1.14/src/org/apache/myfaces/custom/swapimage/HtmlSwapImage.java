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
package org.apache.myfaces.custom.swapimage;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;


// Generated from class org.apache.myfaces.custom.swapimage.AbstractHtmlSwapImage.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlSwapImage extends org.apache.myfaces.custom.swapimage.AbstractHtmlSwapImage
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.Graphic";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.HtmlSwapImage";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.SwapImage";


    public HtmlSwapImage()
    {
        setRendererType("org.apache.myfaces.SwapImage");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: border
    private String _border;
    
    public String getBorder()
    {
        if (_border != null)
        {
            return _border;
        }
        ValueExpression vb = getValueExpression("border");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return "Integer.MIN_VALUE"; 
    }

    public void setBorder(String border)
    {
        this._border = border;
    }
    // Property: hspace
    private String _hspace;
    
    public String getHspace()
    {
        if (_hspace != null)
        {
            return _hspace;
        }
        ValueExpression vb = getValueExpression("hspace");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setHspace(String hspace)
    {
        this._hspace = hspace;
    }
    // Property: vspace
    private String _vspace;
    
    public String getVspace()
    {
        if (_vspace != null)
        {
            return _vspace;
        }
        ValueExpression vb = getValueExpression("vspace");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setVspace(String vspace)
    {
        this._vspace = vspace;
    }
    // Property: swapImageUrl
    private String _swapImageUrl;
    
    public String getSwapImageUrl()
    {
        if (_swapImageUrl != null)
        {
            return _swapImageUrl;
        }
        ValueExpression vb = getValueExpression("swapImageUrl");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setSwapImageUrl(String swapImageUrl)
    {
        this._swapImageUrl = swapImageUrl;
    }
    // Property: activeImageUrl
    private String _activeImageUrl;
    
    public String getActiveImageUrl()
    {
        if (_activeImageUrl != null)
        {
            return _activeImageUrl;
        }
        ValueExpression vb = getValueExpression("activeImageUrl");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setActiveImageUrl(String activeImageUrl)
    {
        this._activeImageUrl = activeImageUrl;
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
    // Property: height
    private String _height;
    
    public String getHeight()
    {
        if (_height != null)
        {
            return _height;
        }
        ValueExpression vb = getValueExpression("height");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setHeight(String height)
    {
        this._height = height;
    }
    // Property: ismap
    private boolean _ismap;
    
    private boolean _ismapSet;
    
    public boolean isIsmap()
    {
        if (_ismapSet)
        {
            return _ismap;
        }
        ValueExpression vb = getValueExpression("ismap");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return false; 
    }

    public void setIsmap(boolean ismap)
    {
        this._ismap = ismap;
        this._ismapSet = true;        
    }
    // Property: longdesc
    private String _longdesc;
    
    public String getLongdesc()
    {
        if (_longdesc != null)
        {
            return _longdesc;
        }
        ValueExpression vb = getValueExpression("longdesc");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setLongdesc(String longdesc)
    {
        this._longdesc = longdesc;
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
    // Property: usemap
    private String _usemap;
    
    public String getUsemap()
    {
        if (_usemap != null)
        {
            return _usemap;
        }
        ValueExpression vb = getValueExpression("usemap");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setUsemap(String usemap)
    {
        this._usemap = usemap;
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
        Object[] values = new Object[24];
        values[0] = super.saveState(facesContext);
        values[1] = _border;
        values[2] = _hspace;
        values[3] = _vspace;
        values[4] = _swapImageUrl;
        values[5] = _activeImageUrl;
        values[6] = _alt;
        values[7] = _height;
        values[8] = Boolean.valueOf(_ismap);
        values[9] = Boolean.valueOf(_ismapSet);
        values[10] = _longdesc;
        values[11] = _onclick;
        values[12] = _ondblclick;
        values[13] = _onkeydown;
        values[14] = _onkeypress;
        values[15] = _onkeyup;
        values[16] = _usemap;
        values[17] = _width;
        values[18] = _dir;
        values[19] = _lang;
        values[20] = _title;
        values[21] = _style;
        values[22] = _styleClass;
        values[23] = _align;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _border = (java.lang.String) values[1];
        _hspace = (java.lang.String) values[2];
        _vspace = (java.lang.String) values[3];
        _swapImageUrl = (java.lang.String) values[4];
        _activeImageUrl = (java.lang.String) values[5];
        _alt = (java.lang.String) values[6];
        _height = (java.lang.String) values[7];
        _ismap = ((Boolean) values[8]).booleanValue();
        _ismapSet = ((Boolean) values[9]).booleanValue();
        _longdesc = (java.lang.String) values[10];
        _onclick = (java.lang.String) values[11];
        _ondblclick = (java.lang.String) values[12];
        _onkeydown = (java.lang.String) values[13];
        _onkeypress = (java.lang.String) values[14];
        _onkeyup = (java.lang.String) values[15];
        _usemap = (java.lang.String) values[16];
        _width = (java.lang.String) values[17];
        _dir = (java.lang.String) values[18];
        _lang = (java.lang.String) values[19];
        _title = (java.lang.String) values[20];
        _style = (java.lang.String) values[21];
        _styleClass = (java.lang.String) values[22];
        _align = (java.lang.String) values[23];
    }
}
