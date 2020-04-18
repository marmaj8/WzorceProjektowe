/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wzorcedekorator;

/**
 *
 * @author Marcin
 */
public class WzorceDekorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Produkt c = new Produkt();
        DekoratorA d1 = new DekoratorA();
        DekoratorB d2 = new DekoratorB();

        // Podłączenie dekoratorów
        d1.UstawKomponent(c);
        d2.UstawKomponent(d1);

        // Wywołanie operacji
        d2.Operacja();
    }
}