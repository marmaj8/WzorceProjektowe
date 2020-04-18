/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wzorceinterpreter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcin
 */
public class WzorceInterpreter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kontekst kontekst = new Kontekst();

        List<Obraz> obrazy = new ArrayList<Obraz>();

        obrazy.add(new Abstrakcja());
        obrazy.add(new Impresja());
        obrazy.add(new Impresja());
        obrazy.add(new Abstrakcja());

        for (Obraz obraz : obrazy)
        {
            obraz.Interpretuj(kontekst);
        }
    }
}