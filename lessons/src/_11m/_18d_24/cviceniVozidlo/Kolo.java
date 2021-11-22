package _11m._18d_24.cviceniVozidlo;

public class Kolo extends JednostopeVozidlo {
    private int kvalitaSedatka;

    public Kolo(String vyrobce, int cena) {
        super("kolo", vyrobce, cena);
        kvalitaSedatka = 10;
    }

    public int getKvalitaSedatka() {
        return kvalitaSedatka;
    }

    public void setKvalitaSedatka(int kvalitaSedatka) {
        this.kvalitaSedatka = kvalitaSedatka >= 0 && kvalitaSedatka <= 10 ? kvalitaSedatka : this.kvalitaSedatka;
    }
}
