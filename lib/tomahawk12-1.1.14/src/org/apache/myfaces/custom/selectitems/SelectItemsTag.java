// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
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

import javax.faces.component.UIComponent;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;


// Generated from class org.apache.myfaces.custom.selectitems.AbstractUISelectItems.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class SelectItemsTag
    extends org.apache.myfaces.shared_tomahawk.taglib.core.SelectItemsTag
{
    public SelectItemsTag()
    {    
    }
    
    public String getComponentType()
    {
        return "org.apache.myfaces.UISelectItems";
    }

    public String getRendererType()
    {
        return null;
    }

    private ValueExpression _var;
    
    public void setVar(ValueExpression var)
    {
        _var = var;
    }
    private ValueExpression _itemLabel;
    
    public void setItemLabel(ValueExpression itemLabel)
    {
        _itemLabel = itemLabel;
    }
    private ValueExpression _itemValue;
    
    public void setItemValue(ValueExpression itemValue)
    {
        _itemValue = itemValue;
    }
    private ValueExpression _itemLabelEscaped;
    
    public void setItemLabelEscaped(ValueExpression itemLabelEscaped)
    {
        _itemLabelEscaped = itemLabelEscaped;
    }
    private ValueExpression _itemDescription;
    
    public void setItemDescription(ValueExpression itemDescription)
    {
        _itemDescription = itemDescription;
    }
    private ValueExpression _itemDisabled;
    
    public void setItemDisabled(ValueExpression itemDisabled)
    {
        _itemDisabled = itemDisabled;
    }
    private ValueExpression _useEntryAsItem;
    
    public void setUseEntryAsItem(ValueExpression useEntryAsItem)
    {
        _useEntryAsItem = useEntryAsItem;
    }

    protected void setProperties(UIComponent component)
    {
        if (!(component instanceof org.apache.myfaces.custom.selectitems.UISelectItems))
        {
            throw new IllegalArgumentException("Component "+
                component.getClass().getName() +" is no org.apache.myfaces.custom.selectitems.UISelectItems");
        }
        
        org.apache.myfaces.custom.selectitems.UISelectItems comp = (org.apache.myfaces.custom.selectitems.UISelectItems) component;
        
        super.setProperties(component);
        
        FacesContext context = getFacesContext();

        if (_var != null)
        {
            comp.setValueExpression("var", _var);
        } 
        if (_itemLabel != null)
        {
            comp.setValueExpression("itemLabel", _itemLabel);
        } 
        if (_itemValue != null)
        {
            comp.setValueExpression("itemValue", _itemValue);
        } 
        if (_itemLabelEscaped != null)
        {
            comp.setValueExpression("itemLabelEscaped", _itemLabelEscaped);
        } 
        if (_itemDescription != null)
        {
            comp.setValueExpression("itemDescription", _itemDescription);
        } 
        if (_itemDisabled != null)
        {
            comp.setValueExpression("itemDisabled", _itemDisabled);
        } 
        if (_useEntryAsItem != null)
        {
            comp.setValueExpression("useEntryAsItem", _useEntryAsItem);
        } 
    }

    public void release()
    {
        super.release();
        _var = null;
        _itemLabel = null;
        _itemValue = null;
        _itemLabelEscaped = null;
        _itemDescription = null;
        _itemDisabled = null;
        _useEntryAsItem = null;
    }
}
