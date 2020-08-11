package ar.itba.edu.POO.PrimerParcial.P2;


import java.util.Iterator;
import java.util.NoSuchElementException;

public class ParallelIterator<T> implements Iterator<Pair<T,T>> {

    T[] array1, array2;
    int N, iterations;

    public ParallelIterator(T[] array1, T[] array2) {
        if (array1 == null) {
            throw new RuntimeException("First collection missing");
        }
        if (array2 == null) {
            throw new RuntimeException("Second collection missing");
        }
        this.array1 = array1;
        this.array2 = array2;
        N = Math.min(array1.length, array2.length);
    }

    @Override
    public boolean hasNext() {
        return iterations < N ;
    }

    @Override
    public Pair<T,T> next() {
        if (!hasNext())
            throw new NoSuchElementException();
        Pair<T,T> pair = new Pair<>(array1[iterations],array2[iterations++]);
        return pair;
    }
}