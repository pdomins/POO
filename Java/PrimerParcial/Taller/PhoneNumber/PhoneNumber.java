package ar.itba.edu.POO.PrimerParcial.Taller.PhoneNumber;

public class PhoneNumber implements Comparable<PhoneNumber> {
    private final int areaCode;
    private final int prefix;
    private final Integer lineNumber;

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "areaCode=" + areaCode +
                ", prefix=" + prefix +
                ", lineNumber=" + lineNumber +
                '}';
    }

    public PhoneNumber(int areaCode, int prefix, int lineNumber) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNumber = lineNumber;
    }


    public int getAreaCode() {
        return areaCode;
    }

    public int getPrefix() {
        return prefix;
    }

    public Integer getLineNumber() {
        return lineNumber;
    }

    @Override
    public int compareTo(PhoneNumber o) {
        int cmp = Integer.compare(this.areaCode, o.areaCode);
        if (cmp == 0){
            cmp = Integer.compare(prefix,o.prefix);
            if (cmp == 0){
                cmp =  lineNumber.compareTo(o.lineNumber);
            }
        }
        return cmp;
    }
}
