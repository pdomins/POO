package ar.itba.edu.TP4.P6;

public class andExpression extends BinaryClass {

    public andExpression(Expression exp1, Expression exp2) {
        super(exp1, exp2);
    }

    @Override
    boolean evaluate() {
        return exp1.evaluate() && exp2.evaluate();
    }
}
