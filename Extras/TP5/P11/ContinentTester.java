package ar.itba.edu.TP5.P11;

import ar.itba.edu.TP4.P14.Continent;

import java.util.Arrays;
import java.util.Comparator;

public class ContinentTester {
    public static void main(String[] args){
        Continent[] continents = new Continent[]{
                Continent.OCEANIA,
                Continent.AMERICA,
                Continent.EUROPE};

        /*
        Arrays.sort(continents, new Comparator<Continent>() {
            @Override
            public int compare(Continent continent, Continent t1) {
                return Integer.compare(continent.getPopulation(), t1.getPopulation());
            }
        });

         */
     //  Arrays.sort(continents, (o1,o2)-> Integer.compare(o1.getPopulation(), o2.getPopulation()));
        Arrays.sort(continents, Comparator.comparingInt(Continent::getPopulation));

        for (Continent continent : continents){
            System.out.println(continent);
        }
    }
}
