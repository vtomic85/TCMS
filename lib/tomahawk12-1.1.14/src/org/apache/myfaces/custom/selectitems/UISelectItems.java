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
package org.apache.myfaces.custom.selectitems;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;


// Generated from class org.apache.myfaces.custom.selectitems.AbstractUISelectItems.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class UISelectItems extends org.apache.myfaces.custom.selectitems.AbstractUISelectItems
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.SelectItems";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.UISelectItems";


    public UISelectItems()
    {
        setRendererType(null);
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: var
    private String _var;
    
    public String getVar()
    {
        if (_var != null)
        {
            return _var;
        }
        ValueExpression vb = getValueExpression("var");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setVar(String var)
    {
        this._var = var;
    }
    // Property: itemLabel
    private Object _itemLabel;
    
    public Object getItemLabel()
    {
        if (_itemLabel != null)
        {
            return _itemLabel;
        }
        ValueExpression vb = getValueExpression("itemLabel");
        if (vb != null)
        {
            return  vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setItemLabel(Object itemLabel)
    {
        this._itemLabel = itemLabel;
    }
    // Property: itemValue
    private Object _itemValue;
    
    public Object getItemValue()
    {
        if (_itemValue != null)
        {
            return _itemValue;
        }
        ValueExpression vb = getValueExpression("itemValue");
        if (vb != null)
        {
            return  vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setItemValue(Object itemValue)
    {
        this._itemValue = itemValue;
    }
    // Property: itemLabelEscaped
    private Object _itemLabelEscaped;
    
    public Object getItemLabelEscaped()
    {
        if (_itemLabelEscaped != null)
        {
            return _itemLabelEscaped;
        }
        ValueExpression vb = getValueExpression("itemLabelEscaped");
        if (vb != null)
        {
            return  vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setItemLabelEscaped(Object itemLabelEscaped)
    {
        this._itemLabelEscaped = itemLabelEscaped;
    }
    // Property: itemDescription
    private Object _itemDescription;
    
    public Object getItemDescription()
    {
        if (_itemDescription != null)
        {
            return _itemDescription;
        }
        ValueExpression vb = getValueExpression("itemDescription");
        if (vb != null)
        {
            return  vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setItemDescription(Object itemDescription)
    {
        this._itemDescription = itemDescription;
    }
    // Property: itemDisabled
    private Object _itemDisabled;
    
    public Object getItemDisabled()
    {
        if (_itemDisabled != null)
        {
            return _itemDisabled;
        }
        ValueExpression vb = getValueExpression("itemDisabled");
        if (vb != null)
        {
            return  vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setItemDisabled(Object itemDisabled)
    {
        this._itemDisabled = itemDisabled;
    }
    // Property: useEntryAsItem
    private boolean _useEntryAsItem;
    
    private boolean _useEntryAsItemSet;
    
    public boolean isUseEntryAsItem()
    {
        if (_useEntryAsItemSet)
        {
            return _useEntryAsItem;
        }
        ValueExpression vb = getValueExpression("useEntryAsItem");
        if (vb != null)
        {
            return ((Boolean) vb.getValue(getFacesContext().getELContext())).booleanValue();
        }
        return false; 
    }

    public void setUseEntryAsItem(boolean useEntryAsItem)
    {
        this._useEntryAsItem = useEntryAsItem;
        this._useEntryAsItemSet = true;        
    }

    public Object saveState(FacesContext facesContext)
    {
        Object[] values = new Object[9];
        values[0] = super.saveState(facesContext);
        values[1] = _var;
        values[2] = _itemLabel;
        values[3] = _itemValue;
        values[4] = _itemLabelEscaped;
        values[5] = _itemDescription;
        values[6] = _itemDisabled;
        values[7] = Boolean.valueOf(_useEntryAsItem);
        values[8] = Boolean.valueOf(_useEntryAsItemSet);
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _var = (java.lang.String) values[1];
        _itemLabel =  values[2];
        _itemValue =  values[3];
        _itemLabelEscaped =  values[4];
        _itemDescription =  values[5];
        _itemDisabled =  values[6];
        _useEntryAsItem = ((Boolean) values[7]).booleanValue();
        _useEntryAsItemSet = ((Boolean) values[8]).booleanValue();
    }
}
