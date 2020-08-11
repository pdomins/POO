package ar.itba.edu.POO.RepasoSegundoParcial.Otros.BookingCentral;

public class BlackListedCustomerException extends RuntimeException {

    public BlackListedCustomerException(String message) {
        super(message);
    }
}
