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
package org.apache.myfaces.custom.captcha;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;


// Generated from class org.apache.myfaces.custom.captcha.AbstractCAPTCHAComponent.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class CAPTCHAComponent extends org.apache.myfaces.custom.captcha.AbstractCAPTCHAComponent
{

    static public final String COMPONENT_FAMILY =
        "org.apache.myfaces.CAPTCHA";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.CAPTCHA";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.CAPTCHA";


    public CAPTCHAComponent()
    {
        setRendererType("org.apache.myfaces.CAPTCHA");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: captchaSessionKeyName
    private String _captchaSessionKeyName;
    
    public String getCaptchaSessionKeyName()
    {
        if (_captchaSessionKeyName != null)
        {
            return _captchaSessionKeyName;
        }
        ValueExpression vb = getValueExpression("captchaSessionKeyName");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setCaptchaSessionKeyName(String captchaSessionKeyName)
    {
        this._captchaSessionKeyName = captchaSessionKeyName;
    }
    // Property: imageWidth
    private String _imageWidth;
    
    public String getImageWidth()
    {
        if (_imageWidth != null)
        {
            return _imageWidth;
        }
        ValueExpression vb = getValueExpression("imageWidth");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setImageWidth(String imageWidth)
    {
        this._imageWidth = imageWidth;
    }
    // Property: imageHeight
    private String _imageHeight;
    
    public String getImageHeight()
    {
        if (_imageHeight != null)
        {
            return _imageHeight;
        }
        ValueExpression vb = getValueExpression("imageHeight");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setImageHeight(String imageHeight)
    {
        this._imageHeight = imageHeight;
    }

    public Object saveState(FacesContext facesContext)
    {
        Object[] values = new Object[4];
        values[0] = super.saveState(facesContext);
        values[1] = _captchaSessionKeyName;
        values[2] = _imageWidth;
        values[3] = _imageHeight;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _captchaSessionKeyName = (java.lang.String) values[1];
        _imageWidth = (java.lang.String) values[2];
        _imageHeight = (java.lang.String) values[3];
    }
}
