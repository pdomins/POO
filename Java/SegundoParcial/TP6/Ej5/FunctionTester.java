package ar.itba.edu.POO.SegundoParcial.TP6.Ej5;

import ar.itba.edu.POO.PrimerParcial.TP4.P2.LinearFunction;
import ar.itba.edu.POO.PrimerParcial.TP4.P2.QuadraticFunction;
import ar.itba.edu.POO.PrimerParcial.TP4.P2.SineFunction;

public class FunctionTester {
    public static void main(String[] args){
        CompositeFunction f1 = new CompositeFunction();
        f1.addFunction(new LinearFunction(2,0));
        f1.addFunction(new QuadraticFunction(1,0,0));
        System.out.println(f1.evaluate(1));
        System.out.println(f1.evaluate(2));
        CompositeFunction f2 = new CompositeFunction();
        f2.addFunction(new LinearFunction(2,0));
        f2.addFunction(new SineFunction());
        f2.addFunction(new LinearFunction(3,0));
        System.out.println(f2.evaluate(0));
        System.out.println(f2.evaluate(Math.PI / 4));

        CompositeFunction f3 = new CompositeFunction();
        System.out.println(f3.evaluate(1));
    }
}
