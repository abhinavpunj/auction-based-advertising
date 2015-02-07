/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Advertiser.DemandSidePlatform;
import Business.Exchange.Auction;
import Business.Exchange.Exchange;
import Business.FinanceAccount.MarketingAgencyAccount;
import Business.Logger.Logging;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhinav
 */
public class MarketingAgencyEnterprise extends Enterprise
{
    private ArrayList<AdvertiserEnterprise> advertiserEnterpriseList;
    private Exchange exchange;
    private MarketingAgencyAccount account;
    private float commission;
    private Logging logging = Logging.getLoggerInstance();

    public MarketingAgencyEnterprise(String name, Exchange exchange) {
        super(name, EnterpriseType.MarketingAgency);
        advertiserEnterpriseList = new ArrayList<>();
        this.exchange = exchange;
        account = new MarketingAgencyAccount();
        getFinanceAccountDirectory().getFinanceAccountDirectory().add(account);
        commission = 0;
    }
    
    public void initiateAdvertiserBidding()
    {
        for(Auction auction : exchange.getAuctionList())
        {
            if(!auction.getStatus().equalsIgnoreCase("sold"))
            {
                for(AdvertiserEnterprise advertiserEnterprise : advertiserEnterpriseList)
                {
                    DemandSidePlatform dsp = advertiserEnterprise.getDsp();
                    logging.logMessage("Advertiser " + advertiserEnterprise.getName() + "'s rules checked for bidding", Logging.INFO);
                    dsp.bidForAuction(auction);
                }
            }
        }
    }
    
    public float chargeCommission(float publisherPrice)
    {
        float agencyPrice;
        agencyPrice = publisherPrice*((commission)/100);
        logging.logMessage(this.getName() + " charged commission", Logging.INFO);
        return agencyPrice;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public ArrayList<AdvertiserEnterprise> getAdvertiserEnterpriseList() {
        return advertiserEnterpriseList;
    }

    public MarketingAgencyAccount getAccount() {
        return account;
    }

    public float getCommission() {
        return commission;
    }

    public void setCommission(float commission) {
        this.commission = commission;
    }
        
    
}
