package com.kharitonov.text_compositor.parser;

import com.kharitonov.text_compositor.component.TextComponent;
import com.kharitonov.text_compositor.component.impl.CompositeText;
import com.kharitonov.text_compositor.component.impl.CompositeType;
import com.kharitonov.text_compositor.parser.impl.ParagraphParser;

import java.util.List;

public class CompositeTextParser {
    public CompositeText parse(String text) {
        CompositeText compositeText = new CompositeText(CompositeType.TEXT);
        ParagraphParser parser = new ParagraphParser();
        List<TextComponent> paragraphs =parser.parse(text);
        for (TextComponent paragraph : paragraphs) {
            compositeText.add(paragraph);
        }
        return compositeText;
    }
}
