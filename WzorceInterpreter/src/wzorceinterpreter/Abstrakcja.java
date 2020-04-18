/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wzorceinterpreter;

/**
 *
 * @author Marcin
 */
public class Abstrakcja extends Obraz
{
    @Override
    public void Interpretuj(Kontekst kontekst)
    {
        System.out.println("Co to za pikasiak?");
    }
}