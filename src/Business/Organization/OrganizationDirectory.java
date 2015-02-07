/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author Abhinav
 */
public class OrganizationDirectory 
{
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Advertiser.getValue())){
            organization = new AdvertiserOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Publisher.getValue())){
            organization = new PublisherOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Consumer.getValue())){
            organization = new ConsumerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Marketing.getValue())){
            organization = new MarketingOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Sales.getValue())){
            organization = new SalesOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}
