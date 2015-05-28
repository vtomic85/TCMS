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
package org.apache.myfaces.custom.newspaper;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;


// Generated from class org.apache.myfaces.custom.newspaper.AbstractHtmlNewspaperTable.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlNewspaperTable extends org.apache.myfaces.custom.newspaper.AbstractHtmlNewspaperTable
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.Data";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.HtmlNewspaperTable";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.HtmlNewspaperTable";


    public HtmlNewspaperTable()
    {
        setRendererType("org.apache.myfaces.HtmlNewspaperTable");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
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
        return null;
    }

    public void setNewspaperOrientation(String newspaperOrientation)
    {
        this._newspaperOrientation = newspaperOrientation;
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
        Object[] values = new Object[8];
        values[0] = super.saveState(facesContext);
        values[1] = Integer.valueOf(_newspaperColumns);
        values[2] = Boolean.valueOf(_newspaperColumnsSet);
        values[3] = _newspaperOrientation;
        values[4] = _datafld;
        values[5] = _datasrc;
        values[6] = _dataformatas;
        values[7] = _align;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _newspaperColumns = ((Integer) values[1]).intValue();
        _newspaperColumnsSet = ((Boolean) values[2]).booleanValue();
        _newspaperOrientation = (java.lang.String) values[3];
        _datafld = (java.lang.String) values[4];
        _datasrc = (java.lang.String) values[5];
        _dataformatas = (java.lang.String) values[6];
        _align = (java.lang.String) values[7];
    }
}
