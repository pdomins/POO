package ar.itba.edu.TP4.P3;

public class CompositeFunction implements Function {
    Function f1,f2;

    public CompositeFunction(Function f1, Function f2) {
        this.f1 = f1;
        this.f2 = f2;
    }
    public double evaluate(double x){
        return f2.evaluate(f1.evaluate(x));
    }
}
