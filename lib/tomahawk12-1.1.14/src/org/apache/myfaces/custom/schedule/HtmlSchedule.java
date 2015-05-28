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
package org.apache.myfaces.custom.schedule;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;
import javax.faces.convert.Converter;
import java.util.Date;
import javax.el.MethodExpression;
import javax.faces.el.MethodBinding;


// Generated from class org.apache.myfaces.custom.schedule.AbstractHtmlSchedule.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlSchedule extends org.apache.myfaces.custom.schedule.AbstractHtmlSchedule
    implements java.io.Serializable
{
    private static final long serialVersionUID = 5859593107442371656L; 

    static public final String COMPONENT_FAMILY =
        "javax.faces.Panel";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.Schedule";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.Schedule";


    public HtmlSchedule()
    {
        setRendererType("org.apache.myfaces.Schedule");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: backgroundClass
    private String _backgroundClass;
    
    public String getBackgroundClass()
    {
        if (_backgroundClass != null)
        {
            return _backgroundClass;
        }
        ValueExpression vb = getValueExpression("backgroundClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setBackgroundClass(String backgroundClass)
    {
        this._backgroundClass = backgroundClass;
    }
    // Property: columnClass
    private String _columnClass;
    
    public String getColumnClass()
    {
        if (_columnClass != null)
        {
            return _columnClass;
        }
        ValueExpression vb = getValueExpression("columnClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setColumnClass(String columnClass)
    {
        this._columnClass = columnClass;
    }
    // Property: contentClass
    private String _contentClass;
    
    public String getContentClass()
    {
        if (_contentClass != null)
        {
            return _contentClass;
        }
        ValueExpression vb = getValueExpression("contentClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setContentClass(String contentClass)
    {
        this._contentClass = contentClass;
    }
    // Property: dateClass
    private String _dateClass;
    
    public String getDateClass()
    {
        if (_dateClass != null)
        {
            return _dateClass;
        }
        ValueExpression vb = getValueExpression("dateClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setDateClass(String dateClass)
    {
        this._dateClass = dateClass;
    }
    // Property: dayClass
    private String _dayClass;
    
    public String getDayClass()
    {
        if (_dayClass != null)
        {
            return _dayClass;
        }
        ValueExpression vb = getValueExpression("dayClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setDayClass(String dayClass)
    {
        this._dayClass = dayClass;
    }
    // Property: entryClass
    private String _entryClass;
    
    public String getEntryClass()
    {
        if (_entryClass != null)
        {
            return _entryClass;
        }
        ValueExpression vb = getValueExpression("entryClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setEntryClass(String entryClass)
    {
        this._entryClass = entryClass;
    }
    // Property: entryRenderer
    private Object _entryRenderer;
    
    public Object getEntryRenderer()
    {
        if (_entryRenderer != null)
        {
            return _entryRenderer;
        }
        ValueExpression vb = getValueExpression("entryRenderer");
        if (vb != null)
        {
            return  vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setEntryRenderer(Object entryRenderer)
    {
        this._entryRenderer = entryRenderer;
    }
    // Property: evenClass
    private String _evenClass;
    
    public String getEvenClass()
    {
        if (_evenClass != null)
        {
            return _evenClass;
        }
        ValueExpression vb = getValueExpression("evenClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setEvenClass(String evenClass)
    {
        this._evenClass = evenClass;
    }
    // Property: foregroundClass
    private String _foregroundClass;
    
    public String getForegroundClass()
    {
        if (_foregroundClass != null)
        {
            return _foregroundClass;
        }
        ValueExpression vb = getValueExpression("foregroundClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setForegroundClass(String foregroundClass)
    {
        this._foregroundClass = foregroundClass;
    }
    // Property: freeClass
    private String _freeClass;
    
    public String getFreeClass()
    {
        if (_freeClass != null)
        {
            return _freeClass;
        }
        ValueExpression vb = getValueExpression("freeClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setFreeClass(String freeClass)
    {
        this._freeClass = freeClass;
    }
    // Property: gutterClass
    private String _gutterClass;
    
    public String getGutterClass()
    {
        if (_gutterClass != null)
        {
            return _gutterClass;
        }
        ValueExpression vb = getValueExpression("gutterClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setGutterClass(String gutterClass)
    {
        this._gutterClass = gutterClass;
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
    // Property: holidayClass
    private String _holidayClass;
    
    public String getHolidayClass()
    {
        if (_holidayClass != null)
        {
            return _holidayClass;
        }
        ValueExpression vb = getValueExpression("holidayClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setHolidayClass(String holidayClass)
    {
        this._holidayClass = holidayClass;
    }
    // Property: hoursClass
    private String _hoursClass;
    
    public String getHoursClass()
    {
        if (_hoursClass != null)
        {
            return _hoursClass;
        }
        ValueExpression vb = getValueExpression("hoursClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setHoursClass(String hoursClass)
    {
        this._hoursClass = hoursClass;
    }
    // Property: inactiveDayClass
    private String _inactiveDayClass;
    
    public String getInactiveDayClass()
    {
        if (_inactiveDayClass != null)
        {
            return _inactiveDayClass;
        }
        ValueExpression vb = getValueExpression("inactiveDayClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setInactiveDayClass(String inactiveDayClass)
    {
        this._inactiveDayClass = inactiveDayClass;
    }
    // Property: minutesClass
    private String _minutesClass;
    
    public String getMinutesClass()
    {
        if (_minutesClass != null)
        {
            return _minutesClass;
        }
        ValueExpression vb = getValueExpression("minutesClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setMinutesClass(String minutesClass)
    {
        this._minutesClass = minutesClass;
    }
    // Property: monthClass
    private String _monthClass;
    
    public String getMonthClass()
    {
        if (_monthClass != null)
        {
            return _monthClass;
        }
        ValueExpression vb = getValueExpression("monthClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setMonthClass(String monthClass)
    {
        this._monthClass = monthClass;
    }
    // Property: selectedClass
    private String _selectedClass;
    
    public String getSelectedClass()
    {
        if (_selectedClass != null)
        {
            return _selectedClass;
        }
        ValueExpression vb = getValueExpression("selectedClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setSelectedClass(String selectedClass)
    {
        this._selectedClass = selectedClass;
    }
    // Property: selectedEntryClass
    private String _selectedEntryClass;
    
    public String getSelectedEntryClass()
    {
        if (_selectedEntryClass != null)
        {
            return _selectedEntryClass;
        }
        ValueExpression vb = getValueExpression("selectedEntryClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setSelectedEntryClass(String selectedEntryClass)
    {
        this._selectedEntryClass = selectedEntryClass;
    }
    // Property: subtitleClass
    private String _subtitleClass;
    
    public String getSubtitleClass()
    {
        if (_subtitleClass != null)
        {
            return _subtitleClass;
        }
        ValueExpression vb = getValueExpression("subtitleClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setSubtitleClass(String subtitleClass)
    {
        this._subtitleClass = subtitleClass;
    }
    // Property: textClass
    private String _textClass;
    
    public String getTextClass()
    {
        if (_textClass != null)
        {
            return _textClass;
        }
        ValueExpression vb = getValueExpression("textClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setTextClass(String textClass)
    {
        this._textClass = textClass;
    }
    // Property: titleClass
    private String _titleClass;
    
    public String getTitleClass()
    {
        if (_titleClass != null)
        {
            return _titleClass;
        }
        ValueExpression vb = getValueExpression("titleClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setTitleClass(String titleClass)
    {
        this._titleClass = titleClass;
    }
    // Property: unevenClass
    private String _unevenClass;
    
    public String getUnevenClass()
    {
        if (_unevenClass != null)
        {
            return _unevenClass;
        }
        ValueExpression vb = getValueExpression("unevenClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setUnevenClass(String unevenClass)
    {
        this._unevenClass = unevenClass;
    }
    // Property: weekClass
    private String _weekClass;
    
    public String getWeekClass()
    {
        if (_weekClass != null)
        {
            return _weekClass;
        }
        ValueExpression vb = getValueExpression("weekClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setWeekClass(String weekClass)
    {
        this._weekClass = weekClass;
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

    public Object saveState(FacesContext facesContext)
    {
        Object[] values = new Object[27];
        values[0] = super.saveState(facesContext);
        values[1] = _backgroundClass;
        values[2] = _columnClass;
        values[3] = _contentClass;
        values[4] = _dateClass;
        values[5] = _dayClass;
        values[6] = _entryClass;
        values[7] = _entryRenderer;
        values[8] = _evenClass;
        values[9] = _foregroundClass;
        values[10] = _freeClass;
        values[11] = _gutterClass;
        values[12] = _headerClass;
        values[13] = _holidayClass;
        values[14] = _hoursClass;
        values[15] = _inactiveDayClass;
        values[16] = _minutesClass;
        values[17] = _monthClass;
        values[18] = _selectedClass;
        values[19] = _selectedEntryClass;
        values[20] = _subtitleClass;
        values[21] = _textClass;
        values[22] = _titleClass;
        values[23] = _unevenClass;
        values[24] = _weekClass;
        values[25] = _enabledOnUserRole;
        values[26] = _visibleOnUserRole;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _backgroundClass = (java.lang.String) values[1];
        _columnClass = (java.lang.String) values[2];
        _contentClass = (java.lang.String) values[3];
        _dateClass = (java.lang.String) values[4];
        _dayClass = (java.lang.String) values[5];
        _entryClass = (java.lang.String) values[6];
        _entryRenderer =  values[7];
        _evenClass = (java.lang.String) values[8];
        _foregroundClass = (java.lang.String) values[9];
        _freeClass = (java.lang.String) values[10];
        _gutterClass = (java.lang.String) values[11];
        _headerClass = (java.lang.String) values[12];
        _holidayClass = (java.lang.String) values[13];
        _hoursClass = (java.lang.String) values[14];
        _inactiveDayClass = (java.lang.String) values[15];
        _minutesClass = (java.lang.String) values[16];
        _monthClass = (java.lang.String) values[17];
        _selectedClass = (java.lang.String) values[18];
        _selectedEntryClass = (java.lang.String) values[19];
        _subtitleClass = (java.lang.String) values[20];
        _textClass = (java.lang.String) values[21];
        _titleClass = (java.lang.String) values[22];
        _unevenClass = (java.lang.String) values[23];
        _weekClass = (java.lang.String) values[24];
        _enabledOnUserRole = (java.lang.String) values[25];
        _visibleOnUserRole = (java.lang.String) values[26];
    }
}
