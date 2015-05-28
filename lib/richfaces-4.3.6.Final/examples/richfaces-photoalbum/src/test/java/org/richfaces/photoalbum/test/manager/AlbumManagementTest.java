package org.richfaces.photoalbum.test.manager;

import java.util.Date;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.UserTransaction;

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
import org.richfaces.photoalbum.model.Album;
import org.richfaces.photoalbum.model.Shelf;
import org.richfaces.photoalbum.model.actions.AlbumAction;
import org.richfaces.photoalbum.model.actions.IAlbumAction;
import org.richfaces.photoalbum.model.event.SimpleEvent;
import org.richfaces.photoalbum.test.PhotoAlbumTestHelper;
import org.richfaces.photoalbum.util.ApplicationUtils;
import org.richfaces.photoalbum.util.PhotoAlbumException;

@RunWith(Arquillian.class)
public class AlbumManagementTest {

    @Deployment
    public static Archive<?> createDeployment() {
        return ShrinkWrap.create(WebArchive.class, "test.war").addPackage(Album.class.getPackage()).addClass(AlbumAction.class)
            .addClass(IAlbumAction.class).addClass(PhotoAlbumTestHelper.class).addClass(PhotoAlbumException.class)
            .addClass(ApplicationUtils.class).addClass(SimpleEvent.class)
            .addAsResource("META-INF/test-persistence.xml", "META-INF/persistence.xml")
            .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml") // important
            .addAsWebInfResource("test-ds.xml").addAsResource("importmin.sql", "import.sql");
    }

    @Inject
    EntityManager em;

    @Inject
    UserTransaction utx;

    @Inject
    PhotoAlbumTestHelper helper;

    @Inject
    IAlbumAction aa;

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
    public void isAlbumAdded() throws Exception {
        int originalSize = helper.getAllAlbums(em).size();

        Shelf shelf = em.createQuery("select s from Shelf s order by s.id", Shelf.class).getResultList().get(0);

        Assert.assertNotNull(shelf);

        Album newAlbum = new Album();
        newAlbum.setName("new album");
        newAlbum.setDescription("new album description");
        newAlbum.setShelf(shelf);
        newAlbum.setCreated(new Date());

        aa.addAlbum(newAlbum);

        Assert.assertTrue(helper.getAllAlbums(em).contains(newAlbum));
        Assert.assertEquals(originalSize + 1, helper.getAllAlbums(em).size());
    }

    @Test
    public void isAlbumEdited() throws Exception {
        Album album = helper.getAllAlbums(em).get(0);

        album.setName("edited album");

        int originalSize = helper.getAllAlbums(em).size();

        aa.editAlbum(album);

        Album editedAlbum = helper.getAllAlbums(em).get(0);
        Assert.assertEquals(album.getId(), editedAlbum.getId());
        Assert.assertEquals("edited album", editedAlbum.getName());
        Assert.assertEquals(originalSize, helper.getAllAlbums(em).size());
    }

    // EntityManager auto-commits, entities don't need refreshing
}
