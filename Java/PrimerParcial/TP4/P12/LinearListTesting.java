package ar.itba.edu.POO.PrimerParcial.TP4.P12;

public class LinearListTesting {
    public static void main (String[] args){
        LinearListImp myList = new LinearListImp();
        for (int i = 0; i < 10; i++){
            myList.add(i*10);
        }
        myList.set(6,100);
        for (int i = 0; i < myList.size(); i ++){
            System.out.println(myList.get(i));
        }
        System.out.println(myList.size());
        myList.remove(6);
        for (int i = 0; i < myList.size(); i ++){
            System.out.println(myList.get(i));
        }
        for (int i = 0; i < 10; i++){
            System.out.println("INDEX OF");
            System.out.println(myList.indexOf(i*10));
        }
    }
}
