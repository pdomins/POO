package ar.itba.edu.POO.PrimerParcial.TP3.ej7;

public class ej7 {
    public static void main(String[] args) throws RuntimeException{
        try {
            Corriente myCheckingAccount = new Corriente(1001, 50);
            myCheckingAccount.deposit(50.00);
            System.out.println(myCheckingAccount);
            myCheckingAccount.extract(150.00);
            System.out.println(myCheckingAccount);

            Ahorro mySavingsAccount = new Ahorro(1002);
            mySavingsAccount.deposit(100);
            System.out.println(mySavingsAccount);
            mySavingsAccount.extract(150);
            System.out.println(mySavingsAccount);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}