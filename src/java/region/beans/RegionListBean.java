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
import region.dao.RegionPartDAO;
import region.model.Region;
import region.model.RegionPart;
import utils.Utils;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@RequestScoped
public class RegionListBean {

    private ArrayList<Region> regions;
    private boolean listEmpty;
    private int lastOrd;

    public RegionListBean() {
    }

    @PostConstruct
    public void refresh() {
        if (regions == null) {
            regions = new ArrayList<>();
        }
        regions = RegionDAO.getAllOrdBy("ord asc");
        if (regions == null) {
        }
        lastOrd = regions.size();
    }

    public Region findByOrd(int ord) {
        return RegionDAO.getWhere("ord=" + ord);
    }

    public String moveUp() {
        int ord = Integer.parseInt(Utils.getParam("ord"));
        Region ip1 = findByOrd(ord);
        Region ip2 = findByOrd(ord - 1);
        ip1.setOrd(ord - 1);
        ip2.setOrd(ord);
        RegionDAO.update(ip1);
        RegionDAO.update(ip2);
        refresh();
        return null;
    }

    public String moveDown() {
        int ord = Integer.parseInt(Utils.getParam("ord"));
        Region ip1 = findByOrd(ord);
        Region ip2 = findByOrd(ord + 1);
        ip1.setOrd(ord + 1);
        ip2.setOrd(ord);
        RegionDAO.update(ip1);
        RegionDAO.update(ip2);
        refresh();
        return null;
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

    public String editRegion() {
        return "adminEditRegion";
    }

    public String deleteRegion() {
        long regId = Long.parseLong(Utils.getParam("regionId"));
        RegionPartDAO.deleteWhere("region_id=" + regId); // first of all, delete all the parts which are connected with this region
        int oldOrd = RegionDAO.getById(regId).getOrd();
        RegionDAO.delete(regId);
        // If the deleted region wasn't the last one, some regions will have to move up
        if (oldOrd < regions.size()) {
            for (Region r : regions) {
                if (r.getId() != regId && r.getOrd() > oldOrd) {
                    r.setOrd(r.getOrd() - 1);
                    RegionDAO.update(r);
                }
            }
        }
        refresh();
        return null;
    }

    public String newRegion() {
        return "adminEditRegion";
    }

    public int getLastOrd() {
        if (regions == null) {
        }
        lastOrd = regions.size();
        return lastOrd;
    }

    public void setLastOrd(int lastOrd) {
        this.lastOrd = lastOrd;
    }
}
