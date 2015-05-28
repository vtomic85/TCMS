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
package org.apache.myfaces.custom.tree;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;
import javax.el.MethodExpression;
import javax.faces.el.MethodBinding;


// Generated from class org.apache.myfaces.custom.tree.AbstractHtmlTreeImageCommandLink.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlTreeImageCommandLink extends org.apache.myfaces.custom.tree.AbstractHtmlTreeImageCommandLink
{

    static public final String COMPONENT_FAMILY =
        "org.apache.myfaces.HtmlTree";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.HtmlTreeImageCommandLink";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.HtmlTreeImageCommandLink";


    public HtmlTreeImageCommandLink()
    {
        setRendererType("org.apache.myfaces.HtmlTreeImageCommandLink");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: image
    private String _image;
    
    public String getImage()
    {
        if (_image != null)
        {
            return _image;
        }
        ValueExpression vb = getValueExpression("image");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setImage(String image)
    {
        this._image = image;
    }

    public Object saveState(FacesContext facesContext)
    {
        Object[] values = new Object[2];
        values[0] = super.saveState(facesContext);
        values[1] = _image;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _image = (java.lang.String) values[1];
    }
}
