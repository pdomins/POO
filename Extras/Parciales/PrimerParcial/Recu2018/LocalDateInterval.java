package ar.itba.edu.Parciales.PrimerParcial.Recu2018;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LocalDateInterval implements Iterable<LocalDate>{
    LocalDate first, last;
    int step;

    public LocalDateInterval(LocalDate first, LocalDate last, int step) {
        this.first = first;
        this.last = last;
        this.step=step;
    }

    @Override
    public Iterator<LocalDate> iterator() {
        return new Iterator<>() {
            LocalDate current = first;
            @Override
            public boolean hasNext() {
                return !current.plusDays(step).isAfter(last);
            }

            @Override
            public LocalDate next() {
                if (!hasNext())
                    throw new NoSuchElementException();
                LocalDate aux = current;
                current = current.plusDays(step);
                return aux;
            }
        };
    }
}
