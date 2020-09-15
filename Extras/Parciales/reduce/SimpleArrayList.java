package ar.itba.edu.Parciales.reduce;

import java.util.Arrays;

public class SimpleArrayList<T> implements SimpleList<T> {

    private final int INITIAL_DIM = 5;
    T[] array;
    int dim;

    @SuppressWarnings("unchecked")
    public SimpleArrayList() {
        array= ((T[]) new Object[INITIAL_DIM]);
    }

    @Override
    public void add(T elem) {
        if (array.length == dim){
            resize();
        }
        array[dim++]=elem;
    }

    private void resize() {
        array = Arrays.copyOf(array,array.length + INITIAL_DIM);
    }

    @Override
    public int size() {
        return dim;
    }

    @Override
    public boolean contains(T elem) {
        for (int i = 0 ; i < dim ; i ++)
            if (array[i] == elem)
                return true;
        return false;
    }


    @Override
    public T reduce(T initialVal, Lambda<T> exp) {
        T aux = initialVal;
        for (int i = 0; i < dim ; i++){
            aux = exp.test(aux, array[i]);
        }
        return aux;
    }
}
