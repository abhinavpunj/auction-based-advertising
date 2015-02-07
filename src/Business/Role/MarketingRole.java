/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.Business.Business;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.MarketingAgency.MarketingAgencyWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Abhinav
 */
public class MarketingRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, Business business) {
        return new MarketingAgencyWorkAreaJPanel(userProcessContainer, account, enterprise, organization, network);
    }
    
}
