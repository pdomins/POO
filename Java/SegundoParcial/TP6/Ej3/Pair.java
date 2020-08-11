package ar.itba.edu.POO.SegundoParcial.TP6.Ej3;

public class Pair<A,B> {
    A elemA;
    B elemB;

    public Pair(A elemA, B elemB) {
        this.elemA = elemA;
        this.elemB = elemB;
    }

    public void setA(A elemA) {
        this.elemA = elemA;
    }

    public void setB(B elemB) {
        this.elemB = elemB;
    }

    @Override
    public String toString() {
        return "#" + elemA + "+" + elemB + "#";
    }
}
