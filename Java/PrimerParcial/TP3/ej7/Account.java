package ar.itba.edu.POO.PrimerParcial.TP3.ej7;

public abstract class Account implements Comparable<Account>{
    public double balance;
    public int ID;

    public void deposit(double val){
        balance+=val;

    }
    protected abstract double extract(double val);

    public double getBalance(){
        return balance;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString(){
        return String.format("Cuenta %d con saldo %.2f",ID,balance);
    }
}