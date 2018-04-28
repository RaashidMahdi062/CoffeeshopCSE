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
public class CoffeeFactory {
    
    private static CoffeeFactory instance = null;
    
    private CoffeeFactory()
    {
        
    }
    
    
    public static CoffeeFactory GetCoffeeFactory()
    {
        if(instance == null)
        {
            instance = new CoffeeFactory();
        }
        return instance;
    }
    
    
    
    public SugarControlFactory makeCoffee(String sugar_type)
    {
        if(sugar_type.equalsIgnoreCase("Y"))
        {
            return new SugarCoffeeFactory();
        }else
        {
            return new NonSugarCoffeeFactory();
        }
    }
    
    
}
