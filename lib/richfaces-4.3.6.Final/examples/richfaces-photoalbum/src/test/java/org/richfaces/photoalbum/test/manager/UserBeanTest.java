package org.richfaces.photoalbum.test.manager;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.UserTransaction;

import org.ajax4jsf.javascript.JSEncoder;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.richfaces.event.FileUploadEvent;
import org.richfaces.exception.FileUploadException;
import org.richfaces.json.JSONObject;
import org.richfaces.model.UploadedFile;
import org.richfaces.photoalbum.manager.FileManager;
import org.richfaces.photoalbum.manager.NavigationEnum;
import org.richfaces.photoalbum.manager.UserBean;
import org.richfaces.photoalbum.manager.UserManager;
import org.richfaces.photoalbum.model.User;
import org.richfaces.photoalbum.model.actions.IUserAction;
import org.richfaces.photoalbum.model.actions.UserAction;
import org.richfaces.photoalbum.model.event.ErrorEvent;
import org.richfaces.photoalbum.social.facebook.FacebookBean;
import org.richfaces.photoalbum.social.gplus.GooglePlusAlbumCache;
import org.richfaces.photoalbum.social.gplus.GooglePlusBean;
import org.richfaces.photoalbum.ui.UserPrefsHelper;
import org.richfaces.photoalbum.util.ApplicationUtils;
import org.richfaces.photoalbum.util.Constants;
import org.richfaces.photoalbum.util.FileHandler;
import org.richfaces.photoalbum.util.ImageCopier;
import org.richfaces.photoalbum.util.PhotoAlbumException;
import org.richfaces.photoalbum.util.Preferred;

@RunWith(Arquillian.class)
public class UserBeanTest {

    @Deployment
    public static Archive<?> createDeployment() {
        return ShrinkWrap.create(WebArchive.class, "test.war").addPackage(User.class.getPackage()).addClass(UserBean.class)
            .addClass(PhotoAlbumException.class).addClass(ApplicationUtils.class)
            .addClasses(UserAction.class, IUserAction.class)
            .addClasses(UserManager.class, FileManager.class, UserPrefsHelper.class, FileUploadEvent.class, UploadedFile.class)
            .addClasses(FacebookBean.class, GooglePlusBean.class).addPackage(ErrorEvent.class.getPackage()).addPackage(JSONObject.class.getPackage())
            .addClass(GooglePlusAlbumCache.class).addClass(NavigationEnum.class).addClass(JSEncoder.class)
            .addClass(FileHandler.class).addClass(FileUploadException.class).addClass(ImageCopier.class)
            .addAsResource("META-INF/test-persistence.xml", "META-INF/persistence.xml")
            .addClass(Preferred.class).addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml") // important
            .addAsWebInfResource("test-ds.xml").addAsResource("importusers.sql", "import.sql");
    }

    @Inject
    UserBean bean;

    @Inject
    EntityManager em;

    @Inject
    UserTransaction utx;

    @Before
    public void startTransaction() throws Exception {
        utx.begin();
        em.joinTransaction();
    }

    @After
    public void commitTransaction() throws Exception {
        utx.commit();
    }

    @Test
    public void isUserLoggedIn() throws Exception {
        User user = (User) em.createNamedQuery(Constants.USER_LOGIN_QUERY).setParameter(Constants.USERNAME_PARAMETER, "Noname")
            .setParameter(Constants.PASSWORD_PARAMETER, "8cb2237d0679ca88db6464eac60da96345513964").getSingleResult();

        Assert.assertNotNull(user);

        User loggedInUser = bean.logIn("Noname", "8cb2237d0679ca88db6464eac60da96345513964");

        Assert.assertNotNull(loggedInUser);
        Assert.assertNotNull(bean.getUser());
        Assert.assertEquals(loggedInUser, bean.getUser());
    }

    @Test
    public void isUserRefreshed() throws Exception {
        bean.logIn("Noname", "8cb2237d0679ca88db6464eac60da96345513964");

        em.createQuery("update User u set u.email = :email where u.login = :login").setParameter("email", "mail@mail.net")
            .setParameter("login", "Noname").executeUpdate();

        bean.refreshUser();

        Assert.assertFalse("mail: " + bean.getUser().getEmail() + " != 'mail@mail.net'",
            "mail@mail.net".equals(bean.getUser().getEmail()));
    }
}
