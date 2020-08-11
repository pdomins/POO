package ar.itba.edu.POO.PrimerParcial.TP4.P6;

public abstract class Expression{

    public abstract boolean evaluate();

    public  Expression not(){
        return new NotExpression(this);
    }

    public  Expression or(Expression exp){
        return new OrExpression(this,exp);
    }

    public Expression and(Expression exp){
        return new AndExpression(this,exp);
    }

}