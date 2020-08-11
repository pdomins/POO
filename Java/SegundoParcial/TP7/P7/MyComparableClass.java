package ar.itba.edu.POO.SegundoParcial.TP7.P7;

import java.util.Objects;

public class MyComparableClass implements Comparable<MyComparableClass>{

    public String sortableIdentifier;
    String name;

    public MyComparableClass(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyComparableClass)) return false;
        MyComparableClass that = (MyComparableClass) o;
        return Objects.equals(sortableIdentifier, that.sortableIdentifier) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sortableIdentifier, name);
    }

    @Override
    public int compareTo(MyComparableClass myComparableClass) {
        int cmp = this.sortableIdentifier.compareTo(myComparableClass.sortableIdentifier);
        if (cmp == 0)
            cmp = this.name.compareTo(myComparableClass.name);
        return cmp;
    }

    @Override
    public String toString() {
        return name+"- "+sortableIdentifier;
    }
}
