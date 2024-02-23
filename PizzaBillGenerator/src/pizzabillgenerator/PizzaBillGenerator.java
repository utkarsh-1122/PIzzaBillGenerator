/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pizzabillgenerator;

/**
 *
 * @author utkar
 */
public class PizzaBillGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // Pizza basePizza = new Pizza(false);
       // basePizza.addExtraToppings();
       // basePizza.getBill();
       DeluxPizza dp =new DeluxPizza(true);
       
       dp.getBill();
    }
    
    
}
