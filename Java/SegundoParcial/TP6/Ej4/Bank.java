package ar.itba.edu.POO.SegundoParcial.TP6.Ej4;

import java.util.HashSet;
import java.util.Set;

public class Bank {

    Set<BankAccount> mySet = new HashSet<>();

    public void addAccount(BankAccount c1) {
        mySet.add(c1);
    }

    public int accountSize() {
        return mySet.size();
    }

    public void removeAccount(BankAccount c2) {
        mySet.remove(c2);
    }

    public double totalAmount() {
        double totalA=0;
        for (BankAccount ac : mySet)
            totalA+=ac.getBalance();
        return totalA;
    }
}
