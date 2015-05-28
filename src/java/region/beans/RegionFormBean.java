/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package region.beans;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import region.dao.RegionDAO;
import region.model.Region;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class RegionFormBean {

    private Region region;
    private long regionId;

    public RegionFormBean() {

    }

    public void init() {
        if (regionId > 0) {
            region = RegionDAO.getById(regionId);
        } else {
            region = new Region();
        }
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public String save() {
        ArrayList<Region> regions = RegionDAO.getAll();
        int newRegListSize = regionId > 0 ? regions.size() : regions.size() + 1;
        region.setOrd(region.getOrd() < 1 ? 1 : (region.getOrd() > newRegListSize ? newRegListSize : region.getOrd()));
        int oldOrd = (regionId > 0) ? RegionDAO.getById(regionId).getOrd() : region.getOrd();
        System.out.println("DEBUG ::: RegionFormBean:save:newRegListSize=" + newRegListSize + ", region.ord=" + region.getOrd() + ", oldOrd=" + oldOrd);

        // If this is an existing region whose ord wasn't changed, just update it and exit
        if (regionId > 0 && oldOrd == region.getOrd()) {
            System.out.println("DEBUG ::: RegionFormBean:save:unchanged existing region - RETURN");
            RegionDAO.update(region);
            return "adminRegionList";
        }
        // Else - the existing region's ord was changed, or this is a new region. Continue...

        // If the region is not inserted at the end of the list, we have to move down some existing regions
        if ((regionId > 0) || (regionId == 0 && region.getOrd() < newRegListSize)) {
            System.out.println("DEBUG ::: RegionFormBean:save:existing region moved or new region not at the bottom");
            switch (Integer.signum(oldOrd - region.getOrd())) {
                case -1: // oldOrd<currentOrd => the existing region was moved somewhere down
                    System.out.println("DEBUG ::: RegionFormBean:save:existing region moved down");
                    for (Region r : regions) {
                        // Decrement ords only for those regions whose ords are between this region's old and new ord
                        // (e.g. if we move ord 2 to ord 4, we will decrease only 3rd and 4th region's ord)
                        if (r.getOrd() <= region.getOrd() && r.getOrd() > oldOrd && r.getId() != regionId) {
                            r.setOrd(r.getOrd() - 1);
                            RegionDAO.update(r);
                        }
                    }
                    break;
                case 0: // this is a new region
                    System.out.println("DEBUG ::: RegionFormBean:save:new region inserted");
                    if (region.getOrd() == oldOrd && regionId == 0) {
                        for (Region r : regions) {
                            if (r.getOrd() >= region.getOrd()) {
                                r.setOrd(r.getOrd() + 1);
                                RegionDAO.update(r);
                            }
                        }
                    }
                    break;
                case 1: // oldOrd>currentOrd => the existing region was moved somewhere up
                    System.out.println("DEBUG ::: RegionFormBean:save:existing region moved up");
                    for (Region r : regions) {
                        // Increment ords only for those regions whose ords are between this region's old and new ord
                        // (e.g. if we move ord 4 to ord 2, we will increase only 2nd and 3rd region's ord)
                        if (r.getOrd() >= region.getOrd() && r.getOrd() < oldOrd && r.getId() != regionId) {
                            r.setOrd(r.getOrd() + 1);
                            RegionDAO.update(r);
                        }
                    }
                    break;
            }
        }

        if (region.getId() == 0) {
            long newId = RegionDAO.add(region);
            region.setId(newId);
        } else {
            RegionDAO.update(region);
        }
        return "adminRegionList";
    }

    public long getRegionId() {
        return regionId;
    }

    public void setRegionId(long regionId) {
        this.regionId = regionId;
    }
}
