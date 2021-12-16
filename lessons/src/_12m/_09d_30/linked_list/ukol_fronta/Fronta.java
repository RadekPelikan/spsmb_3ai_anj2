package _12m._09d_30.linked_list.ukol_fronta;

import _12m._09d_30.linked_list.Zasobnik;

import java.util.LinkedList;
import java.util.Queue;

//Domácí úkol do 16.12.:
//použijte LinkedList pro implementaci abstraktního datového typu fronta
//tj. totéž, co bylo uděláno v třídách Zasobnik a PouzitiZasobniku analogicky
//pro frontu
public class Fronta<E> {
    private LinkedList<E> queue = new LinkedList<E>();

    public void add(E elem) {
        queue.add(elem);
    }

    public E remove() {
        return queue.removeFirst();
    }

    public E get() {
        return queue.getFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
