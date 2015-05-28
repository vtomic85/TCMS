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
package org.apache.myfaces.custom.picklist;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;
import javax.faces.convert.Converter;
import javax.faces.el.MethodBinding;


// Generated from class org.apache.myfaces.custom.picklist.AbstractHtmlSelectManyPicklist.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlSelectManyPicklist extends org.apache.myfaces.custom.picklist.AbstractHtmlSelectManyPicklist
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.SelectMany";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.HtmlSelectManyPicklist";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.PicklistRenderer";


    public HtmlSelectManyPicklist()
    {
        setRendererType("org.apache.myfaces.PicklistRenderer");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: addButtonText
    private String _addButtonText;
    
    public String getAddButtonText()
    {
        if (_addButtonText != null)
        {
            return _addButtonText;
        }
        ValueExpression vb = getValueExpression("addButtonText");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setAddButtonText(String addButtonText)
    {
        this._addButtonText = addButtonText;
    }
    // Property: addAllButtonText
    private String _addAllButtonText;
    
    public String getAddAllButtonText()
    {
        if (_addAllButtonText != null)
        {
            return _addAllButtonText;
        }
        ValueExpression vb = getValueExpression("addAllButtonText");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setAddAllButtonText(String addAllButtonText)
    {
        this._addAllButtonText = addAllButtonText;
    }
    // Property: removeButtonText
    private String _removeButtonText;
    
    public String getRemoveButtonText()
    {
        if (_removeButtonText != null)
        {
            return _removeButtonText;
        }
        ValueExpression vb = getValueExpression("removeButtonText");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setRemoveButtonText(String removeButtonText)
    {
        this._removeButtonText = removeButtonText;
    }
    // Property: removeAllButtonText
    private String _removeAllButtonText;
    
    public String getRemoveAllButtonText()
    {
        if (_removeAllButtonText != null)
        {
            return _removeAllButtonText;
        }
        ValueExpression vb = getValueExpression("removeAllButtonText");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setRemoveAllButtonText(String removeAllButtonText)
    {
        this._removeAllButtonText = removeAllButtonText;
    }
    // Property: addButtonStyle
    private String _addButtonStyle;
    
    public String getAddButtonStyle()
    {
        if (_addButtonStyle != null)
        {
            return _addButtonStyle;
        }
        ValueExpression vb = getValueExpression("addButtonStyle");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setAddButtonStyle(String addButtonStyle)
    {
        this._addButtonStyle = addButtonStyle;
    }
    // Property: addAllButtonStyle
    private String _addAllButtonStyle;
    
    public String getAddAllButtonStyle()
    {
        if (_addAllButtonStyle != null)
        {
            return _addAllButtonStyle;
        }
        ValueExpression vb = getValueExpression("addAllButtonStyle");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setAddAllButtonStyle(String addAllButtonStyle)
    {
        this._addAllButtonStyle = addAllButtonStyle;
    }
    // Property: removeButtonStyle
    private String _removeButtonStyle;
    
    public String getRemoveButtonStyle()
    {
        if (_removeButtonStyle != null)
        {
            return _removeButtonStyle;
        }
        ValueExpression vb = getValueExpression("removeButtonStyle");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setRemoveButtonStyle(String removeButtonStyle)
    {
        this._removeButtonStyle = removeButtonStyle;
    }
    // Property: removeAllButtonStyle
    private String _removeAllButtonStyle;
    
    public String getRemoveAllButtonStyle()
    {
        if (_removeAllButtonStyle != null)
        {
            return _removeAllButtonStyle;
        }
        ValueExpression vb = getValueExpression("removeAllButtonStyle");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setRemoveAllButtonStyle(String removeAllButtonStyle)
    {
        this._removeAllButtonStyle = removeAllButtonStyle;
    }
    // Property: addButtonStyleClass
    private String _addButtonStyleClass;
    
    public String getAddButtonStyleClass()
    {
        if (_addButtonStyleClass != null)
        {
            return _addButtonStyleClass;
        }
        ValueExpression vb = getValueExpression("addButtonStyleClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setAddButtonStyleClass(String addButtonStyleClass)
    {
        this._addButtonStyleClass = addButtonStyleClass;
    }
    // Property: addAllButtonStyleClass
    private String _addAllButtonStyleClass;
    
    public String getAddAllButtonStyleClass()
    {
        if (_addAllButtonStyleClass != null)
        {
            return _addAllButtonStyleClass;
        }
        ValueExpression vb = getValueExpression("addAllButtonStyleClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setAddAllButtonStyleClass(String addAllButtonStyleClass)
    {
        this._addAllButtonStyleClass = addAllButtonStyleClass;
    }
    // Property: removeButtonStyleClass
    private String _removeButtonStyleClass;
    
    public String getRemoveButtonStyleClass()
    {
        if (_removeButtonStyleClass != null)
        {
            return _removeButtonStyleClass;
        }
        ValueExpression vb = getValueExpression("removeButtonStyleClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setRemoveButtonStyleClass(String removeButtonStyleClass)
    {
        this._removeButtonStyleClass = removeButtonStyleClass;
    }
    // Property: removeAllButtonStyleClass
    private String _removeAllButtonStyleClass;
    
    public String getRemoveAllButtonStyleClass()
    {
        if (_removeAllButtonStyleClass != null)
        {
            return _removeAllButtonStyleClass;
        }
        ValueExpression vb = getValueExpression("removeAllButtonStyleClass");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setRemoveAllButtonStyleClass(String removeAllButtonStyleClass)
    {
        this._removeAllButtonStyleClass = removeAllButtonStyleClass;
    }

    public Object saveState(FacesContext facesContext)
    {
        Object[] values = new Object[13];
        values[0] = super.saveState(facesContext);
        values[1] = _addButtonText;
        values[2] = _addAllButtonText;
        values[3] = _removeButtonText;
        values[4] = _removeAllButtonText;
        values[5] = _addButtonStyle;
        values[6] = _addAllButtonStyle;
        values[7] = _removeButtonStyle;
        values[8] = _removeAllButtonStyle;
        values[9] = _addButtonStyleClass;
        values[10] = _addAllButtonStyleClass;
        values[11] = _removeButtonStyleClass;
        values[12] = _removeAllButtonStyleClass;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _addButtonText = (java.lang.String) values[1];
        _addAllButtonText = (java.lang.String) values[2];
        _removeButtonText = (java.lang.String) values[3];
        _removeAllButtonText = (java.lang.String) values[4];
        _addButtonStyle = (java.lang.String) values[5];
        _addAllButtonStyle = (java.lang.String) values[6];
        _removeButtonStyle = (java.lang.String) values[7];
        _removeAllButtonStyle = (java.lang.String) values[8];
        _addButtonStyleClass = (java.lang.String) values[9];
        _addAllButtonStyleClass = (java.lang.String) values[10];
        _removeButtonStyleClass = (java.lang.String) values[11];
        _removeAllButtonStyleClass = (java.lang.String) values[12];
    }
}
