package _21y._11m._29d_27.linked_list;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        var a = new LinkedList<Integer>();
        a.add(4);
        a.add(23);
        a.add(71);
        a.add(35);
        a.add(78);
        a.add(25);
        System.out.println(a);
        for (Integer integer : a) {
            System.out.println(integer);
        }
    }

}
