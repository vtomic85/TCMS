/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item.model;

import item.dao.ItemDAO;
import item.dao.ItemTypeDAO;
import java.util.LinkedList;
import platform.dao.CMSElementDAO;
import platform.model.CMSElement;
import platform.model.Commons;

/**
 *
 * @author Vladimir Tomic
 */
public class Item {

    private long id;
    private long parentId;
    private int level;
    private int typeId;
    private String name;
    private boolean published;
    private String parentName;
    private String typeName;
    private boolean primaryNavigation;
    private boolean secondaryNavigation;
    private LinkedList<CMSElement> children;
    private boolean childrenEmpty;
    private StringBuilder holderURL;

    public Item(long id, long parentId, int level, int typeId, String name, boolean published, boolean primaryNavigation, boolean secondaryNavigation) {
        this.id = id;
        this.parentId = parentId;
        this.level = level;
        this.typeId = typeId;
        this.name = name;
        this.published = published;
        this.primaryNavigation = primaryNavigation;
        this.secondaryNavigation = secondaryNavigation;
//        if (id > 1) {
//            refreshChildren();
//        }
    }

    public Item() {
        this(0, 0, 0, 0, null, false, false, false);
    }

    public void refreshChildren() {
        if (children == null) {
            children = new LinkedList<>();
        }
        children.clear();
//        System.out.println("DEBUG ::: Item: refreshing children for item " + id + ", " + name);
        children = CMSElementDAO.getAllWhere("object_holder_id=" + this.id);
        childrenEmpty = children.size() <= 0;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public String getParentName() {
        parentName = ItemDAO.getById(parentId).getName();
        return parentName;
    }

    public String getTypeName() {
        typeName = ItemTypeDAO.getById(typeId).getName();
        return typeName;
    }

    public boolean isPrimaryNavigation() {
        return primaryNavigation;
    }

    public void setPrimaryNavigation(boolean primaryNavigation) {
        this.primaryNavigation = primaryNavigation;
    }

    public boolean isSecondaryNavigation() {
        return secondaryNavigation;
    }

    public void setSecondaryNavigation(boolean secondaryNavigation) {
        this.secondaryNavigation = secondaryNavigation;
    }

    public LinkedList<CMSElement> getChildren() {
//        refreshChildren();
        return children;
    }

    public void setChildren(LinkedList<CMSElement> children) {
        this.children = children;
    }

    public boolean isChildrenEmpty() {
//        refreshChildren();
//        System.out.println("DEBUG ::: Item: isChildrenEmpty: item=" + this.name + ", empty=" + childrenEmpty);
        return childrenEmpty;
    }

    public void setChildrenEmpty(boolean childrenEmpty) {
        this.childrenEmpty = childrenEmpty;
    }

    public StringBuilder getHolderURL() {
        holderURL = new StringBuilder("");
        switch (typeId) {
            case Commons.ITEMTYPE_EVENT_HOLDER:
                holderURL.append("event/list.xhtml?itemId=").append(id);
                break;
            case Commons.ITEMTYPE_PAGE_HOLDER:
                holderURL.append("page/list.xhtml?itemId=").append(id);
                break;
            case Commons.ITEMTYPE_NEWS_HOLDER:
                holderURL.append("news/list.xhtml?itemId=").append(id);
                break;
            default:
                break;
        }
        System.out.println("DEBUG ::: Item: getHolderURL:" + holderURL);
        return holderURL;
    }

    public void setHolderURL(StringBuilder holderURL) {
        this.holderURL = holderURL;
    }
}
