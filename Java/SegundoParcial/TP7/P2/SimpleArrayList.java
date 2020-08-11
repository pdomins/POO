package ar.itba.edu.POO.SegundoParcial.TP7.P2;


import java.util.ArrayList;

public class SimpleArrayList<T> extends ArrayList<T> implements SimpleList<T> {

    @Override
    public <E> E reduce(E initialVal, Expression<E, T> exp) {
        for (T aux : this){
           initialVal = exp.apply(initialVal, aux);
        }
        return initialVal;
    }
}
