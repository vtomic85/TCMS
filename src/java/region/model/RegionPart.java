/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package region.model;

import part.dao.PartDAO;
import region.dao.RegionDAO;

/**
 *
 * @author Vladimir Tomic
 */
public class RegionPart {

    private int id;
    private int regionId;
    private long partId;
    private int ord;
    private String title;
    private long topListId;
    private String regionName;
    private String partName;
    private boolean topListNeeded;

    public RegionPart(int id, int regionId, long partId, int ord, String title, long topListId) {
        this.id = id;
        this.regionId = regionId;
        this.partId = partId;
        this.ord = ord;
        this.title = title;
        this.topListId = topListId;
    }

    public RegionPart() {
        this(0, 0, 0, 0, "", 0);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public long getPartId() {
        return partId;
    }

    public void setPartId(long partId) {
        this.partId = partId;
    }

    public String getRegionName() {
        regionName = RegionDAO.getById(regionId).getName();
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getPartName() {
        partName = PartDAO.getById(partId).getFullPath();
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public int getOrd() {
        return ord;
    }

    public void setOrd(int ord) {
        this.ord = ord;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getTopListId() {
        return topListId;
    }

    public void setTopListId(long topListId) {
        this.topListId = topListId;
    }

    public boolean isTopListNeeded() {
        return PartDAO.getById(partId).isTopListNeeded();
    }
}
