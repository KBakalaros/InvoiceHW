/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice;

/**
 *
 * @author user
 */
public class Invoice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float Total;
        Customer john = new Customer("John", "27100", "Agiou Eleftheriou 106");
        
        Billig justin = new Billig("Justin" , "Aggelaki 4");
        
        Products first = new Products("Monitors", 8, 100);
        Products second = new Products("Keyboards", 10, 40);
        
        Total = first.getamount() + second.getamount();
        
        Payments fst = new Payments(Total, 50);
        
        
           
                
                
        System.out.println("                       I N V O I C E ");
         
        System.out.println();
        System.out.println();  
        System.out.println("SHIP TO");
        System.out.println(john.getName());
        System.out.println(john.getStreet());
        System.out.println(john.getZipCode());
        System.out.println();
        
        
     
        System.out.println();
        System.out.println("BILL TO");
        System.out.println(justin.getName());
        System.out.println(justin.getAddress());
        System.out.println();
        System.out.println();
        
        System.out.println("Description               Quantity           Amount");
        System.out.println("----------------------------------------------------");
        System.out.print(first.getProduct() + "                     " + first.getQuant() + "               " + first.getamount());
        System.out.println();
        System.out.print(second.getProduct() + "                   " + second.getQuant() + "               " + second.getamount());
        System.out.println();
        System.out.println("                                            -------");
       
        System.out.println("                                             " + Total );
        System.out.println();
        System.out.println("                                              PAID");
        System.out.println("                                              " + fst.getPaid());
        System.out.println();
        System.out.println("                                              TOTAL");
        System.out.println("                                              " + fst.getTotal());
        
        
        
        
        
    }
}
