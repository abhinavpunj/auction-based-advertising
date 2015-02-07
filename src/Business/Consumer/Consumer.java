/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Consumer;

import Business.Person.Person;

/**
 *
 * @author Abhinav
 */
public class Consumer extends Person
{
    private BehaviorPattern behaviorPattern;
    private Order order;

    public Consumer() 
    {
        behaviorPattern = new BehaviorPattern();
        order = new Order();
    }

    public BehaviorPattern getBehaviorPattern() {
        return behaviorPattern;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
      
    
}
