package ar.itba.edu.POO.SegundoParcial.TP6.Ej6;


import java.util.List;

public interface PersonCollection {

    void addPerson(Person aPerson);

    List<Person> findByLastName(String lastName);

    Person findByName(String firstName, String lastName);
}
