package ar.itba.edu.POO.PrimerParcial.Taller.Taller5;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Range implements Iterable<Integer> {

    private int start, step, end;

    public Range(int start, int step, int end){
        this.start = start;
        this.step = step;
        this.end = end;
    }
    public Range (int start, int end){
        this(start,1,end);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int current = start;
            @Override
            public boolean hasNext() {
                return current < end;
            }

            @Override
            public Integer next() {
                if (!hasNext())
                    throw new NoSuchElementException();
                int aux= current;
                current += step;
                return aux;
            }
        };
    }
}
