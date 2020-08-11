package ar.itba.edu.POO.PrimerParcial.TP4.P5;

public class ItalicText extends Text{

    public ItalicText(HTMLText text) {
       super(text);
    }

    @Override
    public String source() {
        return "<i>"+string+"<i/>";
    }


}