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
abstract class Prototyp implements Cloneable
{
    public Prototyp(String id)
    {
        Id = id;
    }
    public String Id;

    public abstract Prototyp Klonuj() throws CloneNotSupportedException;
}
