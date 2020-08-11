package ar.itba.edu.POO.PrimerParcial.TP5.P3;

public class GenericListTesting {
    public static void main (String[] args){
        GenericList<Double> myList = new GenericList<>();
        for (double i = 0; i < 10; i++){
            myList.add(i);
        }
        myList.set(6,50.0);
        for (int i = 0; i < myList.size(); i ++){
            System.out.print(myList.get(i)+" ");
        }
        System.out.println();
        System.out.println("My list size "+myList.size());
        myList.remove(6);
        for (int i = 0; i < myList.size(); i ++){
            System.out.print(myList.get(i)+" ");
        }
        System.out.println();
        for (double i = 0; i < 10; i++){
            System.out.println("Element "+i+" is in position "+myList.indexOf(i));
        }
    }
}
