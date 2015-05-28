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


// Generated from class org.apache.myfaces.component.html.ext.AbstractHtmlDataTable.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlDataTable extends org.apache.myfaces.component.html.ext.AbstractHtmlDataTable
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.Data";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.HtmlDataTable";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.Table";


    public HtmlDataTable()
    {
        setRendererType("org.apache.myfaces.Table");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
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
    // Property: embedded
    private boolean _embedded;
    
    private boolean _embeddedSet;
    
    public boolean isEmbedded()
    {
        if (_embeddedSet)
        {
            return _embedded;
        }
        ValueExpression vb = getValueExpression("embedded");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return false; 
    }

    public void setEmbedded(boolean embedded)
    {
        this._embedded = embedded;
        this._embeddedSet = true;        
    }
    // Property: detailStampExpandedDefault
    private boolean _detailStampExpandedDefault;
    
    private boolean _detailStampExpandedDefaultSet;
    
    public boolean isDetailStampExpandedDefault()
    {
        if (_detailStampExpandedDefaultSet)
        {
            return _detailStampExpandedDefault;
        }
        ValueExpression vb = getValueExpression("detailStampExpandedDefault");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return false; 
    }

    public void setDetailStampExpandedDefault(boolean detailStampExpandedDefault)
    {
        this._detailStampExpandedDefault = detailStampExpandedDefault;
        this._detailStampExpandedDefaultSet = true;        
    }
    // Property: detailStampLocation
    private String _detailStampLocation;
    
    public String getDetailStampLocation()
    {
        if (_detailStampLocation != null)
        {
            return _detailStampLocation;
        }
        ValueExpression vb = getValueExpression("detailStampLocation");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return "after"; 
    }

    public void setDetailStampLocation(String detailStampLocation)
    {
        this._detailStampLocation = detailStampLocation;
    }
    // Property: rowOnMouseOver
    private String _rowOnMouseOver;
    
    public String getRowOnMouseOver()
    {
        if (_rowOnMouseOver != null)
        {
            return _rowOnMouseOver;
        }
        ValueExpression vb = getValueExpression("rowOnMouseOver");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setRowOnMouseOver(String rowOnMouseOver)
    {
        this._rowOnMouseOver = rowOnMouseOver;
    }
    // Property: rowOnMouseOut
    private String _rowOnMouseOut;
    
    public String getRowOnMouseOut()
    {
        if (_rowOnMouseOut != null)
        {
            return _rowOnMouseOut;
        }
        ValueExpression vb = getValueExpression("rowOnMouseOut");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setRowOnMouseOut(String rowOnMouseOut)
    {
        this._rowOnMouseOut = rowOnMouseOut;
    }
    // Property: rowOnClick
    private String _rowOnClick;
    
    public String getRowOnClick()
    {
        if (_rowOnClick != null)
        {
            return _rowOnClick;
        }
        ValueExpression vb = getValueExpression("rowOnClick");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setRowOnClick(String rowOnClick)
    {
        this._rowOnClick = rowOnClick;
    }
    // Property: rowOnDblClick
    private String _rowOnDblClick;
    
    public String getRowOnDblClick()
    {
        if (_rowOnDblClick != null)
        {
            return _rowOnDblClick;
        }
        ValueExpression vb = getValueExpression("rowOnDblClick");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setRowOnDblClick(String rowOnDblClick)
    {
        this._rowOnDblClick = rowOnDblClick;
    }
    // Property: rowOnKeyDown
    private String _rowOnKeyDown;
    
    public String getRowOnKeyDown()
    {
        if (_rowOnKeyDown != null)
        {
            return _rowOnKeyDown;
        }
        ValueExpression vb = getValueExpression("rowOnKeyDown");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setRowOnKeyDown(String rowOnKeyDown)
    {
        this._rowOnKeyDown = rowOnKeyDown;
    }
    // Property: rowOnKeyPress
    private String _rowOnKeyPress;
    
    public String getRowOnKeyPress()
    {
        if (_rowOnKeyPress != null)
        {
            return _rowOnKeyPress;
        }
        ValueExpression vb = getValueExpression("rowOnKeyPress");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setRowOnKeyPress(String rowOnKeyPress)
    {
        this._rowOnKeyPress = rowOnKeyPress;
    }
    // Property: rowOnKeyUp
    private String _rowOnKeyUp;
    
    public String getRowOnKeyUp()
    {
        if (_rowOnKeyUp != null)
        {
            return _rowOnKeyUp;
        }
        ValueExpression vb = getValueExpression("rowOnKeyUp");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setRowOnKeyUp(String rowOnKeyUp)
    {
        this._rowOnKeyUp = rowOnKeyUp;
    }
    // Property: rowOnMouseDown
    private String _rowOnMouseDown;
    
    public String getRowOnMouseDown()
    {
        if (_rowOnMouseDown != null)
        {
            return _rowOnMouseDown;
        }
        ValueExpression vb = getValueExpression("rowOnMouseDown");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setRowOnMouseDown(String rowOnMouseDown)
    {
        this._rowOnMouseDown = rowOnMouseDown;
    }
    // Property: rowOnMouseMove
    private String _rowOnMouseMove;
    
    public String getRowOnMouseMove()
    {
        if (_rowOnMouseMove != null)
        {
            return _rowOnMouseMove;
        }
        ValueExpression vb = getValueExpression("rowOnMouseMove");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setRowOnMouseMove(String rowOnMouseMove)
    {
        this._rowOnMouseMove = rowOnMouseMove;
    }
    // Property: rowOnMouseUp
    private String _rowOnMouseUp;
    
    public String getRowOnMouseUp()
    {
        if (_rowOnMouseUp != null)
        {
            return _rowOnMouseUp;
        }
        ValueExpression vb = getValueExpression("rowOnMouseUp");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setRowOnMouseUp(String rowOnMouseUp)
    {
        this._rowOnMouseUp = rowOnMouseUp;
    }
    // Property: rowGroupStyle
    private String _rowGroupStyle;
    
    public String getRowGroupStyle()
    {
        if (_rowGroupStyle != null)
        {
            return _rowGroupStyle;
        }
        ValueExpression vb = getValueExpression("rowGroupStyle");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setRowGroupStyle(String rowGroupStyle)
    {
        this._rowGroupStyle = rowGroupStyle;
    }
    // Property: rowGroupStyleClass
    private String _rowGroupStyleClass;
    
    public String getRowGroupStyleClass()
    {
        if (_rowGroupStyleClass != null)
        {
            return _rowGroupStyleClass;
        }
        ValueExpression vb = getValueExpression("rowGroupStyleClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setRowGroupStyleClass(String rowGroupStyleClass)
    {
        this._rowGroupStyleClass = rowGroupStyleClass;
    }
    // Property: bodyStyle
    private String _bodyStyle;
    
    public String getBodyStyle()
    {
        if (_bodyStyle != null)
        {
            return _bodyStyle;
        }
        ValueExpression vb = getValueExpression("bodyStyle");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setBodyStyle(String bodyStyle)
    {
        this._bodyStyle = bodyStyle;
    }
    // Property: bodyStyleClass
    private String _bodyStyleClass;
    
    public String getBodyStyleClass()
    {
        if (_bodyStyleClass != null)
        {
            return _bodyStyleClass;
        }
        ValueExpression vb = getValueExpression("bodyStyleClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setBodyStyleClass(String bodyStyleClass)
    {
        this._bodyStyleClass = bodyStyleClass;
    }
    // Property: newspaperColumns
    private int _newspaperColumns;
    
    private boolean _newspaperColumnsSet;
    
    public int getNewspaperColumns()
    {
        if (_newspaperColumnsSet)
        {
            return _newspaperColumns;
        }
        ValueExpression vb = getValueExpression("newspaperColumns");
        if (vb != null)
        {
            return ((Integer) vb.getValue(getFacesContext().getELContext())).intValue();
        }
        return 1; 
    }

    public void setNewspaperColumns(int newspaperColumns)
    {
        this._newspaperColumns = newspaperColumns;
        this._newspaperColumnsSet = true;        
    }
    // Property: newspaperOrientation
    private String _newspaperOrientation;
    
    public String getNewspaperOrientation()
    {
        if (_newspaperOrientation != null)
        {
            return _newspaperOrientation;
        }
        ValueExpression vb = getValueExpression("newspaperOrientation");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return "vertical"; 
    }

    public void setNewspaperOrientation(String newspaperOrientation)
    {
        this._newspaperOrientation = newspaperOrientation;
    }
    // Property: renderedIfEmpty
    private boolean _renderedIfEmpty;
    
    private boolean _renderedIfEmptySet;
    
    public boolean isRenderedIfEmpty()
    {
        if (_renderedIfEmptySet)
        {
            return _renderedIfEmpty;
        }
        ValueExpression vb = getValueExpression("renderedIfEmpty");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return true; 
    }

    public void setRenderedIfEmpty(boolean renderedIfEmpty)
    {
        this._renderedIfEmpty = renderedIfEmpty;
        this._renderedIfEmptySet = true;        
    }
    // Property: rowIndexVar
    private String _rowIndexVar;
    
    public String getRowIndexVar()
    {
        if (_rowIndexVar != null)
        {
            return _rowIndexVar;
        }
        ValueExpression vb = getValueExpression("rowIndexVar");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setRowIndexVar(String rowIndexVar)
    {
        this._rowIndexVar = rowIndexVar;
    }
    // Property: rowCountVar
    private String _rowCountVar;
    
    public String getRowCountVar()
    {
        if (_rowCountVar != null)
        {
            return _rowCountVar;
        }
        ValueExpression vb = getValueExpression("rowCountVar");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setRowCountVar(String rowCountVar)
    {
        this._rowCountVar = rowCountVar;
    }
    // Property: previousRowDataVar
    private String _previousRowDataVar;
    
    public String getPreviousRowDataVar()
    {
        if (_previousRowDataVar != null)
        {
            return _previousRowDataVar;
        }
        ValueExpression vb = getValueExpression("previousRowDataVar");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setPreviousRowDataVar(String previousRowDataVar)
    {
        this._previousRowDataVar = previousRowDataVar;
    }
    // Property: sortedColumnVar
    private String _sortedColumnVar;
    
    public String getSortedColumnVar()
    {
        if (_sortedColumnVar != null)
        {
            return _sortedColumnVar;
        }
        ValueExpression vb = getValueExpression("sortedColumnVar");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setSortedColumnVar(String sortedColumnVar)
    {
        this._sortedColumnVar = sortedColumnVar;
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
    // Property: rowId
    private String _rowId;
    
    public String getRowId()
    {
        if (_rowId != null)
        {
            return _rowId;
        }
        ValueExpression vb = getValueExpression("rowId");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setRowId(String rowId)
    {
        this._rowId = rowId;
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
    // Property: valueType
    private String _valueType;
    
    public String getValueType()
    {
        if (_valueType != null)
        {
            return _valueType;
        }
        ValueExpression vb = getValueExpression("valueType");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setValueType(String valueType)
    {
        this._valueType = valueType;
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
        Object[] values = new Object[39];
        values[0] = super.saveState(facesContext);
        values[1] = Boolean.valueOf(_sortable);
        values[2] = Boolean.valueOf(_sortableSet);
        values[3] = Boolean.valueOf(_embedded);
        values[4] = Boolean.valueOf(_embeddedSet);
        values[5] = Boolean.valueOf(_detailStampExpandedDefault);
        values[6] = Boolean.valueOf(_detailStampExpandedDefaultSet);
        values[7] = _detailStampLocation;
        values[8] = _rowOnMouseOver;
        values[9] = _rowOnMouseOut;
        values[10] = _rowOnClick;
        values[11] = _rowOnDblClick;
        values[12] = _rowOnKeyDown;
        values[13] = _rowOnKeyPress;
        values[14] = _rowOnKeyUp;
        values[15] = _rowOnMouseDown;
        values[16] = _rowOnMouseMove;
        values[17] = _rowOnMouseUp;
        values[18] = _rowGroupStyle;
        values[19] = _rowGroupStyleClass;
        values[20] = _bodyStyle;
        values[21] = _bodyStyleClass;
        values[22] = Integer.valueOf(_newspaperColumns);
        values[23] = Boolean.valueOf(_newspaperColumnsSet);
        values[24] = _newspaperOrientation;
        values[25] = Boolean.valueOf(_renderedIfEmpty);
        values[26] = Boolean.valueOf(_renderedIfEmptySet);
        values[27] = _rowIndexVar;
        values[28] = _rowCountVar;
        values[29] = _previousRowDataVar;
        values[30] = _sortedColumnVar;
        values[31] = _align;
        values[32] = _rowId;
        values[33] = _datafld;
        values[34] = _datasrc;
        values[35] = _dataformatas;
        values[36] = _valueType;
        values[37] = _enabledOnUserRole;
        values[38] = _visibleOnUserRole;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _sortable = ((Boolean) values[1]).booleanValue();
        _sortableSet = ((Boolean) values[2]).booleanValue();
        _embedded = ((Boolean) values[3]).booleanValue();
        _embeddedSet = ((Boolean) values[4]).booleanValue();
        _detailStampExpandedDefault = ((Boolean) values[5]).booleanValue();
        _detailStampExpandedDefaultSet = ((Boolean) values[6]).booleanValue();
        _detailStampLocation = (java.lang.String) values[7];
        _rowOnMouseOver = (java.lang.String) values[8];
        _rowOnMouseOut = (java.lang.String) values[9];
        _rowOnClick = (java.lang.String) values[10];
        _rowOnDblClick = (java.lang.String) values[11];
        _rowOnKeyDown = (java.lang.String) values[12];
        _rowOnKeyPress = (java.lang.String) values[13];
        _rowOnKeyUp = (java.lang.String) values[14];
        _rowOnMouseDown = (java.lang.String) values[15];
        _rowOnMouseMove = (java.lang.String) values[16];
        _rowOnMouseUp = (java.lang.String) values[17];
        _rowGroupStyle = (java.lang.String) values[18];
        _rowGroupStyleClass = (java.lang.String) values[19];
        _bodyStyle = (java.lang.String) values[20];
        _bodyStyleClass = (java.lang.String) values[21];
        _newspaperColumns = ((Integer) values[22]).intValue();
        _newspaperColumnsSet = ((Boolean) values[23]).booleanValue();
        _newspaperOrientation = (java.lang.String) values[24];
        _renderedIfEmpty = ((Boolean) values[25]).booleanValue();
        _renderedIfEmptySet = ((Boolean) values[26]).booleanValue();
        _rowIndexVar = (java.lang.String) values[27];
        _rowCountVar = (java.lang.String) values[28];
        _previousRowDataVar = (java.lang.String) values[29];
        _sortedColumnVar = (java.lang.String) values[30];
        _align = (java.lang.String) values[31];
        _rowId = (java.lang.String) values[32];
        _datafld = (java.lang.String) values[33];
        _datasrc = (java.lang.String) values[34];
        _dataformatas = (java.lang.String) values[35];
        _valueType = (java.lang.String) values[36];
        _enabledOnUserRole = (java.lang.String) values[37];
        _visibleOnUserRole = (java.lang.String) values[38];
    }
}
