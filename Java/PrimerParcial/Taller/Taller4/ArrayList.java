package ar.itba.edu.POO.PrimerParcial.Taller.Taller4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayList<T> implements List<T>{
    private static final int INITIAL_DIM = 5;
    @SuppressWarnings("unchecked")
    private T[] array = (T[]) new Object[INITIAL_DIM];
    private int dim;


    @Override
    public boolean isEmpty() {
        return dim == 0;
    }

    @Override
    public void add(T element) {
        if(dim == array.length) {
            resize();
        }
        array[dim++] = element;
    }

    @Override
    public int contains(T element) {
        for(int i = 0; i < dim; i++) {
            if(array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean remove(int index) {
        if(index >= dim) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(array, index + 1, array, index, dim - 1 - index);
        dim--;
        return true;
    }

    private void resize() {
        array = Arrays.copyOf(array, array.length + INITIAL_DIM);
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int idx = 0;
            @Override
            public boolean hasNext() {
                return idx < dim;
            }

            @Override
            public T next() {
               if(!hasNext())
                   throw new NoSuchElementException();
               return array[idx++];
            }
        };
    }
}
