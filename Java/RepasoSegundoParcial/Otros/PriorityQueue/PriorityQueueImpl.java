package ar.itba.edu.POO.RepasoSegundoParcial.Otros.PriorityQueue;

import java.util.*;

public class PriorityQueueImpl<E> implements PriorityQueue<E> {
    Map<Integer, List<E>> myMap = new HashMap<>();
    int minKey=-1;
    int size;

    @Override
    public void enqueue(E element, int priority) {
        myMap.putIfAbsent(priority, new ArrayList<>());
        myMap.get(priority).add(element);
        minKey= minKey==-1?priority:(Math.min(minKey, priority));
        size++;
    }

    @Override
    public E dequeue() {
        E aux = myMap.get(minKey).remove(0);
        if (myMap.get(minKey).size()==0){
            myMap.remove(minKey);
        }
        if (!myMap.containsKey(minKey) && !myMap.isEmpty()){
            Object[] auxArray = myMap.keySet().toArray();
            minKey = (int) auxArray[0];
        }
        size--;
        return aux;
    }

    @Override
    public boolean isEmpty() {
        return myMap.isEmpty();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int size(int priority) {
        return myMap.get(priority).size();
    }
}
