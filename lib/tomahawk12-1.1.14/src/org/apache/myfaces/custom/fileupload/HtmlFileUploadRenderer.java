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
package org.apache.myfaces.custom.fileupload;

import org.apache.myfaces.component.UserRoleUtils;
import org.apache.myfaces.shared_tomahawk.renderkit.RendererUtils;
import org.apache.myfaces.shared_tomahawk.renderkit.html.HTML;
import org.apache.myfaces.shared_tomahawk.renderkit.html.HtmlRenderer;
import org.apache.myfaces.shared_tomahawk.renderkit.html.HtmlRendererUtils;
import org.apache.myfaces.webapp.filter.MultipartRequestWrapper;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.FacesException;
import javax.faces.context.ResponseWriter;
import javax.faces.context.ExternalContext;
import javax.faces.convert.ConverterException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.IOException;
import java.util.Map;

/**
 * Renderer for the HtmlInputFileUpload component.
 * <p>
 * See also class AbstractHtmlInputFileUpload.
 * 
 * @JSFRenderer
 *   renderKitId = "HTML_BASIC" 
 *   family = "javax.faces.Input"
 *   type = "org.apache.myfaces.FileUpload"
 * 
 * @author Manfred Geiler (latest modification by $Author: lu4242 $)
 * @version $Revision: 782515 $ $Date: 2009-06-07 22:28:42 -0500 (Sun, 07 Jun 2009) $
 */
public class HtmlFileUploadRenderer
        extends HtmlRenderer
{
    private static final Log log = LogFactory.getLog(HtmlFileUploadRenderer.class);

    public void encodeEnd(FacesContext facesContext, UIComponent uiComponent)
            throws IOException
    {
        super.encodeEnd(facesContext, uiComponent); //check for NP

        ResponseWriter writer = facesContext.getResponseWriter();
        writer.startElement(HTML.INPUT_ELEM, uiComponent);
        writer.writeAttribute(HTML.TYPE_ATTR, HTML.FILE_ATTR, null);
        String clientId = uiComponent.getClientId(facesContext);
        renderId(facesContext, uiComponent);
        writer.writeAttribute(HTML.NAME_ATTR, clientId, null);
        UploadedFile value = (UploadedFile)((HtmlInputFileUpload)uiComponent).getValue();
        if (value != null)
        {
            if( value.getName() != null )
            {
                writer.writeAttribute(HTML.VALUE_ATTR, value.getName(), null);
            }
        }
        HtmlRendererUtils.renderHTMLAttributes(writer, uiComponent, HTML.INPUT_FILE_PASSTHROUGH_ATTRIBUTES_WITHOUT_DISABLED);
        if (isDisabled(facesContext, uiComponent))
        {
            writer.writeAttribute(HTML.DISABLED_ATTR, Boolean.TRUE, null);
        }

        writer.endElement(HTML.INPUT_ELEM);
    }

    protected boolean isDisabled(FacesContext facesContext, UIComponent uiComponent)
    {
        if (!UserRoleUtils.isEnabledOnUserRole(uiComponent))
        {
            //if the user is not enabled, the component is
            //disabled, so it should return true.
            return true;
        }
        else
        {
            if (uiComponent instanceof HtmlInputFileUpload)
            {
                return ((HtmlInputFileUpload)uiComponent).isDisabled();
            }
            else
            {
                return RendererUtils.getBooleanAttribute(uiComponent, HTML.DISABLED_ATTR, false);
            }
        }
    }

    private void setSubmittedValueForImplementation(
        FacesContext facesContext, UIComponent uiComponent, FileItem fileItem)
    {
        try
        {
            UploadedFile upFile;
            String implementation =
                ((HtmlInputFileUpload)uiComponent).getStorage();
            if (implementation == null || implementation.length() == 0)
            {
                implementation = "default";
            }
            if (("memory").equals(implementation))
            {
                upFile = new UploadedFileDefaultMemoryImpl(fileItem);
            }
            else if (("default").equals(implementation))
            {
                if (fileItem.isInMemory())
                {
                    upFile = new UploadedFileDefaultMemoryImpl(fileItem);
                }
                else
                {
                    upFile = new UploadedFileDefaultFileImpl(fileItem);                    
                }
            }
            else //"file" case
            {
                upFile = new UploadedFileDefaultFileImpl(fileItem);
            }

            ((HtmlInputFileUpload)uiComponent).setSubmittedValue(upFile);
            ((HtmlInputFileUpload)uiComponent).setValid(true);
        }
        catch (IOException ioe)
        {
            throw new FacesException(
                "Exception while processing file upload for file-input : "
                    + uiComponent.getClientId(facesContext), ioe);
        }
    }

    /**
     * Handle the postback of a form containing a fileUpload component.
     * <p>
     * The browser request will have been in "multi-part-mime" format, where
     * the normal http post is in one part, and the file being uploaded is
     * in another. Hopefully JSF has been configured so that this special
     * request is wrapped in a custom ServletRequest that allows us to
     * fetch that extra data....
     */
    public void decode(FacesContext facesContext, UIComponent uiComponent)
    {
        super.decode(facesContext, uiComponent); //check for NP

        //MultipartWrapper might have been wrapped again by one or more additional
        //Filters. We try to find the MultipartWrapper, but if a filter has wrapped
        //the ServletRequest with a class other than HttpServletRequestWrapper
        //this will fail.
        Object request = facesContext.getExternalContext().getRequest();
        if (!(request instanceof ServletRequest)) {
            ExternalContext externalContext = facesContext.getExternalContext();
            Map fileItems = (Map)externalContext.getRequestMap().
                    get(MultipartRequestWrapper.UPLOADED_FILES_ATTRIBUTE);
            FileItem fileItem = null;
            if (fileItems != null) {
                String paramName = uiComponent.getClientId(facesContext);
                fileItem = (FileItem) fileItems.get(paramName);
            }
            if (fileItem != null)
            {
                setSubmittedValueForImplementation(facesContext, uiComponent, fileItem);
            }
            return;
        }
        if(facesContext.getExternalContext().getRequest() instanceof ServletRequest)
        {
            ServletRequest multipartRequest = (ServletRequest)facesContext.getExternalContext().getRequest();
            while (multipartRequest != null &&
                    !(multipartRequest instanceof MultipartRequestWrapper))
            {
                if (multipartRequest instanceof HttpServletRequestWrapper)
                {
                    multipartRequest = ((HttpServletRequestWrapper)multipartRequest).getRequest();
                }
                else
                {
                    multipartRequest = null;
                }
            }

            if (multipartRequest != null)
            {
                MultipartRequestWrapper mpReq = (MultipartRequestWrapper)multipartRequest;

                String paramName = uiComponent.getClientId(facesContext);
                FileItem fileItem = mpReq.getFileItem(paramName);
                if (fileItem != null)
                {
                    setSubmittedValueForImplementation(facesContext, uiComponent, fileItem);
                }
            }
        }
    }

    public Object getConvertedValue(FacesContext context, UIComponent component, Object submittedValue) throws ConverterException
    {
        if(submittedValue instanceof UploadedFile)
        {
            UploadedFile file = (UploadedFile) submittedValue;

            if(file.getSize()>0 && file.getName()!=null && file.getName().length()>0)
            {
                return file;
            }
        }

        return null;
    }
}
