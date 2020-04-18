/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wzorcekompozyt;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcin
 */
public class Galaz extends Odrost
{
    private List<Odrost> dzieci = new ArrayList<Odrost>();

    public Galaz(String nazwa) 
    {
        super(nazwa);
    }

    @Override
    public void Dodaj(Odrost element)
    {
        dzieci.add(element);
    }

    @Override
    public void Usun(Odrost element)
    {
        dzieci.remove(element);
    }

    @Override
    public void Pokaz(int poziom)
    {
        System.out.println(Poziom.Wciecie('-', poziom) + nazwa);

        for (Odrost el : dzieci)
        {
            el.Pokaz(poziom + 2);
        }
    }
}