package _21y._12m._09d_30.linked_list.ukol_fronta;

public class PouzitiFronty {
    public static void main(String[] args) {
        Fronta<String> fs = new Fronta<>();
        fs.add("prvni");
        fs.add("druhy");
        fs.add("treti");
        System.out.println(fs.get());//prvni
        while (fs.isEmpty() == false) {
            System.out.println(fs.remove());
        } //prvni, druhy, treti
        System.out.println();
        Fronta<Integer> fi = new Fronta<>();
        fi.add(Integer.valueOf(8));
        fi.add(Integer.valueOf(9));
        while (fi.isEmpty() == false) {
            System.out.println(fi.remove() + " ");
        }//8, 9

    }

}
