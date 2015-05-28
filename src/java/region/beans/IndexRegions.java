/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package region.beans;

import java.util.ArrayList;
import java.util.LinkedList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import region.dao.RegionDAO;
import region.model.Region;

/**
 *
 * @author Vladimir Tomic
 */
@RequestScoped
@ManagedBean
public class IndexRegions {

    private ArrayList<Region> regions;
    private boolean listEmpty;

    public IndexRegions() {

    }

    @PostConstruct
    public void refresh() {
        if (regions == null) {
            regions = new ArrayList<>();
        }
        regions = RegionDAO.getAll();
    }

    public boolean isListEmpty() {
        if (regions == null) {
            return true;
        }
        return regions.isEmpty();
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public void setRegions(ArrayList<Region> regions) {
        this.regions = regions;
    }
}
