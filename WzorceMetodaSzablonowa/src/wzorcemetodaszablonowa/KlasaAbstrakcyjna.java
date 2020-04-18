/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wzorcemetodaszablonowa;

/**
 *
 * @author Marcin
 */
public abstract class KlasaAbstrakcyjna
{
    public abstract void ZrobCos();
    public abstract void JakasInnaMetoda();

    public void MetodaSzablonowa()
    {
        ZrobCos();
        JakasInnaMetoda();
        System.out.println("");
    }
}