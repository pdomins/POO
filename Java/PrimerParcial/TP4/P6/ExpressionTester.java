package ar.itba.edu.POO.PrimerParcial.TP4.P6;

public class ExpressionTester{
    public static void main(String[] args){
        SimpleExpression exp1 = new SimpleExpression(true);
        SimpleExpression exp2 = new SimpleExpression(false);
        Expression exp3 = exp1.not();
        System.out.println(exp3.evaluate());
        exp1.setValue(false);
        System.out.println(exp3.evaluate());
    }
}