/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platform.dao;

import java.sql.PreparedStatement;
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

    private static String genericQuery;
    private static PreparedStatement ps;

    public CMSElementDAO() {

    }

    private static void prepare(String query) throws SQLException {
        ps = DBConnection.getInstance().getConn().prepareStatement(query);
    }

    private static void setPsInsertFields(long id, CMSElement cmsel) throws SQLException {
        ps.setLong(1, id);
        ps.setString(2, cmsel.getName());
        ps.setString(3, cmsel.getUrl());
        ps.setString(4, cmsel.getAdminUrl());
        ps.setLong(5, cmsel.getObjectId());
        ps.setLong(6, cmsel.getObjectHolderId());
        ps.setString(7, cmsel.getObjectTable());
        ps.setLong(8, cmsel.getObjectTypeId());
    }

    private static void setPsUpdateFields(CMSElement cmsel) throws SQLException {
        ps.setString(1, cmsel.getName());
        ps.setString(2, cmsel.getUrl());
        ps.setString(3, cmsel.getAdminUrl());
        ps.setLong(4, cmsel.getObjectId());
        ps.setLong(5, cmsel.getObjectHolderId());
        ps.setString(6, cmsel.getObjectTable());
        ps.setLong(7, cmsel.getObjectTypeId());
        ps.setLong(8, cmsel.getId());
    }

    public static LinkedList<CMSElement> getAll() {
        return getAllWhere("1=1");
    }

    public static LinkedList<CMSElement> getAllWhere(String where) {
        LinkedList<CMSElement> cmsElements = new LinkedList<>();
        try {
            genericQuery = "SELECT * FROM cms_element WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
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
            Logger.getLogger(CMSElementDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cmsElements;
    }

    public static LinkedList<CMSElement> getAllByType(long typeId) {
        return getAllWhere("object_type_id=" + typeId);
    }

    public static CMSElement getWhere(String where) {
        CMSElement cmsElement = new CMSElement();
        try {
            genericQuery = "SELECT * FROM cms_element WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
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
            Logger.getLogger(CMSElementDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cmsElement;
    }

    public static CMSElement getById(long id) {
        return getWhere("id=" + id);
    }

    public static LinkedList<CMSElement> getForTopList(long id) {
        LinkedList<TopListElementRelation> tlerList = new LinkedList<>();
        tlerList = TopListElementRelationDAO.getAllWhere("toplist_id=" + id);
        LinkedList<CMSElement> cmselList = new LinkedList<>();
        for (TopListElementRelation t : tlerList) {
            cmselList.add(CMSElementDAO.getById(t.getCmsElementId()));
        }
        return cmselList;
    }

    public static long add(CMSElement cmsElement) {
        long last = -1L;
        try {
            genericQuery = "SELECT MAX(id) AS last FROM cms_element";
            prepare(genericQuery);
            ResultSet rs1 = ps.executeQuery();
            if (rs1.next()) {
                last = rs1.getLong("last");
            } else {
                last = 0;
            }
            genericQuery = "INSERT INTO cms_element VALUES(?,?,?,?,?,?,?,?)";
            prepare(genericQuery);
            setPsInsertFields(++last, cmsElement);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CMSElementDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(CMSElement cmsElement) {
        try {
            genericQuery = "update cms_element set"
                    + " name=?,"
                    + " url=?,"
                    + " admin_url=?,"
                    + " object_id=?,"
                    + " object_holder_id=?,"
                    + " object_table=?,"
                    + " object_type_id=?"
                    + " where id=?";
            prepare(genericQuery);
            setPsUpdateFields(cmsElement);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CMSElementDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static long countAll() {
        return countWhere("1=1");
    }

    public static long countWhere(String where) {
        try {
            genericQuery = "SELECT COUNT(*) AS rowcount FROM cms_element WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(CMSElementDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static void delete(CMSElement cmsel) {
        delete(cmsel.getId());
    }

    public static void delete(long id) {
        try {
            genericQuery = "delete from cms_element where id=?";
            prepare(genericQuery);
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CMSElementDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
