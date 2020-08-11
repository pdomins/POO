package ar.itba.edu.POO.SegundoParcial.TP6.Ej6;

import java.time.LocalDate;
import java.util.Objects;

public class Person {
    private final String firstName, lastName;
    private final LocalDate bornDate;

    public Person(String firstName, String lastName, LocalDate bornDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bornDate = bornDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        if (!Objects.equals(firstName, person.firstName))
               return false;
        return  Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bornDate=" + bornDate +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
