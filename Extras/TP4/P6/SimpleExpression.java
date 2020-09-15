package ar.itba.edu.TP4.P6;

public class SimpleExpression extends Expression {
    boolean exp;

    public SimpleExpression(boolean exp) {
        this.exp = exp;
    }

    @Override
    boolean evaluate() {
        return exp;
    }

    public void setExp(boolean exp) {
        this.exp = exp;
    }
}
