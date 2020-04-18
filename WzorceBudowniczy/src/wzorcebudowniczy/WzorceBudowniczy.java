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
public class WzorceBudowniczy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kierownik kier = new Kierownik();

        Budowniczy bud1 = new BudowniczyQW();
        Budowniczy bud2 = new BudowniczyXY();

        kier.Skladaj(bud1);
        bud1.ZwrocProdukt().Pokaz();
        kier.Skladaj(bud2);
        bud2.ZwrocProdukt().Pokaz();
    }
    
}
