package ar.itba.edu.POO.RepasoSegundoParcial.Otros.PriorityQueue;

public interface PriorityQueue<E> {
    void enqueue(E element, int priority);
    E dequeue();
    boolean isEmpty();
    int size();
    int size(int priority);

}
