package ar.itba.edu.Parciales.PrimerParcial.CensureIterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class CensureIterator<T> implements Iterator<T> {
    T censure;
    T[] array;
    T[] censored;
    int dim,current;
    private final int INITIAL_DIM = 5;

    @SuppressWarnings("unchecked")
    public CensureIterator( T[] array, T censure) {
        this.censure = censure;
        this.array = array;
        censored = ((T[]) new Object[INITIAL_DIM]);
    }

    public CensureIterator<T> censure(T i) {
        if (censored.length == dim )
            resize();
        censored[dim++]=i;
        return this;
    }


    private void resize() {
        censored= Arrays.copyOf(censored, censored.length+ INITIAL_DIM);
    }

    @Override
    public boolean hasNext() {
        return current < array.length;
    }

    @Override
    public T next() {
        if (!hasNext())
            throw new NoSuchElementException();
        for (int i = 0; i < dim ; i ++){
            if (censored[i].equals(array[current])){
                current++;
                return censure;
            }
        }
        T aux = array[current];
        current++;
        return aux;
    }
}
