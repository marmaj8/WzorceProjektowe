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

public abstract class Fabryka
{
    
    
    public abstract PieszaJednostka stworzPieszaJednostke(JednostkaTyp typ) throws Exception;
    public abstract NaziemnaJednostka stworzNaziemnaJednostke(JednostkaTyp typ) throws Exception;
    public abstract PowietrznaJednostka stworzPowietrznaJednostke(JednostkaTyp typ) throws Exception;
}
