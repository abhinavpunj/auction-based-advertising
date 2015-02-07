/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Advertiser.Advertisement;
import Business.Advertiser.DemandSidePlatform;
import Business.Advertiser.Rule.Rule;
import Business.Exchange.Exchange;
import Business.FinanceAccount.AdvertiserAccount;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhinav
 */
public class AdvertiserEnterprise extends Enterprise
{
    private Rule rule;
    private DemandSidePlatform dsp;
    private ArrayList<Advertisement> advertisementList;
    private AdvertiserAccount account;
    private MarketingAgencyEnterprise agency;
    private int consumerClicks;

    public AdvertiserEnterprise(String name, Exchange exchange) 
    {
        super(name, EnterpriseType.Advertiser);
        account = new AdvertiserAccount();
        getFinanceAccountDirectory().getFinanceAccountDirectory().add(account);
        rule = new Rule();
        advertisementList = new ArrayList<>();
        dsp = new DemandSidePlatform(rule, this);
        consumerClicks = 0;
    }

    public int getConsumerClicks() {
        return consumerClicks;
    }

    public void setConsumerClicks(int consumerClicks) {
        this.consumerClicks = consumerClicks;
    }

    public Rule getRule() {
        return rule;
    }

    public DemandSidePlatform getDsp() {
        return dsp;
    }

    public ArrayList<Advertisement> getAdvertisementList() {
        return advertisementList;
    }
    
    public Advertisement uploadAdvertisement(String url, String timeOfDay)
    {
        Advertisement ad = new Advertisement();
        ad.setAdURL(url);
        ad.setTimeOfDay(timeOfDay);
        advertisementList.add(ad);
        return ad;
    }

    public AdvertiserAccount getAccount() {
        return account;
    }

    public MarketingAgencyEnterprise getAgency() {
        return agency;
    }

    public void setAgency(MarketingAgencyEnterprise agency) {
        this.agency = agency;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
