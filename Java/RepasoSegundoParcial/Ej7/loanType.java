package ar.itba.edu.POO.RepasoSegundoParcial.Ej7;

public enum loanType {
    STUDENT("Student",2),

    PRACTICAL("Professor",11),

    RESPONSIBLE("Professor",12),

    ASSISTANT("Professor",10);

    String rank;
    int loanLength;

    loanType(String rank, int loanLength) {
        this.rank = rank;
        this.loanLength = loanLength;
    }

    public int getLoanLength() {
        return loanLength;
    }
}
