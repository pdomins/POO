package ar.itba.edu.TP5.P13;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class IntervalIterator implements Iterator<Double> {
    private double current;
    private double end;
    private double increment;

    public IntervalIterator(double start, double end, double increment) {
        this.current = start;
        this.end = end;
        this.increment = increment;
    }

    @Override
    public boolean hasNext() {
        return current <= end ;
    }

    @Override
    public Double next() {
        if (!hasNext())
            throw new NoSuchElementException();
        double aux = current;
        current+=increment;
        return aux;
    }
}
