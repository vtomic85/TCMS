/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platform.dao;

import toplist.dao.TopListElementRelationDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import platform.model.CMSElement;
import toplist.model.TopListElementRelation;
import utils.DBConnection;

/**
 *
 * @author Vladimir Tomic
 */
public class CMSElementDAO {

    public static LinkedList<CMSElement> getAll() {
        LinkedList<CMSElement> cmsElements = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM cms_element");
        try {
            while (rs.next()) {
                cmsElements.add(new CMSElement(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getString("url"),
                        rs.getString("admin_url"),
                        null,
                        rs.getLong("object_id"),
                        rs.getLong("object_holder_id"),
                        rs.getString("object_table"),
                        rs.getLong("object_type_id")
                ));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CMSElement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cmsElements;
    }

    public static LinkedList<CMSElement> getAllWhere(String where) {
        LinkedList<CMSElement> cmsElements = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM cms_element WHERE " + where);
        try {
            while (rs.next()) {
                cmsElements.add(new CMSElement(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getString("url"),
                        rs.getString("admin_url"),
                        null,
                        rs.getLong("object_id"),
                        rs.getLong("object_holder_id"),
                        rs.getString("object_table"),
                        rs.getLong("object_type_id")));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CMSElement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cmsElements;
    }

    public static LinkedList<CMSElement> getAllByType(long typeId) {
//        System.out.println("DEBUG ::: CMSElementDAO:typeId=" + typeId);
        return getAllWhere("object_type_id=" + typeId);
    }

    public static CMSElement getWhere(String where) {
        CMSElement cmsElement = new CMSElement();
//        System.out.println("DEBUG ::: CMSElementDAO:getWhere:where=" + where);
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM cms_element WHERE " + where);
        try {
            if (rs.next()) {
                cmsElement = new CMSElement(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getString("url"),
                        rs.getString("admin_url"),
                        null,
                        rs.getLong("object_id"),
                        rs.getLong("object_holder_id"),
                        rs.getString("object_table"),
                        rs.getLong("object_type_id"));
            } else {
                cmsElement = null;
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CMSElement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cmsElement;
    }

    public static CMSElement getById(long id) {
        return getWhere("id=" + id);
    }

    public static LinkedList<CMSElement> getForTopList(long id) {
        LinkedList<TopListElementRelation> tlerList = new LinkedList<>();
        tlerList = TopListElementRelationDAO.getAllWhere("toplist_id=" + id);
//        System.out.println("DEBUG ::: CMSElementDAO:getForTopList:tlerList.size=" + tlerList.size());
        LinkedList<CMSElement> cmselList = new LinkedList<>();
        for (TopListElementRelation t : tlerList) {
            cmselList.add(CMSElementDAO.getById(t.getCmsElementId()));
//            System.out.println("DEBUG ::: CMSElementDAO:getForTopList:added cmselId=" + t.getCmsElementId());
        }
//        System.out.println("DEBUG ::: CMSElementDAO:getForTopList:cmselList.size=" + cmselList.size());
        return cmselList;
    }

    public static long insert(CMSElement cmsElement) {
        long last = 0L;
        try {
            String query1 = "SELECT MAX(id) AS last FROM cms_element";
            ResultSet rs1 = DBConnection.getInstance().executeQuery(query1);

            try {
                if (rs1.next()) {
                    last = rs1.getLong("last");
                } else {
                    last = 0;
                }
                String query2 = "INSERT INTO cms_element VALUES(" + ++last + ", '"
                        + cmsElement.getName() + "', '"
                        + cmsElement.getUrl() + "', '"
                        + cmsElement.getAdminUrl() + "', "
                        + cmsElement.getObjectId() + ", "
                        + cmsElement.getObjectHolderId() + ", '"
                        + cmsElement.getObjectTable() + "', "
                        + cmsElement.getObjectTypeId() + ")";
                DBConnection.getInstance().executeUpdate(query2);
                cmsElement.setId(last);
                rs1.close();
            } catch (SQLException ex) {
                Logger.getLogger(CMSElement.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(CMSElement.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(CMSElement cmsElement) {
        String query = "update cms_element set"
                + " name='" + cmsElement.getName() + "',"
                + " url='" + cmsElement.getUrl() + "',"
                + " admin_url='" + cmsElement.getAdminUrl() + "',"
                + " object_id=" + cmsElement.getObjectId() + ","
                + " object_holder_id=" + cmsElement.getObjectHolderId() + ","
                + " object_table='" + cmsElement.getObjectTable() + "',"
                + " object_type_id=" + cmsElement.getObjectTypeId()
                + " where id=" + cmsElement.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(int id) {
        String query = "delete from cms_element where id=" + id;
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(CMSElement cmsElement) {
        String query = "delete from cms_element where id=" + cmsElement.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

}
