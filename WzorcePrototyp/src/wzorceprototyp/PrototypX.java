/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wzorceprototyp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcin
 */
class PrototypX extends Prototyp
{
    public PrototypX(String id)
    {
        super(id);
    }

    @Override
    public Prototyp Klonuj() throws CloneNotSupportedException
    {
        return (Prototyp)clone();
    }
}