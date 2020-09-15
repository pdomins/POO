package ar.itba.edu.Parciales.PrimerParcial.CensureIterator;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CensureIteratorTester {
    public static void main(String[] args){


        Integer[] integers = new Integer[]{1,2,3};
        CensureIterator<Integer> integerCensureIterator = new CensureIterator<>(integers,-1);
        integerCensureIterator.censure(2).censure(4);
        iteratorPrinter(integerCensureIterator);
    }

    private static <T> void iteratorPrinter(Iterator<T> iterator){
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
    }
}

