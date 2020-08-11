package ar.itba.edu.POO.SegundoParcial.TP6.Ej8;


import java.util.*;

public class BagImpl<T extends Comparable<? super T>> implements Bag<T> {
    protected Map<T, Integer> myMap = new HashMap<>();
    int totalAmount;

    @Override
    public void add(T elem) {
        myMap.putIfAbsent(elem,0);
        myMap.put(elem, 1 + myMap.get(elem));
        totalAmount++;
    }

    @Override
    public int size() {
        return totalAmount;
    }

    @Override
    public int sizeDistinct() {
        return myMap.size();
    }

    @Override
    public int count(T elem) {
        return myMap.get(elem);
    }

    @Override
    public boolean contains(T elem) {
        return myMap.containsKey(elem);
    }

    @Override
    public void remove(T elem) {
        if (!myMap.containsKey(elem)){
            throw new NoSuchElementException();
        }
        int aux = myMap.get(elem);
        if (aux>1){
            myMap.put(elem,aux-1);
            totalAmount--;
        }
        else
            myMap.remove(elem);
    }
}
