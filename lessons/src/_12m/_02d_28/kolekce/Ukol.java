package _12m._02d_28.kolekce;

import java.util.ArrayList;

//ArrayList lze vytvořit i s předem vytvořeným počtem prvků. Takto:
//ar = new ArrayList<Integer>(N). Proveďte rychlostní test a srovnejte
//s ar = new ArrayList<Integer> pro milión prvků;
public class Ukol {
    public static void main(String[] args) {
        check(1000000);
        check((int) (Integer.MAX_VALUE * 0.249145));
        check(535035900);
//        check(535035901); // CRASH
    }

    private static void check(int size) {
        System.out.println("========================================");
        System.out.format("%-15s%d\n", "Checking for:",  size);
        long before;
        float durationMs;

        before = System.nanoTime();
        var a = new ArrayList<Integer>(size);
        durationMs = (System.nanoTime() - before)/1000000f;
        System.out.format("%-15s%-12.6f ms\n", "With size:",  durationMs);

        before = System.nanoTime();
        var b = new ArrayList<Integer>();
        durationMs = (System.nanoTime() - before)/1000000f;
        System.out.format("%-15s%-12.6f ms\n", "Without size:",  durationMs);
    }
}
