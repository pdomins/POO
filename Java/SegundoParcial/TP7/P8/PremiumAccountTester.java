package ar.itba.edu.POO.SegundoParcial.TP7.P8;

public class PremiumAccountTester {
    public static void main(String[] args){
        ShopDiscountsProvider shopDiscountsProvider = new ShopDiscountsProvider();
        shopDiscountsProvider.addShop("Falabella", 0.1D);
        shopDiscountsProvider.addShop("Nike", 0.15D);
        shopDiscountsProvider.addShop("Garbarino", 0.3D);
        PremiumAccount premiumAccount = new PremiumAccount(9999,5000,shopDiscountsProvider);
        premiumAccount.deposit(1000);
        premiumAccount.extract(150,"Nike");
        premiumAccount.extract(250,"Lacoste");
        premiumAccount.extract(50,"Starbucks");
        premiumAccount.extract(150,"Nike");
        premiumAccount.showMovements();
    }
}
