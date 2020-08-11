package ar.itba.edu.POO.RepasoSegundoParcial.Ej5;

import java.util.HashMap;
import java.util.Map;

public class DoubleKeyHashMap<K1,K2,V> implements DoubleKeyMap<K1,K2,V> {
    Map<KeyPair<K1,K2>,V> myMap = new HashMap<>();

    @Override
    public int size() {
        return myMap.size();
    }

    @Override
    public boolean isEmpty() {
        return myMap.isEmpty();
    }

    @Override
    public boolean containsKey(K1 firstKey, K2 secondKey) {
        return myMap.containsKey(new KeyPair<>(firstKey,secondKey));
    }

    @Override
    public boolean containsValue(V value) {
        return myMap.containsValue(value);
    }

    @Override
    public V get(K1 firstKey, K2 secondKey) {
        return myMap.get(new KeyPair<>(firstKey,secondKey));
    }

    @Override
    public void put(K1 firstKey, K2 secondKey, V value) {
        myMap.put(new KeyPair<>(firstKey,secondKey),value);
    }
}
