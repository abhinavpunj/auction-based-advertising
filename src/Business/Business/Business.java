/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Business;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Abhinav
 */
public class Business extends Organization
{
    private static Business business;
    private ArrayList<Network> networkList;

    
    public static Business getInstance() {
        if (business == null) {
            business = new Business();
        }
        return business;
    }

    private Business() {
        super(null);
        networkList = new ArrayList<>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }

        for (Network network : networkList) 
        {
            for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList())
            {
                if (!e.getUserAccountDirectory().checkIfUsernameIsUnique(username)) 
                {
                    return false;
                }
                else
                {
                    for(Organization o : e.getOrganizationDirectory().getOrganizationList())
                    {
                        if (!o.getUserAccountDirectory().checkIfUsernameIsUnique(username)) 
                        {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}
