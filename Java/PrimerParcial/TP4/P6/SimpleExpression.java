package ar.itba.edu.POO.PrimerParcial.TP4.P6;

public class SimpleExpression extends Expression{

    private boolean value;

    public SimpleExpression(Boolean exp) {
        this.value = exp;
    }

    @Override
    public boolean evaluate(){
        return this.value;
    }
    public void setValue(Boolean exp){
        this.value=exp;
    }

}