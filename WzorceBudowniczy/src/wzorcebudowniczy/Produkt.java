/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wzorcebudowniczy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcin
 */
public class Produkt {
    private List<String> czesci = new ArrayList<String>();

    public void Uzupelnij(String czesc)
    {
        czesci.add(czesc);
    }

    public void Pokaz()
    {
        System.out.println("\nCzesci produktu:");
        for(String czesc : czesci)
            System.out.println(czesc);
    }
}
