package ar.itba.edu.POO.RepasoSegundoParcial.Ej4;


public class CategoryBoardingFlight extends BoardingFlight {
    public CategoryBoardingFlight() {
        setComparator(PassengerData::compareByCategory);
    }

}
