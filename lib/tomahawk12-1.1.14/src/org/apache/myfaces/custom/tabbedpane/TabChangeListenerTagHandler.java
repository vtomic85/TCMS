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
package org.apache.myfaces.custom.tabbedpane;

import java.io.IOException;

import javax.el.ELException;
import javax.faces.FacesException;
import javax.faces.component.UIComponent;

import org.apache.myfaces.shared_tomahawk.util.ClassUtils;

import com.sun.facelets.FaceletContext;
import com.sun.facelets.FaceletException;
import com.sun.facelets.tag.TagAttribute;
import com.sun.facelets.tag.TagConfig;
import com.sun.facelets.tag.TagHandler;

/**
 * Custom Facelets taghandler for the TabChangeListener class.
 *  
 * @since 1.1.7
 */
public class TabChangeListenerTagHandler extends TagHandler
{
    private final TagAttribute typeAttr;

    public TabChangeListenerTagHandler(TagConfig config)
    {
        super(config);
        typeAttr = getRequiredAttribute("type");
    }

    public void apply(FaceletContext faceletContext, UIComponent parent)
            throws IOException, FacesException, FaceletException, ELException
    {
        // only process this tag if the parent has just been created..
        if (parent.getParent() == null)
        {
            if (parent instanceof HtmlPanelTabbedPane)
            {
                Object listenerRef;
                if (typeAttr.isLiteral())
                {
                    listenerRef = typeAttr.getValue();
                }
                else
                {
                    listenerRef = typeAttr.getObject(faceletContext);
                }
                
                if (listenerRef instanceof String)
                {
                    String className = (String) listenerRef;
                    TabChangeListener listener = (TabChangeListener) ClassUtils.newInstance(className);
                    ((HtmlPanelTabbedPane) parent).addTabChangeListener(listener);
                }
                else if (listenerRef instanceof TabChangeListener)
                {
                    TabChangeListener listener = (TabChangeListener) listenerRef;
                    ((HtmlPanelTabbedPane) parent).addTabChangeListener(listener);
                }
                else if (listenerRef == null)
                {
                    throw new FaceletException("Property 'type' must not be null.");
                }
                else
                {
                    throw new FaceletException(
                       "Property 'type' must be either a string (containing a class name) " +
                       "or a TabChangeListener instance.");
                }
            }
            else
            {
                throw new FaceletException(
                        "Component " + parent.getId() + " is not of type HtmlPanelTabbedPane");
            }
        }
    }
}
