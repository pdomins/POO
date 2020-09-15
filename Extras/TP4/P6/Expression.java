package ar.itba.edu.TP4.P6;

public abstract class Expression {
    abstract boolean evaluate();

    public Expression not(){
        return new notExpression(this);
    }
    public Expression or(Expression e){
        return new orExpression(this,e);
    }
    public Expression and(Expression e){
        return new andExpression(this,e);
    }

}
