package ar.itba.edu.Parciales.PrimerParcial.Varios;

public enum PizzaType {
    PARRILLA("a la Parilla", 150),
    HORNO("al horno",100);

    public String name;
    public int price;

    PizzaType(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name ;
    }
}
