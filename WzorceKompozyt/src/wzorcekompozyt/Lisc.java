/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wzorcekompozyt;

/**
 *
 * @author Marcin
 */
public class Lisc extends Odrost
{
    public Lisc(String nazwa)
    {
        super(nazwa);
    }

    @Override
    public void Dodaj(Odrost c)
    {
        System.out.println("Nie można dodać do liscia");
    }

    @Override
    public void Usun(Odrost c)
    {
        System.out.println("Nie można usunąć z liścia");
    }

    @Override
    public void Pokaz(int poziom)
    {
        System.out.println(Poziom.Wciecie('-', poziom) + nazwa);
    }
}