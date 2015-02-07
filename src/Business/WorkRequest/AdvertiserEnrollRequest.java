/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkRequest;

import Business.Enterprise.AdvertiserEnterprise;
import Business.Enterprise.MarketingAgencyEnterprise;

/**
 *
 * @author Abhinav
 */
public class AdvertiserEnrollRequest extends WorkRequest
{
    private AdvertiserEnterprise advertiserEnterprise;
    private MarketingAgencyEnterprise marketingEnterprise;

    public AdvertiserEnterprise getAdvertiserEnterprise() {
        return advertiserEnterprise;
    }

    public void setAdvertiserEnterprise(AdvertiserEnterprise advertiserEnterprise) {
        this.advertiserEnterprise = advertiserEnterprise;
    }

    public MarketingAgencyEnterprise getMarketingEnterprise() {
        return marketingEnterprise;
    }

    public void setMarketingEnterprise(MarketingAgencyEnterprise marketingEnterprise) {
        this.marketingEnterprise = marketingEnterprise;
    }
    
}
