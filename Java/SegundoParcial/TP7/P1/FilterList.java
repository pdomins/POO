package ar.itba.edu.POO.SegundoParcial.TP7.P1;

import java.util.List;

public interface FilterList<T> extends List<T> {

    public FilterList<T> criteria(Expression<T> exp);
}
