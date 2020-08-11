package ar.itba.edu.POO.PrimerParcial.TP4.P11;

public class InvalidGradeException extends Exception {
    private static final String MESSAGE = "Grado Invalido";

    public InvalidGradeException() {
        super(MESSAGE);
    }
}
