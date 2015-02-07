/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Business;

import Business.Person.Person;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Abhinav
 */
public class ConfigureASystem 
{
    public static Business configure()
    {
        Business business = Business.getInstance();

        Person person = business.getPersonDirectory().createPerson("Abhinav", "Punj", Role.RoleType.SystemAdmin);
        
        UserAccount account = business.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", person, new SystemAdminRole());
        
        return business;
    }
    
}
