package ar.itba.edu.PrimerParcial.P2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ParallelIterator<T> implements Iterator<Pair<T,T>> {

    int dim;
    int min;
    T[] array1, array2;

    public ParallelIterator(T[] array1, T[] array2) {
        if (array1 == null){
            throw new NullPointerException("First Collection Missing");
        }
        if (array2 == null){
            throw new NullPointerException("Second Collection Missing");
        }
        this.array1 = array1;
        this.array2 = array2;
        min = Math.min(array1.length, array2.length);
    }

    @Override
    public boolean hasNext() {
        return dim < min;
    }

    @Override
    public Pair<T, T> next() {
        if (!hasNext()){
            throw new NoSuchElementException();
        }

        return new Pair<>(array1[dim], array2[dim++]);
    }
}
