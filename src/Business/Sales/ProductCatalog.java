/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Sales;

import java.util.ArrayList;

/**
 *
 * @author Abhinav
 */
public class ProductCatalog 
{
    private ArrayList<Product> productCatalog;
    
    public ProductCatalog() {
        productCatalog = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductCatalog() {
        return productCatalog;
    }
    
    public long getTotalSales()
    {
        long total = 0;
        for(Product p : productCatalog)
        {
            total += p.getTotalSale();
        }
        return total;
    }
    
    public Product addProduct() {
        Product p = new Product();
        productCatalog.add(p);
        return p;
    }
    
    public void removeProduct(Product p) {
        productCatalog.remove(p);
    }
    
}
