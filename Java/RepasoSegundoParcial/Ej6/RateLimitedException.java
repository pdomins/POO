package ar.itba.edu.POO.RepasoSegundoParcial.Ej6;

public class RateLimitedException extends RuntimeException {
    private static final String MESSAGE = "You have reached the maximum number of operations available daily";

    public RateLimitedException(){
        super(MESSAGE);
    }

}
