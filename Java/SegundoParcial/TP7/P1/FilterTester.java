package ar.itba.edu.POO.SegundoParcial.TP7.P1;



public class FilterTester {
    public static void main(String[] args){
        FilterList<Integer> myList = new ArrayFilterList<>();
        for (int i = 0; i < 11 ; i++){
            myList.add(i);
        }
        FilterList<Integer> newList = myList.criteria(x-> x % 2==0);
        System.out.println(newList);
    }
}
