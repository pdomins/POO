package ar.itba.edu.POO.PrimerParcial.Taller.Taller5.OP1;

public interface List<T> extends Iterable<T> {

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
