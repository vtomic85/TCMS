/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comment.dao;

import comment.model.ComponentType;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.DBConnection;

/**
 *
 * @author Vladimir Tomic
 */
public class ComponentTypeDAO {

    private static String genericQuery;
    private static PreparedStatement ps;

    public ComponentTypeDAO() {

    }

    private static void prepare(String query) throws SQLException {
        ps = DBConnection.getInstance().getConn().prepareStatement(query);
    }

    private static void setPsInsertFields(long id, ComponentType ct) throws SQLException {
        ps.setLong(1, id);
        ps.setString(2, ct.getName());
    }

    private static void setPsUpdateFields(ComponentType ct) throws SQLException {
        ps.setString(1, ct.getName());
        ps.setLong(2, ct.getId());
    }

    public static LinkedList<ComponentType> getAll() {
        return getAllWhere("1=1");
    }

    public static ComponentType getById(long id) {
        return getWhere("id=" + id);
    }

    public static ComponentType getWhere(String where) {
        ComponentType componentType = new ComponentType();
        try {
            genericQuery = "SELECT * FROM component_type WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                componentType = new ComponentType(
                        rs.getLong("id"),
                        rs.getString("name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ComponentTypeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return componentType;
    }

    public static LinkedList<ComponentType> getAllWhere(String where) {
        LinkedList<ComponentType> componentTypes = new LinkedList<>();
        try {
            genericQuery = "SELECT * FROM component_type WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                componentTypes.add(new ComponentType(
                        rs.getLong("id"),
                        rs.getString("name")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ComponentTypeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return componentTypes;
    }

    public static long insert(ComponentType ct) {
        long last = 0L;
        try {
            genericQuery = "SELECT MAX(id) AS last FROM component_type";
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                last = rs.getLong("last");
            } else {
                last = 0;
            }
            genericQuery = "INSERT INTO component_type VALUES(?,?)";
            prepare(genericQuery);
            setPsInsertFields(last, ct);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ComponentTypeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return last;
    }

    public static void update(ComponentType ct) {
        try {
            genericQuery = "update component_type set name=? where id=?";
            prepare(genericQuery);
            setPsUpdateFields(ct);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ComponentTypeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void delete(long id) {
        try {
            genericQuery = "delete from component_type where id=?";
            prepare(genericQuery);
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ComponentTypeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void delete(ComponentType ct) {
        delete(ct.getId());
    }

    public static long countAll() {
        return countWhere("1=1");
    }

    public static long countWhere(String where) {
        try {
            genericQuery = "SELECT COUNT(*) AS rowcount FROM component_type WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(ComponentTypeDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static String getComponentName(String tableName, long id) {
        String componentName = "";
        try {
            genericQuery = "SELECT * FROM " + tableName + " WHERE id=" + id;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
            rs.next();
            componentName = rs.getString("title");
        } catch (SQLException ex) {
            Logger.getLogger(ComponentTypeDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "";
        }
        return componentName;
    }
}
