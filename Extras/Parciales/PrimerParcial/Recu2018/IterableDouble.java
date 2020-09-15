package ar.itba.edu.Parciales.PrimerParcial.Recu2018;


import java.util.Iterator;

public interface IterableDouble<T> extends Iterable<T> {
    Iterator<T> defaultIterator();

}
