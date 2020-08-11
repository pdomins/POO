package ar.itba.edu.POO.RepasoSegundoParcial.Otros.MultiMap;



import java.util.*;

public class MultiMapImpl<K,V extends Comparable<V>> implements MultiMap<K,V> {
    Map<K, Set<V>> myMap = new HashMap<>();
    int size;
    Comparator<V> comparator;

    public MultiMapImpl(Comparator<V> comparator) {
        this.comparator=comparator;
    }

    @Override
    public void put(K key, V value) {
        myMap.putIfAbsent(key, new TreeSet<>(comparator));
        myMap.get(key).add(value);
        size++;

    }

    @Override
    public void remove(K key) {
        myMap.remove(key);
        size--;
    }

    @Override
    public void remove(K key, V value) {
        myMap.getOrDefault(key, new TreeSet<>()).remove(value);
    }

    @Override
    public Iterable<V> get(K key) {
        return myMap.getOrDefault(key, new TreeSet<>());
    }

    @Override
    public Iterable<V> getReverseOrder(K key) {
        Set<V> aux = new TreeSet<>(Comparator.reverseOrder());
        aux.addAll(myMap.getOrDefault(key, new TreeSet<>()));
        return aux;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int size(K key) {
        return myMap.getOrDefault(key,new TreeSet<>()).size();
    }
}
