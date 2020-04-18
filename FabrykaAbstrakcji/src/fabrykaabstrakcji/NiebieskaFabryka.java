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
public class NiebieskaFabryka extends Fabryka
{
    @Override
    public PieszaJednostka stworzPieszaJednostke(JednostkaTyp typ) throws Exception
    {

        switch (typ)
        {
            case STRZELEC:
                return new Strzelec(25, 0, 5);
            default:
                throw new Exception("Nieznany typ");
        }
    }


    @Override
    public NaziemnaJednostka stworzNaziemnaJednostke(JednostkaTyp typ) throws Exception
    {
        switch (typ)
        {
            case CZOLG:
                return new Czolg(100, 0, 25);
            default:
                throw new Exception("Nieznany typ");
        }
    }

    @Override
    public PowietrznaJednostka stworzPowietrznaJednostke(JednostkaTyp typ) throws Exception
    {
        switch (typ)
        {
            case HELIKOPTER:
                return new Helikopter(50, 0, 25);
            default:
                throw new Exception("Nieznany typ");
        }
    }
}