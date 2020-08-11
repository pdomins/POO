package ar.itba.edu.POO.RepasoSegundoParcial.Otros.CensureIterator;

import java.util.*;

public class CensureIterator<T> implements Iterator<T>{
    Iterator<T> myCol;
    Set<T> toCensure;
    T censored;

    public CensureIterator(Collection<T> myCol, T censored) {
        this.myCol = myCol.iterator();
        this.censored = censored;
        toCensure = new HashSet<>();
    }
    public CensureIterator(T[] array, T censored){
        this(Arrays.asList(array), censored);
    }

    public CensureIterator<T> censure(T object) {
        toCensure.add(object);
        return this;
    }

    @Override
    public boolean hasNext() {
        return myCol.hasNext();
    }

    @Override
    public T next() {
        if (!hasNext())
            throw new NoSuchElementException();
        T elem = myCol.next();
        if (toCensure.contains(elem))
            elem = censored;
        return elem;
    }
}
