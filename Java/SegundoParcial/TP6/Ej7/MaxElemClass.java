package ar.itba.edu.POO.SegundoParcial.TP6.Ej7;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MaxElemClass{

    public static<T extends Comparable<? super T>> T getMaxElem(Collection<T> myCol){
        Iterator<T> myIt = myCol.iterator();
        T max;
        if (!myIt.hasNext())
            throw new NoSuchElementException();
        max = myIt.next();
        while (myIt.hasNext()){
            T aux = myIt.next();
            max = max.compareTo(aux)>0?max:aux;
        }
        return max;
    }
}
