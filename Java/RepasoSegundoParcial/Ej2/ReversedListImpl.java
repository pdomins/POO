package ar.itba.edu.POO.RepasoSegundoParcial.Ej2;
import java.util.*;

public class ReversedListImpl<T extends Comparable<T>> extends LinkedList<T> implements ReversedList<T> {

    @Override
    public Iterator<T> defaultIterator() {
        return super.iterator();
    }

    @Override
    public Iterator<T> iterator(){
        return descendingIterator();
    }

}
