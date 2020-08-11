package ar.itba.edu.POO.RepasoSegundoParcial.Otros.Basket2_0;

public class BasketPerWeight extends BasketElements {
    double amount;

    public BasketPerWeight(Articles article, double amount) {
        super(article);
        this.amount = amount;
    }
    public String makeString(){
        String string = article.getName() + ": " +
                amount + " * $" + article.getPrice() + " = $" +
                getPrice();
        return string;
    }

    @Override
    public double getPrice() {
        return amount*article.getPrice();
    }
}
