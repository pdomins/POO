package ar.itba.edu.POO.PrimerParcial.TP4.P2;

public class QuadraticFunction implements Function {
    public double a, b, c;

    public QuadraticFunction(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double evaluate(double x) {
        return a * Math.pow(x, 2) + b * x + c;
    }
    @Override
    public String toString(){
        return a+"x^2 +"+b+"x"+c ;
    }
}