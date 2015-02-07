/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Publisher;

import Business.Consumer.Consumer;
import Business.Enterprise.PublisherEnterprise;
import Business.Exchange.Exchange;
import Business.Logger.Logging;

/**
 *
 * @author Abhinav
 */
public class SupplySidePlatform 
{
    private AdSpaceInventory adSpaceInventory;
    private Exchange exchange;
    private AdPriceRule rule;
    private Logging logging = Logging.getLoggerInstance();
    
    public SupplySidePlatform(AdSpaceInventory adSpaceInventory, Exchange exchange, AdPriceRule rule) 
    {
        this.exchange = exchange;
        this.adSpaceInventory = adSpaceInventory;
        this.rule = rule;
    }
    
    public void initiateAuction(Consumer consumer, PublisherEnterprise publisherEnterprise)
    {
        logging.logMessage("------------NEW AUCTION--------------", Logging.INFO);
        logging.logMessage("Publisher " + publisherEnterprise.getName() + " accesses consumer profile", Logging.INFO);
        determineAdSpacePrices(consumer);
        exchange.addAuctions(adSpaceInventory, consumer, publisherEnterprise);
    }
    
    public void determineAdSpacePrices(Consumer consumer)
    {
        for(AdSpace adSpace : adSpaceInventory.getAdSpaceList())
        {
            adSpace.setAuctionPrice(adSpace.getBasePrice());
            if(!consumer.getBehaviorPattern().getBrowsingHistory().isEmpty())
            {
                adSpace.setAuctionPrice(adSpace.getAuctionPrice() + rule.getBrowsingHistoryPrice());
            }
            if(!consumer.getBehaviorPattern().getPurchaseHistory().isEmpty())
            {
                adSpace.setAuctionPrice(adSpace.getAuctionPrice() + rule.getPurchaseHistoryPrice());
            }
            if(consumer.getBehaviorPattern().getClickHistory() > 0)
            {
                adSpace.setAuctionPrice(adSpace.getAuctionPrice() + rule.getClickHistoryPrice());
            }
                        
        }
        logging.logMessage("Ad base prices set based on consumer profile", Logging.INFO);
    }
    
}
