package ar.itba.edu.POO.RepasoSegundoParcial.Otros.SimpleList;

import java.util.List;

public interface SimpleList<T> extends List<T> {
    public <E> E reduce(E elem,Predicate<E,T> predicate);
}
