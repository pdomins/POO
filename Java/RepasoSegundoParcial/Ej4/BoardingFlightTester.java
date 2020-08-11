package ar.itba.edu.POO.RepasoSegundoParcial.Ej4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class BoardingFlightTester {
    public static void main(String[] args){
        PassengerCategory[] categories = PassengerCategory.values();
        System.out.println(Arrays.toString(categories));
        Arrays.sort(categories);
        System.out.println(Arrays.toString(categories));
        System.out.println("----------");
        BoardingFlight rowBoardingFlight = new RowBoardingFlight();
        rowBoardingFlight.addForBoarding("Passenger 3", 10, PassengerCategory.ECONOMY);
        rowBoardingFlight.addForBoarding("Passenger 2", 5, PassengerCategory.RUBY);
        rowBoardingFlight.addForBoarding("Passenger 1", 15, PassengerCategory.ECONOMY);
        rowBoardingFlight.addForBoarding("Passenger 4", 5, PassengerCategory.EMERALD);
        Iterator<String> rowIterator = rowBoardingFlight.boardingCallIterator();
        while (rowIterator.hasNext()){
            System.out.println(rowIterator.next());
        }
        try{
            rowIterator.next();
        }catch (NoSuchElementException ex){
            System.out.println("No more elements");
        }
        System.out.println("----------");
        BoardingFlight categoryBoardingFlight = new CategoryBoardingFlight();
        categoryBoardingFlight.addForBoarding("Passenger 3", 10, PassengerCategory.ECONOMY);
        categoryBoardingFlight.addForBoarding("Passenger 2", 15, PassengerCategory.RUBY);
        categoryBoardingFlight.addForBoarding("Passenger 1", 15, PassengerCategory.ECONOMY);
        categoryBoardingFlight.addForBoarding("Passenger 4", 5, PassengerCategory.EMERALD);
        Iterator<String> categoryIterator = categoryBoardingFlight.boardingCallIterator();
        while(categoryIterator.hasNext()){
            System.out.println(categoryIterator.next());
        }
        try{
            categoryIterator.next();
        }catch(NoSuchElementException ex){
            System.out.println("No more Elements");
        }
     }
    }
