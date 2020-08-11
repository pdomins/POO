package ar.itba.edu.POO.PrimerParcial.Taller.Taller5.OP1;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
public class ArrayList<T> implements List<T> {
    private static final int INITIAL_DIM = 5;

    private T[] array;
    private int dim;
    private final Comparator<T> comparator;

    @SuppressWarnings("unchecked")
    public ArrayList(Comparator<T> comparator) {
        this.array = (T[]) new Object[INITIAL_DIM];
        this.comparator = comparator;
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

    private class ArrayListIterator implements Iterator<T> {

        private T[] elements;
        private int index;

        public ArrayListIterator(T[] elements) {
            this.elements = elements;
        }

        @Override
        public boolean hasNext() {
            return index < dim;
        }

        @Override
        public T next() {
            if(!hasNext()) {
                throw new NoSuchElementException();
            }
            return elements[index++];
        }

    }

    @Override
    public Iterator<T> iterator() {
        T[] aux = Arrays.copyOf(array, dim); // Ignoro los nulls
        Arrays.sort(aux, comparator);
        return new ArrayListIterator(aux);
    }

}
