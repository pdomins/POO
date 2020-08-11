package ar.itba.edu.POO.RepasoSegundoParcial.Otros.Basket;


public class BasketTester {
    public static void main(String[] args){

        Articles book = new perUnit("El Aleph - Borges", 235.00);
        Articles bean = new perWeight("Porotos Blancos", 80.0);
        Articles express = new Service("Envio Express", 145.50);

        Basket basket = new Basket("Juana Saldivar").add(book,2)
                .add(bean, 0.75).add(express);

        bean.setPrice(90.0);

        System.out.print(basket);
        System.out.println("-------");
        System.out.println(basket.getCost());

    }
}
