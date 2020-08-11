package ar.itba.edu.POO.SegundoParcial.TP7.P3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ConcatIteratorTester {
    public static void main(String[] args){
        List<String> list1=  Arrays.asList("a","b","c","d");
        List<String> list2=  Arrays.asList("1","2","3","4");
        List<String> list3=  Arrays.asList("alpha","beta");
        Iterator<String> iterator =new ConcatIterator<>( new ConcatIterator<>(list1.iterator(),list2.iterator()), list3.iterator());
        while (iterator.hasNext())
            System.out.print(iterator.next());
    }
}
