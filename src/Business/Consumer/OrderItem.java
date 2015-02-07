/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Consumer;

import Business.Sales.Product;

/**
 *
 * @author Abhinav
 */
public class OrderItem 
{
    private Product product;
    private int quantity;
    private int salePrice;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.salePrice = this.quantity * this.product.getPrice();
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }
    
    @Override
    public String toString()
    {
        return product.getProdName();
    }
    
}
