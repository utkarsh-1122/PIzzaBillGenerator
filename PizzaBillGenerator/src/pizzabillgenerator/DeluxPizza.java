/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzabillgenerator;

/**
 *
 * @author utkar
 */
public class DeluxPizza extends Pizza{
    public DeluxPizza(Boolean veg){
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }
    @Override
    public void addExtraCheese(){}
    
     @Override
    public void addExtraToppings(){}
}
