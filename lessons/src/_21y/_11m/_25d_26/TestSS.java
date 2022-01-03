package _21y._11m._25d_26;

import java.util.Random;

public class TestSS {
    private final static int N = 1000;
    public static void main(String[] args) {
        Random r = new Random();
        SpojovySeznam ss1 = new SpojovySeznam(5);
//        ss1.pridejNaKonec(new SpojovySeznam(r.nextInt(N)));
        for (int i = 0; i < 5; i++) {
            ss1.pridejNaKonec(new SpojovySeznam(r.nextInt(N)));
        }
        SpojovySeznam currentE = ss1;
        do{
            System.out.format("hodnota: %s%n", currentE.getHodnota());
        } while((currentE=currentE.getDalsi())!=null);
        System.out.println(ss1.len());
        System.out.println(ss1.compareTo(ss1.getDalsi()));
    }
}
