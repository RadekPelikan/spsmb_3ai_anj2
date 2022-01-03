package _21y._11m._18d_24.cviceniKolo;

public class HorskeKolo extends Kolo {
    private int prevodyVzadu;
    private int prevodyVpredu;


    public HorskeKolo(int cena, String vyrobce, int prevodyVzadu, int prevodyVpredu) {
        super(cena, true, vyrobce);
        this.prevodyVzadu = prevodyVzadu;
        this.prevodyVpredu = prevodyVpredu;
    }

    public int getPrevodyVzadu() {
        return prevodyVzadu;
    }

    public int getPrevodyVpredu() {
        return prevodyVpredu;
    }

    @Override
    public String coJsiZac() {
        return "HorskeKolo{" +
                "cena=" + getCena() +
                ", vyrobce='" + getVyrobce() + '\'' +
                ", prevodyVzadu=" + prevodyVzadu +
                ", prevodyVpredu=" + prevodyVpredu +
                '}';
    }
}
