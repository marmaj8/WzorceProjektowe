/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wzorcepamiatka;

/**
 *
 * @author Marcin
 */
public class Inicjator
{
    private String stan;
    
    public String getStan()
    {
        return stan;
    }
    public void setStan(String value)
    {
        stan = value;
        System.out.println("Stan = " + stan);
    }

    public Pamiatka UtworzPamiatke()
    {
        return new Pamiatka(stan);
    }

    public void UstawPamiatke(Pamiatka pamiatka)
    {
        System.out.println("Przywracanie stanu...");
        setStan(pamiatka.getStan());
    }
}