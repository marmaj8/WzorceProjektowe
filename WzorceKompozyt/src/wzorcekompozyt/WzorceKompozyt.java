/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wzorcekompozyt;

/**
 *
 * @author Marcin
 */
public class WzorceKompozyt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Galaz pien = new Galaz("pien");
        pien.Dodaj(new Lisc("Lisc 1"));
        pien.Dodaj(new Lisc("Lisc 2"));

        Galaz galaz = new Galaz("Gałąź A");
        galaz.Dodaj(new Lisc("Lisc 1A"));
        galaz.Dodaj(new Lisc("Lisc 1B"));

        pien.Dodaj(galaz);
        pien.Dodaj(new Lisc("Lisc C"));

        Lisc lisc = new Lisc("Lisc D");
        pien.Dodaj(lisc);
        pien.Usun(lisc);

        pien.Pokaz(0);
    }
}
