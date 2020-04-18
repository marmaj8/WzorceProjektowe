/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wzorcemost;

/**
 *
 * @author Marcin
 */
public class WzorceMost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Abstrakcja ab = new AbstrakcjaPochodna();

        ab.setImplementacja(new SpecyficznaImplementacja());
        ab.MetodaImplementacji();

        ab.setImplementacja(new JakasInnaImplementacja());
        ab.MetodaImplementacji();
    }
}
