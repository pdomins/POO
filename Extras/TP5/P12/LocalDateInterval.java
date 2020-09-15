package ar.itba.edu.TP5.P12;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LocalDateInterval implements Iterable<LocalDate> {
    private final LocalDate date1;
    private final LocalDate date2;
    private final int increment;

    public LocalDateInterval(LocalDate date1, LocalDate date2, int increment) {
        this.date1 = date1;
        this.date2 = date2;
        this.increment = increment;
    }

    @Override
    public Iterator<LocalDate> iterator() {
        return new Iterator<>() {
            LocalDate iterator = date1;
            @Override
            public boolean hasNext() {
                return !iterator.plusDays(increment).isAfter(date2);
            }

            @Override
            public LocalDate next() {
                if (!hasNext())
                    throw new NoSuchElementException();
                return iterator = iterator.plusDays(increment);
            }
        };
    }
}
