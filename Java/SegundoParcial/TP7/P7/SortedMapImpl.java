package ar.itba.edu.POO.SegundoParcial.TP7.P7;

import java.util.*;

public class SortedMapImpl<K extends Comparable<? super K>,V>
            extends TreeMap<K,V>
                implements SortedMap<K,V>{

    @Override
    public K higherKey() {
        Set<K> kSet = this.keySet();
        if (kSet.isEmpty())
            throw new NoSuchElementException();
        return kSet.stream().min(Comparator.naturalOrder()).get();
    }

    @Override
    public V higherValue() {
        return this.get(this.higherKey());
    }

    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        return entrySet().iterator();
    }
}
