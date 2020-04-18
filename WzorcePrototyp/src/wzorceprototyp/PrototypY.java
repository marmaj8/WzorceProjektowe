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
class PrototypY extends Prototyp
{
    public PrototypY(String id)
    {
        super(id);
    }

    @Override
    public Prototyp Klonuj() throws CloneNotSupportedException
    {
        return (Prototyp)clone();
    }
}