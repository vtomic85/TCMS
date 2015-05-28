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
package org.apache.myfaces.custom.date;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;
import javax.faces.convert.Converter;
import org.apache.myfaces.custom.calendar.DateBusinessConverter;
import javax.faces.el.MethodBinding;


// Generated from class org.apache.myfaces.custom.date.AbstractHtmlInputDate.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlInputDate extends org.apache.myfaces.custom.date.AbstractHtmlInputDate
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.Input";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.HtmlInputDate";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.Date";


    public HtmlInputDate()
    {
        setRendererType("org.apache.myfaces.Date");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: dateBusinessConverter
    private DateBusinessConverter _dateBusinessConverter;
    
    public DateBusinessConverter getDateBusinessConverter()
    {
        if (_dateBusinessConverter != null)
        {
            return _dateBusinessConverter;
        }
        ValueExpression vb = getValueExpression("dateBusinessConverter");
        if (vb != null)
        {
            return (DateBusinessConverter) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setDateBusinessConverter(DateBusinessConverter dateBusinessConverter)
    {
        this._dateBusinessConverter = dateBusinessConverter;
    }
    // Property: timeZone
    private String _timeZone;
    
    public String getTimeZone()
    {
        if (_timeZone != null)
        {
            return _timeZone;
        }
        ValueExpression vb = getValueExpression("timeZone");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setTimeZone(String timeZone)
    {
        this._timeZone = timeZone;
    }
    // Property: type
    private String _type;
    
    public String getType()
    {
        if (_type != null)
        {
            return _type;
        }
        ValueExpression vb = getValueExpression("type");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return "date"; 
    }

    public void setType(String type)
    {
        this._type = type;
    }
    // Property: ampm
    private boolean _ampm;
    
    private boolean _ampmSet;
    
    public boolean isAmpm()
    {
        if (_ampmSet)
        {
            return _ampm;
        }
        ValueExpression vb = getValueExpression("ampm");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return false; 
    }

    public void setAmpm(boolean ampm)
    {
        this._ampm = ampm;
        this._ampmSet = true;        
    }
    // Property: popupCalendar
    private boolean _popupCalendar;
    
    private boolean _popupCalendarSet;
    
    public boolean isPopupCalendar()
    {
        if (_popupCalendarSet)
        {
            return _popupCalendar;
        }
        ValueExpression vb = getValueExpression("popupCalendar");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return false; 
    }

    public void setPopupCalendar(boolean popupCalendar)
    {
        this._popupCalendar = popupCalendar;
        this._popupCalendarSet = true;        
    }
    // Property: emptyMonthSelection
    private String _emptyMonthSelection;
    
    public String getEmptyMonthSelection()
    {
        if (_emptyMonthSelection != null)
        {
            return _emptyMonthSelection;
        }
        ValueExpression vb = getValueExpression("emptyMonthSelection");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return ""; 
    }

    public void setEmptyMonthSelection(String emptyMonthSelection)
    {
        this._emptyMonthSelection = emptyMonthSelection;
    }
    // Property: emptyAmpmSelection
    private String _emptyAmpmSelection;
    
    public String getEmptyAmpmSelection()
    {
        if (_emptyAmpmSelection != null)
        {
            return _emptyAmpmSelection;
        }
        ValueExpression vb = getValueExpression("emptyAmpmSelection");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return ""; 
    }

    public void setEmptyAmpmSelection(String emptyAmpmSelection)
    {
        this._emptyAmpmSelection = emptyAmpmSelection;
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
        Object[] values = new Object[19];
        values[0] = super.saveState(facesContext);
        values[1] = saveAttachedState(facesContext,_dateBusinessConverter);
        values[2] = _timeZone;
        values[3] = _type;
        values[4] = Boolean.valueOf(_ampm);
        values[5] = Boolean.valueOf(_ampmSet);
        values[6] = Boolean.valueOf(_popupCalendar);
        values[7] = Boolean.valueOf(_popupCalendarSet);
        values[8] = _emptyMonthSelection;
        values[9] = _emptyAmpmSelection;
        values[10] = Boolean.valueOf(_readonly);
        values[11] = Boolean.valueOf(_readonlySet);
        values[12] = Boolean.valueOf(_disabled);
        values[13] = Boolean.valueOf(_disabledSet);
        values[14] = _enabledOnUserRole;
        values[15] = _visibleOnUserRole;
        values[16] = Boolean.valueOf(_forceId);
        values[17] = Boolean.valueOf(_forceIdIndex);
        values[18] = _align;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _dateBusinessConverter = (org.apache.myfaces.custom.calendar.DateBusinessConverter) restoreAttachedState(facesContext,values[1]); 
        _timeZone = (java.lang.String) values[2];
        _type = (java.lang.String) values[3];
        _ampm = ((Boolean) values[4]).booleanValue();
        _ampmSet = ((Boolean) values[5]).booleanValue();
        _popupCalendar = ((Boolean) values[6]).booleanValue();
        _popupCalendarSet = ((Boolean) values[7]).booleanValue();
        _emptyMonthSelection = (java.lang.String) values[8];
        _emptyAmpmSelection = (java.lang.String) values[9];
        _readonly = ((Boolean) values[10]).booleanValue();
        _readonlySet = ((Boolean) values[11]).booleanValue();
        _disabled = ((Boolean) values[12]).booleanValue();
        _disabledSet = ((Boolean) values[13]).booleanValue();
        _enabledOnUserRole = (java.lang.String) values[14];
        _visibleOnUserRole = (java.lang.String) values[15];
        _forceId = ((Boolean) values[16]).booleanValue();
        _forceIdIndex = ((Boolean) values[17]).booleanValue();
        _align = (java.lang.String) values[18];
    }
}
