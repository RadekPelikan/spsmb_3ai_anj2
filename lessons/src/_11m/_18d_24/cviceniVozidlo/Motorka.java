package _11m._18d_24.cviceniVozidlo;

public class Motorka extends JednostopeVozidlo {
    private double objemNadrze;

    public Motorka(String vyrobce, int cena, double objemNadrze) {
        super("motorka", vyrobce, cena);
        this.objemNadrze = objemNadrze;
    }

    public double getObjemNadrze() {
        return objemNadrze;
    }
}
