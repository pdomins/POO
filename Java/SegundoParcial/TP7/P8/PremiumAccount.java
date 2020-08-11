package ar.itba.edu.POO.SegundoParcial.TP7.P8;

import ar.itba.edu.POO.PrimerParcial.TP3.ej7.Account;

public class PremiumAccount extends Account {
    ShopDiscountsProvider myDiscounts;
    StringBuilder myExtractions;

    public PremiumAccount(int ID, int balance, ShopDiscountsProvider discountMap) {
        this.ID= ID;
        myExtractions= new StringBuilder("Movements for Account ");
        myExtractions.append(ID).append(System.lineSeparator());
        this.balance = balance;
        myDiscounts=discountMap;

    }

    @Override
    public void deposit(double val){
        super.deposit(val);
        myExtractions.append("Deposit $").append(val).append(System.lineSeparator());
    }
    @Override
    protected double extract(double val) {
        balance-=val;
        return balance;
    }

    @Override
    public int compareTo(Account account) {
        return Integer.compare(this.ID, account.ID);
    }

    public void extract(int extraction, String name) {
        double extractionAmount = extraction;
        if (myDiscounts.hasDiscount(name)){
            extractionAmount = extraction-(extraction * myDiscounts.getDiscount(name));
        }
        extract(extractionAmount);
        myExtractions.append("Extraction $").append(extractionAmount).append(" for shop ").append(name).append(System.lineSeparator());
    }

    public void showMovements() {
        System.out.println(myExtractions.toString());
        myExtractions.delete(0, myExtractions.length());
        myExtractions.append("Movements for Account ").append(ID).append(System.lineSeparator());
    }
}
