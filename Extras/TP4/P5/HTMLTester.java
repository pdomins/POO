package ar.itba.edu.TP4.P5;

public class HTMLTester {
    public static void main(String[] args){
        PlainText text = new PlainText("Hola");
        HTMLText boldText = new BoldText(text);
        HTMLText italicText = new ItalicText(text);
        System.out.println(italicText);
        text.setText("ITBA");
        System.out.println(italicText);
        HTMLText boldItalicText = new BoldText(italicText);
        System.out.println(boldItalicText);
        HTMLText linkText = new LinkText(text, "itba.edu.ar");
        System.out.println(linkText);


    }
}
