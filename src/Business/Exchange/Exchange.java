/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Exchange;

import Business.Consumer.Consumer;
import Business.Enterprise.AdvertiserEnterprise;
import Business.Enterprise.PublisherEnterprise;
import Business.Logger.Logging;
import Business.Publisher.AdSpace;
import Business.Publisher.AdSpaceInventory;
import java.util.ArrayList;

/**
 *
 * @author Abhinav
 */
public class Exchange 
{
    private ArrayList<Auction> auctionList;
    private ArrayList<WinningBids> bidsWon;
    private Logging logging = Logging.getLoggerInstance();
    private boolean logFlag = false;

    public Exchange() 
    {
        auctionList = new ArrayList<>();
    }

    
    public ArrayList<Auction> getAuctionList() {
        return auctionList;
    }
    
    public void addAuctions(AdSpaceInventory adSpaceInventory, Consumer consumer, PublisherEnterprise publisherEnterprise)
    {
        for(AdSpace adSpace : adSpaceInventory.getAdSpaceList())
        {
            Auction auction = new Auction(adSpace, consumer, publisherEnterprise);
            auctionList.add(auction);
        }
        logFlag = false;
        logging.logMessage("Ad Spaces added on Exchange for Auction", Logging.INFO);
    }
    
    public ArrayList<WinningBids> getBidsWon()
    {
        bidsWon = new ArrayList<>();
        AdvertiserEnterprise enterprise = null;
        for(Auction auction : auctionList)
        {
            enterprise = auction.highestBidder();
            if(enterprise != null)
            {
                WinningBids bidWon = new WinningBids();
                bidWon.setAdSpace(auction.getAdSpace());
                bidWon.setAdvertiserEnterprise(enterprise);
                bidsWon.add(bidWon);
                auction.setStatus("Sold");
                if(!logFlag)
                {
                    logging.logMessage(enterprise.getName() + " won auction " + auction.getAuctionId(), Logging.INFO);
                }
            }
        }
        logFlag = true;
        return bidsWon;
    }

}
