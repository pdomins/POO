package ar.itba.edu.POO.PrimerParcial.TP4.P5;

abstract class Text implements HTMLText{

    HTMLText string;

    public Text(HTMLText text) {
        this.string = text;
    }
    @Override
    public String toString(){
        return source();
    }
}