package ar.itba.edu.Taller.T4;

import java.util.Arrays;
import java.util.Comparator;

public class PhoneNumberTester {
    public static void main(String[] args){
        PhoneNumber[] myNumbers = new PhoneNumber[]{
              new PhoneNumber(49,123,214),
              new PhoneNumber(13,4324,342),
              new PhoneNumber(49,230,231)
        };
        Arrays.sort(myNumbers);
        System.out.println(Arrays.toString(myNumbers));
        Arrays.sort(myNumbers, Comparator.reverseOrder());
        System.out.println(Arrays.toString(myNumbers));
        Arrays.sort(myNumbers, new Comparator<PhoneNumber>() {
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
        });
        Arrays.sort(myNumbers, new ReverseOrder());

        Arrays.sort(myNumbers, (o1, o2) -> {
            int cmp = Integer.compare(o2.getAreaCode(),o1.getAreaCode());
            if (cmp == 0 ){
                cmp = Integer.compare(o2.getPrefix(),o1.getPrefix());
            }
            if (cmp == 0 ){
                cmp = Integer.compare(o2.getLineNumber(),o1.getLineNumber());
            }
            return cmp;
        });
    }
}
