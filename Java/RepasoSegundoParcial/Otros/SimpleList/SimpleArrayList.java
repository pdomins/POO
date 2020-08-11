package ar.itba.edu.POO.RepasoSegundoParcial.Otros.SimpleList;

import java.util.ArrayList;

public class SimpleArrayList<T> extends ArrayList<T> implements SimpleList<T> {

    public <E> E reduce(E elem,Predicate<E,T> predicate){
        for (T aux: this){
            elem = predicate.apply(elem,aux);
        }
        return elem;
    }
}
