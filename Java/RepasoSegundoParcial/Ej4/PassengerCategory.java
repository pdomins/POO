package ar.itba.edu.POO.RepasoSegundoParcial.Ej4;

public enum PassengerCategory {
    EMERALD(1),
    SAPPHIRE(2),
    RUBY(3),
    ECONOMY(4);

    int priorityNumber;
    PassengerCategory(int category) {
        priorityNumber = category;
    }

    public int getPriority() {
        return priorityNumber;
    }
}
