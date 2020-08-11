package ar.itba.edu.POO.RepasoSegundoParcial.Ej6;

public enum QuotaType {
    LIMITED(2,1),
    UNLIMITED(-1,-1);

    int read, write;

    QuotaType(int Readings, int Writings) {
        this.read = Readings;
        this.write = Writings;
    }

    public int getReads() {
        return read;
    }

    public int getWrites() {
        return write;
    }
}
