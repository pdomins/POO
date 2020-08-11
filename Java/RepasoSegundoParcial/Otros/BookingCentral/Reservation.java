package ar.itba.edu.POO.RepasoSegundoParcial.Otros.BookingCentral;

public class Reservation {
    private String person;
    private Event event;
    private boolean confirmed;
    private int seats;

    public Reservation(String person, Event event, int seats) {
        this.person = person;
        this.event = event;
        this.confirmed=false;
        this.seats = seats;
    }
    public void confirm(){
        if (confirmed){
            throw new IllegalStateException("Reservation Already Confirmed");
        }
        confirmed=true;
    }
    public boolean isConfirmed(){
        return confirmed;
    }
    public Event getEvent(){
        return event;
    }

    public String getPerson() {
        return person;
    }

    public int getSeats() {
        return seats;
    }
    public void print(){
        System.out.println(event.getName()+" - "+ person);
    }
}
