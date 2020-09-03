package com.kharitonov.text_compositor.comparator;

import com.kharitonov.text_compositor.component.TextComponent;

import java.util.Comparator;

public class AlphabeticLexemeComparator implements Comparator<TextComponent> {
    @Override
    public int compare(TextComponent o1, TextComponent o2) {
        return o1.toString().compareTo(o2.toString());
    }
}
