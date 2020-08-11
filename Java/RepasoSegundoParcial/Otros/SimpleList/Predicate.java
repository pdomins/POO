package ar.itba.edu.POO.RepasoSegundoParcial.Otros.SimpleList;

public interface Predicate<E,T> {
    public E apply(E valor, T elem);
}
