package ar.itba.edu.POO.PrimerParcial.TP3.ej7;

public class Ahorro extends Account{

    public Ahorro( int ID) {
        this.ID=ID;
    }
    public boolean canExtract(double val){
        return (balance - val) >= 0;
    }
    @Override
    protected double extract(double val) {
        if (!canExtract(val)) {
            throw new RuntimeException("You aiiiiiin't got no credit left to extract");
        }
        else
            balance-=val;
        return balance;
    }

    @Override
    public int compareTo(Account account) {
        return Integer.compare(this.ID, account.getID());
    }
}