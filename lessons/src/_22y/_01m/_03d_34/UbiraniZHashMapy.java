package _22y._01m._03d_34;

import _21y._12m._20d_33.Vaha;

import java.util.*;

public class UbiraniZHashMapy {
    static void naplneniMapyATisk(HashMap<String, Vaha> hm) {
        hm.clear();
        for (int i = 1; i <= 4; i++) {
            String jmeno = "Robot" + i;
            hm.put(jmeno, new Vaha(50 + i));
        }
        System.out.println("Mapa: " + hm);
    }

    public static void main(String[] args) {
        HashMap<String, Vaha> hm = new HashMap<>();
        naplneniMapyATisk(hm);
        Set<String> kl = hm.keySet();
        //odstranění prvku z množiny klíčů a tím i z mapy:
        kl.remove("Robot1");
        kl.remove("Robot2");
        System.out.println("Mapa bez Robot1,2: " + hm);
        //odstranění prvku z množiny hodnot a tím i z mapy:
        naplneniMapyATisk(hm);
        Collection<Vaha> hod = hm.values();
        hod.remove(new Vaha(51));
        System.out.println("Mapa bez Váhy 51:" + hm);
        //odstranění každého sudého Map.Entry a tím i prvku z množiny
        naplneniMapyATisk(hm);
        for (Iterator<Map.Entry<String, Vaha>>
             it = hm.entrySet().iterator(); it.hasNext(); ) {
            String s = (String) it.next().getKey();
            char c = s.charAt(s.length() - 1);
            int i = Character.digit(c, 10);
            if (i % 2 == 0) {
                it.remove();

                System.out.println("Mapa bez sudých:" + hm);

            }
        }
    }

    //Praktické použití mapy
    public static class


    NastaveniVMape {
        private static String[] key = {"pozadi", "popredi", "ramecek"};
        private static String[] hodDef = {"bila", "cerna", "modra"};
        private static String[] hodUziv = {null, "modra", "cervena"};

        static Map<String, String> operations(String[] hodnoty ) {
            Map<String, String> m = new HashMap<>();

            for (int i = 0; i < key.length; i++) {
                if(hodnoty[i] != null) {
                    m.put(key[i], hodnoty[i]);
                }
            }
            return m;
        }

    }

    public static class StejneMapyAPodmapy {
        static HashMap<String, Integer> vytvoreniANaplneniMapy () {
            HashMap<String, Integer> hm = new HashMap<>();
            for (int i = 1; i <= 3 ; i++) {
                String jmeno = "Robot" + i;
                hm.put(jmeno, Integer.valueOf(50 + i));
            }
            return hm;
        }
        public static void main(String[] args) {
            HashMap<String, Integer> hmOrig = vytvoreniANaplneniMapy();
            HashMap<String, Integer> hmStejna = vytvoreniANaplneniMapy();
            HashMap<String, Integer> hmMensi = vytvoreniANaplneniMapy();
            Set kl = hmMensi.keySet();
            kl.remove("Robot1");
            HashMap<String, Integer> hmVetsi = vytvoreniANaplneniMapy();
            hmVetsi.put("Robot5", Integer.valueOf(55));
            System.out.println("hmOrig:    " + hmOrig);
            boolean b1, b2, b3;
            //jsou mapy hmStejna a hmOrig stejné?
            Map<String, Integer> tmp = hmOrig;
            //Map<String, Integer> tmp = hmMensi;
            //Map<String, Integer> tmp = hmVetsi;
            b1 = hmStejna.entrySet().containsAll(tmp.entrySet());
            b2 = hmStejna.entrySet().equals(tmp.entrySet());
            b3 = hmStejna.equals(tmp);
            System.out.format("b1: %b, b2: %b, b3:%b%n", b1, b2, b3);

        }
    }

    public static class UbiraniZHashMapy {
        static void naplneniMapyATisk(HashMap<String, Vaha> hm) {
            hm.clear();
            for (int i = 1; i <= 4 ; i++) {
                String jmeno = "Robot" + i;
                hm.put(jmeno, new Vaha(50 + i));
            }
            System.out.println("Mapa: " + hm);
        }
        public static void main(String[] args) {
            HashMap<String, Vaha> hm = new HashMap<>();
            naplneniMapyATisk(hm);
            Set<String> kl = hm.keySet();
            //odstranění prvku z množiny klíčů a tím i z mapy:
            kl.remove("Robot1");
            kl.remove("Robot2");
            System.out.println("Mapa bez Robot1,2: " + hm);
            //odstranění prvku z množiny hodnot a tím i z mapy:
            naplneniMapyATisk(hm);
            Collection<Vaha> hod = hm.values();
            hod.remove(new Vaha(51));
            System.out.println("Mapa bez Váhy 51:" + hm);
            //odstranění každého sudého Map.Entry a tím i prvku z množiny
            naplneniMapyATisk(hm);
            for(Iterator<Map.Entry<String, Vaha>>
                it = hm.entrySet().iterator(); it.hasNext(); ){
                String s = (String) it.next().getKey();
                char c = s.charAt(s.length() - 1);
                int i = Character.digit(c, 10);
                if(i % 2 == 0) {
                    it.remove();
                }
            }
            System.out.println("Mapa bez sudých:" + hm);

        }
    }
}