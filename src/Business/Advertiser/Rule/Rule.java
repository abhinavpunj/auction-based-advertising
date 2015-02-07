/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Advertiser.Rule;

import java.util.ArrayList;

/**
 *
 * @author Abhinav
 */
public class Rule 
{
    private float minHeight;
    private float minWidth;
    private String position;
    private int fromTime;
    private int toTime;
    private int hitRate;
    private ArrayList<String> browsingHistory;
    private ArrayList<String> purchaseHistory;
    private int clickHistory;
    private float bidAmount;
    private boolean allBrowsingHistory;
    private boolean allPurchasingHistory;

    public Rule() 
    {
        browsingHistory = new ArrayList<>();
        purchaseHistory = new ArrayList<>();
        minHeight = 0;
        minWidth = 0;
        position = "Any";
        hitRate = 0;
        clickHistory = 0;
        bidAmount = 0;
        allBrowsingHistory = false;
        allPurchasingHistory = false;
    }

    public ArrayList<String> getPurchaseHistory() {
        return purchaseHistory;
    }

    public void setPurchaseHistory(ArrayList<String> purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
    }

    public float getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(float bidAmount) {
        this.bidAmount = bidAmount;
    }

    public ArrayList<String> getBrowsingHistory() {
        return browsingHistory;
    }

    public void setBrowsingHistory(ArrayList<String> browsingHistory) {
        this.browsingHistory = browsingHistory;
    }

    public int getClickHistory() {
        return clickHistory;
    }

    public void setClickHistory(int clickHistory) {
        this.clickHistory = clickHistory;
    }

    public int getHitRate() {
        return hitRate;
    }

    public void setHitRate(int hitRate) {
        this.hitRate = hitRate;
    }

    public int getFromTime() {
        return fromTime;
    }

    public void setFromTime(int fromTime) {
        this.fromTime = fromTime;
    }

    public int getToTime() {
        return toTime;
    }

    public void setToTime(int toTime) {
        this.toTime = toTime;
    }

    public float getMinHeight() {
        return minHeight;
    }

    public void setMinHeight(float minHeight) {
        this.minHeight = minHeight;
    }

    public float getMinWidth() {
        return minWidth;
    }

    public void setMinWidth(float minWidth) {
        this.minWidth = minWidth;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isAllBrowsingHistory() {
        return allBrowsingHistory;
    }

    public void setAllBrowsingHistory(boolean allBrowsingHistory) {
        this.allBrowsingHistory = allBrowsingHistory;
    }

    public boolean isAllPurchasingHistory() {
        return allPurchasingHistory;
    }

    public void setAllPurchasingHistory(boolean allPurchasingHistory) {
        this.allPurchasingHistory = allPurchasingHistory;
    }
    
    
}
