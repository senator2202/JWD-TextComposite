package com.kharitonov.text_compositor.type;

public enum CompositeType {
    TEXT("\r\n", 2), PARAGRAPH(" ", 1), SENTENCE(" ", 1), LEXEME("", 0);

    private final String delimiter;
    private final int delta;

    CompositeType(String delimiter, int delta) {
        this.delimiter = delimiter;
        this.delta = delta;
    }

    public String getDelimiter() {
        return delimiter;
    }

    public int getDelta() {
        return delta;
    }
}
