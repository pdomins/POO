package ar.itba.edu.POO.RepasoSegundoParcial.Ej7;

public class Clients {
    String name;
    int loanTime;

    public Clients(String name, loanType data) {
        this.name = name;
        this.loanTime = data.getLoanLength();
    }

    public String getName() {
        return name;
    }

    public int getLoanTime() {
        return loanTime;
    }
}
