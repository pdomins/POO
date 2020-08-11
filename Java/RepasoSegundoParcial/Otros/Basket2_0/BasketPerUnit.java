package ar.itba.edu.POO.RepasoSegundoParcial.Otros.Basket2_0;

public class BasketPerUnit extends BasketElements{
    int units;

    public BasketPerUnit(Articles article, int units) {
        super(article);
        this.units = units;
    }
    public String makeString(){
        String string = article.getName() + ": " +
                units + " * $" + article.getPrice() + " = $" +
                getPrice();
        return string;
    }

    @Override
    public double getPrice() {
        return units*article.getPrice();
    }
}
