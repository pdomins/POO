package ar.itba.edu.TP5.P14;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ReversedIterator<T> implements Iterator<T> {
    private int index;
    T[] array;

    public ReversedIterator(T[] array) {
        this.array = array;
        this.index = this.array.length -1;
        //dado que es un interador inverso comienzo a recorrer de atras para delante
    }

    @Override
    public boolean hasNext() {
        return index >= 0 ;
    }

    @Override
    public T next() {
        if (!hasNext())
            throw new NoSuchElementException();
        return array[index--];
    }
}
