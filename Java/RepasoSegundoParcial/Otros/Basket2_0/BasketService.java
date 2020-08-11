package ar.itba.edu.POO.RepasoSegundoParcial.Otros.Basket2_0;

public class BasketService extends BasketElements {

    public BasketService(Articles article) {
        super(article);
    }

    public String makeString(){
        return article.getName() +": $" + getPrice();
    }

    @Override
    public double getPrice() {
        return article.getPrice();
    }
}
