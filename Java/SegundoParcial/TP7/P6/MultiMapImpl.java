package ar.itba.edu.POO.SegundoParcial.TP7.P6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiMapImpl<T,E> implements MultiMap<T,E> {
    Map<T, List<E>> myMap = new HashMap<>();
    int size;

    @Override
    public void put(T key, E value) {
        myMap.putIfAbsent(key, new ArrayList<>());
        myMap.get(key).add(value);
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int size(T key) {
        return myMap.get(key).size();
    }

    @Override
    public void remove(T key) {
        size-=myMap.get(key).size();
        myMap.remove(key);
    }

    @Override
    public void remove(T key, E value) {
        myMap.get(key).remove(value);
        size--;
    }

    @Override
    public Iterable<E> get(T key) {
        return myMap.get(key);
    }
}
