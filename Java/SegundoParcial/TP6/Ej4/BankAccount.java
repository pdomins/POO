package ar.itba.edu.POO.SegundoParcial.TP6.Ej4;

import java.util.Objects;

public abstract class BankAccount {
    private final int ID;
    protected double balance;

    protected BankAccount(int ID){
        this.ID=ID;
    }
    public double deposit(double amount){
        return balance +=amount;
    }
    public double extract(double amount){
        if (canExtract(amount)){
            return balance-=amount;
        }
        return balance;
    }
    protected abstract boolean canExtract(double amount);

    public double getBalance(){
        return balance;
    }

    @Override
    public String toString() {
        return String.format("Cuenta con $d saldo %.2f",ID, balance);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankAccount)) return false;
        BankAccount that = (BankAccount) o;
        return ID == that.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }
}
