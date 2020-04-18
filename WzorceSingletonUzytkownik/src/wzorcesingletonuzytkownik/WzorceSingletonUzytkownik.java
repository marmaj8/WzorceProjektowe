/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wzorcesingletonuzytkownik;

/**
 *
 * @author Marcin
 */
public class WzorceSingletonUzytkownik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Uzytkownik uzytkownik1 = Uzytkownik.Uzytkownik();
        
        uzytkownik1.zaloguj("zenek", "Zenon", "Zenkowski", "rtb54");
        
        Uzytkownik uzytkownik2 = Uzytkownik.Uzytkownik();
        
        System.out.println(uzytkownik1.Imie());
        System.out.println(uzytkownik2.Imie());
    }
    
}
