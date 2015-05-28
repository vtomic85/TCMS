/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platform.beans;

import platform.dao.CountryDAO;
import platform.model.Country;
import java.util.LinkedList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class CountryFormBean {

    private Country country;
    private long countryId;

    public CountryFormBean() {

    }

    public void init() {
        if (countryId > 0) {
            country = CountryDAO.getById(countryId);
        } else {
            country = new Country();
        }
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String save() {
        if (country.getId() == 0) {
            long id = CountryDAO.insert(country);
            country.setId(id);
        } else {
            CountryDAO.update(country);
        }
        return "adminCountryList";
    }

    public long getCountryId() {
        return countryId;
    }

    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }
}
