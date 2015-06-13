/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toplist.model;

import toplist.model.TopListElementRelation;
import java.util.LinkedList;
import platform.dao.CMSElementDAO;
import toplist.dao.TopListElementRelationDAO;
import platform.model.CMSElement;

/**
 *
 * @author Vladimir Tomic
 */
public class TopList {

    private long id;
    private String name;
    private long typeId;
    private LinkedList<CMSElement> list;
    private long listSize;

    public TopList(long id, String name, long typeId) {
        this.id = id;
        this.name = name;
        this.typeId = typeId;
        this.list = new LinkedList<>();
    }

    public TopList() {
        this(0, "", 0);
    }

    public void refreshList() {
        if (list == null) {
            list = new LinkedList<>();
        } else {
            list.clear();
        }
        if (this.id > 0) {
            LinkedList<TopListElementRelation> tlreList = new LinkedList<>();
            tlreList = TopListElementRelationDAO.getAllWhere("toplist_id=" + this.id);
            if (tlreList.size() > 0) {
                StringBuilder sb = new StringBuilder("(");
                for (TopListElementRelation tlre : tlreList) {
                    sb.append(tlre.getId()).append(",");
                }
                sb.replace(sb.length() - 1, sb.length(), ")");
                list = CMSElementDAO.getAllWhere(" id in " + sb);
                listSize = list.size();
            } else {
                listSize = 0;
            }
        } else {
            listSize = 0;
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<CMSElement> getList() {
        if (list == null) {
            list = new LinkedList<>();
        } else {
            list.clear();
        }
        LinkedList<TopListElementRelation> tlreList = new LinkedList<>();
        tlreList = TopListElementRelationDAO.getAllWhere("toplist_id=" + this.id);
        StringBuilder sb = new StringBuilder("(");
        for (TopListElementRelation tlre : tlreList) {
            sb.append(tlre.getId() + ",");
        }
        if (sb.length() > 1) {
            sb.replace(sb.length() - 1, sb.length(), ")");
            list = CMSElementDAO.getAllWhere(" id in " + sb);
            return list;
        } else {
            return null;
        }
    }

    public void setList(LinkedList<CMSElement> list) {
        this.list = list;
    }

    public long getListSize() {
        return TopListElementRelationDAO.countWhere("toplist_id=" + id);
    }

    public int addElement(CMSElement cmsel) {
        list.add(cmsel);
        TopListElementRelation tler = new TopListElementRelation();
        tler.setCmsElementId(cmsel.getId());
        tler.setTopListId(this.id);
        TopListElementRelationDAO.add(tler);
        return list.size();
    }

    public int removeElement(CMSElement cmsel) {
        list.remove(cmsel);
        TopListElementRelationDAO.deleteWhere("toplist_id=" + this.id + " and cms_element_id="
                + cmsel.getId()
        );
        return list.size();
    }

    public int removeElement(int index) {
        CMSElement cmsel = list.get(index);
        list.remove(index);
        TopListElementRelationDAO.deleteWhere("toplist_id=" + this.id + " and cms_element_id="
                + cmsel.getId()
        );
        return list.size();
    }

    public long getTypeId() {
        return typeId;
    }

    public void setTypeId(long typeId) {
        this.typeId = typeId;
    }
}
