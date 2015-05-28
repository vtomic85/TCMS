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
package org.apache.myfaces.custom.selectOneRow;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;
import javax.faces.convert.Converter;
import javax.faces.el.MethodBinding;


// Generated from class org.apache.myfaces.custom.selectOneRow.AbstractSelectOneRow.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class SelectOneRow extends org.apache.myfaces.custom.selectOneRow.AbstractSelectOneRow
{

    static public final String COMPONENT_FAMILY =
        "org.apache.myfaces.SelectOneRow";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.SelectOneRow";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.SelectOneRow";


    public SelectOneRow()
    {
        setRendererType("org.apache.myfaces.SelectOneRow");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: groupName
    private String _groupName;
    
    public String getGroupName()
    {
        if (_groupName != null)
        {
            return _groupName;
        }
        ValueExpression vb = getValueExpression("groupName");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setGroupName(String groupName)
    {
        this._groupName = groupName;
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
    // Property: readonly
    private boolean _readonly;
    
    private boolean _readonlySet;
    
    public boolean isReadonly()
    {
        if (_readonlySet)
        {
            return _readonly;
        }
        ValueExpression vb = getValueExpression("readonly");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return false; 
    }

    public void setReadonly(boolean readonly)
    {
        this._readonly = readonly;
        this._readonlySet = true;        
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
        Object[] values = new Object[21];
        values[0] = super.saveState(facesContext);
        values[1] = _groupName;
        values[2] = Boolean.valueOf(_disabled);
        values[3] = Boolean.valueOf(_disabledSet);
        values[4] = Boolean.valueOf(_readonly);
        values[5] = Boolean.valueOf(_readonlySet);
        values[6] = _onblur;
        values[7] = _onfocus;
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
        values[18] = _onchange;
        values[19] = _onselect;
        values[20] = _align;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _groupName = (java.lang.String) values[1];
        _disabled = ((Boolean) values[2]).booleanValue();
        _disabledSet = ((Boolean) values[3]).booleanValue();
        _readonly = ((Boolean) values[4]).booleanValue();
        _readonlySet = ((Boolean) values[5]).booleanValue();
        _onblur = (java.lang.String) values[6];
        _onfocus = (java.lang.String) values[7];
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
        _onchange = (java.lang.String) values[18];
        _onselect = (java.lang.String) values[19];
        _align = (java.lang.String) values[20];
    }
}
