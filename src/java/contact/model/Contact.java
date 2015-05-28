/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contact.model;

/**
 *
 * @author Vladimir Tomic
 */
public class Contact {

    private int id;
    private String address1;
    private String address2;
    private String address3;
    private String phone1;
    private String phone2;
    private String phone3;
    private String email;
    private String website;
    private String twitter;
    private String facebook;
    private String linkedin;
    private String foursquare;
    private String gmap;

    public Contact(int id, String address1, String address2, String address3, String phone1, String phone2, String phone3, String email, String website, String twitter, String facebook, String linkedin, String foursquare, String gmap) {
        this.id = id;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.phone3 = phone3;
        this.email = email;
        this.website = website;
        this.twitter = twitter;
        this.facebook = facebook;
        this.linkedin = linkedin;
        this.foursquare = foursquare;
        this.gmap = gmap;
    }

    public Contact() {
        this(0, "", "", "", "", "", "", "", "", "", "", "", "", "");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getPhone3() {
        return phone3;
    }

    public void setPhone3(String phone3) {
        this.phone3 = phone3;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getFoursquare() {
        return foursquare;
    }

    public void setFoursquare(String foursquare) {
        this.foursquare = foursquare;
    }

    public String getGmap() {
        return gmap;
    }

    public void setGmap(String gmap) {
        this.gmap = gmap;
    }
}
