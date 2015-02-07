/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Advertiser;

import Business.Advertiser.Rule.Rule;
import Business.Consumer.Consumer;
import Business.Enterprise.AdvertiserEnterprise;
import Business.Exchange.Auction;
import Business.Logger.Logging;
import Business.Publisher.AdSpace;

/**
 *
 * @author Abhinav
 */
public class DemandSidePlatform 
{
    private Rule rule;
    private AdvertiserEnterprise enterprise;
    private Logging logging = Logging.getLoggerInstance();
    
    public DemandSidePlatform(Rule rule, AdvertiserEnterprise enterprise) 
    {
        this.rule = rule;
        this.enterprise = enterprise;
    }
    
    public void bidForAuction(Auction auction)
    {
        AdSpace adSpace = auction.getAdSpace();
        Consumer consumer = auction.getConsumer();
        boolean bid = false;
        int countBrowsing = 0;
        int countPurchasing = 0;
        float bidPrice = rule.getBidAmount() + (rule.getBidAmount()*(enterprise.getAgency().getCommission()/100));
        if(bidPrice <= enterprise.getAccount().getTotalBalance())
        {
            if(rule.getBidAmount() > adSpace.getAuctionPrice())
            {
                if(rule.getMinHeight() <= adSpace.getHeight() && rule.getMinWidth() <= adSpace.getWidth() &&
                  (rule.getPosition().equalsIgnoreCase(adSpace.getPosition()) || rule.getPosition().equalsIgnoreCase("any"))
                   && rule.getClickHistory() <= consumer.getBehaviorPattern().getClickHistory() && rule.getHitRate() <= adSpace.getPageHitRate())
                {
                    if(!(rule.getBrowsingHistory().isEmpty() && consumer.getBehaviorPattern().getBrowsingHistory().isEmpty()))
                    {
                        for(String browse : rule.getBrowsingHistory())
                        {
                            for(String conBrowse : consumer.getBehaviorPattern().getBrowsingHistory())
                            {
                                if(browse.equalsIgnoreCase(conBrowse))
                                {
                                    countBrowsing++;
                                }
                            }
                        }
                        if(countBrowsing > 0)
                        {
                            bid = true;
                        }
                    }
                    if(!(rule.getPurchaseHistory().isEmpty() && consumer.getBehaviorPattern().getPurchaseHistory().isEmpty()))
                    {
                        for(String purchase : rule.getPurchaseHistory())
                        {
                            for(String conPurchase : consumer.getBehaviorPattern().getPurchaseHistory())
                            {
                                if(purchase.equalsIgnoreCase(conPurchase))
                                {
                                    countPurchasing++;
                                }
                            }
                        }
                        if(countPurchasing > 0)
                        {
                            bid = true;
                        }
                    }
                    if(rule.isAllBrowsingHistory() && (countBrowsing != rule.getBrowsingHistory().size()))
                    {
                        bid = false;
                    }
                    if(rule.isAllPurchasingHistory() && (countPurchasing != rule.getPurchaseHistory().size()))
                    {
                        bid = false;
                    }
                    if(rule.getBrowsingHistory().isEmpty() && rule.getPurchaseHistory().isEmpty())
                    {
                        bid = true;
                    }
                }

                if(bid)
                {
                    auction.bid(enterprise, rule.getBidAmount());
                    logging.logMessage(enterprise.getName() + " bid " + rule.getBidAmount() + "$ for auction " + auction.getAuctionId(), Logging.INFO);
                }
                else
                {
                    logging.logMessage(enterprise.getName() + " did not bid", Logging.INFO);
                }
            }
        }
    }
    
}
