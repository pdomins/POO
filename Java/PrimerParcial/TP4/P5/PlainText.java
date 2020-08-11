package ar.itba.edu.POO.PrimerParcial.TP4.P5;

public class PlainText implements HTMLText{

    public String string;

    public PlainText(String text) {
        this.string=text;
    }
    public String source() {
        return string;
    }
    void setText(String text) {
        this.string=text;
    }
    @Override
    public String toString(){
        return source();
    }

}