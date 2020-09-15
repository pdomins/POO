package ar.itba.edu.Parciales.PrimerParcial.Varios;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CyclicWindowIterator<T> implements Iterator<T[]> {
    T[] array;
    int window, startIndex;

    public CyclicWindowIterator(T[] array, int window) {
        this.array = array;
        this.window = window;
    }

    @Override
    public boolean hasNext() {
        return array.length != 0 ;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T[] next() {
        if (!hasNext())
            throw new NoSuchElementException();
        T[] aux = ((T[]) new Object[window]);
        for (int i = 0; i < window; i++)
             aux[i]= array[(i+startIndex) % array.length];
        startIndex++;
        return aux;
    }
}
