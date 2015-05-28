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
package org.apache.myfaces.custom.tabbedpane;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;


// Generated from class org.apache.myfaces.custom.tabbedpane.AbstractHtmlPanelTabbedPane.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlPanelTabbedPane extends org.apache.myfaces.custom.tabbedpane.AbstractHtmlPanelTabbedPane
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.Panel";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.HtmlPanelTabbedPane";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.TabbedPane";


    public HtmlPanelTabbedPane()
    {
        setRendererType("org.apache.myfaces.TabbedPane");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: activeTabVar
    private String _activeTabVar ;
     
    public String getActiveTabVar()
    {
        return _activeTabVar;
    }

    public void setActiveTabVar(String activeTabVar)
    {
        this._activeTabVar = activeTabVar;
    }
    // Property: activePanelTabVar
    private Boolean _activePanelTabVar;
    
    public Boolean getActivePanelTabVar()
    {
        if (_activePanelTabVar != null)
        {
            return _activePanelTabVar;
        }
        ValueExpression vb = getValueExpression("activePanelTabVar");
        if (vb != null)
        {
            Object value = vb == null ? null : vb.getValue(getFacesContext().getELContext());
            if (!(value instanceof Boolean)){
                value = Boolean.valueOf(value.toString());
            }            
            return (Boolean) value;
        }
        return null;
    }

    public void setActivePanelTabVar(Boolean activePanelTabVar)
    {
        this._activePanelTabVar = activePanelTabVar;
    }
    // Property: selectedIndex
    private int _selectedIndex;
    
    private boolean _selectedIndexSet;
    
    public int getSelectedIndex()
    {
        if (_selectedIndexSet)
        {
            return _selectedIndex;
        }
        ValueExpression vb = getValueExpression("selectedIndex");
        if (vb != null)
        {
            return ((Integer) vb.getValue(getFacesContext().getELContext())).intValue();
        }
        return 0; 
    }

    public void setSelectedIndex(int selectedIndex)
    {
        this._selectedIndex = selectedIndex;
        this._selectedIndexSet = true;        
    }
    // Property: activeTabStyleClass
    private String _activeTabStyleClass;
    
    public String getActiveTabStyleClass()
    {
        if (_activeTabStyleClass != null)
        {
            return _activeTabStyleClass;
        }
        ValueExpression vb = getValueExpression("activeTabStyleClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setActiveTabStyleClass(String activeTabStyleClass)
    {
        this._activeTabStyleClass = activeTabStyleClass;
    }
    // Property: inactiveTabStyleClass
    private String _inactiveTabStyleClass;
    
    public String getInactiveTabStyleClass()
    {
        if (_inactiveTabStyleClass != null)
        {
            return _inactiveTabStyleClass;
        }
        ValueExpression vb = getValueExpression("inactiveTabStyleClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setInactiveTabStyleClass(String inactiveTabStyleClass)
    {
        this._inactiveTabStyleClass = inactiveTabStyleClass;
    }
    // Property: activeSubStyleClass
    private String _activeSubStyleClass;
    
    public String getActiveSubStyleClass()
    {
        if (_activeSubStyleClass != null)
        {
            return _activeSubStyleClass;
        }
        ValueExpression vb = getValueExpression("activeSubStyleClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setActiveSubStyleClass(String activeSubStyleClass)
    {
        this._activeSubStyleClass = activeSubStyleClass;
    }
    // Property: inactiveSubStyleClass
    private String _inactiveSubStyleClass;
    
    public String getInactiveSubStyleClass()
    {
        if (_inactiveSubStyleClass != null)
        {
            return _inactiveSubStyleClass;
        }
        ValueExpression vb = getValueExpression("inactiveSubStyleClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setInactiveSubStyleClass(String inactiveSubStyleClass)
    {
        this._inactiveSubStyleClass = inactiveSubStyleClass;
    }
    // Property: tabContentStyleClass
    private String _tabContentStyleClass;
    
    public String getTabContentStyleClass()
    {
        if (_tabContentStyleClass != null)
        {
            return _tabContentStyleClass;
        }
        ValueExpression vb = getValueExpression("tabContentStyleClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setTabContentStyleClass(String tabContentStyleClass)
    {
        this._tabContentStyleClass = tabContentStyleClass;
    }
    // Property: disabledTabStyleClass
    private String _disabledTabStyleClass;
    
    public String getDisabledTabStyleClass()
    {
        if (_disabledTabStyleClass != null)
        {
            return _disabledTabStyleClass;
        }
        ValueExpression vb = getValueExpression("disabledTabStyleClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setDisabledTabStyleClass(String disabledTabStyleClass)
    {
        this._disabledTabStyleClass = disabledTabStyleClass;
    }
    // Property: serverSideTabSwitch
    private boolean _serverSideTabSwitch;
    
    private boolean _serverSideTabSwitchSet;
    
    public boolean isServerSideTabSwitch()
    {
        if (_serverSideTabSwitchSet)
        {
            return _serverSideTabSwitch;
        }
        ValueExpression vb = getValueExpression("serverSideTabSwitch");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return false; 
    }

    public void setServerSideTabSwitch(boolean serverSideTabSwitch)
    {
        this._serverSideTabSwitch = serverSideTabSwitch;
        this._serverSideTabSwitchSet = true;        
    }
    // Property: immediateTabChange
    private boolean _immediateTabChange;
    
    private boolean _immediateTabChangeSet;
    
    public boolean isImmediateTabChange()
    {
        if (_immediateTabChangeSet)
        {
            return _immediateTabChange;
        }
        ValueExpression vb = getValueExpression("immediateTabChange");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return true; 
    }

    public void setImmediateTabChange(boolean immediateTabChange)
    {
        this._immediateTabChange = immediateTabChange;
        this._immediateTabChangeSet = true;        
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
        Object[] values = new Object[43];
        values[0] = super.saveState(facesContext);
        values[1] = _activeTabVar;
        values[2] = _activePanelTabVar;
        values[3] = Integer.valueOf(_selectedIndex);
        values[4] = Boolean.valueOf(_selectedIndexSet);
        values[5] = _activeTabStyleClass;
        values[6] = _inactiveTabStyleClass;
        values[7] = _activeSubStyleClass;
        values[8] = _inactiveSubStyleClass;
        values[9] = _tabContentStyleClass;
        values[10] = _disabledTabStyleClass;
        values[11] = Boolean.valueOf(_serverSideTabSwitch);
        values[12] = Boolean.valueOf(_serverSideTabSwitchSet);
        values[13] = Boolean.valueOf(_immediateTabChange);
        values[14] = Boolean.valueOf(_immediateTabChangeSet);
        values[15] = _onclick;
        values[16] = _ondblclick;
        values[17] = _onkeydown;
        values[18] = _onkeypress;
        values[19] = _onkeyup;
        values[20] = _onmousedown;
        values[21] = _onmousemove;
        values[22] = _onmouseout;
        values[23] = _onmouseover;
        values[24] = _onmouseup;
        values[25] = _enabledOnUserRole;
        values[26] = _visibleOnUserRole;
        values[27] = _dir;
        values[28] = _lang;
        values[29] = _title;
        values[30] = _datafld;
        values[31] = _datasrc;
        values[32] = _dataformatas;
        values[33] = _bgcolor;
        values[34] = Integer.valueOf(_border);
        values[35] = Boolean.valueOf(_borderSet);
        values[36] = _cellpadding;
        values[37] = _cellspacing;
        values[38] = _frame;
        values[39] = _rules;
        values[40] = _summary;
        values[41] = _width;
        values[42] = _align;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _activeTabVar = (java.lang.String) values[1];
        _activePanelTabVar = (java.lang.Boolean) values[2];
        _selectedIndex = ((Integer) values[3]).intValue();
        _selectedIndexSet = ((Boolean) values[4]).booleanValue();
        _activeTabStyleClass = (java.lang.String) values[5];
        _inactiveTabStyleClass = (java.lang.String) values[6];
        _activeSubStyleClass = (java.lang.String) values[7];
        _inactiveSubStyleClass = (java.lang.String) values[8];
        _tabContentStyleClass = (java.lang.String) values[9];
        _disabledTabStyleClass = (java.lang.String) values[10];
        _serverSideTabSwitch = ((Boolean) values[11]).booleanValue();
        _serverSideTabSwitchSet = ((Boolean) values[12]).booleanValue();
        _immediateTabChange = ((Boolean) values[13]).booleanValue();
        _immediateTabChangeSet = ((Boolean) values[14]).booleanValue();
        _onclick = (java.lang.String) values[15];
        _ondblclick = (java.lang.String) values[16];
        _onkeydown = (java.lang.String) values[17];
        _onkeypress = (java.lang.String) values[18];
        _onkeyup = (java.lang.String) values[19];
        _onmousedown = (java.lang.String) values[20];
        _onmousemove = (java.lang.String) values[21];
        _onmouseout = (java.lang.String) values[22];
        _onmouseover = (java.lang.String) values[23];
        _onmouseup = (java.lang.String) values[24];
        _enabledOnUserRole = (java.lang.String) values[25];
        _visibleOnUserRole = (java.lang.String) values[26];
        _dir = (java.lang.String) values[27];
        _lang = (java.lang.String) values[28];
        _title = (java.lang.String) values[29];
        _datafld = (java.lang.String) values[30];
        _datasrc = (java.lang.String) values[31];
        _dataformatas = (java.lang.String) values[32];
        _bgcolor = (java.lang.String) values[33];
        _border = ((Integer) values[34]).intValue();
        _borderSet = ((Boolean) values[35]).booleanValue();
        _cellpadding = (java.lang.String) values[36];
        _cellspacing = (java.lang.String) values[37];
        _frame = (java.lang.String) values[38];
        _rules = (java.lang.String) values[39];
        _summary = (java.lang.String) values[40];
        _width = (java.lang.String) values[41];
        _align = (java.lang.String) values[42];
    }
}
