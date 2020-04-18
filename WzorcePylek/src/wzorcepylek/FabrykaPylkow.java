/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wzorcepylek;

import java.util.HashMap;

/**
 *
 * @author Marcin
 */
class FabrykaPylkow
{
    private HashMap<String, Pylek> pylki =
      new HashMap<String, Pylek>();

    public FabrykaPylkow()
    {
        pylki.put("1", new SpecyficznyPylek());
        pylki.put("2", new SpecyficznyPylek());
        pylki.put("3", new SpecyficznyPylek());
    }

    public Pylek GetPylek(String key)
    {
        return ((Pylek)pylki.get(key));
    }
}