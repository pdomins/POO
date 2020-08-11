package ar.itba.edu.POO.SegundoParcial.TP6.Ej3;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class PairCyclicIterator<T> implements Iterator<Pair<T,T>> {
    Collection<T> myCol;
    Iterator<T> myIt;


    public PairCyclicIterator(Collection<T> myCol) {
        this.myCol = myCol;
        myIt = myCol.iterator();
    }

    @Override
    public boolean hasNext() {
        return myCol.size() != 0;
    }

    @Override
    public Pair<T,T> next(){
        if (!hasNext()){
            throw new NoSuchElementException();
        }
        return new Pair<>(checkNext(),checkNext());
    }
    private T checkNext(){
        if (!myIt.hasNext()) {
            myIt = myCol.iterator();
        }
        return myIt.next();
    }
}
