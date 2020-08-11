package ar.itba.edu.POO.SegundoParcial.TP7.P5;

import ar.itba.edu.POO.SegundoParcial.TP6.Ej8.BagImpl;

import java.util.*;

public class IterableBagImpl<T extends Comparable<? super T>> extends BagImpl<T> implements IterableBag<T> {

    public IterableBagImpl() {
        myMap = new TreeMap<>(Comparator.reverseOrder());
    }

    @Override
    public Iterable<T> elements() {
        List<T> myList = new ArrayList<>();
        for (T elem: myMap.keySet()){
            for (int i = 0 ; i < myMap.get(elem); i++){
                myList.add(elem);
            }
        }
        return myList;
    }

    @Override
    public Iterable<T> elementsDistinct() {
        return myMap.keySet();
    }
}
