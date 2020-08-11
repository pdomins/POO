package ar.itba.edu.POO.PrimerParcial.TP5.P12;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LocalDateInterval implements Iterable<LocalDate> {

    private  LocalDate today;
    private LocalDate limit;
    private int interval;

    public LocalDateInterval(LocalDate today, LocalDate limit, int interval) {
        this.today = today;
        this.limit = limit;
        this.interval = interval;
    }

    @Override
    public Iterator<LocalDate> iterator() {
        return new Iterator<>() {

            private LocalDate current = today;
            @Override
            public boolean hasNext() {
                return (limit.isAfter(current.plusDays(interval)));
            }

            @Override
            public LocalDate next() {
                if (!hasNext()){
                    throw new NoSuchElementException();
                }
                LocalDate aux = current;
                current= current.plusDays(interval);
                return aux;
            }
        };
    }

}
