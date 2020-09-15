package ar.itba.edu.PrimerParcial.P4;

public class A {
    public A() {
    }

    int m1(){
        return 7;
    }
    int m2(){
        return this.m3();
    }
    int m3(){
        return m1();
    }
}
