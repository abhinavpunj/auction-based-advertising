/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Exchange;

import Business.Consumer.Consumer;
import Business.Enterprise.AdvertiserEnterprise;
import Business.Enterprise.MarketingAgencyEnterprise;
import Business.Enterprise.PublisherEnterprise;
import Business.Publisher.AdSpace;
import java.util.ArrayList;

/**
 *
 * @author Abhinav
 */
public class Auction 
{
    private int auctionId;
    private static int count = 0;
    private AdSpace adSpace;
    private Consumer consumer;
    private ArrayList<Bid> bidsList;
    private PublisherEnterprise publisherEnterprise;
    private String status;
    
    public Auction(AdSpace adSpace, Consumer consumer, PublisherEnterprise publisherEnterprise) 
    {
        count++;
        auctionId = count;
        this.adSpace = adSpace;
        this.consumer = consumer;
        bidsList = new ArrayList<>();
        this.publisherEnterprise = publisherEnterprise;
        status = "Available";
    }
    
    public void bid(AdvertiserEnterprise enterprise, float bidAmount)
    {
        Bid b = new Bid();
        b.setAdvertiser(enterprise);
        b.setBidAmount(bidAmount);
        bidsList.add(b);
    }
    
    public AdvertiserEnterprise highestBidder()
    {
        Bid highestBid = null;
        float highBid = 0;
        for(Bid b : bidsList)
        {
            if(highBid < b.getBidAmount())
            {
                highBid = b.getBidAmount();
                highestBid = b;
            }
        }
        if(highestBid != null)
        {
            return highestBid.getAdvertiser();
        }
        return null;
    }

    public AdSpace getAdSpace() {
        return adSpace;
    }

    public Consumer getConsumer() {
        return consumer;
    }

    public ArrayList<Bid> getBidsList() {
        return bidsList;
    }

    public PublisherEnterprise getPublisherEnterprise() {
        return publisherEnterprise;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }  

    public int getAuctionId() {
        return auctionId;
    }
        
}
