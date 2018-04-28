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
public class Coffee_Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CoffeeFactory coffeeFactory = CoffeeFactory.GetCoffeeFactory();
        Ingredients Coffee;
        SugarControlFactory sugarCoffeeFactory;
        Scanner sc = new Scanner(System.in);
        String Order;
        while(true)
        {
            System.out.println("Want to add Sugar ? Press 'Y' or 'N'");
            Order = sc.nextLine();
            sugarCoffeeFactory = coffeeFactory.makeCoffee(Order);
            Coffee = sugarCoffeeFactory.MakeDesiredCoffee();
            Coffee.TakeDelivery();
            
        }
        
        
    }
    
}
