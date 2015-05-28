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
package org.apache.myfaces.webapp.filter.servlet;

import org.apache.myfaces.shared_tomahawk.util.NullEnumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;
import java.util.Map;


/**
 * HttpSession attibutes as Map.
 * <p>
 * NOTE: This class was copied from myfaces impl 
 * org.apache.myfaces.context.servlet and it is
 * used by TomahawkFacesContextWrapper. By that reason, it could change
 * in the future.
 * </p>
 * 
 * @since 1.1.7
 * @author Anton Koinov (latest modification by $Author: lu4242 $)
 * @version $Revision: 691871 $ $Date: 2008-09-03 23:32:08 -0500 (Wed, 03 Sep 2008) $
 */
public class SessionMap extends AbstractAttributeMap
{
    private final HttpServletRequest _httpRequest;

    SessionMap(HttpServletRequest httpRequest)
    {
        _httpRequest = httpRequest;
    }

    protected Object getAttribute(String key)
    {
        HttpSession httpSession = getSession();
        return (httpSession == null)
            ? null : httpSession.getAttribute(key.toString());
    }

    protected void setAttribute(String key, Object value)
    {
        _httpRequest.getSession(true).setAttribute(key, value);
    }

    protected void removeAttribute(String key)
    {
        HttpSession httpSession = getSession();
        if (httpSession != null)
        {
            httpSession.removeAttribute(key);
        }
    }

    protected Enumeration getAttributeNames()
    {
        HttpSession httpSession = getSession();
        return (httpSession == null)
            ? NullEnumeration.instance()
            : httpSession.getAttributeNames();
    }

    private HttpSession getSession()
    {
        return _httpRequest.getSession(false);
    }


    public void putAll(Map t)
    {
        throw new UnsupportedOperationException();
    }


    public void clear()
    {
        throw new UnsupportedOperationException();
    }
}