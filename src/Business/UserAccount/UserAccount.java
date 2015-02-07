/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.UserAccount;

import Business.Person.Person;
import Business.Role.Role;

/**
 *
 * @author Abhinav
 */
public class UserAccount 
{
    private String username;
    private String password;
    private Person person;
    private Role role;

    public UserAccount() {

    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }
    
    public void setRole(Role role) {
        this.role = role;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return username;
    }
    
}
