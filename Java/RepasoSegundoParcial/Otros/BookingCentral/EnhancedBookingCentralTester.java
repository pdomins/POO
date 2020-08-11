package ar.itba.edu.POO.RepasoSegundoParcial.Otros.BookingCentral;

public class EnhancedBookingCentralTester {
    public static void main(String[] args){
        BookingCentral central = new EnhancedBookingCentral(2,1);
        central.addEvent(new Event("Evento 1",10));
        central.addEvent(new Event("Evento 2",10));
        central.addEvent(new Event("Evento 3",10));
        central.addEvent(new Event("Evento 4",10));
        central.addEvent(new Event("Evento 5",10));
        central.addEvent(new Event("Evento 6",10));

        central.book("Evento 1","Mariano", 1);
        central.book("Evento 2", "Mariano",1);
        try {
            central.book("Evento 3", "Mariano",1);
        }catch(BlackListedCustomerException e){
            System.out.println(e.getMessage());
        }
        central.buy("Evento 3","Mariano", 1);
        try {
            central.book("Evento 4", "Mariano",1);
        }catch(BlackListedCustomerException e){
            System.out.println(e.getMessage());
        }
         central.confirm("Evento 1", "Mariano");
         central.book("Evento 4","Mariano",1);
        central.confirm("Evento 4", "Mariano");
        central.cancel("Evento 2","Mariano");
        try {
            central.book("Evento 5", "Mariano",1);
        }catch(BlackListedCustomerException e){
            System.out.println(e.getMessage());
        }
        central.buy("Evento 5","Mariano",1);
        central.book("Evento 6", "Mariano",1);
        central.printConfirmations();
    }
}
