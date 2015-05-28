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
package org.apache.myfaces.custom.datascroller;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;
import javax.faces.el.MethodBinding;


// Generated from class org.apache.myfaces.custom.datascroller.AbstractHtmlDataScroller.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlDataScroller extends org.apache.myfaces.custom.datascroller.AbstractHtmlDataScroller
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.Panel";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.HtmlDataScroller";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.DataScroller";


    public HtmlDataScroller()
    {
        setRendererType("org.apache.myfaces.DataScroller");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: layout
    private String _layout;
    
    public String getLayout()
    {
        if (_layout != null)
        {
            return _layout;
        }
        ValueExpression vb = getValueExpression("layout");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return "table"; 
    }

    public void setLayout(String layout)
    {
        this._layout = layout;
    }
    // Property: colspan
    private int _colspan;
    
    private boolean _colspanSet;
    
    public int getColspan()
    {
        if (_colspanSet)
        {
            return _colspan;
        }
        ValueExpression vb = getValueExpression("colspan");
        if (vb != null)
        {
            return ((Integer) vb.getValue(getFacesContext().getELContext())).intValue();
        }
        return Integer.MIN_VALUE; 
    }

    public void setColspan(int colspan)
    {
        this._colspan = colspan;
        this._colspanSet = true;        
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
    // Property: for
    private String _for;
    
    public String getFor()
    {
        if (_for != null)
        {
            return _for;
        }
        ValueExpression vb = getValueExpression("for");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setFor(String forParam)
    {
        this._for = forParam;
    }
    // Property: fastStep
    private int _fastStep;
    
    private boolean _fastStepSet;
    
    public int getFastStep()
    {
        if (_fastStepSet)
        {
            return _fastStep;
        }
        ValueExpression vb = getValueExpression("fastStep");
        if (vb != null)
        {
            return ((Integer) vb.getValue(getFacesContext().getELContext())).intValue();
        }
        return Integer.MIN_VALUE; 
    }

    public void setFastStep(int fastStep)
    {
        this._fastStep = fastStep;
        this._fastStepSet = true;        
    }
    // Property: pageIndexVar
    private String _pageIndexVar;
    
    public String getPageIndexVar()
    {
        if (_pageIndexVar != null)
        {
            return _pageIndexVar;
        }
        ValueExpression vb = getValueExpression("pageIndexVar");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setPageIndexVar(String pageIndexVar)
    {
        this._pageIndexVar = pageIndexVar;
    }
    // Property: pageCountVar
    private String _pageCountVar;
    
    public String getPageCountVar()
    {
        if (_pageCountVar != null)
        {
            return _pageCountVar;
        }
        ValueExpression vb = getValueExpression("pageCountVar");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setPageCountVar(String pageCountVar)
    {
        this._pageCountVar = pageCountVar;
    }
    // Property: rowsCountVar
    private String _rowsCountVar;
    
    public String getRowsCountVar()
    {
        if (_rowsCountVar != null)
        {
            return _rowsCountVar;
        }
        ValueExpression vb = getValueExpression("rowsCountVar");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setRowsCountVar(String rowsCountVar)
    {
        this._rowsCountVar = rowsCountVar;
    }
    // Property: displayedRowsCountVar
    private String _displayedRowsCountVar;
    
    public String getDisplayedRowsCountVar()
    {
        if (_displayedRowsCountVar != null)
        {
            return _displayedRowsCountVar;
        }
        ValueExpression vb = getValueExpression("displayedRowsCountVar");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setDisplayedRowsCountVar(String displayedRowsCountVar)
    {
        this._displayedRowsCountVar = displayedRowsCountVar;
    }
    // Property: firstRowIndexVar
    private String _firstRowIndexVar;
    
    public String getFirstRowIndexVar()
    {
        if (_firstRowIndexVar != null)
        {
            return _firstRowIndexVar;
        }
        ValueExpression vb = getValueExpression("firstRowIndexVar");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setFirstRowIndexVar(String firstRowIndexVar)
    {
        this._firstRowIndexVar = firstRowIndexVar;
    }
    // Property: lastRowIndexVar
    private String _lastRowIndexVar;
    
    public String getLastRowIndexVar()
    {
        if (_lastRowIndexVar != null)
        {
            return _lastRowIndexVar;
        }
        ValueExpression vb = getValueExpression("lastRowIndexVar");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setLastRowIndexVar(String lastRowIndexVar)
    {
        this._lastRowIndexVar = lastRowIndexVar;
    }
    // Property: paginator
    private boolean _paginator;
    
    private boolean _paginatorSet;
    
    public boolean isPaginator()
    {
        if (_paginatorSet)
        {
            return _paginator;
        }
        ValueExpression vb = getValueExpression("paginator");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return false; 
    }

    public void setPaginator(boolean paginator)
    {
        this._paginator = paginator;
        this._paginatorSet = true;        
    }
    // Property: paginatorMaxPages
    private int _paginatorMaxPages;
    
    private boolean _paginatorMaxPagesSet;
    
    public int getPaginatorMaxPages()
    {
        if (_paginatorMaxPagesSet)
        {
            return _paginatorMaxPages;
        }
        ValueExpression vb = getValueExpression("paginatorMaxPages");
        if (vb != null)
        {
            return ((Integer) vb.getValue(getFacesContext().getELContext())).intValue();
        }
        return Integer.MIN_VALUE; 
    }

    public void setPaginatorMaxPages(int paginatorMaxPages)
    {
        this._paginatorMaxPages = paginatorMaxPages;
        this._paginatorMaxPagesSet = true;        
    }
    // Property: paginatorTableClass
    private String _paginatorTableClass;
    
    public String getPaginatorTableClass()
    {
        if (_paginatorTableClass != null)
        {
            return _paginatorTableClass;
        }
        ValueExpression vb = getValueExpression("paginatorTableClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setPaginatorTableClass(String paginatorTableClass)
    {
        this._paginatorTableClass = paginatorTableClass;
    }
    // Property: paginatorTableStyle
    private String _paginatorTableStyle;
    
    public String getPaginatorTableStyle()
    {
        if (_paginatorTableStyle != null)
        {
            return _paginatorTableStyle;
        }
        ValueExpression vb = getValueExpression("paginatorTableStyle");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setPaginatorTableStyle(String paginatorTableStyle)
    {
        this._paginatorTableStyle = paginatorTableStyle;
    }
    // Property: paginatorColumnClass
    private String _paginatorColumnClass;
    
    public String getPaginatorColumnClass()
    {
        if (_paginatorColumnClass != null)
        {
            return _paginatorColumnClass;
        }
        ValueExpression vb = getValueExpression("paginatorColumnClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setPaginatorColumnClass(String paginatorColumnClass)
    {
        this._paginatorColumnClass = paginatorColumnClass;
    }
    // Property: paginatorColumnStyle
    private String _paginatorColumnStyle;
    
    public String getPaginatorColumnStyle()
    {
        if (_paginatorColumnStyle != null)
        {
            return _paginatorColumnStyle;
        }
        ValueExpression vb = getValueExpression("paginatorColumnStyle");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setPaginatorColumnStyle(String paginatorColumnStyle)
    {
        this._paginatorColumnStyle = paginatorColumnStyle;
    }
    // Property: paginatorActiveColumnClass
    private String _paginatorActiveColumnClass;
    
    public String getPaginatorActiveColumnClass()
    {
        if (_paginatorActiveColumnClass != null)
        {
            return _paginatorActiveColumnClass;
        }
        ValueExpression vb = getValueExpression("paginatorActiveColumnClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setPaginatorActiveColumnClass(String paginatorActiveColumnClass)
    {
        this._paginatorActiveColumnClass = paginatorActiveColumnClass;
    }
    // Property: paginatorRenderLinkForActive
    private boolean _paginatorRenderLinkForActive;
    
    private boolean _paginatorRenderLinkForActiveSet;
    
    public boolean isPaginatorRenderLinkForActive()
    {
        if (_paginatorRenderLinkForActiveSet)
        {
            return _paginatorRenderLinkForActive;
        }
        ValueExpression vb = getValueExpression("paginatorRenderLinkForActive");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return true; 
    }

    public void setPaginatorRenderLinkForActive(boolean paginatorRenderLinkForActive)
    {
        this._paginatorRenderLinkForActive = paginatorRenderLinkForActive;
        this._paginatorRenderLinkForActiveSet = true;        
    }
    // Property: firstStyleClass
    private String _firstStyleClass;
    
    public String getFirstStyleClass()
    {
        if (_firstStyleClass != null)
        {
            return _firstStyleClass;
        }
        ValueExpression vb = getValueExpression("firstStyleClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setFirstStyleClass(String firstStyleClass)
    {
        this._firstStyleClass = firstStyleClass;
    }
    // Property: lastStyleClass
    private String _lastStyleClass;
    
    public String getLastStyleClass()
    {
        if (_lastStyleClass != null)
        {
            return _lastStyleClass;
        }
        ValueExpression vb = getValueExpression("lastStyleClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setLastStyleClass(String lastStyleClass)
    {
        this._lastStyleClass = lastStyleClass;
    }
    // Property: previousStyleClass
    private String _previousStyleClass;
    
    public String getPreviousStyleClass()
    {
        if (_previousStyleClass != null)
        {
            return _previousStyleClass;
        }
        ValueExpression vb = getValueExpression("previousStyleClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setPreviousStyleClass(String previousStyleClass)
    {
        this._previousStyleClass = previousStyleClass;
    }
    // Property: nextStyleClass
    private String _nextStyleClass;
    
    public String getNextStyleClass()
    {
        if (_nextStyleClass != null)
        {
            return _nextStyleClass;
        }
        ValueExpression vb = getValueExpression("nextStyleClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setNextStyleClass(String nextStyleClass)
    {
        this._nextStyleClass = nextStyleClass;
    }
    // Property: fastfStyleClass
    private String _fastfStyleClass;
    
    public String getFastfStyleClass()
    {
        if (_fastfStyleClass != null)
        {
            return _fastfStyleClass;
        }
        ValueExpression vb = getValueExpression("fastfStyleClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setFastfStyleClass(String fastfStyleClass)
    {
        this._fastfStyleClass = fastfStyleClass;
    }
    // Property: fastrStyleClass
    private String _fastrStyleClass;
    
    public String getFastrStyleClass()
    {
        if (_fastrStyleClass != null)
        {
            return _fastrStyleClass;
        }
        ValueExpression vb = getValueExpression("fastrStyleClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setFastrStyleClass(String fastrStyleClass)
    {
        this._fastrStyleClass = fastrStyleClass;
    }
    // Property: paginatorActiveColumnStyle
    private String _paginatorActiveColumnStyle;
    
    public String getPaginatorActiveColumnStyle()
    {
        if (_paginatorActiveColumnStyle != null)
        {
            return _paginatorActiveColumnStyle;
        }
        ValueExpression vb = getValueExpression("paginatorActiveColumnStyle");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setPaginatorActiveColumnStyle(String paginatorActiveColumnStyle)
    {
        this._paginatorActiveColumnStyle = paginatorActiveColumnStyle;
    }
    // Property: renderFacetsIfSinglePage
    private boolean _renderFacetsIfSinglePage;
    
    private boolean _renderFacetsIfSinglePageSet;
    
    public boolean isRenderFacetsIfSinglePage()
    {
        if (_renderFacetsIfSinglePageSet)
        {
            return _renderFacetsIfSinglePage;
        }
        ValueExpression vb = getValueExpression("renderFacetsIfSinglePage");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return true; 
    }

    public void setRenderFacetsIfSinglePage(boolean renderFacetsIfSinglePage)
    {
        this._renderFacetsIfSinglePage = renderFacetsIfSinglePage;
        this._renderFacetsIfSinglePageSet = true;        
    }
    // Property: immediate
    private boolean _immediate;
    
    private boolean _immediateSet;
    
    public boolean isImmediate()
    {
        if (_immediateSet)
        {
            return _immediate;
        }
        ValueExpression vb = getValueExpression("immediate");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return false; 
    }

    public void setImmediate(boolean immediate)
    {
        this._immediate = immediate;
        this._immediateSet = true;        
    }
    // Property: disableFacetLinksIfFirstPage
    private boolean _disableFacetLinksIfFirstPage;
    
    private boolean _disableFacetLinksIfFirstPageSet;
    
    public boolean isDisableFacetLinksIfFirstPage()
    {
        if (_disableFacetLinksIfFirstPageSet)
        {
            return _disableFacetLinksIfFirstPage;
        }
        ValueExpression vb = getValueExpression("disableFacetLinksIfFirstPage");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return false; 
    }

    public void setDisableFacetLinksIfFirstPage(boolean disableFacetLinksIfFirstPage)
    {
        this._disableFacetLinksIfFirstPage = disableFacetLinksIfFirstPage;
        this._disableFacetLinksIfFirstPageSet = true;        
    }
    // Property: disableFacetLinksIfLastPage
    private boolean _disableFacetLinksIfLastPage;
    
    private boolean _disableFacetLinksIfLastPageSet;
    
    public boolean isDisableFacetLinksIfLastPage()
    {
        if (_disableFacetLinksIfLastPageSet)
        {
            return _disableFacetLinksIfLastPage;
        }
        ValueExpression vb = getValueExpression("disableFacetLinksIfLastPage");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return false; 
    }

    public void setDisableFacetLinksIfLastPage(boolean disableFacetLinksIfLastPage)
    {
        this._disableFacetLinksIfLastPage = disableFacetLinksIfLastPage;
        this._disableFacetLinksIfLastPageSet = true;        
    }
    // Property: renderFacetLinksIfFirstPage
    private boolean _renderFacetLinksIfFirstPage;
    
    private boolean _renderFacetLinksIfFirstPageSet;
    
    public boolean isRenderFacetLinksIfFirstPage()
    {
        if (_renderFacetLinksIfFirstPageSet)
        {
            return _renderFacetLinksIfFirstPage;
        }
        ValueExpression vb = getValueExpression("renderFacetLinksIfFirstPage");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return true; 
    }

    public void setRenderFacetLinksIfFirstPage(boolean renderFacetLinksIfFirstPage)
    {
        this._renderFacetLinksIfFirstPage = renderFacetLinksIfFirstPage;
        this._renderFacetLinksIfFirstPageSet = true;        
    }
    // Property: renderFacetLinksIfLastPage
    private boolean _renderFacetLinksIfLastPage;
    
    private boolean _renderFacetLinksIfLastPageSet;
    
    public boolean isRenderFacetLinksIfLastPage()
    {
        if (_renderFacetLinksIfLastPageSet)
        {
            return _renderFacetLinksIfLastPage;
        }
        ValueExpression vb = getValueExpression("renderFacetLinksIfLastPage");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return true; 
    }

    public void setRenderFacetLinksIfLastPage(boolean renderFacetLinksIfLastPage)
    {
        this._renderFacetLinksIfLastPage = renderFacetLinksIfLastPage;
        this._renderFacetLinksIfLastPageSet = true;        
    }
    // Property: displayValueOnly
    private Boolean _displayValueOnly;
    
    public Boolean getDisplayValueOnly()
    {
        if (_displayValueOnly != null)
        {
            return _displayValueOnly;
        }
        ValueExpression vb = getValueExpression("displayValueOnly");
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

    public void setDisplayValueOnly(Boolean displayValueOnly)
    {
        this._displayValueOnly = displayValueOnly;
    }
    // Property: displayValueOnlyStyle
    private String _displayValueOnlyStyle;
    
    public String getDisplayValueOnlyStyle()
    {
        if (_displayValueOnlyStyle != null)
        {
            return _displayValueOnlyStyle;
        }
        ValueExpression vb = getValueExpression("displayValueOnlyStyle");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setDisplayValueOnlyStyle(String displayValueOnlyStyle)
    {
        this._displayValueOnlyStyle = displayValueOnlyStyle;
    }
    // Property: displayValueOnlyStyleClass
    private String _displayValueOnlyStyleClass;
    
    public String getDisplayValueOnlyStyleClass()
    {
        if (_displayValueOnlyStyleClass != null)
        {
            return _displayValueOnlyStyleClass;
        }
        ValueExpression vb = getValueExpression("displayValueOnlyStyleClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setDisplayValueOnlyStyleClass(String displayValueOnlyStyleClass)
    {
        this._displayValueOnlyStyleClass = displayValueOnlyStyleClass;
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

    public Object saveState(FacesContext facesContext)
    {
        Object[] values = new Object[57];
        values[0] = super.saveState(facesContext);
        values[1] = _layout;
        values[2] = Integer.valueOf(_colspan);
        values[3] = Boolean.valueOf(_colspanSet);
        values[4] = _onclick;
        values[5] = _ondblclick;
        values[6] = _for;
        values[7] = Integer.valueOf(_fastStep);
        values[8] = Boolean.valueOf(_fastStepSet);
        values[9] = _pageIndexVar;
        values[10] = _pageCountVar;
        values[11] = _rowsCountVar;
        values[12] = _displayedRowsCountVar;
        values[13] = _firstRowIndexVar;
        values[14] = _lastRowIndexVar;
        values[15] = Boolean.valueOf(_paginator);
        values[16] = Boolean.valueOf(_paginatorSet);
        values[17] = Integer.valueOf(_paginatorMaxPages);
        values[18] = Boolean.valueOf(_paginatorMaxPagesSet);
        values[19] = _paginatorTableClass;
        values[20] = _paginatorTableStyle;
        values[21] = _paginatorColumnClass;
        values[22] = _paginatorColumnStyle;
        values[23] = _paginatorActiveColumnClass;
        values[24] = Boolean.valueOf(_paginatorRenderLinkForActive);
        values[25] = Boolean.valueOf(_paginatorRenderLinkForActiveSet);
        values[26] = _firstStyleClass;
        values[27] = _lastStyleClass;
        values[28] = _previousStyleClass;
        values[29] = _nextStyleClass;
        values[30] = _fastfStyleClass;
        values[31] = _fastrStyleClass;
        values[32] = _paginatorActiveColumnStyle;
        values[33] = Boolean.valueOf(_renderFacetsIfSinglePage);
        values[34] = Boolean.valueOf(_renderFacetsIfSinglePageSet);
        values[35] = Boolean.valueOf(_immediate);
        values[36] = Boolean.valueOf(_immediateSet);
        values[37] = Boolean.valueOf(_disableFacetLinksIfFirstPage);
        values[38] = Boolean.valueOf(_disableFacetLinksIfFirstPageSet);
        values[39] = Boolean.valueOf(_disableFacetLinksIfLastPage);
        values[40] = Boolean.valueOf(_disableFacetLinksIfLastPageSet);
        values[41] = Boolean.valueOf(_renderFacetLinksIfFirstPage);
        values[42] = Boolean.valueOf(_renderFacetLinksIfFirstPageSet);
        values[43] = Boolean.valueOf(_renderFacetLinksIfLastPage);
        values[44] = Boolean.valueOf(_renderFacetLinksIfLastPageSet);
        values[45] = _displayValueOnly;
        values[46] = _displayValueOnlyStyle;
        values[47] = _displayValueOnlyStyleClass;
        values[48] = _enabledOnUserRole;
        values[49] = _visibleOnUserRole;
        values[50] = Boolean.valueOf(_forceId);
        values[51] = Boolean.valueOf(_forceIdIndex);
        values[52] = _dir;
        values[53] = _lang;
        values[54] = _title;
        values[55] = _style;
        values[56] = _styleClass;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _layout = (java.lang.String) values[1];
        _colspan = ((Integer) values[2]).intValue();
        _colspanSet = ((Boolean) values[3]).booleanValue();
        _onclick = (java.lang.String) values[4];
        _ondblclick = (java.lang.String) values[5];
        _for = (java.lang.String) values[6];
        _fastStep = ((Integer) values[7]).intValue();
        _fastStepSet = ((Boolean) values[8]).booleanValue();
        _pageIndexVar = (java.lang.String) values[9];
        _pageCountVar = (java.lang.String) values[10];
        _rowsCountVar = (java.lang.String) values[11];
        _displayedRowsCountVar = (java.lang.String) values[12];
        _firstRowIndexVar = (java.lang.String) values[13];
        _lastRowIndexVar = (java.lang.String) values[14];
        _paginator = ((Boolean) values[15]).booleanValue();
        _paginatorSet = ((Boolean) values[16]).booleanValue();
        _paginatorMaxPages = ((Integer) values[17]).intValue();
        _paginatorMaxPagesSet = ((Boolean) values[18]).booleanValue();
        _paginatorTableClass = (java.lang.String) values[19];
        _paginatorTableStyle = (java.lang.String) values[20];
        _paginatorColumnClass = (java.lang.String) values[21];
        _paginatorColumnStyle = (java.lang.String) values[22];
        _paginatorActiveColumnClass = (java.lang.String) values[23];
        _paginatorRenderLinkForActive = ((Boolean) values[24]).booleanValue();
        _paginatorRenderLinkForActiveSet = ((Boolean) values[25]).booleanValue();
        _firstStyleClass = (java.lang.String) values[26];
        _lastStyleClass = (java.lang.String) values[27];
        _previousStyleClass = (java.lang.String) values[28];
        _nextStyleClass = (java.lang.String) values[29];
        _fastfStyleClass = (java.lang.String) values[30];
        _fastrStyleClass = (java.lang.String) values[31];
        _paginatorActiveColumnStyle = (java.lang.String) values[32];
        _renderFacetsIfSinglePage = ((Boolean) values[33]).booleanValue();
        _renderFacetsIfSinglePageSet = ((Boolean) values[34]).booleanValue();
        _immediate = ((Boolean) values[35]).booleanValue();
        _immediateSet = ((Boolean) values[36]).booleanValue();
        _disableFacetLinksIfFirstPage = ((Boolean) values[37]).booleanValue();
        _disableFacetLinksIfFirstPageSet = ((Boolean) values[38]).booleanValue();
        _disableFacetLinksIfLastPage = ((Boolean) values[39]).booleanValue();
        _disableFacetLinksIfLastPageSet = ((Boolean) values[40]).booleanValue();
        _renderFacetLinksIfFirstPage = ((Boolean) values[41]).booleanValue();
        _renderFacetLinksIfFirstPageSet = ((Boolean) values[42]).booleanValue();
        _renderFacetLinksIfLastPage = ((Boolean) values[43]).booleanValue();
        _renderFacetLinksIfLastPageSet = ((Boolean) values[44]).booleanValue();
        _displayValueOnly = (java.lang.Boolean) values[45];
        _displayValueOnlyStyle = (java.lang.String) values[46];
        _displayValueOnlyStyleClass = (java.lang.String) values[47];
        _enabledOnUserRole = (java.lang.String) values[48];
        _visibleOnUserRole = (java.lang.String) values[49];
        _forceId = ((Boolean) values[50]).booleanValue();
        _forceIdIndex = ((Boolean) values[51]).booleanValue();
        _dir = (java.lang.String) values[52];
        _lang = (java.lang.String) values[53];
        _title = (java.lang.String) values[54];
        _style = (java.lang.String) values[55];
        _styleClass = (java.lang.String) values[56];
    }
}
