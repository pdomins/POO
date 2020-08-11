package ar.itba.edu.POO.RepasoSegundoParcial.Ej1;

import java.util.List;
import java.util.Map;

public interface SimpleList<T> extends List<T> {
    public <E> Map<E,T> toMap(Expression<E,T> exp);
}
