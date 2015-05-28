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
package org.apache.myfaces.custom.buffer;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;


// Generated from class org.apache.myfaces.custom.buffer.AbstractBuffer.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class Buffer extends org.apache.myfaces.custom.buffer.AbstractBuffer
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.Data";
    static public final String COMPONENT_TYPE =
        "org.apache.myfaces.Buffer";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.apache.myfaces.Buffer";


    public Buffer()
    {
        setRendererType("org.apache.myfaces.Buffer");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
    

    // Property: into
    private String _into;
    
    final protected String getLocalInto()
    {
        return _into;
    }
     
    public String getInto()
    {
        if (_into != null)
        {
            return _into;
        }
        ValueExpression vb = getValueExpression("into");
        if (vb != null)
        {
            return (String) vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    public void setInto(String into)
    {
        this._into = into;
    }

    public Object saveState(FacesContext facesContext)
    {
        Object[] values = new Object[2];
        values[0] = super.saveState(facesContext);
        values[1] = _into;
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
        _into = (java.lang.String) values[1];
    }
}
