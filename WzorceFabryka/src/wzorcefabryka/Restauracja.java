/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wzorcefabryka;

/**
 *
 * @author Marcin
 */

public class Restauracja extends Pizzeria
{
    @Override
    public Pizza AddPizza(String name) throws Exception
    {
        switch (name)
        {
            case "Napolitana":
                Pizza napolitana = new Napolitana();
                Ser cheese = new Ser("Mozarella",0.2f);
                Sos sause= new Sos("Pomidorowy", 0.15f);
                napolitana.Ingredients.add(cheese);
                napolitana.Ingredients.add(sause);
                return napolitana;
            default:
                throw new Exception("Nie ma takiej Pizzy");
        }

    }
}
