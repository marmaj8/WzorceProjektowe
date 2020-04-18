/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wzorcedekorator;

/**
 *
 * @author Marcin
 */
public abstract class Dekorator extends Komponent
{
    protected Komponent komponent;

    public void UstawKomponent(Komponent komponent)
    {
        this.komponent = komponent;
    }

    @Override
    public void Operacja()
    {
        if (komponent != null)
        {
            komponent.Operacja();
        }
    }
}