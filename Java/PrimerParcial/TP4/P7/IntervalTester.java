package ar.itba.edu.POO.PrimerParcial.TP4.P7;

public class IntervalTester {
    public static void main(String[] args) {
        try {
            Interval interval = new Interval(0.17,10,3);
            System.out.println(interval.at(2));
            System.out.println(interval.indexOf(11.2));
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    }
