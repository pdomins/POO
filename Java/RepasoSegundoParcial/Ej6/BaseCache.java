package ar.itba.edu.POO.RepasoSegundoParcial.Ej6;

import java.util.HashMap;

public class BaseCache<K,V> extends HashMap<K,V> implements Cache<K,V> {
    @Override
    public void put(String user, String date,K key, V value) {
        System.out.println(user + " put value " + value + " for key " + key + " on " + date);
        super.put(key,value);
    }

    @Override
    public V get(String user, String date, K key) {
        V value = super.get(key);
        System.out.println(user + " retrieved value " + value + " for key "+ key + " on "+ date);
        return value;
    }
}
