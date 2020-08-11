package ar.itba.edu.POO.SegundoParcial.TP6.Ej9;

import java.util.Objects;

public class TimeRange implements Comparable<TimeRange> {
    int hours, minutes;

    public TimeRange(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    @Override
    public int compareTo(TimeRange timeRange) {
        int cmp = Integer.compare(hours, timeRange.hours);
        if (cmp == 0)
            cmp = Integer.compare(minutes, timeRange.minutes);
        return cmp ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TimeRange)) return false;
        TimeRange timeRange = (TimeRange) o;
        return hours == timeRange.hours &&
                minutes == timeRange.minutes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hours, minutes);
    }
}
