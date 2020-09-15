package ar.itba.edu.Parciales.PrimerParcial.CanastaCompras;

public abstract class Articles {
    String name;
    double price;

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
