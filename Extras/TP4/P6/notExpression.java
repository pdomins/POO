package ar.itba.edu.TP4.P6;

public class notExpression extends Expression {
    Expression exp;

    public notExpression(Expression exp) {
        this.exp = exp;
    }

    @Override
    boolean evaluate() {
        return !exp.evaluate();
    }
}
