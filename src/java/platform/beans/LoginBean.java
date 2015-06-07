package platform.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import message.dao.MessageDAO;
import platform.model.Commons;
import user.dao.UserDAO;
import user.model.User;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@SessionScoped
public class LoginBean {

    private final int ADMIN = 1;
    private final int MODERATOR = 2;
    private final int USER = 3;

    private boolean isLoginOk;
    private boolean isAdmin;
    private boolean isModerator;
    private String username;
    private String password;

    private User user;
    
    public LoginBean() {
        isLoginOk = false;
        isAdmin = false;
        isModerator = false;
        username = "";
        password = "";
        user = null;
    }

    public String login() {
        System.out.println("********************* " + FacesContext.class.getPackage().getImplementationVersion());
        isLoginOk = false;
        isAdmin = false;
        isModerator = false;
        user = null;
        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
        int res = UserDAO.passwordOk(username, password);
        if (res == 0) {
            FacesMessage message = new FacesMessage("The user does not exist!");
            context.addMessage(null, message);
            return null;
        } else if (res == -1) {
            FacesMessage message = new FacesMessage("Invalid password!");
            context.addMessage(null, message);
            return null;
        }
        user = UserDAO.getWhere("username='" + username + "'");
        isAdmin = (user.getTypeId() == ADMIN);
        isModerator = (user.getTypeId() == MODERATOR);
        session.setAttribute("user", user);
        isLoginOk = true;        
        FacesMessage message = new FacesMessage("Login OK!");
        context.addMessage(null, message);
        return null;
    }

    public String logout() {
        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
        session.invalidate();
        isLoginOk = false;
        isAdmin = false;
        isModerator = false;
        user = null;
        return "home";
    }

    public boolean isIsLoginOk() {
        return isLoginOk;
    }

    public void setIsLoginOk(boolean isLoginOk) {
        this.isLoginOk = isLoginOk;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public boolean isIsModerator() {
        return isModerator;
    }

    public void setIsModerator(boolean isModerator) {
        this.isModerator = isModerator;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
