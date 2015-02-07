/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Sales;

/**
 *
 * @author Abhinav
 */
public class Product 
{
    private static int count = 0;
    private String prodName;
    private int price;
    private int modelNumber;
    private int avail;
    private int quantitySold = 0;
    private int totalSale;

    public Product() {
        count++;
        modelNumber = count;
    }
    
    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getAvail() {
        return avail;
    }

    public void setAvail(int avail) {
        this.avail = avail;
    }
    

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public int getTotalSale() {
        totalSale = quantitySold * price;
        return totalSale;
    }

    public void setTotalSale(int totalSale) {
        this.totalSale = totalSale;
    }
    
    
    @Override
    public String toString() {
        return prodName;
    }
    
}
