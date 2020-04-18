/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wzorcemost;

/**
 *
 * @author Marcin
 */
public class Abstrakcja
{
    protected Implementacja implementacja;

    public void setImplementacja(Implementacja value)
    {
        implementacja = value;
    }

    public void MetodaImplementacji()
    {
        implementacja.MetodaImplementacji();
    }
}