package ar.itba.edu.POO.SegundoParcial.TP6.Ej5;

import ar.itba.edu.POO.PrimerParcial.TP4.P2.Function;
import java.util.ArrayList;
import java.util.List;

public class CompositeFunction implements Function {
    List<Function> myList = new ArrayList<>();

    public void addFunction(Function fx) {
        myList.add(fx);

    }

    @Override
    public double evaluate(double x) {
        if (myList.isEmpty())
            throw new IllegalStateException();
        double value = x;
        for(Function fx : myList){
            value = fx.evaluate(value);
        }
        return value;
    }
}
