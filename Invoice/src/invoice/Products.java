/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice;

import java.util.*;


/**
 *
 * @author User
 */
public class Products {
    
    String product;
    int Quant;
    float Price;
    float amount;
    float Total = 0;
    
    Products(String product, int Quant, float Price){
        this.product = product;
        this.Quant = Quant;
        this.Price = Price; 
        this.Total = Total;
        
    }
    
    public String getProduct(){
       return product ;        
    }
    
    public int getQuant(){
        return Quant;
    }
    
    public float getamount(){
        amount = Price * Quant;
        Total = Total + amount;
        return amount; 
    }
    
    public float getTotal(){
        return Total;
        
        
    }
}
