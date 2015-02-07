/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Advertiser;

/**
 *
 * @author Abhinav
 */
public class Advertisement 
{
    private String adURL;
    private String timeOfDay;

    public String getAdURL() {
        return adURL;
    }

    public void setAdURL(String adURL) {
        this.adURL = adURL;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }
    
    @Override
    public String toString()
    {
        return adURL;
    }
}
