package ar.itba.edu.POO.SegundoParcial.TP7.P7;

import java.util.Map;

public interface SortedMap<K,V> extends Map<K,V>, Iterable<Map.Entry<K,V>>{

    K higherKey();
    V higherValue();

}
