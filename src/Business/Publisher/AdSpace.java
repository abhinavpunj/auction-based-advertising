/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Publisher;

/**
 *
 * @author Abhinav
 */
public class AdSpace 
{
    private float height;
    private float width;
    private String position;
    private float basePrice;
    private float auctionPrice;
    private int pageHitRate;
    private static int count = 0;
    private int adId;

    public AdSpace() 
    {
        count++;
        adId = count;
    }

    public int getAdId() {
        return adId;
    }
    
    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }

    public float getAuctionPrice() {
        return auctionPrice;
    }

    public void setAuctionPrice(float auctionPrice) {
        this.auctionPrice = auctionPrice;
    }

    public int getPageHitRate() {
        return pageHitRate;
    }

    public void setPageHitRate(int pageHitRate) {
        this.pageHitRate = pageHitRate;
    }

    @Override
    public String toString()
    {
        return String.valueOf(adId);
    }
}
