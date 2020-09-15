package ar.itba.edu.TP4.P3;

public class FunctionTester {
    public static void main(String[] args){
        Function f1 = new LinearFunction(2,0);
        Function f2 = new QuadraticFunction(1,0,0);
        Function f3 = new CompositeFunction(f1,f2);
        System.out.println(f3.evaluate(1));
        System.out.println(f3.evaluate(2));
        Function f4 = new SineFunction();
        Function f5 = new CompositeFunction(f1,f4);
        Function f6 = new CompositeFunction(f5,f1);
        System.out.println(f6.evaluate(0));
        System.out.println(f6.evaluate(Math.PI / 4.0));
    }
}
