package ar.itba.edu.Taller.T5;


public class RangeTester {
    public static void main(String[] args){
        Range myRange = new Range(1,10);
        for (Integer aux : myRange){
            System.out.println(aux);
        }
    }
}
