/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item.beans;

import event.dao.EventDAO;
import event.model.Event;
import gallery.dao.GalleryDAO;
import gallery.model.Gallery;
import item.dao.ItemDAO;
import item.dao.ItemTypeDAO;
import item.model.Item;
import item.model.ItemType;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import news.dao.NewsDAO;
import news.model.News;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;
import page.dao.PageDAO;
import page.model.Page;
import platform.model.Commons;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class TreeBean {

    private TreeNode root;
    private TreeNode nodeSelected;
    private long itemId;
    private Item item;
    private List<ItemType> typeList;
    private List<Item> parentList;
    private List<Page> pageList;
    private List<Event> eventList;
    private List<News> newsList;
    private List<Gallery> galleryList;

    public TreeBean() {

    }

    @PostConstruct
    public void init() {
        pageList = PageDAO.getAll();
        eventList = EventDAO.getAll();
        newsList = NewsDAO.getAll();
        galleryList = GalleryDAO.getAll();
        root = new DefaultTreeNode();
        generateTree();
        if (nodeSelected == null) {
            nodeSelected = root;
        }
        if (itemId == 0) {
            itemId = 1;
        }
        item = ItemDAO.getById(itemId);
    }

    public void generateTree() {
        LinkedList<Item> items = ItemDAO.getAllOrdByLevel();
        LinkedList<TreeNode> nodes = new LinkedList<>();
        // Obradjujem sve iteme sortirane po opadajucem levelu (odozdo na gore)
        for (Item i : items) {
            // Generisem listu dece u svakom itemu (Event, News, Pages... koji su vezani za njega)
            i.refreshChildren();
            // Pravim novi cvor od trenutnog itema
            TreeNode newTn = new DefaultTreeNode(i, null);
            // Ako trenutni cvor ima parentId=0, znaci da je to root
            if (((Item) newTn.getData()).getParentId() == 0) {
                root.getChildren().add(newTn);
                newTn.setParent(root);
            }
            // Proveravam sve vec obradjene iteme
            for (TreeNode currTn : nodes) {
                // Ukoliko neko od vec dodatih itema ima za roditelja item koji trenutno obradjujem, povezujem ih
                if (((Item) currTn.getData()).getParentId() == i.getId()) {
                    currTn.setParent(newTn);
                    newTn.getChildren().add(currTn);
                }
            }
            // Konacno, postavljam novom cvoru expanded=true i dodajem ga u listu
            newTn.setExpanded(true);
            nodes.add(newTn);
        }
    }

    public String addNode() {
        int newLevel = item.getLevel() + 1;
        Item newItem = new Item(0, itemId, newLevel, Commons.ITEMTYPE_NO_CONTENT, "New Item", false, false, false, 0, null);
        long newItemId = ItemDAO.add(newItem);
        newItem.setId(newItemId);
        init();
        return null;
    }

    public String removeNode() {
        if (ItemDAO.getAllWhere("parent_id=" + itemId).size() == 0 && item.isChildrenEmpty()) {
            ItemDAO.delete(itemId);
            init();
        }
        return null;
    }

    public String nodeClicked() {
        itemId = ((Item) nodeSelected.getData()).getId();
        item = (Item) nodeSelected.getData();
        return null;
    }

    public String save() {
        if (item.getId() == 0) {
            long newId = ItemDAO.add(item);
            item.setId(newId);
        }
        item.setLevel(ItemDAO.getById(item.getParentId()).getLevel() + 1); // da li je level uopste potreban???
        ItemDAO.update(item);
        return null;
    }

    public List<ItemType> getTypeList() {
        typeList = ItemTypeDAO.getAll();
        return typeList;
    }

    public void setTypeList(List<ItemType> typeList) {
        this.typeList = typeList;
    }

    public List<Item> getParentList() {
        parentList = ItemDAO.getAll();
        return parentList;
    }

    public void setParentList(List<Item> parentList) {
        this.parentList = parentList;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(DefaultTreeNode root) {
        this.root = root;
    }

    public TreeNode getNodeSelected() {
        return nodeSelected;
    }

    public void setNodeSelected(TreeNode nodeSelected) {
        this.nodeSelected = nodeSelected;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public Item getItem() {
//        item = ItemDAO.getById(itemId);
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public List<Page> getPageList() {
        return pageList;
    }

    public void setPageList(List<Page> pageList) {
        this.pageList = pageList;
    }

    public List<Event> getEventList() {
        return eventList;
    }

    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }

    public List<News> getNewsList() {
        return newsList;
    }

    public void setNewsList(List<News> newsList) {
        this.newsList = newsList;
    }

    public List<Gallery> getGalleryList() {
        return galleryList;
    }

    public void setGalleryList(List<Gallery> galleryList) {
        this.galleryList = galleryList;
    }
}
