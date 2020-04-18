/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wzorcefabryka;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcin
 */
public class Pizza {
    public List<Skladniki> Ingredients;
    
    public Pizza()
    {
        Ingredients = new ArrayList<Skladniki>();
    }
}
