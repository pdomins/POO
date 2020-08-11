package ar.itba.edu.POO.SegundoParcial.TP6.Ej4;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(int ID){
        super(ID);
    }
    @Override
    protected boolean canExtract(double amount) {
        return balance-amount >= 0;
    }
}
