package ar.itba.edu.POO.SegundoParcial.TP6.Ej9;

import java.util.Set;

public interface TimeSet<T> {
    void add(T elem, int hours, int minutes);
    void remove(T elem);
    int size();
    boolean contains(T elem);
    Set<T> retrieve(int hoursFrom, int minutesFrom, int hoursTo, int minutesTo);
}
