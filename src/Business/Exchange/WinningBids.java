/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Exchange;

import Business.Enterprise.AdvertiserEnterprise;
import Business.Publisher.AdSpace;

/**
 *
 * @author Abhinav
 */
public class WinningBids 
{
    private AdvertiserEnterprise advertiserEnterprise;
    private AdSpace adSpace;

    public AdvertiserEnterprise getAdvertiserEnterprise() {
        return advertiserEnterprise;
    }

    public void setAdvertiserEnterprise(AdvertiserEnterprise advertiserEnterprise) {
        this.advertiserEnterprise = advertiserEnterprise;
    }

    public AdSpace getAdSpace() {
        return adSpace;
    }

    public void setAdSpace(AdSpace adSpace) {
        this.adSpace = adSpace;
    }

}
