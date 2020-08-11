package ar.itba.edu.POO.PrimerParcial.TP4.P15;

public enum ExtendedOperation implements Operation{
    POW("^"){
        public double apply(double x, double y){
            return Math.pow(x,y);
        }},
    REMAINDER("%"){
        public double apply(double x, double y){
            return x % y;
        }};

    private final String symbol;

    ExtendedOperation(String s) {
        this.symbol= s;
    }
    @Override
    public String toString(){
        return symbol;
    }

    public abstract double apply(double x, double y);
}
