package user.model;

import java.util.Date;
import user.dao.UserTypeDAO;

/**
 *
 * @author Vladimir Tomic
 */
public class User {

    private long id;
    private String username;
    private String password;
    private int typeId;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String city;
    private String phone;
    private int countryId;
    private Date dateOfBirth;
    private String typeName;
    private boolean active;
    private java.sql.Date sqlDateOfBirth;
    private String imgPath;

    public User(long id, String username, String password, int typeId,
            String firstName, String lastName, String email, String address,
            String city, int countryId, Date dateOfBirth, String phone, boolean active, String imgPath) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.typeId = typeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.city = city;
        this.phone = phone;
        this.countryId = countryId;
        this.dateOfBirth = dateOfBirth;
        this.active = active;
        this.sqlDateOfBirth = (dateOfBirth == null) ? null : new java.sql.Date(dateOfBirth.getTime());
        this.imgPath = imgPath;
    }

    public User() {
        this(0, null, null, 0, null, null, null, null, null, 0, null, null, false, null);
    }

    public void calcUtilToSqlDates() {
        if (dateOfBirth != null) {
            this.sqlDateOfBirth = new java.sql.Date(dateOfBirth.getTime());
        } else {
            this.sqlDateOfBirth = new java.sql.Date(new Date().getTime());
        }
    }

    public void calcSqlToUtilDates() {
        this.dateOfBirth = new Date(sqlDateOfBirth.getTime());
    }

    public java.sql.Date getSqlDateOfBirth() {
        return sqlDateOfBirth;
    }

    public void setSqlDateOfBirth(java.sql.Date sqlDateOfBirth) {
        this.sqlDateOfBirth = sqlDateOfBirth;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getTypeName() {
        typeName = UserTypeDAO.getById(typeId).getName();
        return typeName;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
}
