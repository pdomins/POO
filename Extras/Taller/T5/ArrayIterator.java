package ar.itba.edu.Taller.T5;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator<T> implements Iterator<T> {
    private T[] array;
    private int dim;
    private int current;

    public ArrayIterator(T[] array, int dim) {
        this.array = array;
        this.dim = dim;
    }

    @Override
    public boolean hasNext() {
        return current < dim;
    }

    @Override
    public T next() {
        if (!hasNext())
            throw new NoSuchElementException();
        return array[current++];
    }
}
