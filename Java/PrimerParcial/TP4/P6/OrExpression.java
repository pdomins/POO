package ar.itba.edu.POO.PrimerParcial.TP4.P6;

public class OrExpression extends DoubleExpression {
    public OrExpression(Expression expression, Expression exp) {
        super(expression,exp);
    }

    @Override
    public boolean evaluate() {
        return (value1.evaluate() || value2.evaluate());
    }
}
