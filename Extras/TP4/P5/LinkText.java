package ar.itba.edu.TP4.P5;

public class LinkText extends FormatText{

    public LinkText(HTMLText text, String format) {
        super(text, format);
    }

    @Override
    public String toString() {
        return String.format("<a href:%s>%s</a>",format, text.source());
    }
}
