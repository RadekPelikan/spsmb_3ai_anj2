package _11m._18d_24.cviceniKolo;
// Vytvořte třídu Kolo s proměnnými vyrobce, cena a boolean maPrehazovacku.
// Doplňte do této třídy příslušné metody a konstruktory. Děděním vytvořte
// třídu HorskéKolo, kterému doplňte členské proměnné int prevodyVzadu,
// prevodyVpredu. Zajistěte, aby konstruktor správně vytvářel objekty této
// třídy (např. proměnná maPrehazovacku musí být vždy true).
public class Kolo {
    private int cena;
    private boolean maPrehazovacku;
    private String vyrobce;

    public Kolo(int cena, boolean maPrehazovacku, String vyrobce) {
        this.cena = cena;
        this.maPrehazovacku = maPrehazovacku;
        this.vyrobce = vyrobce;
    }

    public void kuPredu (double m) {
        System.out.format("Jedu %.2f metru kupredu", m);
    }

    public int getCena() {
        return cena;
    }

    public boolean isMaPrehazovacku() {
        return maPrehazovacku;
    }

    public String getVyrobce() {
        return vyrobce;
    }

    public String coJsiZac() {
        return "Kolo{" +
                "cena=" + cena +
                ", maPrehazovacku=" + maPrehazovacku +
                ", vyrobce='" + vyrobce + '\'' +
                '}';
    }
}
