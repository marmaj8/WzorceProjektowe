/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wzorcepylek;

/**
 *
 * @author Marcin
 */
public class WzorcePylek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int daneZewnetrzne = 22;

        FabrykaPylkow fabryka = new FabrykaPylkow();

        Pylek fq = fabryka.GetPylek("1");
        fq.PrzykladowaMetoda(--daneZewnetrzne);

        Pylek fw = fabryka.GetPylek("2");
        fw.PrzykladowaMetoda(--daneZewnetrzne);

        Pylek fe = fabryka.GetPylek("3");
        fe.PrzykladowaMetoda(--daneZewnetrzne);
    }
}
