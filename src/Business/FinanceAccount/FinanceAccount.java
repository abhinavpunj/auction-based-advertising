/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.FinanceAccount;

import Business.Enterprise.Enterprise;

/**
 *
 * @author Abhinav
 */
public class FinanceAccount 
{
    private float totalBalance;

    public FinanceAccount() 
    {
        totalBalance = 0;
    }
    
    public float getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(float totalBalance) {
        this.totalBalance = totalBalance;
    }   
    
}
