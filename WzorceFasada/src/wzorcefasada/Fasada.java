/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wzorcefasada;

/**
 *
 * @author Marcin
 */
public class Fasada
{
    private PodSystemPierwszy pierwszy ;
    private PodSystemDrugi dwa;
    private PodSystemTrzeci trzy;
    private PodSystemCzwarty cztery;

    public Fasada()
    {
        pierwszy = new PodSystemPierwszy();
        dwa = new PodSystemDrugi();
        trzy = new PodSystemTrzeci();
        cztery = new PodSystemCzwarty();
    }

    public void MetodaA()
    {
        System.out.println("MetodaA");
        pierwszy.MetodaPierwsza();
        dwa.MetodaDruga();
        cztery.MetodaCzwarta();
    }

    public void MetodaB()
    {
        System.out.println("MetodaB");
        dwa.MetodaDruga();
        trzy.MetodaTrzecia();
    }
}