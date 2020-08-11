package ar.itba.edu.POO.RepasoSegundoParcial.Ej4;


public class RowBoardingFlight  extends BoardingFlight {
    public RowBoardingFlight() {
        setComparator(PassengerData::compareBySeatNumber);
    }
}
