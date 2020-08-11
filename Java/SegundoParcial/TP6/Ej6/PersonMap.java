package ar.itba.edu.POO.SegundoParcial.TP6.Ej6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonMap implements PersonCollection {
    Map<String, Map<String,Person>> myMap = new HashMap<>();
    @Override
    public void addPerson(Person aPerson) {
        if (!myMap.containsKey(aPerson.getLastName()))
        myMap.put(aPerson.getLastName(), new HashMap<>());

        myMap.get(aPerson.getLastName()).put(aPerson.getFirstName(), aPerson);
    }

    @Override
    public List<Person> findByLastName(String lastName) {
        return new ArrayList<>(myMap.get(lastName).values());
    }

    @Override
    public Person findByName(String firstName, String lastName) {
        return  myMap.get(lastName).get(firstName);
    }
}
