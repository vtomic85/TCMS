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
package org.apache.myfaces.custom.collapsiblepanel;

import javax.faces.component.UIComponent;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;
import javax.el.MethodExpression;
import javax.faces.event.MethodExpressionActionListener;
import javax.faces.el.MethodBinding;


// Generated from class org.apache.myfaces.custom.collapsiblepanel.AbstractHtmlHeaderLink.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class HtmlHeaderLinkTag
    extends org.apache.myfaces.generated.taglib.html.ext.HtmlCommandLinkTag
{
    public HtmlHeaderLinkTag()
    {    
    }
    
    public String getComponentType()
    {
        return "org.apache.myfaces.HtmlHeaderLink";
    }

    public String getRendererType()
    {
        return "org.apache.myfaces.HeaderLink";
    }


    protected void setProperties(UIComponent component)
    {
        if (!(component instanceof org.apache.myfaces.custom.collapsiblepanel.HtmlHeaderLink))
        {
            throw new IllegalArgumentException("Component "+
                component.getClass().getName() +" is no org.apache.myfaces.custom.collapsiblepanel.HtmlHeaderLink");
        }
        
        org.apache.myfaces.custom.collapsiblepanel.HtmlHeaderLink comp = (org.apache.myfaces.custom.collapsiblepanel.HtmlHeaderLink) component;
        
        super.setProperties(component);
        
        FacesContext context = getFacesContext();

    }

    public void release()
    {
        super.release();
    }
}
