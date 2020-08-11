package ar.itba.edu.POO.PrimerParcial.TP5.P3;

import java.util.Objects;

public class GenericNode<E> {
    private E head;
    private GenericNode<E> tail;

    public GenericNode(E head, GenericNode<E> tail) {
        this.head = head;
        this.tail = tail;
    }

    public Object getHead() {
        return head;
    }

    public void setHead(E head) {
        this.head = head;
    }

    public GenericNode<E> getTail() {
        return tail;
    }

    public void setTail(GenericNode<E> tail) {
        this.tail = tail;
    }


    @Override
    @SuppressWarnings("unchecked")
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GenericNode)) return false;
        GenericNode<E> that = (GenericNode<E>) o;
        return Objects.equals(head, that.head) &&
                Objects.equals(tail, that.tail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head, tail);
    }

    public String toString(){
        return (this.head).toString();
    }
}
