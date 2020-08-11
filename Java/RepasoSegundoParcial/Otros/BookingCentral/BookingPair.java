package ar.itba.edu.POO.RepasoSegundoParcial.Otros.BookingCentral;

public class BookingPair {
    int elem1, elem2;
    private int final1, final2;

    public BookingPair(int elem1, int elem2) {
        this.elem1 = elem1;
        this.elem2 = elem2;
        final1=elem1;
        final2=elem2;
    }

    public int getBookings() {
        return elem1;
    }

    public int getCancellations() {
        return elem2;
    }

    public void useBookingChance(){
        elem1--;
    }
    public void useCancellingChance(){
        elem2--;
    }
    public boolean canBook(){
        return elem1>0;
    }
    public boolean canCancel(){
        return elem2>0;
    }
    public void resetCancellations(){
        elem2=final2;
    }
    public void addBookingChance(){
        elem1++;
    }
}
