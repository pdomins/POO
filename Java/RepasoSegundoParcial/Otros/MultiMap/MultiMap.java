package ar.itba.edu.POO.RepasoSegundoParcial.Otros.MultiMap;

public interface MultiMap<K,V> {
    public void put(K key, V value);
    public void remove(K key);
    public void remove(K key, V value);
    public Iterable<V> get(K key);
    public Iterable<V> getReverseOrder(K key);
    public int size();
    public int size(K key);
}
