package locale;

import java.util.Locale;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class LocaleBean {

    private Locale locale;

    @PostConstruct
    public void init() {
        locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();
    }

    public Locale getLocale() {
        return locale;
    }

    public String getLanguage() {
        return locale.getLanguage();
    }

    public void setLanguage(String language) {
        locale = new Locale(language);
        FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
    }

//    public String changeToSerbian() {
//        FacesContext context = FacesContext.getCurrentInstance();
//        context.getViewRoot().setLocale(new Locale("sr"));
//        return null;
//    }
//
//    public String changeToEnglish() {
//        FacesContext context = FacesContext.getCurrentInstance();
//        context.getViewRoot().setLocale(new Locale("en"));
//        return null;
//    }
}
