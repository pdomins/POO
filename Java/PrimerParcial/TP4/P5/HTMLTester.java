package ar.itba.edu.POO.PrimerParcial.TP4.P5;

public class HTMLTester{
    public static void main(String[] arg){
        PlainText text = new PlainText("Hola");
     //   PlainText text2 = new PlainText("Adios");
        //System.out.println(text);
        HTMLText boldText = new BoldText(text);
        HTMLText italicText = new ItalicText(text);
        System.out.println(boldText);
        System.out.println(italicText);
        HTMLText boldItalicText = new BoldText(italicText);
        System.out.println(boldItalicText);
        text.setText("ITBA");
        System.out.println(boldText);
        System.out.println(italicText);
        System.out.println(boldItalicText);
        HTMLText linkText = new LinkText(text,"itba.edu.ar");
        HTMLText linkBoldText1 = new LinkText(boldItalicText,"itba.edu.ar");
        HTMLText linkBoldText2 = new BoldText(linkText);
        System.out.println(linkText);
        System.out.println(linkBoldText1);
        System.out.println(linkBoldText2);
        text.setText("Ejemplo");
        System.out.println(linkBoldText1);
        System.out.println(linkBoldText2);



    }
}