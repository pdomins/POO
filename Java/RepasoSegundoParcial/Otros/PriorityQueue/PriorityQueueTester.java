package ar.itba.edu.POO.RepasoSegundoParcial.Otros.PriorityQueue;

public class PriorityQueueTester {
    public static void main(String[] args){
        PriorityQueue<String> pq = new PriorityQueueImpl<>();
        pq.enqueue("Hola", 2);
        pq.enqueue("Chau", 5);
        pq.enqueue("Mundo", 2);
        pq.enqueue("ZZZZ", 1);
        pq.enqueue("Java", 1);
        pq.enqueue("Java", 5);
        pq.enqueue("Algo", 1);
        System.out.println(pq.dequeue());
        pq.enqueue("Otro", 1);
        System.out.println(pq.size());
        System.out.println(pq.size(2));
        while(!pq.isEmpty())
            System.out.println(pq.dequeue());
    }
}
