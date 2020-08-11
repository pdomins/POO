package ar.itba.edu.POO.PrimerParcial.TP4.P12;

public interface LinearList {
    void add(Object obj);
    Object get(int i);
    void set(int i, Object obj);
    void remove(int i);
    int indexOf(Object obj);
    int size();
}
