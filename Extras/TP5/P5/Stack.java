package ar.itba.edu.TP5.P5;

public interface Stack<E> {

    void push(E elem);

    E pop();

    E peek();

    boolean isEmpty();

}
