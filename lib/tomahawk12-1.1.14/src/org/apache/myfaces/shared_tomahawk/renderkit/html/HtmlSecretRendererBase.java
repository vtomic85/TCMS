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
package org.apache.myfaces.shared_tomahawk.renderkit.html;

import org.apache.myfaces.shared_tomahawk.renderkit.JSFAttr;
import org.apache.myfaces.shared_tomahawk.renderkit.RendererUtils;

import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.component.UIOutput;
import javax.faces.component.html.HtmlInputSecret;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.convert.ConverterException;
import java.io.IOException;


/**
 * see Spec.1.0 EA - JSF.7.6.4 Renderer Types for UIInput Components
 * @author Manfred Geiler (latest modification by $Author: matzew $)
 * @author Thomas Spiegl
 * @author Anton Koinov
 * @version $Revision: 557350 $ $Date: 2007-07-18 13:19:50 -0500 (Wed, 18 Jul 2007) $
 */
public class HtmlSecretRendererBase
        extends HtmlRenderer
{
    private static final String AUTOCOMPLETE_VALUE_OFF = "off";

    public void encodeEnd(FacesContext facesContext, UIComponent uiComponent)
            throws IOException
    {
        RendererUtils.checkParamValidity(facesContext, uiComponent, UIInput.class);

        ResponseWriter writer = facesContext.getResponseWriter();
        writer.startElement(HTML.INPUT_ELEM, uiComponent);
        writer.writeAttribute(HTML.TYPE_ATTR, org.apache.myfaces.shared_tomahawk.renderkit.html.HTML.INPUT_TYPE_PASSWORD, null);

        String clientId = uiComponent.getClientId(facesContext);

        HtmlRendererUtils.writeIdIfNecessary(writer, uiComponent, facesContext);
        writer.writeAttribute(HTML.NAME_ATTR, clientId, null);

        boolean isRedisplay;
        if (uiComponent instanceof HtmlInputSecret)
        {
            isRedisplay = ((HtmlInputSecret)uiComponent).isRedisplay();
        }
        else
        {
            isRedisplay = org.apache.myfaces.shared_tomahawk.renderkit.RendererUtils.getBooleanAttribute(uiComponent, JSFAttr.REDISPLAY_ATTR, false);
        }
        if (isRedisplay)
        {
            String strValue = RendererUtils.getStringValue(facesContext, uiComponent);
            writer.writeAttribute(HTML.VALUE_ATTR, strValue, JSFAttr.VALUE_ATTR);
        }

        HtmlRendererUtils.renderHTMLAttributes(writer, uiComponent, HTML.INPUT_PASSTHROUGH_ATTRIBUTES_WITHOUT_DISABLED);
        if (isDisabled(facesContext, uiComponent))
        {
            writer.writeAttribute(HTML.DISABLED_ATTR, Boolean.TRUE, null);
        }

        if (isAutocompleteOff(facesContext, uiComponent))
        {
            writer.writeAttribute(HTML.AUTOCOMPLETE_ATTR, AUTOCOMPLETE_VALUE_OFF, HTML.AUTOCOMPLETE_ATTR);
        }

        writer.endElement(HTML.INPUT_ELEM);
    }


    protected boolean isDisabled(FacesContext facesContext, UIComponent uiComponent)
    {
        //TODO: overwrite in extended HtmlSecretRenderer and check for enabledOnUserRole
        if (uiComponent instanceof HtmlInputSecret)
        {
            return ((HtmlInputSecret)uiComponent).isDisabled();
        }

        return RendererUtils.getBooleanAttribute(uiComponent, HTML.DISABLED_ATTR, false);
    }

    /**
     * If autocomplete is "on" or not set, do not render it
     */
    protected boolean isAutocompleteOff(FacesContext facesContext, UIComponent component)
    {
        if (component instanceof HtmlInputSecret)
        {
            String autocomplete = ((HtmlInputSecret)component).getAutocomplete();
            if (autocomplete != null)
            {
                return autocomplete.equals(AUTOCOMPLETE_VALUE_OFF);
            }
        }

        return false;
    }

    public void decode(FacesContext facesContext, UIComponent component)
    {
        org.apache.myfaces.shared_tomahawk.renderkit.RendererUtils.checkParamValidity(facesContext, component, UIInput.class);
        HtmlRendererUtils.decodeUIInput(facesContext, component);
    }

    public Object getConvertedValue(FacesContext facesContext, UIComponent uiComponent, Object submittedValue) throws ConverterException
    {
        RendererUtils.checkParamValidity(facesContext, uiComponent, UIOutput.class);
        return RendererUtils.getConvertedUIOutputValue(facesContext,
                                                       (UIOutput)uiComponent,
                                                       submittedValue);
    }

}
