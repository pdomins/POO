package ar.itba.edu.Parciales.PrimerParcial.reduceB;


import java.util.function.BinaryOperator;

public interface SimpleList<T> {

    void add(T elem);

    int size();

    boolean contains(T elem);

    T reduce(T initialVal, BinaryOperator<T> binaryOperator);
}
