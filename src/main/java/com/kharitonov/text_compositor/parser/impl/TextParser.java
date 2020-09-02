package com.kharitonov.text_compositor.parser.impl;

import com.kharitonov.text_compositor.component.TextComponent;
import com.kharitonov.text_compositor.component.impl.CompositeText;
import com.kharitonov.text_compositor.component.impl.CompositeType;

import java.util.List;

public class TextParser {
    private static final ParagraphParser PARAGRAPH_PARSER =
            ParagraphParser.getInstance();

    public CompositeText parse(String text) {
        CompositeText compositeText = new CompositeText(CompositeType.TEXT);
        List<TextComponent> paragraphs = PARAGRAPH_PARSER.parse(text);
        for (TextComponent paragraph : paragraphs) {
            compositeText.add(paragraph);
        }
        return compositeText;
    }
}
