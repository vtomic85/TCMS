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
import region.dao.RegionPartDAO;
import region.model.Region;
import region.model.RegionPart;
import utils.Utils;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class RegionPartsListBean {

    private ArrayList<Region> regions;
    private ArrayList<RegionPart> regionParts;
    private boolean regionPartListEmpty;
    private int regionId;
    private String regionName;
    private int lastOrd;

    public RegionPartsListBean() {

    }

    public void init() {
        if (regions == null) {
            regions = new ArrayList<>();
        } else {
            regions.clear();
        }
        regions = RegionDAO.getAll();
//        if (regionId == 0) {
        regionId = RegionDAO.getMinOrd();
        System.out.println("DEBUG ::: RegionPartsListBean:init:regionId=" + regionId);
//        }
        regionName = RegionDAO.getById(regionId).getName();
        System.out.println("DEBUG ::: RegionPartsListBean:init:regionName=" + regionName);
        refreshRegionParts();
    }

    public void refreshRegionParts() {
        if (regionParts == null) {
            regionParts = new ArrayList<>();
        } else {
            regionParts.clear();
        }
        System.out.println("DEBUG ::: RegionPartsListBean:refreshRegionParts:regionId=" + regionId);
        regionParts = RegionPartDAO.getAllWhere("region_id=" + regionId);
    }

    public String changeRegion(int regionId) {
        this.regionId = regionId;
        regionName = RegionDAO.getById(regionId).getName();
        refreshRegionParts();
        return null;
    }

    public RegionPart findByRegAndOrd(int regId, int ord) {
        return RegionPartDAO.getWhere("region_id=" + regId + " and ord=" + ord);
    }

    public String moveUp() {
        int ord = Integer.parseInt(Utils.getParam("ord"));
        int regId = Integer.parseInt(Utils.getParam("regId"));
        RegionPart rp1 = findByRegAndOrd(regId, ord);
        RegionPart rp2 = findByRegAndOrd(regId, ord - 1);
        rp1.setOrd(ord - 1);
        rp2.setOrd(ord);
        RegionPartDAO.update(rp1);
        RegionPartDAO.update(rp2);
        refreshRegionParts();
        return null;
    }

    public String moveDown() {
        int ord = Integer.parseInt(Utils.getParam("ord"));
        int regId = Integer.parseInt(Utils.getParam("regId"));
        RegionPart rp1 = findByRegAndOrd(regId, ord);
        RegionPart rp2 = findByRegAndOrd(regId, ord + 1);
        rp1.setOrd(ord + 1);
        rp2.setOrd(ord);
        RegionPartDAO.update(rp1);
        RegionPartDAO.update(rp2);
        refreshRegionParts();
        return null;
    }

    public int getLastOrd() {
        if (regionParts == null) {
            return 0;
        }
        lastOrd = regionParts.size();
        return lastOrd;
    }

    public void setLastOrd(int lastOrd) {
        this.lastOrd = lastOrd;
    }

    public String deleteRegionPart() {
        int regId = Integer.parseInt(Utils.getParam("regId"));
        int ord = Integer.parseInt(Utils.getParam("ord"));
        RegionPart rpDel = RegionPartDAO.getWhere("region_id=" + regId + " and ord=" + ord);
        int regionPartId = rpDel.getId();
        RegionPartDAO.delete(rpDel);
        if (ord < regionParts.size()) {
            for (RegionPart rp : regionParts) {
                if (rp.getId() != regionPartId && rp.getOrd() > ord) {
                    rp.setOrd(rp.getOrd() - 1);
                    RegionPartDAO.update(rp);
                }
            }
        }
        refreshRegionParts();
        return null;
    }

    public ArrayList<RegionPart> getRegionParts() {
        return regionParts;
    }

    public void setRegionParts(ArrayList<RegionPart> regionParts) {
        this.regionParts = regionParts;
    }

    public boolean isRegionPartListEmpty() {
        refreshRegionParts();
        if (regionParts == null) {
            return true;
        } else {
            return regionParts.isEmpty();
        }
    }

    public void setRegionPartListEmpty(boolean regionPartListEmpty) {
        this.regionPartListEmpty = regionPartListEmpty;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public void setRegions(ArrayList<Region> regions) {
        this.regions = regions;
    }
}
