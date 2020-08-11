package ar.itba.edu.POO.PrimerParcial.TP4.P15;

public enum BasicOperation implements Operation{
    SUM("+"){
        public double apply(double x, double y){
            return x + y;
        }},
    SUBSTRACT("-"){
        public double apply(double x, double y){
            return x - y;
        }},
    MULTIPLY("*"){
        public double apply(double x, double y){
            return x * y;
        }},
    DIVIDE("/"){
        public double apply(double x, double y){
            return x / y;
        }};

    private final String symbol;

    BasicOperation(String s) {
    this.symbol= s;
    }
    @Override
    public String toString(){
        return symbol;
    }

    public abstract double apply(double x, double y);
}
