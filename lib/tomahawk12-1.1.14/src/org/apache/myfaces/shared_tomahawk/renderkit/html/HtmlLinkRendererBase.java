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
import org.apache.myfaces.shared_tomahawk.renderkit.html.util.FormInfo;
import org.apache.myfaces.shared_tomahawk.renderkit.html.util.JavascriptUtils;
import org.apache.myfaces.shared_tomahawk.util._ComponentUtils;
import org.apache.myfaces.shared_tomahawk.config.MyfacesConfig;

import javax.faces.application.ViewHandler;
import javax.faces.component.UICommand;
import javax.faces.component.UIComponent;
import javax.faces.component.UIOutput;
import javax.faces.component.UIParameter;
import javax.faces.component.html.HtmlCommandLink;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.event.ActionEvent;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;

/**
 * @author Manfred Geiler
 * @version $Revision: 947903 $ $Date: 2010-05-24 22:40:23 -0500 (Mon, 24 May 2010) $
 */
public abstract class HtmlLinkRendererBase
    extends HtmlRenderer
{
    /* this one is never used
    public static final String URL_STATE_MARKER      = "JSF_URL_STATE_MARKER=DUMMY";
    public static final int    URL_STATE_MARKER_LEN  = URL_STATE_MARKER.length();
    */

    //private static final Log log = LogFactory.getLog(HtmlLinkRenderer.class);

    public boolean getRendersChildren()
    {
        // We must be able to render the children without a surrounding anchor
        // if the Link is disabled
        return true;
    }

    public void decode(FacesContext facesContext, UIComponent component)
    {
        super.decode(facesContext, component);  //check for NP

        if (component instanceof UICommand)
        {
            String clientId = component.getClientId(facesContext);
            FormInfo formInfo = findNestingForm(component, facesContext);
            String reqValue = (String) facesContext.getExternalContext().getRequestParameterMap().get(
                HtmlRendererUtils.getHiddenCommandLinkFieldName(formInfo));
            if (reqValue != null && reqValue.equals(clientId))
            {
                component.queueEvent(new ActionEvent(component));

                RendererUtils.initPartialValidationAndModelUpdate(component, facesContext);
            }
        }
        else if (component instanceof UIOutput)
        {
            //do nothing
        }
        else
        {
            throw new IllegalArgumentException("Unsupported component class " + component.getClass().getName());
        }
    }


    public void encodeBegin(FacesContext facesContext, UIComponent component) throws IOException
    {
        super.encodeBegin(facesContext, component);  //check for NP

        if (component instanceof UICommand)
        {
            renderCommandLinkStart(facesContext, component,
                                   component.getClientId(facesContext),
                                   ((UICommand)component).getValue(),
                                   getStyle(facesContext, component),
                                   getStyleClass(facesContext, component));
        }
        else if (component instanceof UIOutput)
        {
            renderOutputLinkStart(facesContext, (UIOutput)component);
        }
        else
        {
            throw new IllegalArgumentException("Unsupported component class " + component.getClass().getName());
        }
    }


    /**
     * Can be overwritten by derived classes to overrule the style to be used.
     */
    protected String getStyle(FacesContext facesContext, UIComponent link)
    {
        if (link instanceof HtmlCommandLink)
        {
            return ((HtmlCommandLink)link).getStyle();
        }

        return (String)link.getAttributes().get(HTML.STYLE_ATTR);

    }

    /**
     * Can be overwritten by derived classes to overrule the style class to be used.
     */
    protected String getStyleClass(FacesContext facesContext, UIComponent link)
    {
        if (link instanceof HtmlCommandLink)
        {
            return ((HtmlCommandLink)link).getStyleClass();
        }

        return (String)link.getAttributes().get(HTML.STYLE_CLASS_ATTR);

    }

    public void encodeChildren(FacesContext facesContext, UIComponent component) throws IOException
    {
        RendererUtils.renderChildren(facesContext, component);
    }

    public void encodeEnd(FacesContext facesContext, UIComponent component) throws IOException
    {
        super.encodeEnd(facesContext, component);  //check for NP

        if (component instanceof UICommand)
        {
                renderCommandLinkEnd(facesContext, component);

            HtmlFormRendererBase.renderScrollHiddenInputIfNecessary(
                findNestingForm(component, facesContext).getForm(), facesContext, facesContext.getResponseWriter());
        }
        else if (component instanceof UIOutput)
        {
            renderOutputLinkEnd(facesContext, component);
        }
        else
        {
            throw new IllegalArgumentException("Unsupported component class " + component.getClass().getName());
        }
    }

    protected void renderCommandLinkStart(FacesContext facesContext, UIComponent component,
                                          String clientId,
                                          Object value,
                                          String style,
                                          String styleClass)
            throws IOException
    {
        ResponseWriter writer = facesContext.getResponseWriter();

        if (HtmlRendererUtils.isDisabled(component))
        {
            writer.startElement(HTML.SPAN_ELEM, component);
            HtmlRendererUtils.writeIdIfNecessary(writer, component, facesContext);
            HtmlRendererUtils.renderHTMLAttributes(writer, component, HTML.ANCHOR_PASSTHROUGH_ATTRIBUTES);
        }
        else
        {
            String[] anchorAttrsToRender;
            if (JavascriptUtils.isJavascriptAllowed(facesContext.getExternalContext()))
            {
                renderJavaScriptAnchorStart(facesContext, writer, component, clientId);
                anchorAttrsToRender = HTML.ANCHOR_PASSTHROUGH_ATTRIBUTES_WITHOUT_ONCLICK_WITHOUT_STYLE;
            }
            else
            {
                renderNonJavaScriptAnchorStart(facesContext, writer, component, clientId);
                anchorAttrsToRender = HTML.ANCHOR_PASSTHROUGH_ATTRIBUTES_WITHOUT_STYLE;
            }

            HtmlRendererUtils.writeIdIfNecessary(writer, component, facesContext);
            HtmlRendererUtils.renderHTMLAttributes(writer, component,
                                                   anchorAttrsToRender);
            HtmlRendererUtils.renderHTMLAttribute(writer, HTML.STYLE_ATTR, HTML.STYLE_ATTR,
                                                  style);
            HtmlRendererUtils.renderHTMLAttribute(writer, HTML.STYLE_CLASS_ATTR, HTML.STYLE_CLASS_ATTR,
                                                  styleClass);
        }

        // render value as required by JSF 1.1 renderkitdocs
        if(value != null)
        {
            writer.writeText(value.toString(), JSFAttr.VALUE_ATTR);
        }
    }

    protected void renderJavaScriptAnchorStart(FacesContext facesContext,
                                               ResponseWriter writer,
                                               UIComponent component,
                                               String clientId)
        throws IOException
    {
        //Find form
        FormInfo formInfo = findNestingForm(component, facesContext);
        if (formInfo == null)
        {
            String path = RendererUtils.getPathToComponent(component);
            String msg = "Link is not embedded in a form. Change component/tag '" + clientId + "' from javax.faces.*/<h:tagName /> " +
                "to org.apache.myfaces.*/<t:tagName />, or embed it in a form.  This is not a bug. " +
                "Please see: http://wiki.apache.org/myfaces/Upgrading_to_Tomahawk_1.1.3 " +
                "The path to this component is " + path + ". If you need to render a special form and a JSF-form's attributes are not enough," +
                "consider using the s:form tag of the MyFaces sandbox.";
            throw new IllegalArgumentException(msg);
        }
        UIComponent nestingForm = formInfo.getForm();
        String formName = formInfo.getFormName();

        StringBuffer onClick = new StringBuffer();

        String commandOnclick;
        if (component instanceof HtmlCommandLink)
        {
            commandOnclick = ((HtmlCommandLink)component).getOnclick();
        }
        else
        {
            commandOnclick = (String)component.getAttributes().get(HTML.ONCLICK_ATTR);
        }
        if (commandOnclick != null)
        {
            onClick.append("var cf = function(){");
            onClick.append(commandOnclick);
            onClick.append('}');
            onClick.append(';');
            onClick.append("var oamSF = function(){");
        }

        if (RendererUtils.isAdfOrTrinidadForm(formInfo.getForm())) {
            onClick.append("submitForm('");
            onClick.append(formInfo.getForm().getClientId(facesContext));
            onClick.append("',1,{source:'");
            onClick.append(component.getClientId(facesContext));
            onClick.append("'});return false;");
        }
        else {
            HtmlRendererUtils.renderFormSubmitScript(facesContext);

            StringBuffer params = addChildParameters(facesContext, component, nestingForm);

            String target = getTarget(component);

            onClick.append("return ").
                append(HtmlRendererUtils.SUBMIT_FORM_FN_NAME).append("('").
                append(formName).append("','").
                append(clientId).append("'");

            if (params.length() > 2 || target != null) {
                onClick.append(",").
                    append(target == null ? "null" : ("'" + target + "'")).append(",").
                    append(params);
            }
            onClick.append(");");

            //Not necessary since we are using oamSetHiddenInput to create input hidden fields
            //render hidden field - todo: in here for backwards compatibility
            if (MyfacesConfig.getCurrentInstance(facesContext.getExternalContext()).isRenderHiddenFieldsForLinkParams())
            {
                String hiddenFieldName = HtmlRendererUtils.getHiddenCommandLinkFieldName(formInfo);
                addHiddenCommandParameter(facesContext, nestingForm, hiddenFieldName);
            }

        }
        
        if (commandOnclick != null)
        {
            onClick.append('}');
            onClick.append(';');
            onClick.append("return (cf()==false)? false : oamSF();");
        }        

        writer.startElement(HTML.ANCHOR_ELEM, component);
        writer.writeURIAttribute(HTML.HREF_ATTR, "#", null);
        writer.writeAttribute(HTML.ONCLICK_ATTR, onClick.toString(), null);
    }

    private String getTarget(UIComponent component) {
        // for performance reason: double check for the target attribute
        String target;
        if (component instanceof HtmlCommandLink) {
            target = ((HtmlCommandLink) component).getTarget();
        }
        else {
            target = (String) component.getAttributes().get(HTML.TARGET_ATTR);
        }
        return target;
    }

    private StringBuffer addChildParameters(FacesContext context, UIComponent component, UIComponent nestingForm) {
        //add child parameters
        StringBuffer params = new StringBuffer();
        params.append("[");
        for (Iterator it = getChildren(component).iterator(); it.hasNext();) {

            UIComponent child = (UIComponent) it.next();
            if (child instanceof UIParameter) {
                String name = ((UIParameter) child).getName();

                if (name == null) {
                    throw new IllegalArgumentException("Unnamed parameter value not allowed within command link.");
                }

                //Not necessary, since we are using oamSetHiddenInput to create hidden fields
                if (MyfacesConfig.getCurrentInstance(context.getExternalContext()).isRenderHiddenFieldsForLinkParams())
                {
                    addHiddenCommandParameter(context, nestingForm, name);
                }

                Object value = ((UIParameter) child).getValue();

                //UIParameter is no ValueHolder, so no conversion possible - calling .toString on value....
                // MYFACES-1832 bad charset encoding for f:param
                // if HTMLEncoder.encode is called, then
                // when is called on writer.writeAttribute, encode method
                // is called again so we have a duplicated encode
                // call.
                // MYFACES-2726 All '\' and "'" chars must be escaped 
                // because there will be inside "'" javascript quotes, 
                // otherwise the value will not correctly restored when
                // the command is post.
                //String strParamValue = value != null ? org.apache.myfaces.shared_tomahawk.renderkit.html.util.HTMLEncoder.encode(value.toString(), false, false) : "";
                String strParamValue = "";
                if (value != null)
                {
                    strParamValue = value.toString();
                    StringBuffer buff = null;
                    for (int i = 0; i < strParamValue.length(); i++)
                    {
                        char c = strParamValue.charAt(i); 
                        if (c == '\'' || c == '\\')
                        {
                            if (buff == null)
                            {
                                buff = new StringBuffer();
                                buff.append(strParamValue.substring(0,i));
                            }
                            buff.append('\\');
                            buff.append(c);
                        }
                        else if (buff != null)
                        {
                            buff.append(c);
                        }
                    }
                    if (buff != null)
                    {
                        strParamValue = buff.toString();
                    }
                }

                if (params.length() > 1) {
                    params.append(",");
                }

                params.append("['");
                params.append(name);
                params.append("','");
                params.append(strParamValue);
                params.append("']");
            }
        }
        params.append("]");
        return params;
    }

    /**
     * find nesting form<br />
     * need to be overrideable to deal with dummyForm stuff in tomahawk.
     */
    protected FormInfo findNestingForm(UIComponent uiComponent, FacesContext facesContext)
    {
        return _ComponentUtils.findNestingForm(uiComponent, facesContext);
    }

    protected void addHiddenCommandParameter(FacesContext facesContext, UIComponent nestingForm, String hiddenFieldName)
    {
        if (nestingForm != null)
        {
            HtmlFormRendererBase.addHiddenCommandParameter(facesContext, nestingForm, hiddenFieldName);
        }
    }


    protected void renderNonJavaScriptAnchorStart(FacesContext facesContext,
                                                  ResponseWriter writer,
                                                  UIComponent component,
                                                  String clientId)
        throws IOException
    {
        ViewHandler viewHandler = facesContext.getApplication().getViewHandler();
        String viewId = facesContext.getViewRoot().getViewId();
        String path = viewHandler.getActionURL(facesContext, viewId);

        boolean strictXhtmlLinks
                = MyfacesConfig.getCurrentInstance(facesContext.getExternalContext()).isStrictXhtmlLinks();

        StringBuffer hrefBuf = new StringBuffer(path);

        //add clientId parameter for decode

        if (path.indexOf('?') == -1)
        {
            hrefBuf.append('?');
        }
        else
        {
            if (strictXhtmlLinks) {
                hrefBuf.append("&amp;");
            } else {
                hrefBuf.append('&');
            }
        }
        String hiddenFieldName = HtmlRendererUtils.getHiddenCommandLinkFieldName(findNestingForm(component, facesContext));
        hrefBuf.append(hiddenFieldName);
        hrefBuf.append('=');
        hrefBuf.append(clientId);

        if (getChildCount(component) > 0)
        {
            addChildParametersToHref(facesContext, component, hrefBuf,
                                     false, //not the first url parameter
                                     writer.getCharacterEncoding());
        }

        String href = facesContext.getExternalContext().encodeActionURL(hrefBuf.toString());
        writer.startElement(HTML.ANCHOR_ELEM, component);
        writer.writeURIAttribute(HTML.HREF_ATTR,
                                 facesContext.getExternalContext().encodeActionURL(href),
                                 null);
    }

    private void addChildParametersToHref(FacesContext facesContext,
                                          UIComponent linkComponent,
                                          StringBuffer hrefBuf,
                                          boolean firstParameter,
                                          String charEncoding)
            throws IOException
    {
        boolean strictXhtmlLinks
                = MyfacesConfig.getCurrentInstance(facesContext.getExternalContext()).isStrictXhtmlLinks();
        for (Iterator it = getChildren(linkComponent).iterator(); it.hasNext(); )
        {
            UIComponent child = (UIComponent)it.next();
            if (child instanceof UIParameter)
            {
                String name = ((UIParameter)child).getName();
                Object value = ((UIParameter)child).getValue();
                addParameterToHref(name, value, hrefBuf, firstParameter, charEncoding, strictXhtmlLinks);
                firstParameter = false;
            }
        }
    }

    protected void renderOutputLinkStart(FacesContext facesContext, UIOutput output)
            throws IOException
    {
        ResponseWriter writer = facesContext.getResponseWriter();

        if (HtmlRendererUtils.isDisabled(output))
        {
            writer.startElement(HTML.SPAN_ELEM, output);
            HtmlRendererUtils.writeIdIfNecessary(writer, output, facesContext);
            HtmlRendererUtils.renderHTMLAttributes(writer, output, HTML.ANCHOR_PASSTHROUGH_ATTRIBUTES);
        }
        else
        {
            //calculate href
            String href = org.apache.myfaces.shared_tomahawk.renderkit.RendererUtils.getStringValue(facesContext, output);
            //check if there is an anchor # in it
            int index = href.indexOf('#');
            String anchorString = null;
            if (index > -1)
            {
                // remove anchor element and add it again after the parameter are encoded
                anchorString = href.substring(index,href.length());
                href = href.substring(0,index);
            }
            if (getChildCount(output) > 0)
            {
                StringBuffer hrefBuf = new StringBuffer(href);
                addChildParametersToHref(facesContext, output, hrefBuf,
                                     (href.indexOf('?') == -1), //first url parameter?
                                     writer.getCharacterEncoding());
                href = hrefBuf.toString();
            }
            if (index > -1)
            {
                href += anchorString;
            }
            href = facesContext.getExternalContext().encodeResourceURL(href);    //TODO: or encodeActionURL ?

            //write anchor
            writer.startElement(HTML.ANCHOR_ELEM, output);
            HtmlRendererUtils.writeIdAndNameIfNecessary(writer, output, facesContext);
            writer.writeURIAttribute(HTML.HREF_ATTR, href, null);
            HtmlRendererUtils.renderHTMLAttributes(writer, output, org.apache.myfaces.shared_tomahawk.renderkit.html.HTML.ANCHOR_PASSTHROUGH_ATTRIBUTES);
            writer.flush();
        }
    }

    private void renderLinkParameter(String name,
                                     Object value,
                                     StringBuffer onClick,
                                     String jsForm,
                                     UIComponent nestingForm)
    {
        if (name == null)
        {
            throw new IllegalArgumentException("Unnamed parameter value not allowed within command link.");
        }
        onClick.append(jsForm);
        onClick.append(".elements['").append(name).append("']");
        //UIParameter is no ValueHolder, so no conversion possible
        String strParamValue = value != null ? org.apache.myfaces.shared_tomahawk.renderkit.html.util.HTMLEncoder.encode(value.toString(), false, false) : "";
        onClick.append(".value='").append(strParamValue).append("';");

        addHiddenCommandParameter(FacesContext.getCurrentInstance(), nestingForm, name);
    }

    private static void addParameterToHref(String name,
                                           Object value,
                                           StringBuffer hrefBuf,
                                           boolean firstParameter,
                                           String charEncoding,
                                           boolean strictXhtmlLinks) throws UnsupportedEncodingException {
        if (name == null) {
            throw new IllegalArgumentException("Unnamed parameter value not allowed within command link.");
        }

        if (firstParameter) {
            hrefBuf.append('?');
        } else {
            if (strictXhtmlLinks) {
                hrefBuf.append("&amp;");
            } else {
                hrefBuf.append('&');
            }
        }

        hrefBuf.append(URLEncoder.encode(name, charEncoding));
        hrefBuf.append('=');
        if (value != null)
        {
            //UIParameter is no ConvertibleValueHolder, so no conversion possible
            hrefBuf.append(URLEncoder.encode(value.toString(), charEncoding));
        }
    }


    protected void renderOutputLinkEnd(FacesContext facesContext, UIComponent component)
            throws IOException
    {
        ResponseWriter writer = facesContext.getResponseWriter();

        if (HtmlRendererUtils.isDisabled(component))
        {
            writer.endElement(HTML.SPAN_ELEM);
        }
        else
        {
            // force separate end tag
            writer.writeText("", null);
            writer.endElement(HTML.ANCHOR_ELEM);
        }
    }

    protected void renderCommandLinkEnd(FacesContext facesContext, UIComponent component)
            throws IOException
    {
        ResponseWriter writer = facesContext.getResponseWriter();
        if (HtmlRendererUtils.isDisabled(component))
        {

            writer.endElement(HTML.SPAN_ELEM);
        }
        else
        {
            writer.writeText("", null);
            writer.endElement(HTML.ANCHOR_ELEM);
        }
    }

}
