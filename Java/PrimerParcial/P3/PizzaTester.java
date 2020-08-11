package ar.itba.edu.POO.PrimerParcial.P3;

public class PizzaTester {
    public static void main(String[] args){
        Pizza pizza1 = new Pizza(PizzaType.valueOf("PARILLA"), new Toppings[]{Toppings.valueOf("TOMATE")});
        Pizza pizza2 = new Pizza(PizzaType.valueOf("PARILLA"), new Toppings[]{Toppings.valueOf("TOMATE"),Toppings.valueOf("CEBOLLA"),Toppings.valueOf("EXTRAQUESO")});
        Pizza pizza3 = new Pizza(PizzaType.valueOf("HORNO"), new Toppings[]{Toppings.valueOf("CEBOLLA"),Toppings.valueOf("EXTRAQUESO")});

        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);

    }
}
