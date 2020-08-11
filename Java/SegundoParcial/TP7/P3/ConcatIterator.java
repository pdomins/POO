package ar.itba.edu.POO.SegundoParcial.TP7.P3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ConcatIterator<T> implements Iterator<T> {
    Iterator<T> it1, it2;

    public ConcatIterator(Iterator<T> iterator, Iterator<T> iterator1) {
    it1= iterator;
    it2=iterator1;
    }

    @Override
    public boolean hasNext() {
        return it1.hasNext() || it2.hasNext();
    }

    @Override
    public T next() {
        if (!hasNext())
            throw new NoSuchElementException();
        if (it1.hasNext())
            return it1.next();
        return it2.next();
    }
}
