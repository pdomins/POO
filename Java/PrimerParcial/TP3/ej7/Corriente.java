package ar.itba.edu.POO.PrimerParcial.TP3.ej7;

import java.util.Objects;

public class Corriente extends Account{
    int ID;

    public Corriente(int ID, double balance) {
        this.balance= balance;
        this.ID = ID;
    }

    @Override
    protected double extract(double val) {
        balance-=val;
        return balance;
    }

    public int getID() {
        return ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Corriente)) return false;
        Corriente corriente = (Corriente) o;
        return ID == corriente.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    @Override
    public int compareTo(Account account) {
        return Integer.compare(this.ID,account.getID());
    }
}