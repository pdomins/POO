package ar.itba.edu.POO.SegundoParcial.TP7.P6;

public interface MultiMap<K,V> {

    void put(K key, V value);

    int size();

    int size(K key);

    void remove(K key);

    void remove(K key, V value);

    Iterable<V> get(K key);

}
