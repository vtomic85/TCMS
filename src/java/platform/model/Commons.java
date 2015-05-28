/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platform.model;

import java.io.File;

/**
 *
 * @author Vladimir Tomic
 */
public class Commons {

    /* ITEM TYPES */
    public static final int ITEMTYPE_INDEX = 1;
    public static final int ITEMTYPE_CONTACT = 2;
    public static final int ITEMTYPE_GALLERY = 3;
    public static final int ITEMTYPE_PAGE_HOLDER = 4;
    public static final int ITEMTYPE_NEWS_HOLDER = 5;
    public static final int ITEMTYPE_EVENT_HOLDER = 6;
    public static final int ITEMTYPE_PAGE = 7;
    public static final int ITEMTYPE_NEWS = 8;
    public static final int ITEMTYPE_EVENT = 9;
    public static final int ITEMTYPE_NO_CONTENT = 10;
    public static final int ITEMTYPE_USER_PART = 20;
    public static final int ITEMTYPE_USER_PART_HOLDER = 21;

    /* MESSAGE FOLDERS */
    public static final int MESSAGEFOLDER_PERMANENTLY_DELETED = 999;
    public static final int MESSAGEFOLDER_NEW_MESSAGE = 0;
    public static final int MESSAGEFOLDER_INBOX = 1;
    public static final int MESSAGEFOLDER_DRAFTS = 2;
    public static final int MESSAGEFOLDER_SENT = 3;
    public static final int MESSAGEFOLDER_DELETED = 4;

    /* INDEX REGION WIDTHS (%) */
    public static final int REGION_WIDTH_ONE_THIRD = 33;
    public static final int REGION_WIDTH_ONE_HALF = 50;
    public static final int REGION_WIDTH_TWO_THIRDS = 66;
    public static final int REGION_WIDTH_FULL = 100;

    /* IMAGE CROPPER DIMENSIONS */
    public static final int IMAGE_SIZE_SMALL_WIDTH = 100;
    public static final int IMAGE_SIZE_SMALL_HEIGHT = 100;
    public static final int IMAGE_SIZE_MEDIUM_WIDTH = 150;
    public static final int IMAGE_SIZE_MEDIUM_HEIGHT = 120;
    public static final int IMAGE_SIZE_LARGE_WIDTH = 200;
    public static final int IMAGE_SIZE_LARGE_HEIGHT = 150;

    /* FILE MANIPULATING */
    public static final String FILE_UPLOAD_IMG_FOLDER = "/resources/img/crop";
    public static final String FILE_UPLOAD_IMG_FILENAME = "tempimg";
    public static final String FILE_UPLOAD_IMG_EXTENSION = ".jpg";
}
