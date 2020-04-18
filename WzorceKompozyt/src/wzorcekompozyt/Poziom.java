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
public class Poziom {
    public static String Wciecie(char znak,int poziom)
    {
        String str = "";
        for(int i=0; i< poziom; i++)
        {
            str += znak;
        }
        return str;
    }
}
