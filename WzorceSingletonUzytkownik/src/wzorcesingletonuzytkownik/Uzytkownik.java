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
public class Uzytkownik {
    private static Uzytkownik uzytkownik;
    
    private String imie;
    private String nazwisko;
    private String login;
    private String token;

    protected Uzytkownik()
    {
    }

    public static Uzytkownik Uzytkownik()
    {
        if (uzytkownik == null)
        {
            uzytkownik = new Uzytkownik();
        }

        return uzytkownik;
    }
    public void zaloguj(String login, String imie, String nazwisko, String token)
    {
        this.login = login;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.token = token;
    }
    
    public String Imie()
    {
        return imie;
    }
    
    public String Nazwisko()
    {
        return nazwisko;
    }
    
    public String Login()
    {
        return login;
    }
    
    public String Token()
    {
        return token;
    }
}
