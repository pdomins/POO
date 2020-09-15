package ar.itba.edu.TP5.P15;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CyclicWindowIterator<T> implements Iterator<T[]> {
    private T[] array;
    private int N;
    private int index;

    public CyclicWindowIterator(T[] array, int n) {
        this.array = array;
        N = n;
    }

    @Override
    public boolean hasNext() {
        return array.length != 0;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T[] next() {
        if (!hasNext())
            throw new NoSuchElementException();
        T[] auxArray = ((T[]) new Object[N]);
        for (int i = 0; i < N; i++){
            auxArray[i] = array[(i+index) % array.length];
        }
        index++;
        return auxArray;
    }
}
