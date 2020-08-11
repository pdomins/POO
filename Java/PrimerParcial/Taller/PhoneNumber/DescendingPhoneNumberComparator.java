package ar.itba.edu.POO.PrimerParcial.Taller.PhoneNumber;

import java.util.Comparator;

public class DescendingPhoneNumberComparator implements Comparator<PhoneNumber> {

    @Override
    public int compare(PhoneNumber t1, PhoneNumber t2) {
        int cmp = Integer.compare(t2.getAreaCode(), t1.getAreaCode());
        if (cmp == 0 ){
            cmp = Integer.compare(t2.getPrefix(),t1.getPrefix());
            if (cmp == 0){
                cmp = Integer.compare(t2.getLineNumber(),t1.getLineNumber());
            }
        }
        return cmp;
    }
}
