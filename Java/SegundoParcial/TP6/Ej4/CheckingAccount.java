package ar.itba.edu.POO.SegundoParcial.TP6.Ej4;

public class CheckingAccount extends BankAccount {

    private final double overdraft;

    public CheckingAccount(int id, double overdraft) {
        super(id);
        this.overdraft=overdraft;
    }

    @Override
    protected boolean canExtract(double amount) {
        return balance+overdraft-amount>=0;
    }

    public double getOverdraft(){
        return overdraft;
    }
}
