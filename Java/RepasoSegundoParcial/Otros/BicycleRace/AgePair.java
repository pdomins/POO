package ar.itba.edu.POO.RepasoSegundoParcial.Otros.BicycleRace;

public class AgePair {
    int minAge, maxAge;

    public AgePair(int minAge, int maxAge) {
        this.minAge = minAge;
        this.maxAge = maxAge;
    }
    public boolean fitsAge(Participant participant){
        return participant.getAge() >= minAge && participant.getAge() <= maxAge;
    }
}
