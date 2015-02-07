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
import javax.swing.JPanel;

/**
 *
 * @author Abhinav
 */
public abstract class Role 
{
    public enum RoleType{
        SystemAdmin("SystemAdmin"),
        AdminRole("Admin"),
        Advertiser("Advertiser"),
        Publisher("Publisher"),
        Consumer("Consumer"),
        Marketing("Marketing"),
        Sales("Sales");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, Business business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
