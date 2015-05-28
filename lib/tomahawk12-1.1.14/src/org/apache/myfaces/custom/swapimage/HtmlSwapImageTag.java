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
package org.apache.myfaces.custom.swapimage;

import javax.faces.component.UIComponent;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;


// Generated from class org.apache.myfaces.custom.swapimage.AbstractHtmlSwapImage.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlSwapImageTag
    extends javax.faces.webapp.UIComponentELTag
{
    public HtmlSwapImageTag()
    {    
    }
    
    public String getComponentType()
    {
        return "org.apache.myfaces.HtmlSwapImage";
    }

    public String getRendererType()
    {
        return "org.apache.myfaces.SwapImage";
    }

    private ValueExpression _border;
    
    public void setBorder(ValueExpression border)
    {
        _border = border;
    }
    private ValueExpression _hspace;
    
    public void setHspace(ValueExpression hspace)
    {
        _hspace = hspace;
    }
    private ValueExpression _vspace;
    
    public void setVspace(ValueExpression vspace)
    {
        _vspace = vspace;
    }
    private ValueExpression _swapImageUrl;
    
    public void setSwapImageUrl(ValueExpression swapImageUrl)
    {
        _swapImageUrl = swapImageUrl;
    }
    private ValueExpression _activeImageUrl;
    
    public void setActiveImageUrl(ValueExpression activeImageUrl)
    {
        _activeImageUrl = activeImageUrl;
    }
    private ValueExpression _alt;
    
    public void setAlt(ValueExpression alt)
    {
        _alt = alt;
    }
    private ValueExpression _height;
    
    public void setHeight(ValueExpression height)
    {
        _height = height;
    }
    private ValueExpression _ismap;
    
    public void setIsmap(ValueExpression ismap)
    {
        _ismap = ismap;
    }
    private ValueExpression _longdesc;
    
    public void setLongdesc(ValueExpression longdesc)
    {
        _longdesc = longdesc;
    }
    private ValueExpression _onclick;
    
    public void setOnclick(ValueExpression onclick)
    {
        _onclick = onclick;
    }
    private ValueExpression _ondblclick;
    
    public void setOndblclick(ValueExpression ondblclick)
    {
        _ondblclick = ondblclick;
    }
    private ValueExpression _onkeydown;
    
    public void setOnkeydown(ValueExpression onkeydown)
    {
        _onkeydown = onkeydown;
    }
    private ValueExpression _onkeypress;
    
    public void setOnkeypress(ValueExpression onkeypress)
    {
        _onkeypress = onkeypress;
    }
    private ValueExpression _onkeyup;
    
    public void setOnkeyup(ValueExpression onkeyup)
    {
        _onkeyup = onkeyup;
    }
    private ValueExpression _usemap;
    
    public void setUsemap(ValueExpression usemap)
    {
        _usemap = usemap;
    }
    private ValueExpression _width;
    
    public void setWidth(ValueExpression width)
    {
        _width = width;
    }
    private ValueExpression _dir;
    
    public void setDir(ValueExpression dir)
    {
        _dir = dir;
    }
    private ValueExpression _lang;
    
    public void setLang(ValueExpression lang)
    {
        _lang = lang;
    }
    private ValueExpression _title;
    
    public void setTitle(ValueExpression title)
    {
        _title = title;
    }
    private ValueExpression _style;
    
    public void setStyle(ValueExpression style)
    {
        _style = style;
    }
    private ValueExpression _styleClass;
    
    public void setStyleClass(ValueExpression styleClass)
    {
        _styleClass = styleClass;
    }
    private ValueExpression _align;
    
    public void setAlign(ValueExpression align)
    {
        _align = align;
    }
    private ValueExpression _url;
    
    public void setUrl(ValueExpression url)
    {
        _url = url;
    }
    private ValueExpression _value;
    
    public void setValue(ValueExpression value)
    {
        _value = value;
    }

    protected void setProperties(UIComponent component)
    {
        if (!(component instanceof org.apache.myfaces.custom.swapimage.HtmlSwapImage))
        {
            throw new IllegalArgumentException("Component "+
                component.getClass().getName() +" is no org.apache.myfaces.custom.swapimage.HtmlSwapImage");
        }
        
        org.apache.myfaces.custom.swapimage.HtmlSwapImage comp = (org.apache.myfaces.custom.swapimage.HtmlSwapImage) component;
        
        super.setProperties(component);
        
        FacesContext context = getFacesContext();

        if (_border != null)
        {
            comp.setValueExpression("border", _border);
        } 
        if (_hspace != null)
        {
            comp.setValueExpression("hspace", _hspace);
        } 
        if (_vspace != null)
        {
            comp.setValueExpression("vspace", _vspace);
        } 
        if (_swapImageUrl != null)
        {
            comp.setValueExpression("swapImageUrl", _swapImageUrl);
        } 
        if (_activeImageUrl != null)
        {
            comp.setValueExpression("activeImageUrl", _activeImageUrl);
        } 
        if (_alt != null)
        {
            comp.setValueExpression("alt", _alt);
        } 
        if (_height != null)
        {
            comp.setValueExpression("height", _height);
        } 
        if (_ismap != null)
        {
            comp.setValueExpression("ismap", _ismap);
        } 
        if (_longdesc != null)
        {
            comp.setValueExpression("longdesc", _longdesc);
        } 
        if (_onclick != null)
        {
            comp.setValueExpression("onclick", _onclick);
        } 
        if (_ondblclick != null)
        {
            comp.setValueExpression("ondblclick", _ondblclick);
        } 
        if (_onkeydown != null)
        {
            comp.setValueExpression("onkeydown", _onkeydown);
        } 
        if (_onkeypress != null)
        {
            comp.setValueExpression("onkeypress", _onkeypress);
        } 
        if (_onkeyup != null)
        {
            comp.setValueExpression("onkeyup", _onkeyup);
        } 
        if (_usemap != null)
        {
            comp.setValueExpression("usemap", _usemap);
        } 
        if (_width != null)
        {
            comp.setValueExpression("width", _width);
        } 
        if (_dir != null)
        {
            comp.setValueExpression("dir", _dir);
        } 
        if (_lang != null)
        {
            comp.setValueExpression("lang", _lang);
        } 
        if (_title != null)
        {
            comp.setValueExpression("title", _title);
        } 
        if (_style != null)
        {
            comp.setValueExpression("style", _style);
        } 
        if (_styleClass != null)
        {
            comp.setValueExpression("styleClass", _styleClass);
        } 
        if (_align != null)
        {
            comp.setValueExpression("align", _align);
        } 
        if (_url != null)
        {
            comp.setValueExpression("url", _url);
        } 
        if (_value != null)
        {
            comp.setValueExpression("value", _value);
        } 
    }

    public void release()
    {
        super.release();
        _border = null;
        _hspace = null;
        _vspace = null;
        _swapImageUrl = null;
        _activeImageUrl = null;
        _alt = null;
        _height = null;
        _ismap = null;
        _longdesc = null;
        _onclick = null;
        _ondblclick = null;
        _onkeydown = null;
        _onkeypress = null;
        _onkeyup = null;
        _usemap = null;
        _width = null;
        _dir = null;
        _lang = null;
        _title = null;
        _style = null;
        _styleClass = null;
        _align = null;
        _url = null;
        _value = null;
    }
}
