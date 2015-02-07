/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Exchange.Exchange;
import java.util.ArrayList;

/**
 *
 * @author Abhinav
 */
public class EnterpriseDirectory 
{
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type, Exchange exchange){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Advertiser){
            enterprise = new AdvertiserEnterprise(name, exchange);
            enterpriseList.add(enterprise);
        }
        else if (type == Enterprise.EnterpriseType.Publisher){
            enterprise = new PublisherEnterprise(name, exchange);
            enterpriseList.add(enterprise);
        }
        else if (type == Enterprise.EnterpriseType.Consumer){
            enterprise = new ConsumerEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if (type == Enterprise.EnterpriseType.MarketingAgency){
            enterprise = new MarketingAgencyEnterprise(name, exchange);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
}
