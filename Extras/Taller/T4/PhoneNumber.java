package ar.itba.edu.Taller.T4;

public class PhoneNumber implements Comparable<PhoneNumber> {
    private int areaCode;
    private int prefix;
    private Integer lineNumber;

    public PhoneNumber(int areaCode, int prefix, int lineNumber) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNumber = lineNumber;
    }

    @Override
    public String toString() {
        return areaCode +
                "-" + prefix +
                "-" + lineNumber;
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
    public int compareTo(PhoneNumber phoneNumber) {
        int cmp = Integer.compare(areaCode,phoneNumber.areaCode);
        if (cmp == 0){
            cmp = Integer.compare(prefix,phoneNumber.prefix);
        } if (cmp == 0){
            cmp =lineNumber.compareTo(phoneNumber.lineNumber);
        }
        return cmp;
    }
}
