/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part.model;

import item.dao.ItemTypeDAO;

/**
 *
 * @author Vladimir Tomic
 */
public class Part {

    private long id;
    private String folder;  // e.g. full
    private String name;    // e.g. latest10NewsFull.xhtml
    private int itemType;   // e.g. Commons.ITEMTYPE_NEWS
    private boolean topListNeeded; // is the toplist needed?
    private int width; // 33, 50, 66 or 100
    private long topListId;
    private String fullPath; // e.g. WEB-INF/parts/full/latest10NewsFull.xhtml
    private String itemTypeName;

    public Part(long id, String folder, String name, int itemType, boolean toplistNeeded, int width, long topListId) {
        this.id = id;
        this.folder = folder;
        this.name = name;
        this.itemType = itemType;
        this.topListNeeded = toplistNeeded;
        this.width = width;
        this.topListId = topListId;
    }

    public Part() {
        this(0, null, null, 0, false, 0, 0);
    }

    public Part(Part p, long topListId) {
        this.folder = p.folder;
        this.name = p.name;
        this.itemType = p.itemType;
        this.topListNeeded = p.topListNeeded;
        this.width = p.width;
        this.topListId = p.topListId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getItemType() {
        return itemType;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    public String getFullPath() {
        fullPath = "WEB-INF/parts/" + folder + "/" + name;
        return fullPath;
    }

    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }

    public boolean isTopListNeeded() {
        return topListNeeded;
    }

    public void setTopListNeeded(boolean topListNeeded) {
        this.topListNeeded = topListNeeded;
    }

    public String getItemTypeName() {
        itemTypeName = ItemTypeDAO.getById(itemType).getName();
        return itemTypeName;
    }

    public void setItemTypeName(String itemTypeName) {
        this.itemTypeName = itemTypeName;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public long getTopListId() {
        return topListId;
    }

    public void setTopListId(long topListId) {
        this.topListId = topListId;
    }
}
