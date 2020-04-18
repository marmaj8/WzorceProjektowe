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
public class CzerwonaFabryka extends Fabryka
{
    @Override
    public PieszaJednostka stworzPieszaJednostke(JednostkaTyp typ) throws Exception
    {

        switch (typ)
        {
            case STRZELEC:
                return new Strzelec(80, 0, 500);
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
                return new Czolg(200, 0, 8990);
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
                return new Helikopter(440, 0, 335);
            default:
                throw new Exception("Nieznany typ");
        }
    }
}