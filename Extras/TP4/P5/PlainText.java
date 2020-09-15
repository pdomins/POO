package ar.itba.edu.TP4.P5;

public class PlainText extends Text{
    String plain;

    public PlainText(String plain) {
        this.plain = plain;
    }


    public void setText(String plain) {
        this.plain = plain;
    }

    @Override
    public String source() {
        return plain;
    }
}
