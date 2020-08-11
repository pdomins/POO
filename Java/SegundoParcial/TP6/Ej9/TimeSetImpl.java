package ar.itba.edu.POO.SegundoParcial.TP6.Ej9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TimeSetImpl<T> implements TimeSet<T>{
    Map<T, TimeRange> myMap = new HashMap<>();

    @Override
    public void add(T elem, int hours, int minutes) {
        TimeRange aux = new TimeRange(hours,minutes);
        myMap.put(elem, aux);
    }

    @Override
    public void remove(T elem) {
        myMap.remove(elem);

    }

    @Override
    public int size() {
        return myMap.size();
    }

    @Override
    public boolean contains(T elem) {
        return myMap.containsKey(elem);
    }

    @Override
    public Set<T> retrieve(int hoursFrom, int minutesFrom, int hoursTo, int minutesTo) {
        TimeRange start = new TimeRange(hoursFrom,minutesFrom);
        TimeRange end = new TimeRange(hoursTo, minutesTo);
        Set<T> aux = new HashSet<>();
        for (T key: myMap.keySet()){
            if (myMap.get(key).compareTo(start) >= 0 && myMap.get(key).compareTo(end) <= 0){
                aux.add(key);
            }
        }
        return aux;
    }
}
