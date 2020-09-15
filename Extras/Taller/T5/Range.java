package ar.itba.edu.Taller.T5;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Range implements Iterable<Integer> {
    int start, end, step;

    public Range(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    public Range(int start, int end) {
       this(start,end,1);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int current;
            @Override
            public boolean hasNext() {
                return current < end;
            }

            @Override
            public Integer next() {
                if (!hasNext())
                    throw  new NoSuchElementException();
                int number = current;
                current+= step;
                return number;
            }};
    }
}
