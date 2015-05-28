/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package region.model;

import java.util.ArrayList;
import part.dao.PartDAO;
import part.model.Part;
import toplist.dao.TopListDAO;
import region.dao.RegionPartDAO;

/**
 *
 * @author Vladimir Tomic
 */
public class Region {

    private long id;
    private String name;
    private int ord; // 0, 1, 2,...
    private int width; // 33=oneThird, 50=oneHalf, 66=twoThirds, 100=full
    private boolean right; // TRUE=right, FALSE=left
    private String widthName;
    private String positionName;
    private boolean positionNeeded;
    private ArrayList<Part> myParts;
    private boolean myPartListEmpty;

    public Region(long id, String name, int ord, int width, boolean right) {
        this.id = id;
        this.name = name;
        this.ord = ord;
        this.width = width;
        this.right = right;
    }

    public Region() {
        this(0, "", 0, 0, false);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getOrd() {
        return ord;
    }

    public void setOrd(int ord) {
        this.ord = ord;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isRight() {
        return right;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public String getWidthName() {
        switch (width) {
            case 33:
                widthName = "One-third";
                break;
            case 50:
                widthName = "One-half";
                break;
            case 66:
                widthName = "Two-thirds";
                break;
            case 100:
                widthName = "Full";
                break;
            default:
                widthName = "ERROR!";
                break;
        }
        return widthName;
    }

    public void setWidthName(String widthName) {
        this.widthName = widthName;
    }

    public String getPositionName() {
        positionName = right ? "Right" : "Left";
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPositionNeeded() {
        positionNeeded = width > 0 && width < 100;
        return positionNeeded;
    }

    public void setPositionNeeded(boolean positionNeeded) {
        this.positionNeeded = positionNeeded;
    }

    public void refreshMyParts() {
        ArrayList<RegionPart> regParts = RegionPartDAO.getAllWhere("region_id=" + id);
        myParts = new ArrayList<>();
        for (RegionPart rp : regParts) {
            Part p = PartDAO.getById(rp.getPartId());
            myParts.add(p);
            System.out.println("DEBUG ::: Region: refresh: added part " + p.getId() + " " + p.getName() + ", topListId=" + p.getTopListId());
        }
    }

    public ArrayList<Part> getMyParts() {
        refreshMyParts();
        return myParts;
    }

    public void setMyParts(ArrayList<Part> myParts) {
        this.myParts = myParts;
    }

    public boolean isMyPartListEmpty() {
        refreshMyParts();
        if (myParts == null) {
            return true;
        } else {
            return myParts.isEmpty();
        }
    }

    public void setMyPartListEmpty(boolean myPartListEmpty) {
        this.myPartListEmpty = myPartListEmpty;
    }

    public String getTitleForPart(long partId) {
        return RegionPartDAO.getWhere("region_id=" + this.id + " and part_id=" + partId).getTitle();
    }
}
