package ar.itba.edu.Taller.T5;


public interface List<T extends Comparable<? super T>> extends Iterable<T> {

    boolean isEmpty();

    void add(T element);

    int contains(T element);

    boolean remove(int index);

    default boolean removeElement(T element) {
        int index = contains(element);
        if(index != -1) {
            return remove(index);
        }
        return false;
    }

}

