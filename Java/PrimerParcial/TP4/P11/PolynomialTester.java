package ar.itba.edu.POO.PrimerParcial.TP4.P11;

public class PolynomialTester {
    public static void main(String[] args) throws InvalidGradeException, InvalidIndexException {
        Polynomial fourthGradePol = new Polynomial(4);
        fourthGradePol.set(2,3.1);
        fourthGradePol.set(3,2);
        System.out.println(fourthGradePol.evaluate(2));
        System.out.println(new Polynomial(3).evaluate(5));
        try{
            new Polynomial(-4);
        }catch (InvalidGradeException e){
            System.out.println(e.getMessage());
        }
        try{
            fourthGradePol.set(7,1.5);
        }catch (InvalidIndexException e){
            System.out.println(e.getMessage());
        }

    }
}
