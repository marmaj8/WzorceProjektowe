/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrykaabstrakcji;

/**
 *
 * @author Marcin
 */
public class FabrykaAbstrakcji {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fabryka niebieskaFabryka = new NiebieskaFabryka();
        Fabryka czerwonaFabryka = new CzerwonaFabryka();

        try
        {
            NaziemnaJednostka czerwonyCzolg = czerwonaFabryka.stworzNaziemnaJednostke(JednostkaTyp.CZOLG);
            PieszaJednostka czerwonyWojskowy = czerwonaFabryka.stworzPieszaJednostke(JednostkaTyp.STRZELEC);

            NaziemnaJednostka niebieskiCzolg = niebieskaFabryka.stworzNaziemnaJednostke(JednostkaTyp.CZOLG);
            PieszaJednostka niebieskiWojskowy = niebieskaFabryka.stworzPieszaJednostke(JednostkaTyp.STRZELEC);

            PowietrznaJednostka niebieskiHelikopter = niebieskaFabryka.stworzPowietrznaJednostke(JednostkaTyp.HELIKOPTER);
            PowietrznaJednostka czerwonyHelikopter = czerwonaFabryka.stworzPowietrznaJednostke(JednostkaTyp.HELIKOPTER);

            System.out.println("Czerwony czołg - życie:");
            System.out.println(czerwonyCzolg.zycie);
            System.out.println("Niebieski czołg - życie:");
            System.out.println(niebieskiCzolg.zycie);

            System.out.println(czerwonyWojskowy.zycie);
            System.out.println(niebieskiWojskowy.zycie);

            System.out.println(niebieskiHelikopter.zycie);
            System.out.println(czerwonyHelikopter.zycie);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
