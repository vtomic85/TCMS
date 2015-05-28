/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platform.beans;

import platform.dao.CountryDAO;
import platform.model.Country;
import java.util.LinkedList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import utils.Utils;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@RequestScoped
public class CountryListBean {

    private LinkedList<Country> countryList;
    private boolean listEmpty;

    public CountryListBean() {

    }

    @PostConstruct
    public void refresh() {
        if (countryList == null) {
            countryList = new LinkedList<>();
        }
        countryList = CountryDAO.getAll();
    }

    public boolean isListEmpty() {
        if (countryList == null) {
            return true;
        }
        return countryList.isEmpty();
    }

    public LinkedList<Country> getCountryList() {
        return countryList;
    }

    public void setCountryList(LinkedList<Country> countryList) {
        this.countryList = countryList;
    }

    public String editCountry() {
        return "adminEditCountry";
    }

    public String deleteCountry() {
        countryList.remove(Integer.parseInt(Utils.getParam("countryId")));
        CountryDAO.delete(Integer.parseInt(Utils.getParam("countryId")));
        refresh();
        return null;
    }

    public String newCountry() {
        return "adminEditCountry";
    }
}
