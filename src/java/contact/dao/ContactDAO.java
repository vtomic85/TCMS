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
import java.sql.PreparedStatement;
import utils.DBConnection;

/**
 *
 * @author Vladimir Tomic
 */
public class ContactDAO {

    private static String genericQuery;
    private static PreparedStatement ps;

    public ContactDAO() {

    }

    private static void prepare(String query) throws SQLException {
        ps = DBConnection.getInstance().getConn().prepareStatement(query);
    }

    private static void setPsInsertFields(int id, Contact contact) throws SQLException {
        ps.setInt(1, id);
        ps.setString(2, contact.getAddress1());
        ps.setString(3, contact.getAddress2());
        ps.setString(4, contact.getAddress3());
        ps.setString(5, contact.getPhone1());
        ps.setString(6, contact.getPhone2());
        ps.setString(7, contact.getPhone3());
        ps.setString(8, contact.getEmail());
        ps.setString(9, contact.getWebsite());
        ps.setString(10, contact.getTwitter());
        ps.setString(11, contact.getFacebook());
        ps.setString(12, contact.getLinkedin());
        ps.setString(13, contact.getFoursquare());
        ps.setString(14, contact.getGmap());
    }

    private static void setPsUpdateFields(Contact contact) throws SQLException {
        ps.setString(1, contact.getAddress1());
        ps.setString(2, contact.getAddress2());
        ps.setString(3, contact.getAddress3());
        ps.setString(4, contact.getPhone1());
        ps.setString(5, contact.getPhone2());
        ps.setString(6, contact.getPhone3());
        ps.setString(7, contact.getEmail());
        ps.setString(8, contact.getWebsite());
        ps.setString(9, contact.getTwitter());
        ps.setString(10, contact.getFacebook());
        ps.setString(11, contact.getLinkedin());
        ps.setString(12, contact.getFoursquare());
        ps.setString(13, contact.getGmap());
        ps.setInt(14, contact.getId());
    }

    public static LinkedList<Contact> getAll() {
        return getAllWhere("1=1");
    }

    public static LinkedList<Contact> getAllWhere(String where) {
        LinkedList<Contact> contacts = new LinkedList<>();
        try {
            genericQuery = "SELECT * FROM comment WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
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
            Logger.getLogger(ContactDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contacts;
    }

    public static Contact getById(long id) {
        return getWhere("id=" + id);
    }

    public static Contact getWhere(String where) {
        Contact contact = new Contact();
        try {
            genericQuery = "SELECT * FROM contact WHERE " + where;
            prepare(genericQuery);
            ResultSet rs = ps.executeQuery();
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

    public static int add(Contact contact) {
        int last = -1;
        try {
            genericQuery = "SELECT MAX(id) AS last FROM contact";
            prepare(genericQuery);
            ResultSet rs1 = ps.executeQuery();
            if (rs1.next()) {
                last = rs1.getInt("last");
            } else {
                last = 0;
            }
            genericQuery = "INSERT INTO contact VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            prepare(genericQuery);
            setPsInsertFields(last, contact);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Contact.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return last;
        }
    }

    public static void update(Contact contact) {
        try {
            genericQuery = "update contact set"
                    + " address1=?,"
                    + " address2=?,"
                    + " address3=?,"
                    + " phone1=?,"
                    + " phone2=?,"
                    + " phone3=?,"
                    + " email=?,"
                    + " website=?,"
                    + " twitter=?,"
                    + " facebook=?,"
                    + " linkedin=?,"
                    + " foursquare=?,"
                    + " gmap=?"
                    + " where id=?";
            prepare(genericQuery);
            setPsUpdateFields(contact);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ContactDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void delete(Contact contact) {
        delete(contact.getId());
    }

    public static void delete(int id) {
        try {
            String query = "delete from comment where id=?";
            ps = DBConnection.getInstance().getConn().prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ContactDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
