/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item.model;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/**
 *
 * @author Vladimir Tomic
 */
public class ItemTree {

    private Item item;
    private Set children;

    public ItemTree(Item item) {
        this.item = item;
        this.children = new HashSet();
    }

    // OVO TREBA TESTIRATI!!!
    public static void generateList(ItemTree root, LinkedList<Item> list) {
        list.add(root.getItem());
        for (Iterator i = root.getChildren().iterator(); i.hasNext();) {
            ItemTree child = (ItemTree) i.next();
            generateList(child, list);
        }
    }

    // Treba li ovo da ostane ili sluzi samo za test???
    public static void printNames(ItemTree itemTree) {
        System.out.println(itemTree.getItem().getName());
        for (Iterator i = itemTree.getChildren().iterator(); i.hasNext();) {
            ItemTree child = (ItemTree) i.next();
            printNames(child);
        }
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Set getChildren() {
        return children;
    }

    public void setChildren(Set children) {
        this.children = children;
    }
}
