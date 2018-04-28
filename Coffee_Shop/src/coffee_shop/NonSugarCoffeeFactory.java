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
public class NonSugarCoffeeFactory implements SugarControlFactory{

    @Override
    public Ingredients MakeDesiredCoffee() {
        return new CoffeeB();
    }
    
}
