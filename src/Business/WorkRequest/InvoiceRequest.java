/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkRequest;

import Business.Enterprise.AdvertiserEnterprise;
import Business.Enterprise.MarketingAgencyEnterprise;
import Business.Enterprise.PublisherEnterprise;

/**
 *
 * @author Abhinav
 */
public class InvoiceRequest extends WorkRequest
{
    private PublisherEnterprise publisherEnterprise;
    private MarketingAgencyEnterprise agencyEnterprise;
    private AdvertiserEnterprise advertiserEnterprise;
    private float publisherPrice;
    private float agencyPrice;
    private float totalPrice;
    
    public float getTotalPrice()
    {
        totalPrice = publisherPrice + agencyPrice;
        return totalPrice;
    }

    public float getPublisherPrice() {
        return publisherPrice;
    }

    public void setPublisherPrice(float publisherPrice) {
        this.publisherPrice = publisherPrice;
    }

    public float getAgencyPrice() {
        return agencyPrice;
    }

    public void setAgencyPrice(float agencyPrice) {
        this.agencyPrice = agencyPrice;
    }

    public PublisherEnterprise getPublisherEnterprise() {
        return publisherEnterprise;
    }

    public void setPublisherEnterprise(PublisherEnterprise publisherEnterprise) {
        this.publisherEnterprise = publisherEnterprise;
    }

    public MarketingAgencyEnterprise getAgencyEnterprise() {
        return agencyEnterprise;
    }

    public void setAgencyEnterprise(MarketingAgencyEnterprise agencyEnterprise) {
        this.agencyEnterprise = agencyEnterprise;
    }

    public AdvertiserEnterprise getAdvertiserEnterprise() {
        return advertiserEnterprise;
    }

    public void setAdvertiserEnterprise(AdvertiserEnterprise advertiserEnterprise) {
        this.advertiserEnterprise = advertiserEnterprise;
    }   
    
}
