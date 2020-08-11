package ar.itba.edu.POO.PrimerParcial.TP4.P2;

public class SineFunction implements Function{
    @Override
    public double evaluate(double x){
        return Math.sin(x);
    }
    @Override
    public String toString(){
        return "sin(x)" ;
    }
}