package ar.itba.edu.POO.PrimerParcial.Taller.Taller5.OP1;

import java.util.Comparator;
//import java.util.Iterator;

public class IntegerListTester {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Comparator.<Integer>reverseOrder());
        System.out.println(integerList.isEmpty()); // true
        integerList.add(5);
        integerList.add(7);
        integerList.add(3);
        integerList.add(1);
        System.out.println(integerList.contains(3)); // 2
        System.out.println(integerList.removeElement(3)); // true
        System.out.println(integerList.contains(3)); // -1
        System.out.println(integerList.removeElement(3)); // false
        // Opción 1: Usando la sentencia forEach
        for(Integer element : integerList) {
            System.out.println(element);
        }
        // Opción 2: Usando el iterador
      /* Iterator<Integer> iterator = integerList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/
    }
}
