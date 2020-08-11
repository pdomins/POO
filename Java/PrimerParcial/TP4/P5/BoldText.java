package ar.itba.edu.POO.PrimerParcial.TP4.P5;

public class BoldText extends Text {

    public BoldText(HTMLText text) {
       super(text);
    }

    @Override
    public String source() {
        return "<b>" + string + "<b/>";
    }

}
