package _12m._02d_28.kolekce;

import java.util.ArrayList;
import java.util.Collections;

//ArrayList lze vytvořit i s předem vytvořeným počtem prvků. Takto:
//ar = new ArrayList<Integer>(N). Proveďte rychlostní test a srovnejte
//s ar = new ArrayList<Integer> pro milión prvků;
public class Ukol {
    public static void main(String[] args) {
        check(1000000);
        check(150000000);
    }

    private static void check(int size) {
        System.out.println("========================================");
        System.out.format("%-15s%d\n", "Checking for:", size);
        long before;
        float durationMs;

        before = System.nanoTime();
        var a = new ArrayList<Integer>(size);
        fill(a, size);
        durationMs = (System.nanoTime() - before) / 1000000f;
        System.out.format("%-15s%-12.6f ms\n", "With size:", durationMs);

        before = System.nanoTime();
        var b = new ArrayList<Integer>();
        fill(b, size);
        durationMs = (System.nanoTime() - before) / 1000000f;
        System.out.format("%-15s%-12.6f ms\n", "Without size:", durationMs);
    }

    private static void fill(ArrayList<Integer> ar, int size) {
        for (int i = 0; i < size; i++) {
            ar.add(0);
        }
    }
}
