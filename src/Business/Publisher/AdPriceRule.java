/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Publisher;

/**
 *
 * @author Abhinav
 */
public class AdPriceRule 
{
    private float browsingHistoryPrice;
    private float purchaseHistoryPrice;
    private float clickHistoryPrice;

    public AdPriceRule() 
    {
        browsingHistoryPrice = 0;
        purchaseHistoryPrice = 0;
        clickHistoryPrice = 0;
    }

    public float getBrowsingHistoryPrice() {
        return browsingHistoryPrice;
    }

    public void setBrowsingHistoryPrice(float browsingHistoryPrice) {
        this.browsingHistoryPrice = browsingHistoryPrice;
    }

    public float getPurchaseHistoryPrice() {
        return purchaseHistoryPrice;
    }

    public void setPurchaseHistoryPrice(float purchaseHistoryPrice) {
        this.purchaseHistoryPrice = purchaseHistoryPrice;
    }

    public float getClickHistoryPrice() {
        return clickHistoryPrice;
    }

    public void setClickHistoryPrice(float clickHistoryPrice) {
        this.clickHistoryPrice = clickHistoryPrice;
    }    
    
}
