/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contact.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import contact.model.Contact;
import utils.DBConnection;

/**
 *
 * @author Vladimir Tomic
 */
public class ContactDAO {

    public static LinkedList<Contact> getAll() {
        LinkedList<Contact> contacts = new LinkedList<>();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM contact");
        try {
            while (rs.next()) {
                contacts.add(new Contact(
                        rs.getInt("id"),
                        rs.getString("address1"),
                        rs.getString("address2"),
                        rs.getString("address3"),
                        rs.getString("phone1"),
                        rs.getString("phone2"),
                        rs.getString("phone3"),
                        rs.getString("email"),
                        rs.getString("website"),
                        rs.getString("twitter"),
                        rs.getString("facebook"),
                        rs.getString("linkedin"),
                        rs.getString("foursquare"),
                        rs.getString("gmap")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Contact.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contacts;
    }

    public static Contact getById(long id) {
        Contact contact = new Contact();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM contact WHERE id=" + id);
        try {
            if (rs.next()) {
                contact = new Contact(
                        rs.getInt("id"),
                        rs.getString("address1"),
                        rs.getString("address2"),
                        rs.getString("address3"),
                        rs.getString("phone1"),
                        rs.getString("phone2"),
                        rs.getString("phone3"),
                        rs.getString("email"),
                        rs.getString("website"),
                        rs.getString("twitter"),
                        rs.getString("facebook"),
                        rs.getString("linkedin"),
                        rs.getString("foursquare"),
                        rs.getString("gmap"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Contact.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contact;
    }

    public static Contact getWhere(String where) {
        Contact contact = new Contact();
        ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM contact WHERE " + where);
        try {
            if (rs.next()) {
                contact = new Contact(
                        rs.getInt("id"),
                        rs.getString("address1"),
                        rs.getString("address2"),
                        rs.getString("address3"),
                        rs.getString("phone1"),
                        rs.getString("phone2"),
                        rs.getString("phone3"),
                        rs.getString("email"),
                        rs.getString("website"),
                        rs.getString("twitter"),
                        rs.getString("facebook"),
                        rs.getString("linkedin"),
                        rs.getString("foursquare"),
                        rs.getString("gmap"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Contact.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contact;
    }

    public static long add(Contact contact) {
        long last = -1L;
        try {
            String query1 = "SELECT MAX(id) AS last FROM contact";
            ResultSet rs1 = DBConnection.getInstance().executeQuery(query1);

            try {
                if (rs1.next()) {
                    last = rs1.getLong("last");
                } else {
                    last = 0;
                }
                String query2 = "INSERT INTO contact VALUES(" + ++last
                        + ", '" + contact.getAddress1() + "'"
                        + ", '" + contact.getAddress2() + "'"
                        + ", '" + contact.getAddress3() + "'"
                        + ", '" + contact.getPhone1() + "'"
                        + ", '" + contact.getPhone2() + "'"
                        + ", '" + contact.getPhone3() + "'"
                        + ", '" + contact.getEmail() + "'"
                        + ", '" + contact.getWebsite() + "'"
                        + ", '" + contact.getTwitter() + "'"
                        + ", '" + contact.getFacebook() + "'"
                        + ", '" + contact.getLinkedin() + "'"
                        + ", '" + contact.getFoursquare() + "'"
                        + ", '" + contact.getGmap() + "'"
                        + ")";
                DBConnection.getInstance().executeUpdate(query2);

            } catch (SQLException ex) {
                Logger.getLogger(Contact.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(Contact.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(Contact contact) {
        String query = "update contact set "
                + " address1='" + contact.getAddress1() + "',"
                + " address2='" + contact.getAddress2() + "',"
                + " address3='" + contact.getAddress3() + "',"
                + " phone1='" + contact.getPhone1() + "',"
                + " phone2='" + contact.getPhone2() + "',"
                + " phone3='" + contact.getPhone3() + "',"
                + " email='" + contact.getEmail() + "',"
                + " website='" + contact.getWebsite() + "',"
                + " twitter='" + contact.getTwitter() + "',"
                + " facebook='" + contact.getFacebook() + "',"
                + " linkedin='" + contact.getLinkedin() + "',"
                + " foursquare='" + contact.getFoursquare() + "',"
                + " gmap='" + contact.getGmap() + "'"
                + " where id=" + contact.getId();
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(long id) {
        String query = "delete from contact where id=" + id;
        DBConnection.getInstance().executeUpdate(query);
    }

    public static void delete(Contact contact) {
        String query = "delete from contact where id=" + contact.getId();
        DBConnection.getInstance().executeUpdate(query);
    }
}
