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
public abstract class NaziemnaJednostka
{
    protected NaziemnaJednostka(int zycie, int doswiadczenie, int silaZniszczen)
    {
        this.zycie = zycie;
        this.doswiadczenie = doswiadczenie;
        this.silaZniszczen = silaZniszczen;
    }

    public int zycie;

    public int doswiadczenie;

    public int silaZniszczen;
}
