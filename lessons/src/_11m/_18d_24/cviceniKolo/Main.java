package _11m._18d_24.cviceniKolo;

public class Main {

    public static void main(String[] args) {
        Kolo a1 = new Kolo(1000, true, "hh");
        Kolo a2 = new HorskeKolo(3000, "dgdfg", 5, 4);
        System.out.println(a1.coJsiZac());
        System.out.println(a2.coJsiZac());
    }
}
