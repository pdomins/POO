package ar.itba.edu.TP4.P6;

public abstract class BinaryClass extends Expression {
    Expression exp1, exp2;

    public BinaryClass(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    abstract boolean evaluate();
}
