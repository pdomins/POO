package ar.itba.edu.POO.RepasoSegundoParcial.Ej1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SimpleArrayList<T> extends ArrayList<T> implements SimpleList<T>{
    @Override
    public <E> Map<E,T> toMap(Expression<E, T> exp) {
        Map<E,T> myMap = new HashMap<>();
        for (T elem : this){
            myMap.put(exp.apply(elem), elem);
        }
        return myMap;
    }
}
