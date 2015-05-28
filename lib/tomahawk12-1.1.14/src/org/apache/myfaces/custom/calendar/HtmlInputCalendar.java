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
package org.apache.myfaces.custom.calendar;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;
import javax.faces.convert.Converter;
import org.apache.myfaces.custom.calendar.DateBusinessConverter;
import javax.faces.el.MethodBinding;


// Generated from class org.apache.myfaces.custom.calendar.AbstractHtmlInputCalendar.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlInputCalendar extends org.apache.myfaces.custom.calendar.AbstractHtmlInputCalendar
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.Input";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.HtmlInputCalendar";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.Calendar";


    public HtmlInputCalendar()
    {
        setRendererType("org.apache.myfaces.Calendar");
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
    // Property: monthYearRowClass
    private String _monthYearRowClass;
    
    public String getMonthYearRowClass()
    {
        if (_monthYearRowClass != null)
        {
            return _monthYearRowClass;
        }
        ValueExpression vb = getValueExpression("monthYearRowClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setMonthYearRowClass(String monthYearRowClass)
    {
        this._monthYearRowClass = monthYearRowClass;
    }
    // Property: weekRowClass
    private String _weekRowClass;
    
    public String getWeekRowClass()
    {
        if (_weekRowClass != null)
        {
            return _weekRowClass;
        }
        ValueExpression vb = getValueExpression("weekRowClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setWeekRowClass(String weekRowClass)
    {
        this._weekRowClass = weekRowClass;
    }
    // Property: dayCellClass
    private String _dayCellClass;
    
    public String getDayCellClass()
    {
        if (_dayCellClass != null)
        {
            return _dayCellClass;
        }
        ValueExpression vb = getValueExpression("dayCellClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setDayCellClass(String dayCellClass)
    {
        this._dayCellClass = dayCellClass;
    }
    // Property: currentDayCellClass
    private String _currentDayCellClass;
    
    public String getCurrentDayCellClass()
    {
        if (_currentDayCellClass != null)
        {
            return _currentDayCellClass;
        }
        ValueExpression vb = getValueExpression("currentDayCellClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setCurrentDayCellClass(String currentDayCellClass)
    {
        this._currentDayCellClass = currentDayCellClass;
    }
    // Property: popupLeft
    private boolean _popupLeft;
    
    private boolean _popupLeftSet;
    
    public boolean isPopupLeft()
    {
        if (_popupLeftSet)
        {
            return _popupLeft;
        }
        ValueExpression vb = getValueExpression("popupLeft");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return false; 
    }

    public void setPopupLeft(boolean popupLeft)
    {
        this._popupLeft = popupLeft;
        this._popupLeftSet = true;        
    }
    // Property: renderAsPopup
    private boolean _renderAsPopup;
    
    private boolean _renderAsPopupSet;
    
    public boolean isRenderAsPopup()
    {
        if (_renderAsPopupSet)
        {
            return _renderAsPopup;
        }
        ValueExpression vb = getValueExpression("renderAsPopup");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return false; 
    }

    public void setRenderAsPopup(boolean renderAsPopup)
    {
        this._renderAsPopup = renderAsPopup;
        this._renderAsPopupSet = true;        
    }
    // Property: addResources
    private boolean _addResources;
    
    private boolean _addResourcesSet;
    
    public boolean isAddResources()
    {
        if (_addResourcesSet)
        {
            return _addResources;
        }
        ValueExpression vb = getValueExpression("addResources");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return true; 
    }

    public void setAddResources(boolean addResources)
    {
        this._addResources = addResources;
        this._addResourcesSet = true;        
    }
    // Property: popupButtonString
    private String _popupButtonString;
    
    public String getPopupButtonString()
    {
        if (_popupButtonString != null)
        {
            return _popupButtonString;
        }
        ValueExpression vb = getValueExpression("popupButtonString");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setPopupButtonString(String popupButtonString)
    {
        this._popupButtonString = popupButtonString;
    }
    // Property: popupButtonStyle
    private String _popupButtonStyle;
    
    public String getPopupButtonStyle()
    {
        if (_popupButtonStyle != null)
        {
            return _popupButtonStyle;
        }
        ValueExpression vb = getValueExpression("popupButtonStyle");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setPopupButtonStyle(String popupButtonStyle)
    {
        this._popupButtonStyle = popupButtonStyle;
    }
    // Property: popupButtonStyleClass
    private String _popupButtonStyleClass;
    
    public String getPopupButtonStyleClass()
    {
        if (_popupButtonStyleClass != null)
        {
            return _popupButtonStyleClass;
        }
        ValueExpression vb = getValueExpression("popupButtonStyleClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setPopupButtonStyleClass(String popupButtonStyleClass)
    {
        this._popupButtonStyleClass = popupButtonStyleClass;
    }
    // Property: renderPopupButtonAsImage
    private boolean _renderPopupButtonAsImage;
    
    private boolean _renderPopupButtonAsImageSet;
    
    public boolean isRenderPopupButtonAsImage()
    {
        if (_renderPopupButtonAsImageSet)
        {
            return _renderPopupButtonAsImage;
        }
        ValueExpression vb = getValueExpression("renderPopupButtonAsImage");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return false; 
    }

    public void setRenderPopupButtonAsImage(boolean renderPopupButtonAsImage)
    {
        this._renderPopupButtonAsImage = renderPopupButtonAsImage;
        this._renderPopupButtonAsImageSet = true;        
    }
    // Property: popupDateFormat
    private String _popupDateFormat;
    
    public String getPopupDateFormat()
    {
        if (_popupDateFormat != null)
        {
            return _popupDateFormat;
        }
        ValueExpression vb = getValueExpression("popupDateFormat");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setPopupDateFormat(String popupDateFormat)
    {
        this._popupDateFormat = popupDateFormat;
    }
    // Property: popupGotoString
    private String _popupGotoString;
    
    public String getPopupGotoString()
    {
        if (_popupGotoString != null)
        {
            return _popupGotoString;
        }
        ValueExpression vb = getValueExpression("popupGotoString");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setPopupGotoString(String popupGotoString)
    {
        this._popupGotoString = popupGotoString;
    }
    // Property: popupTodayString
    private String _popupTodayString;
    
    public String getPopupTodayString()
    {
        if (_popupTodayString != null)
        {
            return _popupTodayString;
        }
        ValueExpression vb = getValueExpression("popupTodayString");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setPopupTodayString(String popupTodayString)
    {
        this._popupTodayString = popupTodayString;
    }
    // Property: popupTodayDateFormat
    private String _popupTodayDateFormat;
    
    public String getPopupTodayDateFormat()
    {
        if (_popupTodayDateFormat != null)
        {
            return _popupTodayDateFormat;
        }
        ValueExpression vb = getValueExpression("popupTodayDateFormat");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setPopupTodayDateFormat(String popupTodayDateFormat)
    {
        this._popupTodayDateFormat = popupTodayDateFormat;
    }
    // Property: popupWeekString
    private String _popupWeekString;
    
    public String getPopupWeekString()
    {
        if (_popupWeekString != null)
        {
            return _popupWeekString;
        }
        ValueExpression vb = getValueExpression("popupWeekString");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setPopupWeekString(String popupWeekString)
    {
        this._popupWeekString = popupWeekString;
    }
    // Property: popupScrollLeftMessage
    private String _popupScrollLeftMessage;
    
    public String getPopupScrollLeftMessage()
    {
        if (_popupScrollLeftMessage != null)
        {
            return _popupScrollLeftMessage;
        }
        ValueExpression vb = getValueExpression("popupScrollLeftMessage");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setPopupScrollLeftMessage(String popupScrollLeftMessage)
    {
        this._popupScrollLeftMessage = popupScrollLeftMessage;
    }
    // Property: popupScrollRightMessage
    private String _popupScrollRightMessage;
    
    public String getPopupScrollRightMessage()
    {
        if (_popupScrollRightMessage != null)
        {
            return _popupScrollRightMessage;
        }
        ValueExpression vb = getValueExpression("popupScrollRightMessage");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setPopupScrollRightMessage(String popupScrollRightMessage)
    {
        this._popupScrollRightMessage = popupScrollRightMessage;
    }
    // Property: popupSelectMonthMessage
    private String _popupSelectMonthMessage;
    
    public String getPopupSelectMonthMessage()
    {
        if (_popupSelectMonthMessage != null)
        {
            return _popupSelectMonthMessage;
        }
        ValueExpression vb = getValueExpression("popupSelectMonthMessage");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setPopupSelectMonthMessage(String popupSelectMonthMessage)
    {
        this._popupSelectMonthMessage = popupSelectMonthMessage;
    }
    // Property: popupSelectYearMessage
    private String _popupSelectYearMessage;
    
    public String getPopupSelectYearMessage()
    {
        if (_popupSelectYearMessage != null)
        {
            return _popupSelectYearMessage;
        }
        ValueExpression vb = getValueExpression("popupSelectYearMessage");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setPopupSelectYearMessage(String popupSelectYearMessage)
    {
        this._popupSelectYearMessage = popupSelectYearMessage;
    }
    // Property: popupSelectDateMessage
    private String _popupSelectDateMessage;
    
    public String getPopupSelectDateMessage()
    {
        if (_popupSelectDateMessage != null)
        {
            return _popupSelectDateMessage;
        }
        ValueExpression vb = getValueExpression("popupSelectDateMessage");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setPopupSelectDateMessage(String popupSelectDateMessage)
    {
        this._popupSelectDateMessage = popupSelectDateMessage;
    }
    // Property: popupTheme
    private String _popupTheme;
    
    public String getPopupTheme()
    {
        if (_popupTheme != null)
        {
            return _popupTheme;
        }
        ValueExpression vb = getValueExpression("popupTheme");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setPopupTheme(String popupTheme)
    {
        this._popupTheme = popupTheme;
    }
    // Property: popupButtonImageUrl
    private String _popupButtonImageUrl;
    
    public String getPopupButtonImageUrl()
    {
        if (_popupButtonImageUrl != null)
        {
            return _popupButtonImageUrl;
        }
        ValueExpression vb = getValueExpression("popupButtonImageUrl");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setPopupButtonImageUrl(String popupButtonImageUrl)
    {
        this._popupButtonImageUrl = popupButtonImageUrl;
    }
    // Property: helpText
    private String _helpText;
    
    public String getHelpText()
    {
        if (_helpText != null)
        {
            return _helpText;
        }
        ValueExpression vb = getValueExpression("helpText");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setHelpText(String helpText)
    {
        this._helpText = helpText;
    }
    // Property: popupSelectMode
    private String _popupSelectMode;
    
    public String getPopupSelectMode()
    {
        if (_popupSelectMode != null)
        {
            return _popupSelectMode;
        }
        ValueExpression vb = getValueExpression("popupSelectMode");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return "day"; 
    }

    public void setPopupSelectMode(String popupSelectMode)
    {
        this._popupSelectMode = popupSelectMode;
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
    // Property: javascriptLocation
    private String _javascriptLocation;
    
    public String getJavascriptLocation()
    {
        if (_javascriptLocation != null)
        {
            return _javascriptLocation;
        }
        ValueExpression vb = getValueExpression("javascriptLocation");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setJavascriptLocation(String javascriptLocation)
    {
        this._javascriptLocation = javascriptLocation;
    }
    // Property: imageLocation
    private String _imageLocation;
    
    public String getImageLocation()
    {
        if (_imageLocation != null)
        {
            return _imageLocation;
        }
        ValueExpression vb = getValueExpression("imageLocation");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setImageLocation(String imageLocation)
    {
        this._imageLocation = imageLocation;
    }
    // Property: styleLocation
    private String _styleLocation;
    
    public String getStyleLocation()
    {
        if (_styleLocation != null)
        {
            return _styleLocation;
        }
        ValueExpression vb = getValueExpression("styleLocation");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setStyleLocation(String styleLocation)
    {
        this._styleLocation = styleLocation;
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
        Object[] values = new Object[37];
        values[0] = super.saveState(facesContext);
        values[1] = saveAttachedState(facesContext,_dateBusinessConverter);
        values[2] = _monthYearRowClass;
        values[3] = _weekRowClass;
        values[4] = _dayCellClass;
        values[5] = _currentDayCellClass;
        values[6] = Boolean.valueOf(_popupLeft);
        values[7] = Boolean.valueOf(_popupLeftSet);
        values[8] = Boolean.valueOf(_renderAsPopup);
        values[9] = Boolean.valueOf(_renderAsPopupSet);
        values[10] = Boolean.valueOf(_addResources);
        values[11] = Boolean.valueOf(_addResourcesSet);
        values[12] = _popupButtonString;
        values[13] = _popupButtonStyle;
        values[14] = _popupButtonStyleClass;
        values[15] = Boolean.valueOf(_renderPopupButtonAsImage);
        values[16] = Boolean.valueOf(_renderPopupButtonAsImageSet);
        values[17] = _popupDateFormat;
        values[18] = _popupGotoString;
        values[19] = _popupTodayString;
        values[20] = _popupTodayDateFormat;
        values[21] = _popupWeekString;
        values[22] = _popupScrollLeftMessage;
        values[23] = _popupScrollRightMessage;
        values[24] = _popupSelectMonthMessage;
        values[25] = _popupSelectYearMessage;
        values[26] = _popupSelectDateMessage;
        values[27] = _popupTheme;
        values[28] = _popupButtonImageUrl;
        values[29] = _helpText;
        values[30] = _popupSelectMode;
        values[31] = _enabledOnUserRole;
        values[32] = _visibleOnUserRole;
        values[33] = _javascriptLocation;
        values[34] = _imageLocation;
        values[35] = _styleLocation;
        values[36] = _align;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _dateBusinessConverter = (org.apache.myfaces.custom.calendar.DateBusinessConverter) restoreAttachedState(facesContext,values[1]); 
        _monthYearRowClass = (java.lang.String) values[2];
        _weekRowClass = (java.lang.String) values[3];
        _dayCellClass = (java.lang.String) values[4];
        _currentDayCellClass = (java.lang.String) values[5];
        _popupLeft = ((Boolean) values[6]).booleanValue();
        _popupLeftSet = ((Boolean) values[7]).booleanValue();
        _renderAsPopup = ((Boolean) values[8]).booleanValue();
        _renderAsPopupSet = ((Boolean) values[9]).booleanValue();
        _addResources = ((Boolean) values[10]).booleanValue();
        _addResourcesSet = ((Boolean) values[11]).booleanValue();
        _popupButtonString = (java.lang.String) values[12];
        _popupButtonStyle = (java.lang.String) values[13];
        _popupButtonStyleClass = (java.lang.String) values[14];
        _renderPopupButtonAsImage = ((Boolean) values[15]).booleanValue();
        _renderPopupButtonAsImageSet = ((Boolean) values[16]).booleanValue();
        _popupDateFormat = (java.lang.String) values[17];
        _popupGotoString = (java.lang.String) values[18];
        _popupTodayString = (java.lang.String) values[19];
        _popupTodayDateFormat = (java.lang.String) values[20];
        _popupWeekString = (java.lang.String) values[21];
        _popupScrollLeftMessage = (java.lang.String) values[22];
        _popupScrollRightMessage = (java.lang.String) values[23];
        _popupSelectMonthMessage = (java.lang.String) values[24];
        _popupSelectYearMessage = (java.lang.String) values[25];
        _popupSelectDateMessage = (java.lang.String) values[26];
        _popupTheme = (java.lang.String) values[27];
        _popupButtonImageUrl = (java.lang.String) values[28];
        _helpText = (java.lang.String) values[29];
        _popupSelectMode = (java.lang.String) values[30];
        _enabledOnUserRole = (java.lang.String) values[31];
        _visibleOnUserRole = (java.lang.String) values[32];
        _javascriptLocation = (java.lang.String) values[33];
        _imageLocation = (java.lang.String) values[34];
        _styleLocation = (java.lang.String) values[35];
        _align = (java.lang.String) values[36];
    }
}
