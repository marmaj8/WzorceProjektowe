/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wzorcemetodaszablonowa;

/**
 *
 * @author Marcin
 */
public class WzorceMetodaSzablonowa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KlasaAbstrakcyjna aA = new SpecyficznaKlasaA();
        aA.MetodaSzablonowa();

        KlasaAbstrakcyjna aB = new SpecyficznaKlasaB();
        aB.MetodaSzablonowa();
    }
}