package ar.itba.edu.POO.PrimerParcial.TP4.P11;

public class Polynomial implements Function{

    private double[] polynomial;
    int degree;
    double value;

    public Polynomial(int degree)throws InvalidGradeException {
        if (degree <= 0)
            throw new InvalidGradeException();
        this.degree = degree;
        this.polynomial = new double[this.degree];
    }

    public void set(int position, double value) throws InvalidIndexException{
        if (position > degree)
            throw new InvalidIndexException();
        polynomial[position]=value;
    }

    @Override
    public double evaluate(double x) {
        value = polynomial[0];
        for (int i = 1; i < degree; i++){
            value+= Math.pow(x,i)*polynomial[i];
        }
        return value;
    }
}
