package ar.itba.edu.POO.PrimerParcial.Taller.PhoneNumber;

import java.util.Arrays;
import java.util.Comparator;

public class PhoneNumberTester {
    public static void main(String[] args){
        PhoneNumber[] phoneNumbers= new PhoneNumber[]{
                new PhoneNumber(54,11,123456789),
                new PhoneNumber(0,0,44556677),
                new PhoneNumber(54,11,987654321)
        };
        System.out.printf(Arrays.toString(phoneNumbers));
       //ordenamiento natural -> los elementos necesitan implementar comparable
        Arrays.sort(phoneNumbers);
        System.out.println();
        System.out.printf(Arrays.toString(phoneNumbers));

        //ordenamiento especifico
        Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
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
        });
        System.out.println();
        System.out.printf(Arrays.toString(phoneNumbers));


    }
}
