package ar.itba.edu.Parciales.PrimerParcial.Varios;


import java.util.Arrays;

public class CiclicIteratorTester {
    public static void main(String[] args){
        String[] words = new String[]{"hola","que","tal"};
        CyclicWindowIterator<String> iterator = new CyclicWindowIterator<>(words,2);
        for (int i = 0 ; i < 5; i++){
            System.out.println(Arrays.toString(iterator.next()));
        }
    }
}
