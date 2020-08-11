package ar.itba.edu.POO.SegundoParcial.TP6.Ej10;

import java.util.Comparator;

public class MultiSortedCollectionTester {
    public static void main(String[] args){
        MultiSortedCollection<Person> m = new MultiSortedCollectionImpl<>();
        Comparator<Person> nameComparator = (o1,o2)->o1.getName().compareTo(o2.getName());
        m.add(nameComparator);
        Comparator<Person> ageComparator = (o1,o2)->o1.getAge()-(o2.getAge());
        m.add(ageComparator);
        m.add(new Person("Ana",15));
        m.add(new Person("Juan",20));
        m.add(new Person("Pedro",10));
        for (Person person : m.iterable(nameComparator)){
            System.out.println(person);
        }
        System.out.println();
        for (Person person : m.iterable(ageComparator)){
            System.out.println(person);
        }
        System.out.println();
        m.remove(new Person("Ana",15));
        for (Person person : m.iterable(ageComparator)){
            System.out.println(person);
        }



    }
}
