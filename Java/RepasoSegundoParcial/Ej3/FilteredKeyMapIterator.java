package ar.itba.edu.POO.RepasoSegundoParcial.Ej3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FilteredKeyMapIterator<K, V> implements Iterator<K>{
    Map<K,V> myMap = new HashMap<>();
    Iterator<K> iterableKeys;
    private K aux;

    public FilteredKeyMapIterator(Map<K,V> map, Predicate<K> predicate){
        Set<K> auxSet= map.keySet();
        for (K aux : auxSet){
            if (predicate.test(aux)){
                myMap.put(aux, map.get(aux));
            }
        }
        iterableKeys = myMap.keySet().iterator();
    }

    @Override
    public boolean hasNext() {
        return iterableKeys.hasNext();
    }

    @Override
    public K next() {
        aux = iterableKeys.next();
        return aux;
    }

    public V getValue(){
        return myMap.get(aux);
    }
}
