/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzabillgenerator;

/**
 *
 * @author utkar
 */
public class Pizza {
    public int price;
    public Boolean veg;
    public int extraCheesePrice = 100;
    public int extraToppingsPrice = 150;
    public int backPackPrice = 20;
    public int basePizzaPrice;
    public Boolean isExtraCheeseAdded =false;
    public Boolean isExtraToppingsAdded = false;
    public Boolean isOPtedForTakeAway=false;
      
    public Pizza(Boolean veg){
        this.veg = veg;
        if (this.veg){
            this.price = 300;
            
        }else{
            this.price = 400;
            
        }
        basePizzaPrice =this.price;
    }
   public void addExtraCheese(){
       isExtraCheeseAdded = true;
      
       this.price += extraCheesePrice;
       
}
   public void addExtraToppings(){
       isExtraToppingsAdded = true;
       
       this.price += extraToppingsPrice;
       
   }
    public void takeAway(){
        isOPtedForTakeAway=true;
    
       this.price += backPackPrice;
       
   }
    public void getBill(){
        String bill ="";
        System.out.println("Pizza"+ basePizzaPrice);
        if(isExtraCheeseAdded){
            bill += "Extra cheese added: "+extraCheesePrice+"\n";
            
        }
        if(isExtraToppingsAdded){
            bill += "Extra toppings added: "+extraToppingsPrice+"\n";
            
        }
        if( isOPtedForTakeAway){
            bill += "Take away: "+backPackPrice+"\n";
            
        }
        bill +="Bill:"+this.price +"\n";
        System.out.println(bill);
    }
   
}
    

