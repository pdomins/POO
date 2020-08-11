package ar.itba.edu.POO.SegundoParcial.TP6.Ej6;

import java.time.LocalDate;

public class PersonTester {
    public static void main(String[] args){
        Person person1 = new Person("Paula","Domingues", LocalDate.now());
        Person person2 = new Person("Katia","Domingues", LocalDate.now());
        Person person3 = new Person("Matias","Domingues", LocalDate.now());
        Person person4 = new Person("Alejandra","Hernandez", LocalDate.now());
        Person person5 = new Person("Antonio","Domingues", LocalDate.now());
        Person person6 = new Person("Leopoldo","Hernandez", LocalDate.now());
        Person person7 = new Person("Sofia","Bolosis", LocalDate.now());

        PersonCollection myMap = new PersonMap();
        myMap.addPerson(person1);
        myMap.addPerson(person2);
        myMap.addPerson(person3);
        myMap.addPerson(person4);
        myMap.addPerson(person5);
        myMap.addPerson(person6);
        myMap.addPerson(person7);

        System.out.println(myMap.findByLastName("Domingues"));
        System.out.println(myMap.findByName("Leopoldo","Hernandez"));

    }
}
