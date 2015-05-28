/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comment.dao;

import comment.model.ComponentType;
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

    public static LinkedList<ComponentType> getAll() {
        LinkedList<ComponentType> componentTypes = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM component_type");
        try {
            while (rs.next()) {
                componentTypes.add(new ComponentType(
                        rs.getInt("id"),
                        rs.getString("name")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ComponentType.class.getName()).log(Level.SEVERE, null, ex);
        }
        return componentTypes;
    }

    public static ComponentType getById(long id) {
        ComponentType component_type = new ComponentType();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM component_type WHERE id=" + id);
        try {
            if (rs.next()) {
                component_type = new ComponentType(
                        rs.getInt("id"),
                        rs.getString("name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ComponentType.class.getName()).log(Level.SEVERE, null, ex);
        }
        return component_type;
    }

    public static ComponentType getWhere(String where) {
        ComponentType componentType = new ComponentType();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM component_type WHERE " + where);
        try {
            if (rs.next()) {
                componentType = new ComponentType(
                        rs.getLong("id"),
                        rs.getString("name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ComponentType.class.getName()).log(Level.SEVERE, null, ex);
        }
        return componentType;
    }

    public static LinkedList<ComponentType> getAllWhere(String where) {
        LinkedList<ComponentType> componentTypes = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM component_type WHERE " + where);
        try {
            while (rs.next()) {
                componentTypes.add(new ComponentType(
                        rs.getLong("id"),
                        rs.getString("name")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ComponentType.class.getName()).log(Level.SEVERE, null, ex);
        }
        return componentTypes;
    }

    public static long insert(ComponentType componentType) {
        long last = 0L;
        try {
            String query1 = "SELECT MAX(id) AS last FROM component_type";
            ResultSet rs1 = DBConnection.getInstance().executeQuery(query1);

            try {
                if (rs1.next()) {
                    last = rs1.getLong("last");
                } else {
                    last = 0;
                }
                String query2 = "INSERT INTO component_type VALUES(" + ++last + ",'"
                        + componentType.getName() + "')";
                DBConnection.getInstance().executeUpdate(query2);

            } catch (SQLException ex) {
                Logger.getLogger(ComponentType.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(ComponentType.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(ComponentType componentType) {
        String query = "update component_type set "
                + " name='" + componentType.getName() + "'"
                + " where id=" + componentType.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(int id) {
        String query = "delete from component_type where id=" + id;
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(ComponentType component_type) {
        String query = "delete from component_type where id=" + component_type.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

    public static long countAll() {
        try {
            String query = "SELECT COUNT(*) AS rowcount FROM component_type";
            ResultSet rs = DBConnection.getInstance().executeQuery(query);
            rs.next();
            long count = rs.getLong("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(ComponentTypeDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static long countWhere(String where) {
        try {
            String query = "SELECT COUNT(*) AS rowcount FROM component_type WHERE " + where;
            ResultSet rs = DBConnection.getInstance().executeQuery(query);
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
            String query = "SELECT * FROM " + tableName + " WHERE id=" + id;
            ResultSet rs = DBConnection.getInstance().executeQuery(query);
            rs.next();
            componentName = rs.getString("title");
        } catch (SQLException ex) {
            Logger.getLogger(ComponentTypeDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "";
        }
        return componentName;
    }
}
