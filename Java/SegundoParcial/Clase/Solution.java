package ar.itba.edu.POO.SegundoParcial.Clase;

import java.time.LocalDate;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        // Lista de ventas de la cual queremos obtener el total de unidades y monto por producto
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = date1.minusDays(2);
        List<Sale> sales = Arrays.asList(
                new Sale("Tornillo", date1, 10, 11.00),
                new Sale("Clavo", date1, 3, 9.00),
                new Sale("Tornillo", date2, 1, 1.10),
                new Sale("Martillo", date1, 1, 150.00),
                new Sale("Tornillo", date1, 5, 9.50),
                new Sale("Serrucho", date1, 2, 1500.00),
                new Sale("Clavo", date2, 100, 88.00),
                new Sale("Martillo", date2, 1, 120.00),
                new Sale("Tornillo", date1, -1, -1.00)   // Una devoluvión
        );

        Map<String, Sale> myMap = new TreeMap<>();
        for (Sale sale : sales){
            if (myMap.containsKey(sale.getDescription())){
                Sale mapSale = myMap.get(sale.getDescription());
                Sale aux = new Sale(sale.getDescription(), sale.getDate(), sale.getQty()+mapSale.getQty(),sale.getAmount()+mapSale.getAmount());
                myMap.put(sale.getDescription(), aux);
            }else
                myMap.put(sale.getDescription(),sale);

        }

        for (String key : myMap.keySet()){
            System.out.println(myMap.get(key));
        }

        // Invocamos a un metodo que reciba la lista y nos permita obtener una coleccion con los siguientes datos en este orden
        // Clavo, 103, 97.00
        // Martillo, 2, 270.00
        // Serrucho, 2, 1500.00
        // Tornillo, 15, 20.60
    }
}
