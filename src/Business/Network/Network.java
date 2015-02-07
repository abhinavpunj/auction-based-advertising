/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Network;

import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Enterprise.MarketingAgencyEnterprise;
import Business.Exchange.Exchange;
import Business.Logger.Logging;

/**
 *
 * @author Abhinav
 */
public class Network 
{
    private String country;
    private EnterpriseDirectory enterpriseDirectory;
    private Exchange exchange;
    private Logging logging = Logging.getLoggerInstance();

    public Network() {
        enterpriseDirectory = new EnterpriseDirectory();
        exchange = new Exchange();
    }
    
    public void initiateMarketingAgencyBidding()
    {
        logging.logMessage("Marketing Agencies initiate Bidding", Logging.INFO);
        for(Enterprise enterprise : enterpriseDirectory.getEnterpriseList())
        {
            if(enterprise instanceof MarketingAgencyEnterprise)
            {
                MarketingAgencyEnterprise agencyEnterprise = (MarketingAgencyEnterprise)enterprise;
                agencyEnterprise.initiateAdvertiserBidding();
            }
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public Exchange getExchange() {
        return exchange;
    }

    public void setExchange(Exchange exchange) {
        this.exchange = exchange;
    }  
    

    @Override
    public String toString() {
        return country;
    }
}
