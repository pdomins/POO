package ar.itba.edu.POO.SegundoParcial.TP6.Ej8;

public interface Bag<T extends Comparable<? super T>> {

    public void add(T elem);

    public int size();

    int sizeDistinct();

    int count(T elem);

    boolean contains(T elem);

    void remove(T elem);

}
