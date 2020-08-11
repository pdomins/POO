package ar.itba.edu.POO.SegundoParcial.TP7.P9;

public class NoCashException extends RuntimeException {
    private static final String MESSAGE = "The Cashier is out of Cash";

    public NoCashException() {
        super(MESSAGE);
    }
}
