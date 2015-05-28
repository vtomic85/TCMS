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
package org.apache.myfaces.component;

/**
 * 
 * @since 1.1.7
 * @author Leonardo Uribe (latest modification by $Author: lu4242 $)
 * @version $Revision: 691856 $ $Date: 2008-09-03 21:40:30 -0500 (Wed, 03 Sep 2008) $
 */
public interface EventAware
{
    
    /**
     * HTML: Script to be invoked when the element is clicked.
     * 
     * @JSFProperty
     */
    public String getOnclick();

    /**
     * HTML: Script to be invoked when the element is double-clicked.
     * 
     * @JSFProperty
     */
    public String getOndblclick();

    /**
     * HTML: Script to be invoked when a key is pressed down over this element.
     * 
     * @JSFProperty
     */
    public String getOnkeydown();

    /**
     * HTML: Script to be invoked when a key is pressed over this element.
     * 
     * @JSFProperty
     */
    public String getOnkeypress();

    /**
     * HTML: Script to be invoked when a key is released over this element.
     * 
     * @JSFProperty
     */
    public String getOnkeyup();

    /**
     * HTML: Script to be invoked when the pointing device is pressed over this element.
     * 
     * @JSFProperty
     */
    public String getOnmousedown();

    /**
     * HTML: Script to be invoked when the pointing device is moved while it is in this element.
     * 
     * @JSFProperty
     */
    public String getOnmousemove();

    /**
     * HTML: Script to be invoked when the pointing device is moves out of this element.
     * 
     * @JSFProperty
     */
    public String getOnmouseout();

    /**
     * HTML: Script to be invoked when the pointing device is moved into this element.
     * 
     * @JSFProperty
     */
    public String getOnmouseover();

    /**
     * HTML: Script to be invoked when the pointing device is released over this element.
     * 
     * @JSFProperty
     */
    public String getOnmouseup();

}
