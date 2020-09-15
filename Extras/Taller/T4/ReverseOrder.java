package ar.itba.edu.Taller.T4;

import java.util.Comparator;

public class ReverseOrder implements Comparator<PhoneNumber> {
    @Override
    public int compare(PhoneNumber o1, PhoneNumber o2) {
        int cmp = Integer.compare(o2.getAreaCode(),o1.getAreaCode());
        if (cmp == 0 ){
            cmp = Integer.compare(o2.getPrefix(),o1.getPrefix());
        }
        if (cmp == 0 ){
            cmp = Integer.compare(o2.getLineNumber(),o1.getLineNumber());
        }
        return cmp;
    }
}
