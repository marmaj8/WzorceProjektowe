/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wzorceadapter;

/**
 *
 * @author Marcin
 */
class Adapter extends ElementDocelowy
{
    private Adaptowany _adaptowany = new Adaptowany();

    @Override
    public void MetodaA()
    {
        _adaptowany.MetodaAdaptowanego();
    }
}