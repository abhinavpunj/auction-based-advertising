/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Consumer;

import Business.Sales.Product;
import java.util.ArrayList;

/**
 *
 * @author Abhinav
 */
public class Order 
{
    private ArrayList<OrderItem> orderItemList;
    private int orderNumer;
    private static int count = 0;

    public Order() 
    {
        orderItemList = new ArrayList<>();
        count++;
        orderNumer = count;
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getOrderNumer() {
        return orderNumer;
    }

    public void setOrderNumer(int orderNumer) {
        this.orderNumer = orderNumer;
    }
    
    public void removeOrderItem(OrderItem o)
    {
        int avail = o.getProduct().getAvail();
        int newavail = avail + o.getQuantity();
        o.getProduct().setAvail(newavail);
        orderItemList.remove(o);
    }
    
    public OrderItem addOrderItem(Product p, int quantity)
    {
        OrderItem o = new OrderItem();
        o.setProduct(p);
        o.setQuantity(quantity);
        orderItemList.add(o);
        return o;
    
    }
    
    @Override
    public String toString()
    {
        return String.valueOf(orderNumer);
    }
}
