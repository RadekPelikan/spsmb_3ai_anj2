package _11m._18d_24.cviceniVozidlo;
//Vytvořte abstraktní třídu JednostopeVozidlo s proměnnou String druh
// a abstraktní metodu void vypisCoJsiZac(), která bude v odvozených třídách
// vypisovat obsah řetězce druh a další informace, např výrobce, cenu
// atd. Od této třídy odvoďte třídu Kolo a třídu Motocykl (např.
// s proměnnou obsahNadrze).

//Ve třídě HorskeKolo překryjte metodu void vypisCoJsiZac() tak, aby
// vypisovala i počty převodů.

public abstract class JednostopeVozidlo {
    private String druh;
    private String vyrobce;
    private int cena;

    public JednostopeVozidlo(String druh, String vyrobce, int cena) {
        this.druh = druh;
        this.vyrobce = vyrobce;
        this.cena = cena;
    }

    public String coJsiZac() {
        return "JednostopeVozidlo{" +
                "druh='" + druh + '\'' +
                ", vyrobce='" + vyrobce + '\'' +
                ", cena=" + cena +
                '}';
    }
}
