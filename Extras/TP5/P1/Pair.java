package ar.itba.edu.TP5.P1;

import java.util.Objects;

public class Pair<A extends Comparable<? super A>,B extends Comparable<? super B>> implements Comparable<Pair<A,B>> {
    A a;
    B b;

    public Pair(A a, B b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s]",a,b);
    }

    public void setA(A a) {
        this.a = a;
    }

    public void setB(B b) {
        this.b = b;
    }

    public A getA() {
        return a;
    }

    public B getB() {
        return b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> that = (Pair<?, ?>) o;
        return Objects.equals(a, that.a) &&
                Objects.equals(b, that.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public int compareTo(Pair<A, B> abPair) {
        int cmp = this.a.compareTo(abPair.a);
        if (cmp == 0 ){
            cmp = this.b.compareTo(abPair.b);
        }
        return cmp;
    }
}
