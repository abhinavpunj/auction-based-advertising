/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Role.Role;
import Business.Role.SalesRole;
import Business.Sales.ProductCatalog;
import java.util.ArrayList;

/**
 *
 * @author Abhinav
 */
public class SalesOrganization extends Organization
{
    private ProductCatalog productCatalog;
    private int consumerPurchases;

    public SalesOrganization() {
        super(Type.Sales.getValue());
        productCatalog = new ProductCatalog();
        consumerPurchases = 0;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public int getConsumerPurchases() {
        return consumerPurchases;
    }

    public void setConsumerPurchases(int consumerPurchases) {
        this.consumerPurchases = consumerPurchases;
    }
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SalesRole());
        return roles;
    }
    
}
