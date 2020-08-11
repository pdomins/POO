package ar.itba.edu.POO.SegundoParcial.TP7.P5;

import ar.itba.edu.POO.SegundoParcial.TP6.Ej8.Bag;

public interface IterableBag<T extends Comparable<? super T>> extends Bag<T> {

    Iterable<T> elements();

    Iterable<T> elementsDistinct();
}
