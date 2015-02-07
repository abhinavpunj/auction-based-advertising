/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Role.AdvertiserRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhinav
 */
public class AdvertiserOrganization extends Organization
{

    public AdvertiserOrganization() {
        super(Type.Advertiser.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdvertiserRole());
        return roles;
    }
    
}
