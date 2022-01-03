package _21y._10m._25d_18;
import _21y._10m._21d_17.DomaciUkol;

public class MereniDobyBehu {

    public static void main(String[] args) {
        long before;
        float durationMs;
        check(20);
        check(200);
        check(2000);
        check(3000);
    }

    private static void check(long size) {
        System.out.println("================================");
        System.out.format("Checking for: %d\n", size);
        long before;
        float durationMs;

        before = System.nanoTime();
        DomaciUkol.faktorial(size);
        durationMs = (System.nanoTime() - before)/1000000f;
        System.out.format("%-12s%.6f\n", "loop:",  durationMs);

        before = System.nanoTime();
        DomaciUkol.faktorialRekurzivne(size);
        durationMs = (System.nanoTime() - before)/1000000f;
        System.out.format("%-12s%.6f\n", "recursive:",  durationMs);
    }
}
