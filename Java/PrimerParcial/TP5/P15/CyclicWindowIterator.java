package ar.itba.edu.POO.PrimerParcial.TP5.P15;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CyclicWindowIterator<T> implements Iterator<T[]> {
    T[] array;
    int N;
    int pos;

    public CyclicWindowIterator(T[] array, int InterationsIncrement) {
        this.array = array;
        N = InterationsIncrement;
    }

    public boolean hasNext() {
        return array.length != 0;
    }
    @SuppressWarnings("unchecked")
    public T[] next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T[] aux = ((T[]) new Object[N]);
        for (int i = 0; i < N; i++)
            aux[i] = array[(pos + i) % array.length];

        pos++;
        return aux;
    }
}