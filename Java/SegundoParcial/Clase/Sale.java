package ar.itba.edu.POO.SegundoParcial.Clase;

import java.time.LocalDate;

public class Sale {
    String description;
    LocalDate date;
    int qty;
    double amount;

    /**
     *
     * @param description Nombre del producto
     * @param date fecha de la venta
     * @param qty unidades vendidas
     * @param amount monto total de la venta
     */
    public Sale(String description, LocalDate date, int qty, double amount) {
        this.description = description;
        this.date = date;
        this.qty = qty;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public int getQty() {
        return qty;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return description +
                ", " + qty +
                ", " + amount;
    }
}

