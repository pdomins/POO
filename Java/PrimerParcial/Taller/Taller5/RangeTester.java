package ar.itba.edu.POO.PrimerParcial.Taller.Taller5;

import java.util.Iterator;

public class RangeTester {
    public static void main(String[] args){
        Range r = new Range(1,3,10);
        for (Integer aux : r){
            System.out.println(aux);
        }

        Iterator<Integer> it = r.iterator();
        System.out.println(it.next());
    }
}
