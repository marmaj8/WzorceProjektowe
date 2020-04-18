/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wzorcepamiatka;

/**
 *
 * @author Marcin
 */
public class WzorcePamiatka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Inicjator i = new Inicjator();
        i.setStan("Włącz");

        Zarzadzajacy z = new Zarzadzajacy();
        z.setPamiatka(i.UtworzPamiatke());

        i.setStan("Wyłącz");

        i.UstawPamiatke(z.getPamiatka());
    }
}
