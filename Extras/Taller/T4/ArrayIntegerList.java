package ar.itba.edu.Taller.T4;

import java.util.Arrays;

public class ArrayIntegerList<T> implements IntegerList<T> {

    private static final int INITIAL_DIM = 5;
    private T[] array;
    private int dim;

    @SuppressWarnings("unchecked")
    public ArrayIntegerList() {
        this.array= ((T[]) new Object[INITIAL_DIM]);
        this.dim = 0;
    }

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

}
