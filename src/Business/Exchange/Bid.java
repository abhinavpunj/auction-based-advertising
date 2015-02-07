/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Exchange;

import Business.Enterprise.AdvertiserEnterprise;

/**
 *
 * @author Abhinav
 */
public class Bid 
{
    private AdvertiserEnterprise advertiser;
    private float bidAmount;

    public AdvertiserEnterprise getAdvertiser() {
        return advertiser;
    }

    public void setAdvertiser(AdvertiserEnterprise advertiser) {
        this.advertiser = advertiser;
    }

    public float getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(float bidAmount) {
        this.bidAmount = bidAmount;
    }
    
    
    
}
