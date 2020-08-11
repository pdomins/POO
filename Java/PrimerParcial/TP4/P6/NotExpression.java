package ar.itba.edu.POO.PrimerParcial.TP4.P6;

public class NotExpression extends Expression {

    Expression expression;

    public NotExpression(Expression exp) {
       this.expression = exp;
    }

    @Override
    public boolean evaluate() {
        return !(this.expression.evaluate());
    }


}
