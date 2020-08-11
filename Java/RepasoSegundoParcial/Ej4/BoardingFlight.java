package ar.itba.edu.POO.RepasoSegundoParcial.Ej4;

import java.util.*;

public abstract class BoardingFlight{

    Set<PassengerData> boardingSet;

    protected void setComparator(Comparator<PassengerData> comparator) {
        this.boardingSet = new TreeSet<>(comparator);
    }

    public void addForBoarding(String passengerNumber, int SeatNumber, PassengerCategory category){
            boardingSet.add(new PassengerData(passengerNumber, SeatNumber,category));
    }

    public Iterator<String> boardingCallIterator() {

        return new Iterator<String>() {
        Iterator<PassengerData> iterableSet = boardingSet.iterator();
        @Override
        public boolean hasNext() {
            return iterableSet.hasNext();
        }

        @Override
        public String next() {
            if (!hasNext())
                throw new NoSuchElementException();
            return iterableSet.next().getPassengerNumber();
        }

        };
    }
}
