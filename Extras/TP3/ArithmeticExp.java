package ar.itba.edu.TP3;

public enum ArithmeticExp{
    ADD("+"){
        public double apply(double a, double b){
         return a+b;
        }},
    SUBSTRACT("-"){
        public double apply (double a, double b){
            return a-b;
        }};

    private final String symbol;

    ArithmeticExp(String symbol){
        this.symbol=symbol;
    }

    public abstract double apply(double a, double b);

    @Override
    public String toString() {
        return symbol;
    }
}
