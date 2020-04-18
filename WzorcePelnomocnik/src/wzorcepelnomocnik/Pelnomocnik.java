/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wzorcepelnomocnik;

/**
 *
 * @author Marcin
 */
public class Pelnomocnik extends Przedmiot
{
    private KonkretnyPrzedmiot konkretnyPrzedmiot;

    @Override
    public  void Zapytanie()
    {
        if (konkretnyPrzedmiot == null)
        {
            konkretnyPrzedmiot = new KonkretnyPrzedmiot();
        }

        konkretnyPrzedmiot.Zapytanie();
    }
}