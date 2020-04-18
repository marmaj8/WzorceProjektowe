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
public abstract class Odrost
{
    protected String nazwa;

    public Odrost(String nazwa)
    {
        this.nazwa = nazwa;
    }

    public abstract void Dodaj(Odrost c);
    public abstract void Usun(Odrost c);
    public abstract void Pokaz(int poziom);
}