/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.myfaces.custom.document;

import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;

/**
 * Base class to handle the document family
 * 
 * @JSFComponent
 *   tagClass = "org.apache.myfaces.custom.document.AbstractDocumentTag"
 *   configExcluded = "true"
 *   
 * @author Mario Ivankovits (latest modification by $Author: skitching $)
 * @version $Revision: 673833 $ $Date: 2008-07-03 16:58:05 -0500 (Thu, 03 Jul 2008) $
 */
public class AbstractDocument extends UIComponentBase
{
    private String _state = null;

    public static final String COMPONENT_FAMILY = "javax.faces.Data";

    public AbstractDocument(String renderType)
    {
        setRendererType(renderType);
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }

    public void setState(String state)
    {
        _state = state;
    }

    /**
     * state="start|end". Used to demarkate the document boundaries
     * 
     * @JSFProperty
     *   literalOnly = "true"
     */
    public String getState()
    {
        return _state;
    }

    public boolean hasState()
    {
        return isStartState() || isEndState();
    }

    public boolean isStartState()
    {
        return "start".equals(getState());
    }

    public boolean isEndState()
    {
        return "end".equals(getState());
    }

    public Object saveState(FacesContext context)
    {
        Object values[] = new Object[2];
        values[0] = super.saveState(context);
        values[1] = _state;
        return values;
    }

    public void restoreState(FacesContext context, Object state)
    {
        Object values[] = (Object[]) state;
        super.restoreState(context, values[0]);
        _state = (String) values[1];
    }
}