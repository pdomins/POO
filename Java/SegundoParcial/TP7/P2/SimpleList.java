package ar.itba.edu.POO.SegundoParcial.TP7.P2;

import java.util.List;

public interface SimpleList<T> extends List<T> {
    public <E> E reduce(E initialVal, Expression<E,T> exp );
}
