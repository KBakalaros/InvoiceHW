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
public class Payments {
    float Total = 0;
    float paid;
    
    
    Payments(float Total, float paid){
 
        this.Total = Total; 
        this.paid = paid;
       
    }

    public float getTotal(){
        Total = Total - paid;
        return Total;
    }
    
    public float getPaid(){
        return paid;
    }
    
    
    
}
