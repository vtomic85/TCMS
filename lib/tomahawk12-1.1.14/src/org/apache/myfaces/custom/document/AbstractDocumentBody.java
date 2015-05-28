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

import org.apache.myfaces.component.StyleAware;

/**
 * Document to enclose the document body. If not otherwise possible you can use
 * state="start|end" to demarkate the document boundaries
 * 
 * @JSFComponent
 *   name = "t:documentBody"
 *   class = "org.apache.myfaces.custom.document.DocumentBody"
 *   tagClass = "org.apache.myfaces.custom.document.DocumentBodyTag"
 * @since 1.1.7
 * @author Mario Ivankovits (latest modification by $Author: lu4242 $)
 * @version $Revision: 691871 $ $Date: 2008-09-03 23:32:08 -0500 (Wed, 03 Sep 2008) $
 */
abstract class AbstractDocumentBody extends AbstractDocument implements StyleAware
{
    public static final String COMPONENT_TYPE = "org.apache.myfaces.DocumentBody";
    private static final String DEFAULT_RENDERER_TYPE = "org.apache.myfaces.DocumentBody";

    public AbstractDocumentBody()
    {
        super(DEFAULT_RENDERER_TYPE);
    }
    
    /**
     * @JSFProperty
     */
    public abstract String getOnload();

    /**
     * @JSFProperty
     */
    public abstract String getOnunload();

    /**
     * @JSFProperty
     */
    public abstract String getOnresize();

    /**
     * @JSFProperty
     */
    public abstract String getOnkeypress();
    
}