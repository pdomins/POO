package ar.itba.edu.POO.PrimerParcial.TP4.P12;

import java.util.Objects;

public class Node {
    private Object head;
    private Node tail;

    public Object getHead() {
        return head;
    }

    public void setHead(Object head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public Node(Object head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;
        Node node = (Node) o;
        return Objects.equals(head, node.head) &&
                Objects.equals(tail, node.tail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head, tail);
    }
    public String toString(){
        return (this.head).toString();
    }
}
