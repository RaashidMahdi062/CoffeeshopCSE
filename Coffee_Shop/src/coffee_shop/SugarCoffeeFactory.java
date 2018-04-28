/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee_shop;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SugarCoffeeFactory implements SugarControlFactory{

    @Override
    public Ingredients MakeDesiredCoffee() {
        
        System.out.println("Coffee 'A' or Coffee 'C'");
        Scanner sc = new Scanner(System.in);
        String Order = sc.nextLine();
        
        if(Order.equalsIgnoreCase("A"))
        {
            return new CoffeeA();
        }else
        {
            return new CoffeeC();
        }
        
        
    }
    

    
}
