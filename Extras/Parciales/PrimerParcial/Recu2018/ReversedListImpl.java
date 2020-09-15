package ar.itba.edu.Parciales.PrimerParcial.Recu2018;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ReversedListImpl<T> implements ReversedList<T>{
    T[] array;
    int dim;
    private final int INITIAL_DIM = 5;

    @SuppressWarnings("unchecked")
    public ReversedListImpl() {
        array = ((T[]) new Object[INITIAL_DIM]);
    }


    @Override
    public void add(T elem) {
        if (array.length == dim) {
            resize();
        }
        array[dim++] = elem;
    }

    private void resize() {
        array = Arrays.copyOf(array, array.length + INITIAL_DIM);
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            int current = dim-1;

            @Override
            public boolean hasNext() {
                return current >= 0;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T aux = array[current];
                current--;
                return aux;
            }
        };

    }

    public Iterator<T> defaultIterator() {
        return new Iterator<>() {
            int current;

            @Override
            public boolean hasNext() {
                return dim != current;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T aux = array[current];
                current++;
                return aux;
            }
        };
    }
}
