/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.FinanceAccount;

/**
 *
 * @author Abhinav
 */
public class AdvertiserAccount extends FinanceAccount
{
    private float totalSpent;

    public AdvertiserAccount() 
    {
        totalSpent = 0;
    }

    public float getTotalSpent() {
        return totalSpent;
    }

    public void setTotalSpent(float totalSpent) {
        this.totalSpent = totalSpent;
    }
    
    
}
