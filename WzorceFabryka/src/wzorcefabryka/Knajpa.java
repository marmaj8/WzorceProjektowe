/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wzorcefabryka;

import java.util.ArrayList;

/**
 *
 * @author Marcin
 */
    
public class Knajpa extends Pizzeria
{
    public String Name;

    @Override
    public Pizza AddPizza(String name) throws Exception
    {
        switch (name)
        {
            case "Napolitana":
                Pizza napolitana = new Napolitana();
                Ser cheese = new Ser("Gouda",0.3f);
                Mieso meat = new Mieso("Szynka", 0.2f);
                napolitana.Ingredients.add(cheese);
                napolitana.Ingredients.add(meat);
                return napolitana;
            default:
                throw new Exception("Nie ma takiej Pizzy");
        }

    }
}
