/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wzorcebudowniczy;

/**
 *
 * @author Marcin
 */
public class BudowniczyXY extends Budowniczy
{
    private Produkt produkt = new Produkt();
    
    @Override
    public void ZlozCzescA()
    {
        produkt.Uzupelnij("Czesc X");
    }

    @Override
    public void ZlozCzescB()
    {
        produkt.Uzupelnij("Czesc Y");
    }

    @Override
    public Produkt ZwrocProdukt()
    {
        return produkt;
    }
}
