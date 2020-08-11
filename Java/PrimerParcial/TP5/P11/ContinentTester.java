package ar.itba.edu.POO.PrimerParcial.TP5.P11;

import java.util.Arrays;

public class ContinentTester {
    public static void main(String[] args){
        Continent[] continents = new Continent[]{
                Continent.OCEANIA,
                Continent.AMERICA,
                Continent.EUROPE};
      /*  Arrays.sort(continents, new Comparator<Continent>() {
            @Override
            public int compare(Continent c1, Continent c2) {
                return Integer.compare(c1.getPopulation(),c2.getPopulation());
            }
        });

       */
        Arrays.sort(continents, (o1,o2)-> Integer.compare(o1.getPopulation(),o2.getPopulation()) );
       // Arrays.sort(continents, Comparator.comparingInt(Continent::getPopulation));

        for (Continent continent : continents){
            System.out.println(continent);
        }

    }
}
