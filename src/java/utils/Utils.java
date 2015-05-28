package utils;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Vladimir Tomic
 */
public class Utils {

    public static String getParam(String paramName) {
        return FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get(paramName);
    }

    public static void putParam(String paramName, String value) {
        FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().put(paramName, value);
    }

    public static Object getSessionAttribute(String attributeName) {
        return ((HttpSession) (FacesContext.getCurrentInstance()).getExternalContext().getSession(false)).getAttribute(attributeName);
    }

    public static void setSessionAttribute(String attributeName, Object o) {
        ((HttpSession) (FacesContext.getCurrentInstance()).getExternalContext().getSession(false)).setAttribute(attributeName, o);
    }
}
