/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package region.beans;

import java.util.LinkedList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import part.dao.PartDAO;
import part.model.Part;
import toplist.dao.TopListDAO;
import toplist.model.TopList;
import region.dao.RegionDAO;
import region.dao.RegionPartDAO;
import region.model.RegionPart;

/**
 *
 * @author Vladimir Tomic
 */
@ManagedBean
@ViewScoped
public class RegionPartFormBean {

    private RegionPart regionPart;
    private int regionId;
    private int regionPartId;
    private long partId;
    private LinkedList<Part> parts;
    private LinkedList<TopList> topLists;
    private long topListId;
    private int regionWidth;
    private String regionName;
    private boolean topListNeeded;

    public RegionPartFormBean() {

    }

    public void init() {
        regionWidth = RegionDAO.getById(regionId).getWidth();
        if (regionPartId > 0) {
            regionPart = RegionPartDAO.getById(regionPartId);
            partId = regionPart.getPartId();
        } else {
            regionPart = new RegionPart();
        }
        if (topLists == null) {
            topLists = new LinkedList<>();
        } else {
            topLists.clear();
        }
        topLists = TopListDAO.getAll();
        refreshParts();
    }

    public void refreshParts() {
        if (parts == null) {
            parts = new LinkedList<>();
        } else {
            parts.clear();
        }
        parts = PartDAO.getAllForWidth(regionWidth);
        if (regionPart != null) {
            partId = regionPart.getPartId();
        }
    }

    public String save() {
        topListNeeded = PartDAO.getById(partId).isTopListNeeded();
        if (topListNeeded && topListId > 0) {
            Part currentPart = PartDAO.getById(partId);
            Part newPart = new Part(currentPart, topListId);
            partId = PartDAO.add(newPart);
        }
        regionPart.setRegionId(regionId);
        regionPart.setPartId(partId);
        regionPart.setTopListId(topListId);
        regionPart.setOrd(RegionPartDAO.getAllForRegion(regionId).size() + 1);
        if (regionPartId == 0) {
            int newId = RegionPartDAO.add(regionPart);
            regionPart.setId(newId);
            regionPartId=newId;
        } else {
            RegionPartDAO.update(regionPart);
        }
        return null;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public int getRegionPartId() {
        return regionPartId;
    }

    public void setRegionPartId(int regionPartId) {
        this.regionPartId = regionPartId;
    }

    public LinkedList<Part> getParts() {
        refreshParts();
        return parts;
    }

    public void setParts(LinkedList<Part> parts) {
        this.parts = parts;
    }

    public int getRegionWidth() {
        regionWidth = RegionDAO.getById(regionId).getWidth();
        return regionWidth;
    }

    public void setRegionWidth(int regionWidth) {
        this.regionWidth = regionWidth;
    }

    public long getPartId() {
        return partId;
    }

    public void setPartId(long partId) {
        this.partId = partId;
    }

    public RegionPart getRegionPart() {
        return regionPart;
    }

    public void setRegionPart(RegionPart regionPart) {
        this.regionPart = regionPart;
    }

    public String getRegionName() {
        regionName = RegionDAO.getById(regionId).getName();
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public LinkedList<TopList> getTopLists() {
        return topLists;
    }

    public void setTopLists(LinkedList<TopList> topLists) {
        this.topLists = topLists;
    }

    public long getTopListId() {
        return topListId;
    }

    public void setTopListId(long topListId) {
        this.topListId = topListId;
    }

    public boolean isTopListNeeded() {
        return partId > 0 ? PartDAO.getById(partId).isTopListNeeded() : false;
    }

    public void setTopListNeeded(boolean topListNeeded) {
        this.topListNeeded = topListNeeded;
    }
}
