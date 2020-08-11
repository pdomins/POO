package ar.itba.edu.POO.RepasoSegundoParcial.Otros.Basket2_0;

public abstract class BasketElements {
    Articles article;

    public BasketElements(Articles article) {
        this.article = article;
    }
    public abstract String makeString();

    public abstract double getPrice();
}
