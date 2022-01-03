package _21y._11m._18d_24.cviceniVozidlo;

public class Motorka extends JednostopeVozidlo {
    private double objemNadrze;

    public Motorka(String vyrobce, int cena, double objemNadrze) {
        super("motorka", vyrobce, cena);
        this.objemNadrze = objemNadrze;
    }

    public double getObjemNadrze() {
        return objemNadrze;
    }

    @Override
    public String coJsiZac() {
        return "Motorka{" +
                "druh='" + druh + '\'' +
                ", vyrobce='" + vyrobce + '\'' +
                ", cena=" + cena +
                ", objemNadrze=" + objemNadrze +
                '}';
    }
}
