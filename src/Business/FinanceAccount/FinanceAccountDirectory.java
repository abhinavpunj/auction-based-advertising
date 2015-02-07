/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.FinanceAccount;

import java.util.ArrayList;

/**
 *
 * @author Abhinav
 */
public class FinanceAccountDirectory 
{
    private ArrayList<FinanceAccount> financeAccountDirectory;

    public FinanceAccountDirectory() 
    {
        financeAccountDirectory = new ArrayList<>();
    }

    public ArrayList<FinanceAccount> getFinanceAccountDirectory() {
        return financeAccountDirectory;
    }
    
}
