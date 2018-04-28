/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee_shop;

/**
 *
 * @author User
 */
public class CoffeeB implements Ingredients{

    private String milk;
    private String caffein;
    private String sugar;
    
    
    public CoffeeB() {
        
        add_milk();
        add_caffein();
        sugar_set();
    }
    
    

    @Override
    public void add_milk() {
    
        this.milk = "Milk Added\n";
    
    }

    @Override
    public void add_caffein() {
    
        this.caffein = "Caffein Added\n";
    
    }

    @Override
    public void sugar_set() {
        this.sugar = "Sugar Added\n";
    }

    @Override
    public CoffeeB getCoffee() {
        
        return this;
        
    }
    @Override
    public void TakeDelivery() {
        System.out.println("Coffee B :\n"+this.milk+this.caffein+this.sugar);
    }
    
}
