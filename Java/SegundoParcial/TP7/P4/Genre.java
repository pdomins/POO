package ar.itba.edu.POO.SegundoParcial.TP7.P4;

public enum Genre {
    FANTASY("Fantasy"),
    DRAMA("Drama"),
    CHILDREN("Children"),
    FICTION("Fiction");

    public String genreName;

    Genre(String genreName) {
        this.genreName = genreName;
    }

    public String getGenreName() {
        return genreName;
    }

}
