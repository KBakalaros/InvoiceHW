/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice;

/**
 *
 * @author User
 */
public class Customer {
    private String name;
    private String ZipCode;
    private String street;
    
    Customer(String name, String ZipCode, String street){
        this.name = name;
        this.ZipCode = ZipCode;
        this.street = street;
       
    }
    
    public String getName(){
        return name;        
    }
    
    public String getZipCode(){
        return ZipCode;
    }
    
    public String getStreet(){
        return street;
    }
    
    
}
