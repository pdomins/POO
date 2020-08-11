package ar.itba.edu.POO.RepasoSegundoParcial.Ej4;

public class PassengerData implements Comparable<PassengerData> {
    String PassengerNumber;
    int SeatNumber;
    PassengerCategory category;

    public PassengerData(String passengerNumber, int seatNumber, PassengerCategory category) {
        PassengerNumber = passengerNumber;
        SeatNumber = seatNumber;
        this.category = category;
    }

    public String getPassengerNumber() {
        return PassengerNumber;
    }

    public int compareByCategory(PassengerData passenger){
        int cmp =Integer.compare(this.category.getPriority(), passenger.category.getPriority());
        if (cmp == 0){
            cmp = this.PassengerNumber.compareTo(passenger.PassengerNumber);
        }
        return cmp;
    }

    public int compareBySeatNumber(PassengerData passengerData) {
        int cmp =  Integer.compare(this.SeatNumber,passengerData.SeatNumber);
        if (cmp == 0){
            cmp = this.PassengerNumber.compareTo(passengerData.PassengerNumber);
        }
        return cmp;
    }

    @Override
    public int compareTo(PassengerData passengerData) {
        int cmp = this.PassengerNumber.compareTo(passengerData.PassengerNumber);
        if (cmp == 0){
            cmp = Integer.compare(this.SeatNumber,passengerData.SeatNumber);
            if (cmp == 0){
                cmp =Integer.compare(this.category.getPriority(), passengerData.category.getPriority());
            }
        }
        return cmp;
    }

}
