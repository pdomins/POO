package ar.itba.edu.PrimerParcial.P3;

public enum PizzaType {
    PARRILLA("a la Parilla", 150),
    HORNO("al Horno ",100);

    String name;
    int price;

    PizzaType(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public int getPrice(){
        return price;
    }

    public String toString(){
        return name;
    }
}
