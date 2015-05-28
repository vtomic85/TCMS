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


// Generated from class org.apache.myfaces.component.html.ext.AbstractHtmlMessage.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlMessage extends org.apache.myfaces.component.html.ext.AbstractHtmlMessage
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.Message";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.HtmlMessage";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.Message";


    public HtmlMessage()
    {
        setRendererType("org.apache.myfaces.Message");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
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
    // Property: summaryFormat
    private String _summaryFormat;
    
    public String getSummaryFormat()
    {
        if (_summaryFormat != null)
        {
            return _summaryFormat;
        }
        ValueExpression vb = getValueExpression("summaryFormat");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setSummaryFormat(String summaryFormat)
    {
        this._summaryFormat = summaryFormat;
    }
    // Property: detailFormat
    private String _detailFormat;
    
    public String getDetailFormat()
    {
        if (_detailFormat != null)
        {
            return _detailFormat;
        }
        ValueExpression vb = getValueExpression("detailFormat");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setDetailFormat(String detailFormat)
    {
        this._detailFormat = detailFormat;
    }
    // Property: replaceIdWithLabel
    private boolean _replaceIdWithLabel;
    
    private boolean _replaceIdWithLabelSet;
    
    public boolean isReplaceIdWithLabel()
    {
        if (_replaceIdWithLabelSet)
        {
            return _replaceIdWithLabel;
        }
        ValueExpression vb = getValueExpression("replaceIdWithLabel");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return true; 
    }

    public void setReplaceIdWithLabel(boolean replaceIdWithLabel)
    {
        this._replaceIdWithLabel = replaceIdWithLabel;
        this._replaceIdWithLabelSet = true;        
    }
    // Property: forceSpan
    private boolean _forceSpan;
    
    private boolean _forceSpanSet;
    
    public boolean isForceSpan()
    {
        if (_forceSpanSet)
        {
            return _forceSpan;
        }
        ValueExpression vb = getValueExpression("forceSpan");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return false; 
    }

    public void setForceSpan(boolean forceSpan)
    {
        this._forceSpan = forceSpan;
        this._forceSpanSet = true;        
    }

    public Object saveState(FacesContext facesContext)
    {
        Object[] values = new Object[24];
        values[0] = super.saveState(facesContext);
        values[1] = _onclick;
        values[2] = _ondblclick;
        values[3] = _onkeydown;
        values[4] = _onkeypress;
        values[5] = _onkeyup;
        values[6] = _onmousedown;
        values[7] = _onmousemove;
        values[8] = _onmouseout;
        values[9] = _onmouseover;
        values[10] = _onmouseup;
        values[11] = _enabledOnUserRole;
        values[12] = _visibleOnUserRole;
        values[13] = Boolean.valueOf(_forceId);
        values[14] = Boolean.valueOf(_forceIdIndex);
        values[15] = _dir;
        values[16] = _lang;
        values[17] = _title;
        values[18] = _summaryFormat;
        values[19] = _detailFormat;
        values[20] = Boolean.valueOf(_replaceIdWithLabel);
        values[21] = Boolean.valueOf(_replaceIdWithLabelSet);
        values[22] = Boolean.valueOf(_forceSpan);
        values[23] = Boolean.valueOf(_forceSpanSet);
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _onclick = (java.lang.String) values[1];
        _ondblclick = (java.lang.String) values[2];
        _onkeydown = (java.lang.String) values[3];
        _onkeypress = (java.lang.String) values[4];
        _onkeyup = (java.lang.String) values[5];
        _onmousedown = (java.lang.String) values[6];
        _onmousemove = (java.lang.String) values[7];
        _onmouseout = (java.lang.String) values[8];
        _onmouseover = (java.lang.String) values[9];
        _onmouseup = (java.lang.String) values[10];
        _enabledOnUserRole = (java.lang.String) values[11];
        _visibleOnUserRole = (java.lang.String) values[12];
        _forceId = ((Boolean) values[13]).booleanValue();
        _forceIdIndex = ((Boolean) values[14]).booleanValue();
        _dir = (java.lang.String) values[15];
        _lang = (java.lang.String) values[16];
        _title = (java.lang.String) values[17];
        _summaryFormat = (java.lang.String) values[18];
        _detailFormat = (java.lang.String) values[19];
        _replaceIdWithLabel = ((Boolean) values[20]).booleanValue();
        _replaceIdWithLabelSet = ((Boolean) values[21]).booleanValue();
        _forceSpan = ((Boolean) values[22]).booleanValue();
        _forceSpanSet = ((Boolean) values[23]).booleanValue();
    }
}
