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

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.myfaces.shared_tomahawk.renderkit.JSFAttr;
import org.apache.myfaces.shared_tomahawk.renderkit.RendererUtils;
import org.apache.myfaces.shared_tomahawk.util.ArrayUtils;
import org.apache.myfaces.shared_tomahawk.util.StringUtils;

import javax.faces.component.UIComponent;
import javax.faces.component.UIPanel;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import java.io.IOException;
import java.util.Iterator;

/**
 * @author Martin Marinschek
 * @version $Revision: 618839 $ $Date: 2008-02-05 19:41:42 -0500 (Tue, 05 Feb 2008) $
 *          <p/>
 *          $Log: $
 */
public class HtmlGridRendererBase
        extends HtmlRenderer
{
    private static final Log log = LogFactory.getLog(HtmlGridRendererBase.class);

    public boolean getRendersChildren()
    {
        return true;
    }

    public void encodeBegin(FacesContext facesContext, UIComponent component)
            throws IOException
    {
        // all work done in encodeEnd()
    }

    public void encodeChildren(FacesContext context, UIComponent component)
        throws IOException
    {
        // all work done in encodeEnd()
    }

    public void encodeEnd(FacesContext facesContext, UIComponent component)
            throws IOException
    {
        RendererUtils.checkParamValidity(facesContext, component, UIPanel.class);

        int columns;
        if (component instanceof HtmlPanelGrid)
        {
            columns = ((HtmlPanelGrid)component).getColumns();
        }
        else
        {
            Integer i = (Integer)component.getAttributes().get(org.apache.myfaces.shared_tomahawk.renderkit.JSFAttr.COLUMNS_ATTR);
            columns = i != null ? i.intValue() : 0;
        }

        if (columns <= 0)
        {
            if (log.isErrorEnabled())
            {
                log.error("Wrong columns attribute for PanelGrid " + component.getClientId(facesContext) + ": " + columns);
            }
            columns = 1;
        }

        ResponseWriter writer = facesContext.getResponseWriter();
        writer.startElement(HTML.TABLE_ELEM, component);
        HtmlRendererUtils.writeIdIfNecessary(writer, component, facesContext);
        HtmlRendererUtils.renderHTMLAttributes(writer, component, HTML.TABLE_PASSTHROUGH_ATTRIBUTES);

        writer.flush();

        HtmlRendererUtils.renderTableCaption(facesContext, writer, component);

        // theader and tfooter are rendered before the tbody
        renderHeaderOrFooter(facesContext, writer, component, columns, true);   //Header facet
        renderHeaderOrFooter(facesContext, writer, component, columns, false);  //Footer facet
        
        renderChildren(facesContext, writer, component, columns);

        writer.endElement(HTML.TABLE_ELEM);
    }

    

    protected void renderHeaderOrFooter(FacesContext context,
                                      ResponseWriter writer,
                                      UIComponent component,
                                      int columns,
                                      boolean header)
        throws IOException
    {
        UIComponent facet = component.getFacet(header ? "header" : "footer");
        if (facet == null) return;

        HtmlRendererUtils.writePrettyLineSeparator(context);
        writer.startElement(header ? org.apache.myfaces.shared_tomahawk.renderkit.html.HTML.THEAD_ELEM : HTML.TFOOT_ELEM, component);
        writer.startElement(HTML.TR_ELEM, component);
        writer.startElement(header ? HTML.TH_ELEM : HTML.TD_ELEM, component);

        String styleClass = (component instanceof HtmlPanelGrid)
            ? (header ?
                         ((HtmlPanelGrid)component).getHeaderClass() :
                         ((HtmlPanelGrid)component).getFooterClass())
            : (header ?
                         (String)component.getAttributes().get(JSFAttr.HEADER_CLASS_ATTR) :
                         (String)component.getAttributes().get(org.apache.myfaces.shared_tomahawk.renderkit.JSFAttr.FOOTER_CLASS_ATTR));
        if (styleClass != null)
        {
            writer.writeAttribute(HTML.CLASS_ATTR, styleClass,
                                  header ? JSFAttr.HEADER_CLASS_ATTR : org.apache.myfaces.shared_tomahawk.renderkit.JSFAttr.FOOTER_CLASS_ATTR);
        }

        if (header)
        {
            writer.writeAttribute(HTML.SCOPE_ATTR, HTML.SCOPE_COLGROUP_VALUE, null);
        }

        writer.writeAttribute(HTML.COLSPAN_ATTR, Integer.toString(columns), null);

        HtmlRendererUtils.writePrettyLineSeparator(context);
        RendererUtils.renderChild(context, facet);

        HtmlRendererUtils.writePrettyLineSeparator(context);
        writer.endElement(header ? HTML.TH_ELEM : HTML.TD_ELEM);
        writer.endElement(HTML.TR_ELEM);
        writer.endElement(header ? HTML.THEAD_ELEM : HTML.TFOOT_ELEM);
    }

    protected int childAttributes(FacesContext context,
            ResponseWriter writer,
            UIComponent component,
            int columnIndex)
        throws IOException
    {
        // subclasses can override this method to add attributes to the table cell <td> tag
        return columnIndex;
    }

    protected void renderChildren(FacesContext context,
                                ResponseWriter writer,
                                UIComponent component,
                                int columns)
        throws IOException
    {
        writer.startElement(HTML.TBODY_ELEM, component);

        String columnClasses;
        String rowClasses;
        if (component instanceof HtmlPanelGrid)
        {
            columnClasses = ((HtmlPanelGrid)component).getColumnClasses();
            rowClasses =  ((HtmlPanelGrid)component).getRowClasses();
        }
        else
        {
            columnClasses = (String)component.getAttributes().get(org.apache.myfaces.shared_tomahawk.renderkit.JSFAttr.COLUMN_CLASSES_ATTR);
            rowClasses = (String)component.getAttributes().get(JSFAttr.ROW_CLASSES_ATTR);
        }

        String[] columnClassesArray = (columnClasses == null)
            ? ArrayUtils.EMPTY_STRING_ARRAY
            : StringUtils.trim(StringUtils.splitShortString(columnClasses, ','));
        int columnClassesCount = columnClassesArray.length;

        String[] rowClassesArray = (rowClasses == null)
            ? org.apache.myfaces.shared_tomahawk.util.ArrayUtils.EMPTY_STRING_ARRAY
            : StringUtils.trim(StringUtils.splitShortString(rowClasses, ','));
        int rowClassesCount = rowClassesArray.length;

        int childCount = getChildCount(component);
        if (childCount > 0)
        {
            int columnIndex = 0;
            int rowClassIndex = 0;
            boolean rowStarted = false;
            for (Iterator it = getChildren(component).iterator(); it.hasNext(); )
            {
                UIComponent child = (UIComponent)it.next();
                if (child.isRendered())
                {
                    if (columnIndex == 0)
                    {
                        //start of new/next row
                        if (rowStarted)
                        {
                            //do we have to close the last row?
                            writer.endElement(HTML.TR_ELEM);
                            HtmlRendererUtils.writePrettyLineSeparator(context);
                        }
                        writer.startElement(HTML.TR_ELEM, component);
                        if (rowClassIndex < rowClassesCount) {
                            writer.writeAttribute(HTML.CLASS_ATTR, rowClassesArray[rowClassIndex], null);
                        }
                        rowStarted = true;
                        rowClassIndex++;
                        if (rowClassIndex == rowClassesCount) {
                            rowClassIndex = 0;
                        }
                    }

                    writer.startElement(HTML.TD_ELEM, component);
                    if (columnIndex < columnClassesCount)
                    {
                        writer.writeAttribute(HTML.CLASS_ATTR, columnClassesArray[columnIndex], null);
                    }
                    columnIndex = childAttributes(context, writer, child, columnIndex);
                    RendererUtils.renderChild(context, child);
                    writer.endElement(HTML.TD_ELEM);

                    columnIndex++;
                    if (columnIndex >= columns) {
                        columnIndex = 0;
                    }
                }
            }

            if (rowStarted)
            {
                if (columnIndex > 0)
                {
                    if (log.isWarnEnabled()) log.warn("PanelGrid " + component.getClientId(context) + " has not enough children. Child count should be a multiple of the columns attribute.");
                    //Render empty columns, so that table is correct
                    for ( ; columnIndex < columns; columnIndex++)
                    {
                        writer.startElement(HTML.TD_ELEM, component);
                        if (columnIndex < columnClassesCount)
                        {
                            writer.writeAttribute(HTML.CLASS_ATTR, columnClassesArray[columnIndex], null);
                        }
                        writer.endElement(HTML.TD_ELEM);
                    }
                }
                writer.endElement(HTML.TR_ELEM);
                HtmlRendererUtils.writePrettyLineSeparator(context);
            }
        }

        writer.endElement(HTML.TBODY_ELEM);
    }

}
