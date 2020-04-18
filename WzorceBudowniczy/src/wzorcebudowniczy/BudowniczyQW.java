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
public class BudowniczyQW extends Budowniczy
{
    private Produkt produkt = new Produkt();

    @Override
    public void ZlozCzescA()
    {
        produkt.Uzupelnij("Czesc Q");
    }

    @Override
    public void ZlozCzescB()
    {
        produkt.Uzupelnij("Czesc W");
    }

    @Override
    public Produkt ZwrocProdukt()
    {
        return produkt;
    }
}
