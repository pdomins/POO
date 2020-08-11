package ar.itba.edu.POO.RepasoSegundoParcial.Otros.BookingCentral;

import java.util.*;

public class EnhancedBookingCentral extends BookingCentral{
    int maxUnconfirmedBooking, maxCancellations;
    Map<String, BookingPair> myBookingCentral= new HashMap<>();
    Map<String, List<String>> myEvents = new HashMap<>();

    public EnhancedBookingCentral(int maxUnconfirmedBooking, int maxCancellations) {
        this.maxUnconfirmedBooking = maxUnconfirmedBooking;
        this.maxCancellations = maxCancellations;
    }
    public void book(String eventName, String person, int seats) {
        myBookingCentral.putIfAbsent(person, new BookingPair(maxUnconfirmedBooking,maxCancellations));
        myEvents.putIfAbsent(person, new ArrayList<>());
        if (!myBookingCentral.get(person).canBook()){
            throw new BlackListedCustomerException("Can't book: Person cannot have more than 2 pending reservation/s");
        }
        if (!myBookingCentral.get(person).canCancel()){
            throw new BlackListedCustomerException("Can't book: Person cannot have more than 1 cancellation/s");

        }
        myEvents.get(person).add(eventName);
        myBookingCentral.get(person).useBookingChance();
        super.book(eventName,person,seats);
    }
    public void buy(String eventName,String person, int seats){
        myBookingCentral.get(person).resetCancellations();
        if (myEvents.get(person).contains(eventName)){
            myEvents.get(person).remove(eventName);
            myBookingCentral.get(person).addBookingChance();
        }
        super.buy(eventName,person,seats);
    }
    public void confirm(String eventName, String person) {
        if (myEvents.get(person).contains(eventName)) {
            myEvents.get(person).remove(eventName);
            myBookingCentral.get(person).addBookingChance();
        }
        super.confirm(eventName,person);
    }
        public void cancel(String eventName, String person){
            if (myEvents.get(person).contains(eventName)){
                myEvents.get(person).remove(eventName);
                myBookingCentral.get(person).addBookingChance();
                myBookingCentral.get(person).useCancellingChance();
            }
            super.cancel(eventName,person);
        }




    }
