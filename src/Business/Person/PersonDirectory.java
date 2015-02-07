/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Person;

import Business.Advertiser.Advertiser;
import Business.Consumer.Consumer;
import Business.MarketingAgency.MarketingAgent;
import Business.Publisher.Publisher;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Sales.SalesPerson;
import java.util.ArrayList;

/**
 *
 * @author Abhinav
 */
public class PersonDirectory 
{
    private ArrayList<Person> personList;

    public PersonDirectory() {
        personList = new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public Person createPerson(String firstName, String lastName, Role.RoleType type){
        Person person = null;
        if (type.getValue().equals(Role.RoleType.Advertiser.getValue())){
            person = new Advertiser();
            personList.add(person);
        }
        else if (type.getValue().equals(Role.RoleType.Publisher.getValue())){
            person = new Publisher();
            personList.add(person);
        }
        else if (type.getValue().equals(Role.RoleType.Consumer.getValue())){
            person = new Consumer();
            personList.add(person);
        }
        else if (type.getValue().equals(Role.RoleType.Marketing.getValue())){
            person = new MarketingAgent();
            personList.add(person);
        }
        else if (type.getValue().equals(Role.RoleType.Sales.getValue())){
            person = new SalesPerson();
            personList.add(person);
        }
        else if (type.getValue().equals(Role.RoleType.SystemAdmin.getValue())){
            person = new Person();
            personList.add(person);
        }
        else if (type.getValue().equals(Role.RoleType.AdminRole.getValue())){
            person = new Person();
            personList.add(person);
        }
        
        person.setFirstName(firstName);
        person.setLastName(lastName);
        return person;
    }
    
}
