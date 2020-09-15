package ar.itba.edu.TP4.P5;

public class FormatText extends Text{
    protected HTMLText text;
    protected String format;

    public FormatText(HTMLText text, String format) {
        this.text = text;
        this.format = format;
    }

    @Override
    public String source() {
        return String.format("<%s>%s</%s>",format,text.source(),format);
    }


}
