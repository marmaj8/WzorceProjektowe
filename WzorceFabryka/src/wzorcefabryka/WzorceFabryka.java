/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wzorcefabryka;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcin
 */
public class WzorceFabryka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Pizzeria[] pizzerias = new Pizzeria[2];
    pizzerias[0] = new Knajpa();
    pizzerias[1] = new Restauracja();

        for (Pizzeria pizzeria : pizzerias)
        {
            try
            {
                Pizza pizza = pizzeria.AddPizza("Napolitana");

                System.out.println("Utworzono w pizzerii "+pizzeria.getClass().getSimpleName()+" pizzę "+pizza.getClass().getSimpleName()+" o składnikach:");

                for (Skladniki ingredient : pizza.Ingredients)
                {
                    String ingredientType = ingredient.getClass().getName();
                    String ingredientTypeValue ="";
                    if ( ingredientType == Ser.class.getName())
                        ingredientTypeValue = ((Ser)ingredient).Type;
                    if ( ingredientType == Mieso.class.getName())
                        ingredientTypeValue = ((Mieso)ingredient).Type;
                    if ( ingredientType == Sos.class.getName())
                        ingredientTypeValue = ((Sos)ingredient).Type;
                    ingredientType = ingredient.getClass().getSimpleName();

                    System.out.println(ingredientType +" - "+ingredientTypeValue+": "+ingredient.Weight+"kg");
                }
            }
            catch(Exception e)
            {
                
            }

        }

    }
}
