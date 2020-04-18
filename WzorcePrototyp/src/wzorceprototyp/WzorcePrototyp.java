/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wzorceprototyp;

/**
 *
 * @author Marcin
 */
public class WzorcePrototyp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypY prototyp1 = new PrototypY("I");
        PrototypY klon1 = (PrototypY)prototyp1.Klonuj();
        System.out.println("Sklonowano: "+klon1.Id);

        PrototypX prototyp2 = new PrototypX("II");
        PrototypX klon2 = (PrototypX)prototyp2.Klonuj();
        System.out.println("Sklonowano: "+klon2.Id);
    }
}