/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package region.beans;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import region.dao.RegionDAO;
import region.model.Region;
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
        regions = RegionDAO.getAll();
        if (regions == null) {
            System.out.println("DEBUG ::: RegionListBean:refresh:regions=null");
        }
        lastOrd = regions.size();
        System.out.println("DEBUG ::: RegionListBean:refresh:lastOrd=" + lastOrd);
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
        int oldOrd = RegionDAO.getById(regId).getOrd();
        RegionDAO.delete(regId);
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
            System.out.println("DEBUG ::: RegionListBean:getLastOrd:regions=null");
        }
        lastOrd = regions.size();
        return lastOrd;
    }

    public void setLastOrd(int lastOrd) {
        this.lastOrd = lastOrd;
    }
}
