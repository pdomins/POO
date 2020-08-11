package ar.itba.edu.POO.PrimerParcial.TP4.P5;

public class LinkText extends Text {

    String source;

   public LinkText(HTMLText text,String source ) {
        super(text);
        this.source= source;
    }

    @Override
    public String source() {
       return "<a href:"+source+">"+string+"<a/>";
    }

}