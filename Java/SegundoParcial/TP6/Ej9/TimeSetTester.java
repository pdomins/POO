package ar.itba.edu.POO.SegundoParcial.TP6.Ej9;

public class TimeSetTester {
    public static void main(String[] args){
        TimeSet<String> timeSet = new TimeSetImpl<>();
        timeSet.add("Taller POO",17,0);
        timeSet.add("Taller PI",13,0);
        timeSet.add("Clase POD",18,30);
        System.out.println(timeSet.size());
        System.out.println(timeSet.contains("Taller POO"));
        System.out.println(timeSet.retrieve(12,0,17,0));
        timeSet.remove("Clase POD");
        System.out.println(timeSet.size());
        System.out.println(timeSet.retrieve(17,30,18,30));
    }
}
