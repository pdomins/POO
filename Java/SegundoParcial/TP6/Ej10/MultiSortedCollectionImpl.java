package ar.itba.edu.POO.SegundoParcial.TP6.Ej10;

import java.util.*;

public class MultiSortedCollectionImpl<T> implements MultiSortedCollection<T> {

    Map<Comparator<T>,Set<T>> myMap = new HashMap<>();
    Set<T> auxSet = new HashSet<>();


    @Override
    public void add(Comparator<T> comp) {
        if (!myMap.containsKey(comp)){
        myMap.put(comp, new TreeSet<>(comp));
        myMap.get(comp).addAll(auxSet);
        }
    }

    @Override
    public void add(T elem) {
        Set<Comparator<T>> aux = myMap.keySet();
        for (Comparator<T> cmp : aux){
            myMap.get(cmp).add(elem);
        }
    }

    @Override
    public void remove(T elem) {
        Set<Comparator<T>> auxC = myMap.keySet();
        for (Comparator<T> cmp : auxC){
            myMap.get(cmp).remove(elem);
        }
        auxSet.remove(elem);
    }

    @Override
    public Iterable<T> iterable(Comparator<T> comp) {
        return myMap.get(comp);
    }
}
