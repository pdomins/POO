package ar.itba.edu.POO.PrimerParcial.TP4.P6;

public abstract class DoubleExpression extends Expression {

    protected Expression value1, value2;

    public DoubleExpression(Expression exp1, Expression exp2) {
        this.value1 = exp1;
        this.value2 = exp2;
    }

}
