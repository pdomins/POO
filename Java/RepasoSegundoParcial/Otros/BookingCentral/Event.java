package ar.itba.edu.POO.RepasoSegundoParcial.Otros.BookingCentral;

import java.util.Objects;

public class Event {
    private String name;
    private int emptySeats;

    public Event(String name, int emptySeats) {
        this.name = name;
        this.emptySeats = emptySeats;
    }

    public String getName() {
        return name;
    }
    public void book(int seats){
        if (seats > emptySeats){
            throw new IllegalArgumentException("Event has not enough empty places");
        }
        this.emptySeats-=seats;
    }
    public void cancel(int seats){
        this.emptySeats+=seats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event)) return false;
        Event event = (Event) o;
        return Objects.equals(name, event.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
