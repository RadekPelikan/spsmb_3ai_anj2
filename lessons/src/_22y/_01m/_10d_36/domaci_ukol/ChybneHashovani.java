package _22y._01m._10d_36.domaci_ukol;

import _21y._12m._16d_32.Hruska;

import java.util.HashSet;
import java.util.Objects;

class Ovoce {
    private int cena;
    private String typ;

    public Ovoce(int cena) {
        this.cena = cena;
        this.typ = "Jablko";
    }
/*
    @Override
    public int hashCode() {
        return this.cena;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(obj instanceof Ovoce == false) {
            return false;
        }
        return (cena == ((Ovoce) obj).cena);
    }
 */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ovoce ovoce = (Ovoce) o;
        return cena == ovoce.cena && Objects.equals(typ, ovoce.typ);
    }

    @Override
    public int hashCode() {
        return this.cena;
    }

    @Override
    public String toString() {
        return "{cena=" + cena +
                "Kč, typ='" + typ + '\'' +
                '}';
    }
}

public class ChybneHashovani {
    public static void main(String[] args) {
        System.out.println("Toto hashovani funguje:");
        HashSet<Integer> intSet = new HashSet<>();
        for (int i = 6; i <= 8; i++) {
            intSet.add(Integer.valueOf(i));
        }
        System.out.println("intSet: " + intSet);
        System.out.println("obsahuje 7:" + intSet.contains(Integer.valueOf(7)));

        System.out.println("Toto hashovani nefunguje, opravte:");
        HashSet<Ovoce> ovoceSet = new HashSet<>();
        for (int i = 6; i <= 8; i++) {
            ovoceSet.add(new Ovoce(i));
        }
        System.out.println("ovoceSet: " + ovoceSet);
        System.out.println("obsahuje 7:" + ovoceSet.contains(new Ovoce(7)));
    }
}
