package ar.itba.edu.POO.PrimerParcial.TP4.P11;

public class InvalidIndexException extends Exception {

    private static final String MESSAGE = "Indice Invalido";

    public InvalidIndexException(){
        super(MESSAGE);
    }
}
