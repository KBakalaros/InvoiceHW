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
public class Billig {
    private String BilligName;
    private String BilligAddress;
    
    Billig(String BilligName, String BilligAddress){
        this.BilligName = BilligName;
        this.BilligAddress = BilligAddress;
       
    }
    
    public String getName(){
        return BilligName;        
    }
    
    public String getAddress(){
        return BilligAddress;
    }
    
}
