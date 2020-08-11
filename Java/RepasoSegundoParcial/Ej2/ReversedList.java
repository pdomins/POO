package ar.itba.edu.POO.RepasoSegundoParcial.Ej2;

import java.util.Iterator;
import java.util.List;

public interface ReversedList<T extends Comparable<T>> extends List<T>{
    public Iterator<T> defaultIterator();
}
