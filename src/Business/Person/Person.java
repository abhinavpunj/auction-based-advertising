/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Person;

/**
 *
 * @author Abhinav
 */
public class Person 
{
    private static int count = 1000;
    private int personId;
    private String firstName;
    private String lastName;
    
    public Person()
    {
        count++;
        personId = count;
    }

    public int getPersonId() {
        return personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    @Override
    public String toString()
    {
        return firstName + " " + lastName;
    }
}
