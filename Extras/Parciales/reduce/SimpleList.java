package ar.itba.edu.Parciales.reduce;


public interface SimpleList<T> {

    void add(T elem);

    int size();

    boolean contains(T elem);

    T reduce(T initialVal, Lambda<T> exp);
}
