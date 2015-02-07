/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.Business.Business;
import Business.Enterprise.Enterprise;
import Business.Exchange.Exchange;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.AdminWorkAreaJPanel.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Abhinav
 */
public class AdminRole extends Role
{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, Business business) {
        return new AdminWorkAreaJPanel(userProcessContainer, enterprise, business);
    }
    
}
