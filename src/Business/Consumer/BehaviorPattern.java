/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Consumer;

import java.util.ArrayList;

/**
 *
 * @author Abhinav
 */
public class BehaviorPattern 
{
    private ArrayList<String> browsingHistory;
    private int clickHistory;
    private ArrayList<String> purchaseHistory;

    public BehaviorPattern() 
    {
        browsingHistory = new ArrayList<>();
        purchaseHistory = new ArrayList<>();
    }

    public ArrayList<String> getBrowsingHistory() {
        return browsingHistory;
    }

    public int getClickHistory() {
        return clickHistory;
    }

    public void setClickHistory(int clickHistory) {
        this.clickHistory = clickHistory;
    }

    public ArrayList<String> getPurchaseHistory() {
        return purchaseHistory;
    }
    
}
