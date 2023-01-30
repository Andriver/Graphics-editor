package org.example;

public class Text implements Writing{
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String text() {
        return text;
    }
}
