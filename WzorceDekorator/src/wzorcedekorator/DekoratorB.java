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
public class DekoratorB extends Dekorator
{
    @Override
    public void Operacja()
    {
        super.Operacja();
        DodanaFunkcjonalnosc();
        System.out.println("Funkcja z B");
    }

    void DodanaFunkcjonalnosc()
    {
        System.out.println("Dodatek z B");
    }
}