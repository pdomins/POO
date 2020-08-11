package ar.itba.edu.POO.PrimerParcial.TP5.P14;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ReversedIterator<T> implements  Iterator<T> {

    T[] words;
    int size;

    public ReversedIterator(T[] words) {
        this.words= words;
        size = words.length-1;
    }
            @Override
            public boolean hasNext() {
                return size >= 0;
            }

            @Override
            public T next() {
                if (!hasNext())
                    throw new NoSuchElementException();
                return words[size--];
            }
        }
