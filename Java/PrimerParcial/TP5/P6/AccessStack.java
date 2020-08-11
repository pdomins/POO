package ar.itba.edu.POO.PrimerParcial.TP5.P6;

public class AccessStack<E> extends ArrayStack<E> implements AccessibleStack<E> {

    public int timesPush,timesPop;

    public AccessStack() {
    }

    public int getPush(){
        return timesPush;
    }
    public int getPop(){
        return timesPop;
    }

    @Override
    public E pop() {
        E elem = super.pop();
        timesPop++;
        return elem;
    }
    @Override
    public void push(E elem) {
        timesPush = dim+timesPop;
    }

    }
