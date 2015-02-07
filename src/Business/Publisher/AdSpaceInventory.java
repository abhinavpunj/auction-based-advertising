/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Publisher;

import java.util.ArrayList;

/**
 *
 * @author Abhinav
 */
public class AdSpaceInventory 
{
    private ArrayList<AdSpace> adSpaceList;

    public AdSpaceInventory() 
    {
        adSpaceList = new ArrayList<>();
    }

    public ArrayList<AdSpace> getAdSpaceList() {
        return adSpaceList;
    }
    
    public AdSpace createAdSpace(float height, float width, String position, float basePrice, int hitrate)
    {
        AdSpace adSpace = new AdSpace();
        adSpaceList.add(adSpace);
        adSpace.setHeight(height);
        adSpace.setWidth(width);
        adSpace.setPosition(position);
        adSpace.setBasePrice(basePrice);
        adSpace.setPageHitRate(hitrate);
        return adSpace;
    }
    
    public void removeAdSpace(AdSpace adSpace)
    {
        adSpaceList.remove(adSpace);
    }
    
}
