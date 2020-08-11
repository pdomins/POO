package ar.itba.edu.POO.PrimerParcial.Taller.GenericsList;


/**
 * Lista de enteros con repetidos
 */
public interface List<E> {

    boolean isEmpty();

    void add(E element);

    int contains(E element);

    boolean remove(int index);

    default boolean removeElement(E element) {
        int index = contains(element);
        if(index != -1) {
            return remove(index);
        }
        return false;
    }

}
